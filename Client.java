package edu.cgcc.cs161.client;


public class Client {
	
	private String firstname; 
	private String lastname;
	private String street;
	private String city;
	private String state;
	private String country;
	private int zipcode;
	private int phone;
	private String email;
	private String insurancecarrier;
	
	Client(String fname, String lname, String strt, String cit, String stat, String coun, int zip, int phon, String emal, String insur){
	//info is set upon creation of client object based on survey	
		firstname = fname;
		lastname = lname;
		street = strt;
		city = cit;
		state = stat;
		country = coun;
		zipcode = zip;
		phone = phon;
		email = emal;
		insurancecarrier = insur;
		
	}

}
