class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:Anton Wong
  */
  
  public void run() {
    
    // variables
    double dblSideA;
    double dblSideB;
    double dblAnglC;
    double dblSideC;

    //get inputs
    dblSideA = readDouble("Enter length of side A: ");
    dblSideB = readDouble("Enter length of side B: ");
    dblAnglC = readDouble("Enter angle C in degrees: ");

    //calculate output
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - (2 * dblSideA * dblSideB * (Math.cos(Math.toRadians(dblAnglC)))));

    //output
    System.out.println("The value of side C is: " + dblSideC);
  }
}