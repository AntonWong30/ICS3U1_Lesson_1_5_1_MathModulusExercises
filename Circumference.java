class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:Anton Wong
  */
  
  public void run() {
    // variables
    double dblRadius;
    double dblCircum;

    //get input
    dblRadius = readDouble("Please enter the length of the radius:");
    
    //calculate output
    dblCircum = Math.PI * 2 * dblRadius;

    //output
    System.out.println("The circumeference of the circle is " + dblCircum);

  }
}