package carr;

public class Carr {

    String plateNumber;
    String model;
    double mileage;
    double fuelLevel;
    double tankCapacity;

    public Carr(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

   

    public void Drive(double km){
        
        double l=km/10;
        
        if(this.fuelLevel<l){
            System.out.println("Not enough fuel to complete this trip! ");
        }else{
            this.mileage+=km;
            this.fuelLevel-=l;
            System.out.println("Driving " + km );
        }
        
    }
    
    public void Refuel(double amount){
           if(this.fuelLevel+amount>this.tankCapacity){
               this.fuelLevel=this.tankCapacity;
               System.out.println("tan is full!");
           } else{
               this.fuelLevel+=amount;
              System.out.println("Refueling " + amount );
               
           }
        }
    
    
  
        
    public void checkStatus() {
               
              System.out.println("Plate Number: " + this.plateNumber); 
              System.out.println("Car Model: " + this.model);  
              System.out.println("Current Mileage: " + this.mileage );
              System.out.println("Current Fuel Level: " + this.fuelLevel );
              
                  double a=this.tankCapacity*0.1;
                     if (this.fuelLevel < a){
              System.out.println("Low fuel wsrning");
    }

    }
    

    public static void main(String[] args) {

        
        
        Carr car1=new Carr("ALA 38 599","Peugot",30.0,50.0);
        
        car1.checkStatus();
        car1.Drive(120);
        car1.Refuel(30);
        
        
    }
}