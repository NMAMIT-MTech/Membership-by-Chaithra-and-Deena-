package BL;
import Beans.Member;
import DAO.MemberDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
public class BusinessLogic {
    
	public boolean insertMemberData(Member objMember) throws SQLException{
		
		//calculating expiry date
		Date d=objMember.getStartDate();
		objMember.setExpiryDate(new Date(d.getDate(),d.getMonth(),d.getYear()+1));
               
		MemberDAO objMem=new MemberDAO();

		boolean success=objMem.insertintoMember(objMember);
                return success;
	}


	public List<Member> getMemberData() throws SQLException{
		
		MemberDAO objMem=new MemberDAO();

		List<Member> lstDet=objMem.getMemberDetails();

		return lstDet;
	}
}
