class Rads extends ConsoleProgram {

  /**
  * Description
  * @author: Anton Wong
  */
  
  public void run() {
    //get variables
    double dblDegrees;
    double dblRadians;
    
    // Get the degrees 
    dblDegrees = readDouble("Enter the angle in degrees: ");

    // Convert to radians
    dblRadians  = Math.toRadians(dblDegrees);
    
    // Output
    System.out.println(dblDegrees + " degrees = " + dblRadians + " radians");    
  }
}