package com.michalgarnczarski;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	    try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\databases\\testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT into contacts (name, phone, email)" +
//                    " VALUES('Tim', 654687, 'tim@email.com')");
//            statement.execute("INSERT into contacts (name, phone, email)" +
//                    " VALUES('Joe', 45678, 'joe@anywhere.com')");
//            statement.execute("INSERT into contacts (name, phone, email)" +
//                    " VALUES('Jane', 12341567, 'jane@somewhere.com')");
//            statement.execute("INSERT into contacts (name, phone, email)" +
//                    " VALUES('Fido', 15648, 'dog@email.com')");

//            statement.execute("UPDATE contacts SET phone=111111111 WHERE name='Jane'");

//            statement.execute("DELETE FROM contacts WHERE name='Joe'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();

            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                                    results.getInt("phone") + " " +
                                    results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();
        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
