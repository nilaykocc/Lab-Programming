
package labsheet6;


public class PremiumRide extends Ride {
    private int comfortFee;
    private double surgeMultiplier;
    
    public PremiumRide(String passenferName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm,int comfortFee,double surgeMultiplier) {
        super(passenferName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee=comfortFee;
        setSurgeMultiplier(surgeMultiplier);
        
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        if(1.0<=surgeMultiplier &&3>=surgeMultiplier){
             this.surgeMultiplier = surgeMultiplier;
        }else{
            System.out.println("Error");
            this.surgeMultiplier=1;
        }
       
    }
@Override
    public double calculateFare() {
        return (super.calculateFare()+comfortFee)*surgeMultiplier; 
    }
    @Override
    public String toString() {
        return super.toString()+" Comfort Fee: "+this.comfortFee+" surge Multiplier: "+ this.surgeMultiplier; 
    }

    
    
    
    
    
    
    
    
    
}
