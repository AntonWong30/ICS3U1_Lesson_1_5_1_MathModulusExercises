class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:Anton Wong
  */
  
  public void run() {

    int intHours;
    int intDays;
    int intLeftOverHours;

    intHours = readInt("Enter number of hours: ");

    intDays = intHours/24;
    intLeftOverHours = intHours % 24;

    System.out.println(intHours + " = " + intDays + " days + " + intLeftOverHours + " hours");
    
  }
}