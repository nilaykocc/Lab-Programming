
package labsheet.pkg5;


public class NewMain {

    public static void main(String[] args) {
        
        Package p=new Package("Nilay","Seher","Melikgazi","Lindenstrasse","Kayseri","bErlin","Preparing","Returned",3038,1069,1.05,46);
        System.out.println("======================State Package==============================");
        p.displayInfo();
        System.out.println("Total price: "+p.calculateCost());
        
        TwoDay t1=new TwoDay("Furkan","Güven","talas","uskudar","Kayseri","Istanbul","preparing","Alindi",3033,102,3.7,21);
        System.out.println("======================TwoDay Package==============================");
        t1.displayInfo();
        System.out.println("Total price: "+t1.calculateCost());
        
        OverNight o1=new OverNight("Elif","Berra","Kizilay","meydan","Ankara","Kayseri","Shipped","cancelled",23,19,4,456);
        System.out.println("======================OverNight Package==============================");
        o1.displayInfo();
        System.out.println("Total price: "+o1.calculateCost());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
