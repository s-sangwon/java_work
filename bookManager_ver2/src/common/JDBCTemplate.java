package common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

//공통모듈 : 오라클 연동이 필요한 모든 모델이 공통으로 사용할 것임
//SingleTone 패턴 적용함 : 프로그램 구동동안 메모리에 딱 한개마 ㄴ생성함
// 			여러 클래스 객체들이 같이 공유 사용하는 방식
//			모든 메소드를 static 으로 작성
public class JDBCTemplate {
	
//	public static Connection getConnetion() {
//		Connection conn = null;
//		
//		try {
//			//1. 드라이버 등록
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			
//			
//			//2. dbms 연동
//			conn = DriverManager.getConnection(
//					"jdbc:oracle:thin:@127.0.0.1:1521:xe",
//					"c##student","student");
//			conn.setAutoCommit(false);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return conn;
//	}
	
	public static Connection getConnetion() {
		Connection conn = null;
		Properties prop = new Properties();
		
		
		
		try {
			//1. 드라이버 등록
			prop.load(new FileReader("resources/dbdriver.properties"));
			
			Class.forName(prop.getProperty("driver"));
			
			
			//2. dbms 연동
			conn = DriverManager.getConnection(
					prop.getProperty("url"),
					prop.getProperty("user"),
					prop.getProperty("password"));
			conn.setAutoCommit(false);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
