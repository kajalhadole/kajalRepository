package exceptionhandling;

public class Throws {

public static void main(String[] args) throws InterruptedException {   //throws keyword must be used with method then only after writing 
	                                                 //'thread.sleep()' not shows error 
	                                                 // if we do not use throws the error shows in 'thread.sleep()' line
	
	System.out.println(1);  
	System.out.println(2);
     Thread.sleep(2000);    
	System.out.println(4);
	System.out.println(6);
	System.out.println(8);
  }









}
