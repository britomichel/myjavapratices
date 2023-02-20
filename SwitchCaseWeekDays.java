public class SwitchCaseWeekDays {
  public static void main(String[] args) {
  int day = (int)(1 + Math.random() * 7);
	System.out.println("Day: " + day);
	// dias da semana
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
	// caso seja dia de folga ou não
	switch (day) {
		case 6:
		  System.out.println("Stay in home, it\'s a Saturday");
		  break;
		case 7:
		  System.out.println("Stay in home, it\'s a Sunday");
		  break;
		default:
		  System.out.println("Go to work...");
	}
  }
}