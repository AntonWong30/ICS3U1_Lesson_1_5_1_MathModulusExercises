class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:Anton Wong
  */
  
  public void run() {
    
    double dblCels;
    double dblFerenht;
    
    dblFerenht = readDouble("Enter the temperature in degrees Fahrenheit: ");

    dblCels = 5.0/9.0 * (dblFerenht - 32);

    System.out.println(dblFerenht+ " degrees Fahrenheit = " + dblCels + " degrees Celsius.");
    
  }
}