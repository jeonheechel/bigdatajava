package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StorageDAO {

	String url = "jdbc:mysql://localhost:3306/movieworld?useUnicode=true&characterEncoding=utf8";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	StorageDTO dto = null;

	public StorageDAO() {

		try {
			// 1. 드라이브 연결
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("StorageDAO 1 ok");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("StorageDAO 2 ok");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from Storage;";
			ps = con.prepareStatement(sql);
			
			System.out.println("StorageSelect 3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("StorageSelect 4 ok");

			while (rs.next()) {
				dto = new StorageDTO();
				String id = rs.getString(1);
				String movieName = rs.getString(2);
				String movieUrl = rs.getString(3);
				String today = rs.getString(4);
				

				dto.setId(id);
				dto.setMovieName(movieName);
				dto.setMovieUrl(movieUrl);
				dto.setToday(today);
				list.add(dto);
				

			} 

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생! id");
			System.out.println(e.getMessage());
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}
	
	public ArrayList select(String getId) {
		ArrayList list = new ArrayList();
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from storage where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, getId);
			
			System.out.println("StorageSelect 3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("StorageSelect 4 ok");

			while (rs.next()) {
				dto = new StorageDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String url = rs.getString(3);
				String today = rs.getString(4);
				

				dto.setId(id);
				dto.setMovieName(name);
				dto.setMovieUrl(url);
				dto.setToday(today);
				list.add(dto);

			} 

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생! id");
			System.out.println(e.getMessage());
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}
	
	
	public StorageDTO movieSelect(String getId, String movieName, String movieUrl) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from Storage where id = ? and movieName = ? and movieUrl = ?;";
			ps = con.prepareStatement(sql);
			ps.setString(1, getId);
			ps.setString(2, movieName);
			ps.setString(3, movieUrl);
			
			System.out.println("StorageSelect 3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("StorageSelect 4 ok");

			if (rs.next()) {
				dto = new StorageDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String url = rs.getString(3);
				String today = rs.getString(4);
				

				dto.setId(id);
				dto.setMovieName(name);
				dto.setMovieName(url);
				dto.setToday(today);
				

			} else {
				System.out.println("검색 결과가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생! id");
			System.out.println(e.getMessage());
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e2) {
			}
		}
		return dto;
	}
	
	public void insert(StorageDTO dto) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "insert into Storage values (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getMovieName());
			ps.setString(3, dto.getMovieUrl());
			ps.setString(4, dto.getToday());
		
			System.out.println("insert 3 ok");

			// 4. SQL문 전송
			ps.executeUpdate();
			System.out.println("insert 4 ok");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e2) {
			}
		}

	}
	
	public void delete(String id, String movieUrl) {
		try {
			String sql = "delete from storage where id = ? and movieUrl= ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, movieUrl);
			System.out.println("delete 3 ok");
			ps.executeUpdate();
			System.out.println("delete 4 ok");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e2) {
			}
		}
	}
}
