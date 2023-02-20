public class SimpleIfElseDayEvening {
  public static void main(String[] args) {   
    
    int time = (int)(Math.random() * 24);
    
    System.out.print("Hour: ");
    System.out.println(time);
    String result;

    result = (time < 18) ? "Good day." : "Good evening.";

    System.out.println(result);
  }
}