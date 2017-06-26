package p6;

public enum Month {
	
   
	
	JAN("january"),FEB("february"),MAR("march"),APR("april"),MAY("may");
	
	  private String msg;	
	  
	  private Month(String s)
	  {
		  msg=s;
	  }

	  public void show()
	  {
		  System.out.println(msg);
	  }

};