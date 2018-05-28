# Membership-chaithra-and-Deena-
1) Member.java is a Member bean which contain data, getters and setters code for member id,name,email,addresss,aadhar and contact Number
2) MemberDetails.java is a MemberDetails bean which contain data, getters and setters code for startDate and ExpiryDate
3) Constants.java code includes driver information, url, user name and password of the database.
4) BusinessLogic.java contains the member object that is responsible for aggregating all of the information needed by the business request. Member object calls out to the member dao (data access object) module to get member data.
5) MemberDAO.java executes SQL statements to insert the data into the member table, and to retrieve the corresponding data and pass it back up to the member object in the business layer(BusinessLogic.java).
6) MemberDetailsDAO.java executes SQL statements to insert the data into the memberDetails table, and to retrieve the corresponding data and pass it back up to the member object in the business layer(BusinessLogic.java).
