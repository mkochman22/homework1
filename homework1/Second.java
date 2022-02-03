// Mary Kochmanski
// CIS 221, Tuesdays and Thursdays at 2:10PM

public class Second {
   public static void main(String[] args) {
      Main myObj = new Main();
      int result = myObj.x * myObj.y;			//multiplys data from Main.java
      System.out.println("First number: " + myObj.x);	//prints the value of x from Main.java
      System.out.println("Second number: " + myObj.y);	//prints the value of y from Main.java
      System.out.println("Result: " + result);		//prints result of manipulating data from Main.java
   }
}