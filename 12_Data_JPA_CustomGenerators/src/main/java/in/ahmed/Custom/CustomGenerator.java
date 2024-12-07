package in.ahmed.Custom;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "OD";
        String suffix = "";

        try {
            // Obtain database connection

            // Create a statement to query the database

            // Query the next_id for the custom key
            ResultSet resultSet = statement.executeQuery("SELECT next_id FROM id_generator WHERE id_name = 'ORDER_ID'");
            if (resultSet.next()) {
                int nextId = resultSet.getInt(1); // Get the next_id value
                suffix = String.format("%05d", nextId); // Format the ID with leading zeros, e.g., 00001

                // Increment the next_id value in the database
                statement.executeUpdate("UPDATE id_generator SET next_id = next_id + 1 WHERE id_name = 'ORDER_ID'");
            }

        } catch (Exception e) {
            e.printStackTrace(); // Log the exception (can use a logger for better management)
        }

        // Combine the prefix and suffix to generate the final ID
        return prefix + suffix;
    }
}
