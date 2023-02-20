public class RandomizarComIfElse {
  public static void main(String[] args) {
    int time = 0;
    time = (int)(Math.random() * 24);
    System.out.println("Time is: " + time);
    if (time < 6) {
      System.out.println("Go to sleep.");
    } else if (time < 12) {
      System.out.println("Good morning.");
    } else if (time < 18) {
      System.out.println("Good day.");
    }  else {
      System.out.println("Good evening.");
    }
  }
}