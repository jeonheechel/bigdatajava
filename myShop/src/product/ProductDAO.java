package product;

import java.sql.*;
import java.util.ArrayList;







public class ProductDAO {
	
	DBConnectionMgr mgr;
	
	public ProductDAO() {
		
		mgr = DBConnectionMgr.getInstance();
		

	}
	
public void insert(ProductDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "insert into shop values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		ps.setString(2,dto.getPro());
		ps.setString(3,dto.getCom());
		ps.setString(4,dto.getPrice());
	
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
		mgr.freeConnection(con,ps);
	}
public void update(ProductDTO dto) throws Exception {
	
	//1.2단계를 해주는 DBconnectinMgr 객체 필요
	Connection con = mgr.getConnection();
	
	
	
	//3단계 sql문 결정
	String sql = "update shop set com = ?,  price = ? where id=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,dto.getCom());
	ps.setString(2,dto.getPrice());
	ps.setString(3,dto.getId());
	
	
	//4단계 sql문 전달요청
	ps.executeUpdate();
	mgr.freeConnection(con,ps);
}
public void delete(ProductDTO dto) throws Exception {
	
	//1.2단계를 해주는 DBconnectinMgr 객체 필요
	Connection con = mgr.getConnection();
	
	
	
	//3단계 sql문 결정
	String sql = "delete from shop where id=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,dto.getId());
	
	
	
	//4단계 sql문 전달요청
	ps.executeUpdate();
	mgr.freeConnection(con,ps);
}

public ProductDTO select(ProductDTO dto) throws Exception {
    
    //1.2단계를 해주는 DBconnectinMgr 객체 필요
    Connection con = mgr.getConnection();
    
    
    
    //3단계 sql문 결정
    String sql = "select * from shop where id = ?";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1,dto.getId());
    
    
    //4단계 sql문 전달요청
    ResultSet rs =  ps.executeQuery();
    
    ProductDTO  dto2 = null;
    
    while(rs.next()) {
       dto2 = new ProductDTO();
       String id = rs.getString(1);
       String pro = rs.getString(2);
       String com = rs.getString(3);
       String price = rs.getString(4);
      
       
       dto2.setId(id);
       dto2.setPro(pro);
       dto2.setCom(com);
       dto2.setPrice(price);
       
       
       
    }
    return dto2;
    
 }

public ArrayList<ProductDTO> selectAll() throws Exception {
    ArrayList<ProductDTO> list = new ArrayList<ProductDTO>(); 
    
    //1.2단계를 해주는 DBconnectinMgr 객체 필요
    Connection con = mgr.getConnection();
    
    
    
    //3단계 sql문 결정
    String sql = "select * from shop";
    PreparedStatement ps = con.prepareStatement(sql);
    
    
    //4단계 sql문 전달요청
    ResultSet rs =  ps.executeQuery();
    ProductDTO  dto2 = null;
    while(rs.next()) {
    	  dto2 = new ProductDTO();
          String id = rs.getString(1);
          String pro = rs.getString(2);
          String com = rs.getString(3);
          String price = rs.getString(4);
	       
	      dto2.setId(id);
	      dto2.setPro(pro);
	      dto2.setCom(com);
	      dto2.setPrice(price);
	       
	      list.add(dto2);
       
    }
    return list;
 }

}
