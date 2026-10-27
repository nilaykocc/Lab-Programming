
package labsheet6;


public class Ride {
    
    private String passenferName;
    private String pickup;
    private  String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passenferName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passenferName = passenferName;
        this.pickup = pickup;
        this.destination = destination;
        setDistanceKm(distanceKm);
        setDurationMin(durationMin);
        setPricePerKm(pricePerKm);
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        if(distanceKm<0){
          System.out.println("Distance cannot negative");
            this.distanceKm=1;
        }else{
            
            this.distanceKm = distanceKm;
        }
        
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        if(durationMin<0){
            System.out.println("Duration cannot negative!");
            this.durationMin=1;
        }
        this.durationMin = durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(double pricePerKm) {
        if(pricePerKm<0){
            System.out.println("Price cannot negative!!");
            this.pricePerKm=1;
        }
        this.pricePerKm = pricePerKm;
    }
    
    public double calculateFare(){
        return (distanceKm*pricePerKm);
    }

    @Override
    public String toString() {
        return "passengerName= " + passenferName + ", pickup=" + pickup + ", destination=" + destination + ", distanceKm=" + distanceKm + ", durationMin=" + durationMin + ", pricePerKm=" + pricePerKm ;
    }
             
    
    
    
    
    
    
    
    
    
    
    
    
}
