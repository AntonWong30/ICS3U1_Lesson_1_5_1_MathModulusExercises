class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:Anton Wong
  */
  
  public void run() {
    
    //variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    //get the inputs
    dblSideA = readDouble("Enter side A of the triangle: ");
    dblSideB = readDouble("Enter side B of the triangle: ");
    dblAngleC = readDouble("Enter the angle between Side A and B: ");

    //calculate area
    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC))) / 2.0;

    //output
    System.out.println("The area is " + dblArea);
    
  }
}