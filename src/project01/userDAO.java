package project01;

import java.sql.*;
import java.util.ArrayList;


public class userDAO {
	String url = "jdbc:mysql://localhost:3306/movieworld?useUnicode=true&characterEncoding=utf8";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	userDTO dto = null;

	public userDAO() {

		try {
			// 1. 드라이브 연결
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1 ok");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2 ok");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		try {
			
			// 3. SQL문 결정(객체화)
			String sql = "select * from user";
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 객체화 OK");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK");

			// SQL문의 결과가 있으면, 받아서 처리

			while (rs.next()) {
				dto = new userDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nicname = rs.getString(4);
				String email = rs.getString(5);
				int hint = rs.getInt(6);
				String pwhint = rs.getString(7);
				int grade = rs.getInt(8);

				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setNicname(nicname);
				dto.setEmail(email);
				dto.setHint(hint);
				dto.setPwhint(pwhint);
				dto.setGrade(grade);
				list.add(dto);

			} 

		} catch (Exception e) {
			System.out.println("DB처리 중 에러 발생..");
			System.out.println(e.getMessage());
		} finally {
			// 에러발생 여부와 상관없이 무조건 실행시켜야 하는 코드
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// e.printStackTrace();
				System.out.println("자원 해제 중 에러 발생!!");
			} // catch
		} // try-catch-finally
		
		
		return list;
	}

	public userDTO select(String inputId) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from user where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4 ok");

			if (rs.next()) {
				dto = new userDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nicname = rs.getString(4);
				String email = rs.getString(5);
				int hint = rs.getInt(6);
				String pwhint = rs.getString(7);
				int grade = rs.getInt(8);

				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setNicname(nicname);
				dto.setEmail(email);
				dto.setHint(hint);
				dto.setPwhint(pwhint);
				dto.setGrade(grade);
				
				

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
	
	
	public userDTO selectNicName(String inputNicName) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from user where nicname = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputNicName);
			System.out.println("3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4 ok");

			if (rs.next()) {
				dto = new userDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nicname = rs.getString(4);
				String email = rs.getString(5);
				int hint = rs.getInt(6);
				String pwhint = rs.getString(7);
				int grade = rs.getInt(8);

				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setNicname(nicname);
				dto.setEmail(email);
				dto.setHint(hint);
				dto.setPwhint(pwhint);
				dto.setGrade(grade);
				
				

			} else {
				System.out.println("검색 결과가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생! nicname");
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
	
	public userDTO selectNicName2(String inputId) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from user where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4 ok");

			if (rs.next()) {
				dto = new userDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nicname = rs.getString(4);
				String email = rs.getString(5);
				int hint = rs.getInt(6);
				String pwhint = rs.getString(7);
				int grade = rs.getInt(8);

				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setNicname(nicname);
				dto.setEmail(email);
				dto.setHint(hint);
				dto.setPwhint(pwhint);
				dto.setGrade(grade);
				
				

			} else {
				System.out.println("검색 결과가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생! nicname");
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
	
	public userDTO selectEmail(String inputEmail) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from user where email = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputEmail);
			System.out.println("3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4 ok");

			if (rs.next()) {
				dto = new userDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nicname = rs.getString(4);
				String email = rs.getString(5);
				int hint = rs.getInt(6);
				String pwhint = rs.getString(7);
				int grade = rs.getInt(8);

				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setNicname(nicname);
				dto.setEmail(email);
				dto.setHint(hint);
				dto.setPwhint(pwhint);
				dto.setGrade(grade);
				
				

			} else {
				System.out.println("검색 결과가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생! email");
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
	
	public userDTO selectIdFind(String inputName, int inputHint, String inputPwHint) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from user where name = ? and hint = ? and pwhint = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputName);
			ps.setInt(2, inputHint);
			ps.setString(3, inputPwHint);
			System.out.println("3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4 ok");

			if (rs.next()) {
				dto = new userDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nicname = rs.getString(4);
				String email = rs.getString(5);
				int hint = rs.getInt(6);
				String pwhint = rs.getString(7);
				int grade = rs.getInt(8);

				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setNicname(nicname);
				dto.setEmail(email);
				dto.setHint(hint);
				dto.setPwhint(pwhint);
				dto.setGrade(grade);
				
				

			} else {
				System.out.println("검색 결과가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생!");
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
	
	
	
	public userDTO selectPwFind(String inputId, String inputName, int inputHint, String inputPwHint) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from user where id = ? and name = ? and hint = ? and pwhint = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			ps.setString(2, inputName);
			ps.setInt(3, inputHint);
			ps.setString(4, inputPwHint);
			System.out.println("3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4 ok");

			if (rs.next()) {
				dto = new userDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nicname = rs.getString(4);
				String email = rs.getString(5);
				int hint = rs.getInt(6);
				String pwhint = rs.getString(7);
				int grade = rs.getInt(8);

				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setNicname(nicname);
				dto.setEmail(email);
				dto.setHint(hint);
				dto.setPwhint(pwhint);
				dto.setGrade(grade);
				
				

			} else {
				System.out.println("검색 결과가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생!");
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

	public void insert(userDTO dto) {
		try {
			// 3. SQL문 결정(객체화)
			String sql = "insert into user values (?, ?, ?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getNicname());
			ps.setString(5, dto.getEmail());
			ps.setInt(6, dto.getHint());
			ps.setString(7, dto.getPwhint());
			ps.setInt(8, dto.getGrade());
			System.out.println("3 ok");

			// 4. SQL문 전송
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
	
	
	public void ModifyingInformation(userDTO dto) {
		try {
			String sql = "update user set pw=?, nicname=?, email=?, hint=?, pwhint=? where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPw());
			ps.setString(2, dto.getNicname());
			ps.setString(3, dto.getEmail());
			ps.setInt(4, dto.getHint());
			ps.setString(5, dto.getPwhint());
			ps.setString(6, dto.getId());
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
	
	public void gradeUpdate(userDTO dto) {
		try {
			String sql = "update user set grade= ? where id= ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getGrade());
			ps.setString(2,  dto.getId());
			
			System.out.println("gradeUpdate 3 ok");
			ps.executeUpdate();
			System.out.println("gradeUpdate 4 ok");
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
	
	public void delete(String id) {
		try {
			String sql = "delete from user where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			ps.executeUpdate();
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
