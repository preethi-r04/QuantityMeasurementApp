package com.bridgelabz.repository;


import com.bridgelabz.entity.QuantityMeasurementEntity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuantityMeasurementDatabaseRepository {

    public void save(QuantityMeasurementEntity entity) {

        try (Connection conn = DBConnection.getConnection()) {

            String sql = "INSERT INTO quantity_measurement (value, unit) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDouble(1, entity.getValue());
            ps.setString(2, entity.getUnit());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<QuantityMeasurementEntity> findAll() {

        List<QuantityMeasurementEntity> list = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection()) {

            String sql = "SELECT * FROM quantity_measurement";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                QuantityMeasurementEntity q = new QuantityMeasurementEntity();
                q.setId(rs.getLong("id"));
                q.setValue(rs.getDouble("value"));
                q.setUnit(rs.getString("unit"));
                list.add(q);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}