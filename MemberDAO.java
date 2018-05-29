package DAO;
import BL.Constants;
import Beans.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class MemberDAO {
    
public boolean insertintoMember(Member objMem) throws SQLException{

boolean success=false;
Connection con=null;
Statement stm=null;
try{
Class.forName(Constants.DriverName);

con=DriverManager.getConnection(Constants.URL,Constants.UserName,Constants.Pass);

stm= con.createStatement();

String sql="Insert into Member values("+objMem.getName()+","+objMem.getMemberType()+","+objMem.getContactNumber()+","+objMem.getEmail()+","+objMem.getAddress()+","+objMem.getStartDate()+","+objMem.getExpiryDate()+","+objMem.getAadhar()+")";

success=stm.execute(sql);
}catch(Exception e){
	e.printStackTrace();
}finally{
	stm.close();
	con.close();
}
return success;    
}


	
public List<Member> getMemberDetails() throws SQLException{
Connection con=null;
Statement stm=null;
List<Member> lstMem= new ArrayList<Member>();
try{
Class.forName(Constants.DriverName);

con=DriverManager.getConnection(Constants.URL,Constants.UserName,Constants.Pass);

stm= con.createStatement();

String sql="Select * from Member";

ResultSet rs=stm.executeQuery(sql);

while(rs.next()){
	Member objMem= new Member();
	objMem.setContactNumber(rs.getLong("ContactNumber"));
        objMem.setMemberType(rs.getString("memberType"));
	objMem.setName(rs.getString("Name"));
	objMem.setEmail(rs.getString("Email"));
	objMem.setAadhar(rs.getLong("Aadhar"));
	objMem.setMemberID(rs.getInt("MemberID"));
        objMem.setStartDate(rs.getDate("startDate"));
        objMem.setExpiryDate(rs.getDate("expiryDate"));
lstMem.add(objMem);
}
}catch(Exception e){
	e.printStackTrace();
}finally{
	stm.close();
	con.close();
}

return lstMem;
}
}

