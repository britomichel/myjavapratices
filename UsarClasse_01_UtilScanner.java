import java.util.Scanner; // import the Scanner class 

class UsarClasse_01_UtilScanner {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username:"); 
    userName = myObj.nextLine();
    myObj.close();
       
    System.out.println("Username is: " + userName);        
  }
}
