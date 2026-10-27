
package labsheet6;

/**
 *
 * @author Nilay
 */
public class SharedRide extends EconomyRide{
    private int passengerCount;
    public SharedRide(String passenferName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, int pricePerMin,int passengerCount) {
        super(passenferName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMin);
        setPassengerCount(passengerCount);
    }
    
    public void setPassengerCount(int passengerCount) {
        if(1<=passengerCount &&4>=passengerCount){
            this.passengerCount = passengerCount;
        }else{
            System.out.println("Passenger count is over");
            this.passengerCount=1;
        }
        
        
    }
  @Override
    public double calculateFare() {
        return super.calculateFare()/passengerCount+(0.1); 
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"Passenger count: "+ this.passengerCount; 
    }
    
    
}
