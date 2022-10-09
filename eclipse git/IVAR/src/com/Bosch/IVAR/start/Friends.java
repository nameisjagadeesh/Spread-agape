package com.Bosch.IVAR.start;

public class Friends {

	static String[] myfriends={null,null,null,null};
	static int position=0;
	static void save(String friend)
	{
	  if (position>=3)
	  {
		  System.out.println("names are four");
		  return;
	  }
	  if(myfriends!=null && friend.length()>=5)
	  {
		  System.out.println("names are here to store");
		  myfriends[position]=friend;
		  System.out.println("positiom:"+position+"=:"+friend);
		  position++;
	  }
		  
	  }
	static void display()
	{
		for(int name=0; name<=myfriends.length;name++)
		{
			String ref=myfriends[name];
			System.out.println(ref);
		}
	}
	}
	

