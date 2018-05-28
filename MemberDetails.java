
package Beans;

import java.sql.Date;

public class MemberDetails {
    
int memberID;
Date startDate,expiryDate;

        public void setMemberID(int memberID) {
        this.memberID = memberID;
        }
    
        public int getMemberID() {
        return memberID;
        }
	
	
	public void setExpiryDate(Date expiryDate){
		this.expiryDate=expiryDate;
	}

	public Date getExpiryDate(){
		return this.expiryDate;
	}
	
        
        public void setStartDate(Date startDate){
		this.startDate=startDate;
	}

	public Date getStartDate(){
		return this.startDate;
	}
}
