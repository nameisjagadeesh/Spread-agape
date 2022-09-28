class billionaires{
	static String[]billionaire={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	static void save(String name)
	{
	if (position>=9)
	{
	System.out.println("the list of billionaires");
	return;
	}
		if(billionaire!=null && name.length()>=4)
		{
			billionaire[position]=name;
			System.out.println("name:"+name+"::"+position);
			position++;
		}
	}
	static void display()
	{
		for (int mint=0;mint<billionaire.length;mint++)
		{
			String kings=billionaire[mint];
			System.out.println(kings);
		}
	}
	static boolean find(String name)
	{
		if(billionaire!=null && name.length()>=4)
		{
			for(int money=0;money<billionaire.length;money++)
			{
				String ref=billionaire[money];
				if(ref==name)
				{
					System.out.println("found name:"+ref);
					return true;
				}	
				
			}
			
		}
		return false;
	}
	static String update(String oldName,String newName)
	{
		if(oldName!=null && newName!=null)
		{
			if(oldName.length()>=4 &&newName.length()>=4)
			{
				for(int wealth=0;wealth<billionaire.length;wealth++)
				{
					String ref=billionaire[wealth];
					if(ref==oldName)
					{
					System.out.println("old Name was:"+ref);	
					billionaire[wealth]=newName;
                    System.out.println("update Name is:"+newName);					
						return newName;
					}
					
				}
				
			}
		}return  null;
	}
	static String update1(int index,String newName)
	{
		if(newName!=null && newName.length()>=4)
		{   
     		System.out.println("old point:"+index);
		    billionaire[index]=newName;
			System.out.println("update Name:"+newName);
					return newName;
		}return null;
	}
    static boolean delete(String name)
	{
		if(billionaire!=null && name.length()>=4)
		{
			for(int peace=0;peace<billionaire.length;peace++)
			{
				String ref=billionaire[peace];
				if(ref==name)
				{
					System.out.println("entred name was :"+name);
					ref=null;
					System.out.println("name deleted now is:"+ref);
					return true;
				}	
			}
			
		}
		return false;	
	}
	static boolean delete1(int index,String name)
	{
		if(name!=null && name.length()>=4)
		{   
     		System.out.println(" index:"+index);
		    billionaire[index]=name;
			name=null;
			System.out.println("update Name:"+name);
			return true;
		}return false;
    }
	
}