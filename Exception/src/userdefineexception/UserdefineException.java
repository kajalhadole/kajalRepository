package userdefineexception;

public class UserdefineException {

  public void m1 (int age) {
	  if(age<=18)
		  throw new IllegalArgumentException ("Under age") ;
	  else 
		  System.out.println("Allowed to vote");
  }
 public static void main(String[] args) {
	 UserdefineException checkage= new UserdefineException();
	 checkage.m1(17);
	 checkage.m1(37);
}

}
