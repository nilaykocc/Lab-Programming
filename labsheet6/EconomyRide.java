/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet6;

/**
 *
 * @author Nilay
 */
public class EconomyRide extends Ride{
   private int pricePerMin;
    
    public EconomyRide(String passenferName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm,int pricePerMin) {
        super(passenferName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMin=pricePerMin;
        
    }

    @Override
    public double calculateFare() {
        if(super.calculateFare()+(this.getDurationMin()*pricePerMin)<=50){
            return 50;
        }else{
        return super.calculateFare()+(this.getDurationMin()*pricePerMin); 
      
        }
    }

    @Override
    public String toString() {
        return super.toString()+"price per minute= "+this.pricePerMin; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
