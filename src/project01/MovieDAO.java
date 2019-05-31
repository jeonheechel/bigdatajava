package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDAO {

	String url = "jdbc:mysql://localhost:3306/movieworld?useUnicode=true&characterEncoding=utf8";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	MovieDTO dto = null;

	public MovieDAO() {

		try {
			// 1. 드라이브 연결
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MovieDAO 1 ok");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("MovieDAO 2 ok");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from movieevaluation;";
			ps = con.prepareStatement(sql);
			
			System.out.println("movieSelect 3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("movieSelect 4 ok");

			while (rs.next()) {
				dto = new MovieDTO();
				String id = rs.getString(1);
				double evaluationScore = rs.getDouble(2);
				String movieName = rs.getString(3);
				String review = rs.getString(4);
				

				dto.setId(id);
				dto.setEvaluationScore(evaluationScore);
				dto.setMovieName(movieName);
				dto.setReview(review);
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
	
	
	public MovieDTO movieSelect(String getId, String movieName) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from movieevaluation where id = ? and movieName = ?;";
			ps = con.prepareStatement(sql);
			ps.setString(1, getId);
			ps.setString(2, movieName);
			
			System.out.println("movieSelect 3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("movieSelect 4 ok");

			if (rs.next()) {
				dto = new MovieDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);

				dto.setId(id);
				dto.setMovieName(name);
				

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
	
	
	
	public void insert(MovieDTO dto) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "insert into movieevaluation values (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setDouble(2, dto.getEvaluationScore());
			ps.setString(3, dto.getMovieName());
			ps.setString(4, dto.getReview());
		
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
}
