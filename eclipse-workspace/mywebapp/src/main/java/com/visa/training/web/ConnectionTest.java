package com.visa.training.web;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c = JdbcUtil.getConnection();
		DatabaseMetaData metaData = c.getMetaData();
		System.out.println("Product is "+metaData.getDatabaseProductName());
		System.out.println("Version is "+metaData.getDatabaseProductVersion());
	}

}
