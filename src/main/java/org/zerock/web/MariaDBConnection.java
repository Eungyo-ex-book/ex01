package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;
	
public class MariaDBConnection {

	private static final String DRIVER = "org.mariadb.jdbc.Driver";

	private static final String URL = "jdbc:mariadb://192.168.0.115:3306/book_ex";

	private static final String USER = "root"; //db 접속 id

	private static final String PW = "1q2w3e4r!!"; //db 접속 password

	

	@Test

	public void testConnection() throws Exception{

		Class.forName(DRIVER);

		try(Connection con = DriverManager.getConnection(URL, USER, PW)){

			System.out.println(con);

		}catch(Exception e){

			e.printStackTrace();

		}

	}

}