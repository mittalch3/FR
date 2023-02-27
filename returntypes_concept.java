package javabasics;

import java.util.ArrayList;

public class returntypes_concept {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		System.out.println(addition());
		int val=addition();
		System.out.println(val);
	}
public static int addition()
{
	int n1=100,n2=200,result;
	result=n1+n2;
	return result;*/
		 ArrayList val= topic("api");
				// int v=val.size();
				 for(int i=0;i<val.size();i++)
				 {
					 System.out.println(val.get(i));
				 }
					 
		
	}
	public static ArrayList topic(String nm)
	{
		ArrayList al=new ArrayList();
		
		
		if(nm=="selenium")
		{
			al.add(100);
			al.add("testng");
			/*System.out.println("java");
			System.out.println("testnmg");
		}else if (nm=="api")
		{
			System.out.println("postman");
			System.out.println("soupui");*/
		}else if(nm=="api")
		{
			al.add('c');
			al.add("soupui");
		}
		return al;
}
}
