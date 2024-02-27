class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:Anton Wong
  */
  
  public void run() {
    //variables
    int intMinutes;
    int intDays;
    int intHours;
    
    //variables
    int intLeftOvrMin;
  
    intMinutes = readInt("Enter number minutes: ");

    intDays = intMinutes/(1440);
    intLeftOvrMin = intMinutes % 1440;

    intHours  = intLeftOvrMin/60;
    intLeftOvrMin = intLeftOvrMin % 60;
   
    System.out.println (intDays + " day(s) " + intHours + " hour(s) " + intLeftOvrMin + " minute(s).");
    
  }
}