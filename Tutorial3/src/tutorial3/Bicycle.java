package tutorial3;

/**
 *
 * @author 5399 - Kennedy Oliveira
 */
public class Bicycle extends LandVehicle{
    
    //The information about gears are here because some land vehicules
    //could not have gears such as skate
    public int numberGears; 
    public int actualGear = 1; 

    
    public void showVehicle(){
        System.out.println("Properties from Vehicle:");
        System.out.println("Colour            : " + colour);
        System.out.println("Actual Speed      : " + actualSpeed);
        System.out.println("Frame Material    : " + frameMaterial);
        System.out.println("Number Wheels     : " + numberWheels);
        System.out.println("Number Cogs Front : " + numberCogsFront);
        System.out.println("Number Cogs Back  : " + numberCogsBack);
        System.out.println("Number Gears      : " + numberGears);
        System.out.println("Actual Gear       : " + actualGear);       
    }
    
    public void showActualGear(){
        System.out.println("Actual Gear       : " + actualGear);
    }
    
    public void increaseGear(){
        if(actualGear+1 > numberGears ){
            System.out.println("The current gear is already the top one"); 
        }else{
            actualGear++;
            showActualGear();
        }
    }
    
    public void decreaseGear(){
        if(actualGear-1 < 1 ){
            System.out.println("The current gear is already the minimal one");
        }else{
            actualGear--;
            showActualGear();
        }
    }
}
