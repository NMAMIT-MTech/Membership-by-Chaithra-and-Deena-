
package BL;

import Beans.Member;
import Beans.MemberDetails;
import DAO.MemberDAO;
import DAO.MemberDetailsDAO;
import java.sql.SQLException;
import java.util.List;

public class BusinessLogic {
    
public boolean insertMemberData(Member objMember) throws SQLException{
		
		MemberDAO objMem=new MemberDAO();

		boolean success=objMem.insertintoMember(objMember);
                return success;
	}


public boolean insertMemberDetailsData(MemberDetails objMember) throws SQLException{
		// calculating expiry date after getting startDate
		Date d=objMember.getStartDate();
		objMember.setExpiryDate(new Date(d.getDate(),d.getMonth(),d.getYear()+1));
		
		MemberDetailsDAO objMemDet=new MemberDetailsDAO();

		boolean success=objMemDet.insertintoMemberDetails(objMember);
                return success;
	}


public List<MemberDetails> getMemberDetailsData(String MemIDs) throws SQLException{
		
		MemberDetailsDAO objMemDet=new MemberDetailsDAO();

		List<MemberDetails> lstDet=objMemDet.getMemberDetails(MemIDs);

		return lstDet;
	}

	public List<Member> getMemberData(String MemIDs) throws SQLException{
		
		MemberDAO objMem=new MemberDAO();

		List<Member> lstDet=objMem.getMemberDetails(MemIDs);

		return lstDet;
	}
}
