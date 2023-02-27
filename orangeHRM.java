package javabasics;

public class orangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login("naresh","test12");
		logout();
		login("kumar","ertt");
		
		logout();

		
		
	}
	public static void login(String un,String pw)
	{
		System.out.println("user name" +un);
		System.out.println("passwd" +pw);
		System.out.println("click on loging");
	}
	public static void logout()
	{
		System.out.println("click on logout");
	}
	
	
}
