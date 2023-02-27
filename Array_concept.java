package javabasics;

import java.util.ArrayList;

public class Array_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name[]=new String[5];
	
		System.out.println(name.length);
		name[0]="anu";
		name[1]="bharti";
		name[2]="viki";
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		
		String details[][]=new String[2][3];
		details[0][0]="naresh";
		details[0][1]="abc1234";
		details[0][2]="abc1234";
		details[1][0]="kumar";
		details[1][1]="xyy1234";
		details[1][2]="xyz1234";
		
		System.out.println(details.length);
		System.out.println(details[0].length);
		
		for(int i=0;i<details.length;i++)
		{
		
			for(int j=0;j<details[0].length;j++)
			{
				System.out.print(details[i][j]+" ");				
		}
		
		System.out.println();
		}
		
		Object details[]=new Object[4];
		details[0]="naresh";
		details[1]='g';
		details[2]=1992;
		details[3]=10.4;
		
		for(int i=0;i<details.length;i++)
		{
			System.out.println(details[i]);
		}
		Object details[][]=new Object[2][4];
		details[0][0]="naresh";
		details[0][1]='g';
		details[0][2]=1993;
		details[0][3]=10.4;
		details[1][0]="kumar";		
		details[1][1]='m';
		details[1][2]=1998;
		details[1][3]=5.5;
		
		for(int i=0;i<details.length;i++)
		{
			for(int j=0;j<details[0].length;j++)
			{
				System.out.print(details[i][j]+" ");
			}
			System.out.println();
		}
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("ani");
		al.add('g');
		al.add(400);
		al.add(500);
		al.add(600);
		System.out.println(al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		
		//System.out.println(al.get(3));
		//al.remove(3);

		//System.out.println(al.get(3));*/
		
		ArrayList<Character>al=new ArrayList<Character>();
		
	//	ArrayList<Integer>al=new ArrayList<Integer>();
		al.add('a');
		al.add('b');
		al.add('c');//2
		al.add('d');
		
		al.remove(2);
		
		//System.out.println(al.get(3));
		
		for(int i=0;i<al.size();i++)
{
			System.out.println(al.get(i));
	
}
		
		
	}

}
