package jdbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	//√Îæ‡¡°
	static String url;
	static String hr;
	static String password;

	static {
		try(BufferedReader in = new BufferedReader(new FileReader("./DB_Info.txt"))) {
			url = in.readLine();
			hr = in.readLine();
			password = in.readLine();
			System.out.println("[Info] Initilize static variables");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, hr, password);
		} catch (SQLException e) {
			return null;
		}
	}
	
}
