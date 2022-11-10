package dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;

public class KetNoi {
	public Connection cn;
	public void KetNoi() {
		try {
			// ket noi sql sever
			//DESKTOP-DQECU9U
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://DESKTOP-DQECU9U:1433;databaseName=hoangquangluan1;user=sa; password=123123";
			cn=DriverManager.getConnection(url);
			System.out.println("da ket noi");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
	}
}
