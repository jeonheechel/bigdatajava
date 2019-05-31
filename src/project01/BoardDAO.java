package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDAO {
	String url = "jdbc:mysql://localhost:3306/movieworld?useUnicode=true&characterEncoding=utf8";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	BoardDTO dto = null;

	public BoardDAO() {

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
			String sql = "select * from whiteBoard order by number desc;";
			ps = con.prepareStatement(sql);
			
			System.out.println("whiteBoard 3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("whiteBoard 4 ok");

			while (rs.next()) {
				dto = new BoardDTO();
				int number = rs.getInt(1);
				String id = rs.getString(2);
				String nicName = rs.getString(3);
				String title = rs.getString(4);
				String content = rs.getString(5);
				String today = rs.getString(6);
				

				dto.setNumber(number);
				dto.setId(id);
				dto.setNicName(nicName);
				dto.setTitle(title);
				dto.setContent(content);
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
	
	public ArrayList selectAllId(String getId) {
		ArrayList list = new ArrayList();
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from whiteBoard where id = ? order by number desc;";
			ps = con.prepareStatement(sql);
			ps.setString(1, getId);
			
			System.out.println("whiteBoard 3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("whiteBoard 4 ok");

			while (rs.next()) {
				dto = new BoardDTO();
				int number = rs.getInt(1);
				String id = rs.getString(2);
				String nicName = rs.getString(3);
				String title = rs.getString(4);
				String content = rs.getString(5);
				String today = rs.getString(6);
				

				dto.setNumber(number);
				dto.setId(id);
				dto.setNicName(nicName);
				dto.setTitle(title);
				dto.setContent(content);
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
	
	public void insert(int number, String id, String nicName, String title, String content, String today) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "insert into whiteBoard values (?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, number);
			ps.setString(2, id);
			ps.setString(3, nicName);
			ps.setString(4, title);
			ps.setString(5, content);
			ps.setString(6, today);
		
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
	
	public void delete(String today) {
		try {
			String sql = "delete from whiteBoard where today = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, today);
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
	
	public void update(String title, String content, String today, String id, String todayTime) {
		try {
			String sql = "update whiteBoard set title = ?, content = ?, today = ? where id = ? and today = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, today);
			ps.setString(4, id);
			ps.setString(5, todayTime);
			System.out.println("3 ok");
			ps.executeUpdate();
			System.out.println("4 ok");
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