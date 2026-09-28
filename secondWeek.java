
package Bus;

import java.util.Scanner;

public class secondWeek {

    
    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("How many seat are in the bus: ");
        int totalSeat=scanner.nextInt();
        
        System.out.println("How many stops are there: ");
        int totalStops =scanner.nextInt();
        scanner.nextLine();
        
        String[]names=new String[totalStops];
        int[]boarding=new int[totalStops];
        int[]alight=new int[totalStops];
        int[]current=new int[totalStops];
        
        int curentP=0;
        int totalBoarding=0;
        int totalAlighted=0;
        
        
         for (int i = 0; i < totalStops; i++) {
             System.out.println("-----Stops"+(i+1)+"------");
             
             System.out.print("Enter the stop name: ");
             names[i]= scanner.nextLine();
             
             System.out.print("number of boardin passangers: ");
             boarding[i]=scanner.nextInt();
             
             System.out.print("Number of alighting passangers: ");
             alight[i]=scanner.nextInt();
              scanner.nextLine();
              
             curentP = curentP + boarding[i] - alight[i];
             
            if (curentP < 0) {
                curentP = 0;
            }
            
             current[i] = curentP;
             

              totalBoarding=totalBoarding+boarding[i];
              totalAlighted=totalAlighted+alight[i];
             if(curentP>totalSeat){
                 System.out.println("Warning: Bus is over capacity");
             }
             
             
         }
         System.out.println("==============================================================================================================");
         System.out.println("                                 Route                                                                     ");
          System.out.println("============================================================================================================");
          System.out.println("Stop Name             Boarded Passengers         Alighted Passengers         Current Passengers ");
         System.out.println("===============================================================================================================");
        
      
         for (int i = 0; i < totalStops; i++){  
             System.out.println(names[i]+"                              "+
                                boarding[i]+"                                 "+
                                alight[i]+"                                   "+
                                 current[i]+"                  ");
         }
        
        
          System.out.println("=======================================================");
        System.out.println("                   STATISTICS                          ");
        System.out.println("=======================================================");
        System.out.println("Total Passengers Boarded : " + totalBoarding);
        System.out.println("Passengers at Last Stop  : " + curentP);
      

        scanner.close();
        
        
        
    }
    
}
