
package labsheet.pkg5;

public class Package {
    
    private String sName;
    private String rName;
    private String sAddress;
    private String rAddress;
    private String sCity;
    private String rCity;
    private String sState;
    private  String rState;
    private int sZipCode;
    private int rZipCode;
    double weight;
    private double cost;

    public Package(String sName, String rName, String sAddress, String rAddress, String sCity, String rCity, String sState, String rState, int sZipCode, int rZipCode, double weight, double cost) {
        this.sName = sName;
        this.rName = rName;
        this.sAddress = sAddress;
        this.rAddress = rAddress;
        this.sCity = sCity;
        this.rCity = rCity;
        this.sState = sState;
        this.rState = rState;
        this.sZipCode = sZipCode;
        this.rZipCode = rZipCode;
        this.weight = weight;
        this.cost = cost;
    }

    public void setWeight(double weight) {
        if(weight>=0){
        this.weight = weight;
    }
    }

    public void setCost(double cost) {
        if(cost>=0){
        this.cost = cost;
    }
    }
    
    public double calculateCost(){
        return weight*cost;
    }
    
    public void displayInfo(){
        System.out.println("Sender: "+this.sName);
        System.out.println("Recipient: "+this.rName);
        System.out.println("Sender address: "+this.sAddress+" | Recepient address: "+this.rAddress);
        System.out.println("Sender city: "+this.sCity+" | Recipient city:"+this.rCity);
        System.out.println(" sender State: "+this.sState+" | Recipiet state: "+this.rState);
        System.out.println(" Sender ZIP CODE: "+this.sZipCode+" | Recpiet code: "+this.rZipCode);
        System.out.println("Weight: "+this.weight);
        System.out.println("Cost: "+this.cost);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
