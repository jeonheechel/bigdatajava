package bean;


import java.sql.*;
import java.util.ArrayList;







public class StarDAO {
	DBConnectionMgr mgr;
	public StarDAO() {
		
		mgr = DBConnectionMgr.getInstance();//한개밖에 못만든다
	}
	public void insert(StarDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "insert into star value(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		ps.setInt(2,dto.getStarnum());
		ps.setInt(3,dto.getTop());
		ps.setInt(4,dto.getUnder());
		ps.setInt(5,dto.getShoes());
	
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
		
		mgr.freeConnection(con,ps);
		
	}
	

	public StarDTO select(StarDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "select * from star where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		
		
		//4단계 sql문 전달요청
		ResultSet rs =  ps.executeQuery();
		
		StarDTO  dto2 = null;
		while(rs.next()) {
			dto2 = new StarDTO();
			String id = rs.getString(1);
			String starnum = rs.getString(2);
			String top = rs.getString(3);
			String under = rs.getString(4);
			String shoes = rs.getString(5);
			
			dto2.setId(id);
			dto2.setStarnum(Integer.parseInt(starnum));
			dto2.setTop(Integer.parseInt(top));
			dto2.setUnder(Integer.parseInt(under));
			dto2.setShoes(Integer.parseInt(shoes));
			
			
		}
		return dto2;
		
	}
	
	public void update(StarDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "update star set  id= ?, starnum= ?, top= ?, under= ?, shoes= ?     where id= ?  AND starnum=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		ps.setInt(2,dto.getStarnum());
		ps.setInt(3,dto.getTop());
		ps.setInt(4,dto.getUnder());
		ps.setInt(5,dto.getShoes());
		ps.setString(6,dto.getId());
		ps.setInt(7,dto.getStarnum());
		
		
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
		mgr.freeConnection(con,ps);
	}
	
public void delete(StarDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "delete  from star where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
		mgr.freeConnection(con,ps);
	}

	public ArrayList<StarDTO> selectAll(StarDTO dto) throws Exception {
		ArrayList<StarDTO> list = new ArrayList<StarDTO>(); 
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "select * from star where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		
		
		//4단계 sql문 전달요청
		ResultSet rs =  ps.executeQuery();
		StarDTO  dto2 = null;
		while(rs.next()) {
			dto2 = new StarDTO();
			String id = rs.getString(1);
			String starnum = rs.getString(2);
			String top = rs.getString(3);
			String under = rs.getString(4);
			String shoes = rs.getString(5);
			
			dto2.setId(id);
			dto2.setStarnum(Integer.parseInt(starnum));
			dto2.setTop(Integer.parseInt(top));
			dto2.setUnder(Integer.parseInt(under));
			dto2.setShoes(Integer.parseInt(shoes));
			
			
			
			list.add(dto2);
			
		}
		return list;
	}
		
		
		
		
	

}
