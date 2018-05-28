
package Beans;

public class Member {
    
String name,email,address,memberType;
long aadhar;
	long contactNumber;
	int memberID;
        
        
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
	public void setContactNumber(long contactNumber){
		this.contactNumber=contactNumber;
	}

	public long getContactNumber(){
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

	public void setAadhar(long aadhar){
		this.aadhar=aadhar;
	}

	public long getAadhar(){
		return this.aadhar;
	}
}
