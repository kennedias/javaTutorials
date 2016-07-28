package tutorial3;

/**
 *
 * @author 5399 - Kennedy Oliveira
 */
public class LandVehicle extends Vehicle{
    public int numberWheels;
    public int numberCogsFront;
    public int numberCogsBack; 
    
    public void showVehicle(){
        System.out.println("Properties from Vehicle:");
        System.out.println("Colour            : " + colour);
        System.out.println("Actual Speed      : " + actualSpeed);
        System.out.println("Frame Material    : " + frameMaterial);
        System.out.println("Number Wheels     : " + numberWheels);
        System.out.println("Number Cogs Front : " + numberCogsFront);
        System.out.println("Number Cogs Back  : " + numberCogsBack);
        
    }
    
}
