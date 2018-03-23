package NuralPKG;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import scrsun.db_conn;

public class FirstClass {
	BeanClass bean;
	BeanClass[] array;
	ArrayList<BeanClass> list;
	 java.sql.Connection con;
	 HashSet<BeanClass> set;
	public FirstClass() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		con = db_conn.db_Connections1();
		list = new ArrayList<BeanClass>();
		 set = new HashSet<BeanClass>();
	}
	
	public ArrayList<BeanClass> getData()
	{
		
		try {
            PreparedStatement pd = con.prepareStatement("select * from components ");
            ResultSet rs = pd.executeQuery();
            
            while (rs.next()) {
				String name = rs.getString(1);
				String TV = rs.getString(2);
				String LV = rs.getString(3);
				String Lincense = rs.getString(4);
				String Author = rs.getString(5);
				String Maintainer = rs.getString(6);
				String PL = rs.getString(7);
				String MU = rs.getString(8);
				String DU = rs.getString(9);
				String OS = rs.getString(10);
				String PD = rs.getString(11);
				String Desc = rs.getString(12);
				String AV = rs.getString(13); 
				String NOD = rs.getString(14);
				String Depend = rs.getString(15);
				String Source = rs.getString(16);
				
				
			bean = new BeanClass(name, TV, LV, Lincense, Author, Maintainer, PL, MU, DU, OS, 
					PD, Desc, AV, NOD, Depend, Source);
			
		 
			list.add(bean);
			
			
				
			}
            
           /* if (rs.next()) {
				System.out.println("You are Successfully LogIn");
			}else{
				System.out.println("Your Username or password are incorrect");
			}*/
            
		}catch(Exception e)
		{
			System.out.println(""+e);
		}
		
		return list;
	}
	
	public HashSet<BeanClass> showName(ArrayList<BeanClass> list, String name)
	{
		Collections.sort(list, new NameComparator(name));
		
		set.clear();
		for (int i = 0; i < list.size(); i++) {
		
			char[] s1 = name.toCharArray();
			char[] s2 = list.get(i).getName().toCharArray();
			if(name.equals(list.get(i).getName()))
			{
				System.out.println(list.get(i).getName());
				break;
			}
			else{
				
			for(char x : s1)
			{
				for(char x1 : s2)
				{
					if(x==x1)
					{
					//	System.out.println(list.get(i).getName()+"..."+x);
						set.add(list.get(i));
					/*	set.add(list.get(i).getTotal_Versions());
						set.add(list.get(i).getLatest_version());
						set.add(list.get(i).getLicense());
*/					}
				}
			}
	
				/*}else
				{
				String name1 = list.get(i).getName();
			//	int x = name.compareTo(list.get(i).getName());
				
				String[] sorted = Stream.of(name, name1).sorted().toArray(String[]::new);
				System.out.println(sorted[0] + " is before " + sorted[1]);
				
				}*/
		}
		}
		/*for(BeanClass s : set)
		{
			System.out.println("//////"+s.getName());
		}*/
		
		return set;
		
	}
	
	public HashSet<BeanClass>  showOS(ArrayList<BeanClass> list, String os)
	{
		Collections.sort(list, new OSComparator());
	
		set.clear();
		for (int i = 0; i < list.size(); i++) {
		
			char[] s1 = os.toCharArray();
			char[] s2 = list.get(i).getOperating_system().toCharArray();
			if(os.equals(list.get(i).getOperating_system()))
			{
				System.out.println(list.get(i).getOperating_system());
				break;
			}
			else{
				
			for(char x : s1)
			{
				for(char x1 : s2)
				{
					if(x==x1)
					{
						set.add(list.get(i));
					}
				}
			}
	
		}
		}
		
		return set;
	}
	
	public HashSet<BeanClass>  showVersion(ArrayList<BeanClass> list, String version)
	{
		Collections.sort(list, new VersionComparator());
	
		set.clear();
		for (int i = 0; i < list.size(); i++) {
		
			char[] s1 = version.toCharArray();
			char[] s2 = list.get(i).getTotal_Versions().toCharArray();
			if(version.equals(list.get(i).getTotal_Versions()))
			{
				System.out.println(list.get(i).getTotal_Versions());
				break;
			}
			else{
				
			for(char x : s1)
			{
				for(char x1 : s2)
				{
					if(x==x1)
					{
						set.add(list.get(i));
					}
				}
			}
	
		}
		}
		
		return set;
	}
	
	public HashSet<BeanClass>  showlisence(ArrayList<BeanClass> list, String lisence)
	{
		Collections.sort(list, new LisenceComparator());
	
		set.clear();
		for (int i = 0; i < list.size(); i++) {
		
			char[] s1 = lisence.toCharArray();
			char[] s2 = list.get(i).getLicense().toCharArray();
			if(lisence.equals(list.get(i).getLicense()))
			{
				System.out.println(list.get(i).getLicense());
				break;
			}
			else{
				
			for(char x : s1)
			{
				for(char x1 : s2)
				{
					if(x==x1)
					{
						set.add(list.get(i));
					}
				}
			}
	
		}
		}
		
		return set;
	}
	
	

}
