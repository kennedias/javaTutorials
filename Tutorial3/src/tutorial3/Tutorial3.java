package tutorial3;

/**
 *
 * @author 5399 - Kennedy Oliveira
 */
public class Tutorial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a Vehicle, properties exclusive from the top of the
        // inheritance.
       
        System.out.println("\nBuilding a vehicle");
        Vehicle vehicle = new Vehicle();
        vehicle.colour = "Blue";
        vehicle.actualSpeed = 20.50;
        vehicle.frameMaterial = "fiber glass";
        vehicle.showVehicle();
 
        System.out.println("\nBuilding a land vehicle");
        LandVehicle landVehicle = new LandVehicle();
        landVehicle.colour = "RED";
        landVehicle.actualSpeed = 40;
        landVehicle.frameMaterial = "steel";
        landVehicle.numberWheels = 2;
        landVehicle.numberCogsFront = 1;
        landVehicle.numberCogsBack = 2;
        landVehicle.showVehicle();       
        
        System.out.println("\nBuilding a bicycle");
        Bicycle bicycle = new Bicycle();
        bicycle.colour = "black";
        bicycle.actualSpeed = 25;
        bicycle.frameMaterial = "aluminum";
        bicycle.numberWheels = 2;
        bicycle.numberCogsFront = 1;
        bicycle.numberCogsBack = 2;
        bicycle.numberGears = 21; 
        bicycle.showActualGear(); 

        //Comented lines used to play with the gears.
        //Change the value of the number gears also.
        //Use them for test
        bicycle.increaseGear();
        bicycle.increaseGear();
        bicycle.increaseGear();
        bicycle.increaseGear();
        bicycle.increaseGear();    
        bicycle.decreaseGear();
/*        bicycle.decreaseGear();
        bicycle.decreaseGear();
        bicycle.decreaseGear();
        bicycle.decreaseGear();
        bicycle.decreaseGear();*/
                
        bicycle.showVehicle();      
    }
    
}
