package DAO;
import BL.Constants;
import Beans.Member;
import java.math.BigInteger;
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

String sql="Insert into Member values("+objMem.getMemberID()+",'"+objMem.getName()+"','"+objMem.getMemberType()+"','"+objMem.getEmail()+"','"+objMem.getAddress()+"',"+objMem.getAadhar()+","+objMem.getContactNumber()+",'"+objMem.getStartDate()+"','"+objMem.getExpiryDate()+"')";
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
	objMem.setContactNumber(BigInteger.valueOf(rs.getInt("ContactNumber")));
        objMem.setMemberType(rs.getString("memberType"));
	objMem.setName(rs.getString("Name"));
	objMem.setEmail(rs.getString("Email"));
        objMem.setAddress(rs.getString("Address"));
	objMem.setAadhar(BigInteger.valueOf(rs.getInt("Aadhar")));
	objMem.setMemberID(rs.getInt("MemberID"));
        objMem.setStartDate(rs.getDate("startDate"));
        objMem.setExpiryDate(rs.getDate("expiryDate"));
lstMem.add(objMem);
}
/*for(Member m:lstMem)
{
    System.out.println(m.getName());
}*/
for(int i = 0; i < lstMem.size(); i++) {
    System.out.println("Details of Member with MemberId"+lstMem.get(i).getMemberID()+"\n");
            System.out.println("MemberID:"+lstMem.get(i).getMemberID());
            System.out.println("MemberName:"+lstMem.get(i).getName());
            System.out.println("MemberType:"+lstMem.get(i).getMemberType());
            System.out.println("Email:"+lstMem.get(i).getEmail());
            System.out.println("Address:"+lstMem.get(i).getAddress());
            System.out.println("Aadhar:"+lstMem.get(i).getAadhar());
            System.out.println("contactNumber:"+lstMem.get(i).getContactNumber());
            System.out.println("Start Date:"+lstMem.get(i).getStartDate());
            System.out.println("Expiry Date:"+lstMem.get(i).getExpiryDate()+"\n");   
        }

}catch(Exception e){
	e.printStackTrace();
}finally{
	stm.close();
	con.close();
}

return lstMem;
}



public boolean deletefromMember(int MemId) throws SQLException{

boolean success=false;
Connection con=null;
Statement stm=null;
try{
Class.forName(Constants.DriverName);

con=DriverManager.getConnection(Constants.URL,Constants.UserName,Constants.Pass);

stm= con.createStatement();

String sql="DELETE FROM Member WHERE memberId in("+MemId+")";

success=stm.execute(sql);
}catch(Exception e){
	e.printStackTrace();
}finally{
	stm.close();
	con.close();
}
return success;    
}
}
