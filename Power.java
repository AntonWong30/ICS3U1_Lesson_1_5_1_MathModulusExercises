class Power extends ConsoleProgram {

  /**
  * Description
  * @author:Anton Wong
  */
  
  public void run() {
    //get variables
    double dblBase;
    double dblExp;
    double dblPow;
    
    // Get base + exponent
    dblBase = readDouble("Enter the base: ");
    dblExp = readDouble("Enter exponent: ");

    // Calculate power
    dblPow = Math.pow(dblBase, dblExp);

    // Output
    System.out.println(dblBase + " to the power of " + dblExp + " is " + dblPow);
  }
}