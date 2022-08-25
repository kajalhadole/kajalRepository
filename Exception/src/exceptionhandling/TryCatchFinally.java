package exceptionhandling;

public class TryCatchFinally {// we can use multiple catch but before that try should be used 
  //catch will give the msg to bypass the situation on which exception occurred

public static void main(String[] args) throws InterruptedException{
	System.out.println(20/10);  
	System.out.println(32/16);
	
    Thread.sleep(2000);
	System.out.println(10/5);
	 try {
		System.out.println(5/0); ///this code is risky code & may causes exception 
	}                             /// try catch will handling this exception
	 catch(NullPointerException ref) {
		 System.out.println("Exception has occurred bcz of" + ref.getMessage());
	 }
	 catch (ArithmeticException ref1){
		 System.out.println("Exception has occurred bcz of" + ref1.getMessage());
	 }
	 finally {
		 System.out.println("finally will always run");
	 }
	 System.out.println(6/3);
}}
