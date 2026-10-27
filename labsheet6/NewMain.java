
package labsheet6;

import java.util.ArrayList;

public class NewMain {

    
    public static void main(String[] args) {
        
        ArrayList<Ride>yolcular=new ArrayList<>();
        
        Ride r1=new Ride("Nilay","Eru","Eve",45,6,567);
        EconomyRide e1=new EconomyRide("Furkan","Eru","Anayurt",13,4,54,12);
        PremiumRide p1=new PremiumRide("Güven","ev","erü",4234,567,67,76,3);
        SharedRide s1=new SharedRide("Elif","Kayseripark","forum",34,4,68,34,5);
        yolcular.add(r1);
        yolcular.add(e1);
        yolcular.add(p1);
        yolcular.add(s1);
        for(Ride r: yolcular){
            System.out.println("===============INFO Ride================");
            System.out.println(r.toString() );
            System.out.println("Calculated Fare:"+r.calculateFare());
            
        }
        
     
        
        
        
        
        
        
        
        
        
        
    }
    
}
