package Beans;

import java.math.BigInteger;
import java.sql.Date;

public class Member {
    
String name,email,address,memberType;
    BigInteger aadhar;
BigInteger contactNumber;
int memberID;
Date startDate,expiryDate;
        
        public String getMemberType() {
        return memberType;
        }

        public void setMemberType(String memberType) {
        this.memberType = memberType;
        }

        
	public void setMemberID(int memberID){
		this.memberID=memberID;
	}

	public int getMemberID(){
		return this.memberID;
	}
        
	public void setContactNumber(BigInteger contactNumber){
		this.contactNumber=contactNumber;
	}

	public BigInteger getContactNumber(){
		return this.contactNumber;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getEmail(){
		return this.email;
	}

        public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return this.address;
	}

	public void setAadhar(BigInteger aadhar){
		this.aadhar=aadhar;
	}

	public BigInteger getAadhar(){
		return this.aadhar;
	}
        
        
        public void setStartDate(Date startDate){
		this.startDate=startDate;
	}

	public Date getStartDate(){
		return this.startDate;
	}
        public void setExpiryDate(Date expiryDate){
		this.expiryDate=expiryDate;
	}

	public Date getExpiryDate(){
		return this.expiryDate;
        }
}
