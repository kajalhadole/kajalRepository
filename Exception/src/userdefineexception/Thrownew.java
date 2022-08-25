package userdefineexception;

public class Thrownew {

   public void m1(String name, int age ) {
	   System.out.println(name +" "+age);
	   try {
		   if(age<=18)
			   throw new IllegalArgumentException("under age");
			   else 
				   System.out.println("Allowed to vote");
		   }
	   catch (IllegalArgumentException a) {
		   System.out.println(a.getMessage());
	   }
	   }
   public static void main(String[] args) {
	   Thrownew checkage = new Thrownew();
	   checkage.m1("Anubhav", 17);
	   checkage.m1("Raju", 50);
}
   }
