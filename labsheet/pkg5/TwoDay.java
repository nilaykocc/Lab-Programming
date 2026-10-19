
package labsheet.pkg5;


public class TwoDay extends Package{
    private int flatFee=10;
    public TwoDay(String sName, String rName, String sAddress, String rAddress, String sCity, String rCity, String sState, String rState, int sZipCode, int rZipCode, double weight, double cost) {
        super(sName, rName, sAddress, rAddress, sCity, rCity, sState, rState, sZipCode, rZipCode, weight, cost);
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()+flatFee; 
                }
    
    
    
    
}
