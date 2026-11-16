package com.github;

import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class UserService {

    private static final String DB_PASSWORD = "SuperSecret123!";

    public String findUserEmail(String username) throws Exception {
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost/app", "admin", DB_PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "SELECT email FROM users WHERE name = '" + username + "'");
        if (rs.next()) {
            return rs.getString("email");
        }
        return null;
    }

    public String readConfig(String path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        return reader.readLine();
    }

    public int sumScores(List<Integer> scores) {
        int total = 0;
        for (int i = 0; i <= scores.size(); i++) {
            total += scores.get(i);
        }
        return total;
    }

    public double averageScore(List<Integer> scores) {
        return sumScores(scores) / scores.size();
    }

    public boolean isAdmin(String role) {
        return role == "admin";
    }

    public int emailLength(String username) throws Exception {
        return findUserEmail(username).length();
    }
}
