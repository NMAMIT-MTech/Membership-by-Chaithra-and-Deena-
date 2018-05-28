
package DAO;

import BL.Constants;
import Beans.Member;
import Beans.MemberDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDetailsDAO {
    
public boolean insertintoMemberDetails(MemberDetails objMem) throws SQLException{
Connection con=null;
Statement stm=null;
boolean success=false;
try{
Class.forName(Constants.DriverName);

con=DriverManager.getConnection(Constants.URL,Constants.UserName,Constants.Pass);

stm= con.createStatement();

String sql="Insert into MemberDetails values("+objMem.getMemberID()+","+objMem.getStartDate()+","+objMem.getExpiryDate()+")";

success=stm.execute(sql);
}catch(Exception e){
	e.printStackTrace();
}finally{
	stm.close();
	con.close();
}
return success;
}

public List<MemberDetails> getMemberDetails(String MemIDs) throws SQLException{
Connection con=null;
Statement stm=null;
List<MemberDetails> lstMem= new ArrayList<MemberDetails>();
try{
Class.forName(Constants.DriverName);

con=DriverManager.getConnection(Constants.URL,Constants.UserName,Constants.Pass);

stm= con.createStatement();

String sql="Select * from MemberDetails where MemberID in("+MemIDs+")";

ResultSet rs=stm.executeQuery(sql);

while(rs.next()){
	MemberDetails objMem= new MemberDetails();
		
	objMem.setStartDate(rs.getDate("StartDate"));
	objMem.setExpiryDate(rs.getDate("ExpiryDate"));
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

