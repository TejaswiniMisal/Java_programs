import java.util.Scanner;

public class evenodd{
  public static void main( String args[]){
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the value:");
     
    int num= reader.nextInt();
      if(num %2== 0)
      
      System.out.println(num+ "it is even");
      
      else
      
      System.out.println(num+ "is is odd");
      
 }

}