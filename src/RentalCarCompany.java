
import java.util.*;

public class RentalCarCompany {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Identify some variables:
        
        int Firstchoice=0 ;
        double total;
        double CarCost=0  ;
        double InsuranceCost=0;
        double SpecificationCost =0;
        int NumberOfRentingDay =1;

        // Print the main menu :
        while(Firstchoice!=4){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----             Welcome to Rental Car Company             -----");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| 1: Car Type            |");
        System.out.println("| 2: Car Insurance       |");
        System.out.println("| 3: Payment             |");
        System.out.println("| 4: Exite               |");
        System.out.println("-----------------------------------------------------------------");
        //Ask user to choice
        System.out.print(">Please enter your choice: ");
        Firstchoice = input.nextInt();
        //print car type menu if the choice was 1:
        if (Firstchoice==1){
            
         String CarTypeChoice;
            do{
                System.out.println("------------- Car Type Menu ------------");
                System.out.println("----- Car Type          Price Form -----");
                System.out.println("----------------------------------------");
                System.out.println("| S or s : Small Car       $100        |"); 
                System.out.println("| M or m : Medium Car      $150        |");
                System.out.println("| L or l : Large Car       $200        |");
                System.out.println("| R or r : Return to Main Menu         |");
                System.out.println("----------------------------------------");
                //Ask user to choice from car type menu:
                System.out.print("> Please enter the choice: ");
                 CarTypeChoice = input.next();
                CarTypeChoice=CarTypeChoice.toUpperCase();
                //Store the cost of the car in relation to its size:
                if (CarTypeChoice.equals("S"))
                CarCost+=100;
                else if (CarTypeChoice.equals("M"))
                CarCost+=150;
                else if (CarTypeChoice.equals("L"))
                CarCost+=200;
                // print Car Optional Specification
                if (CarTypeChoice.equals("S")||CarTypeChoice.equals("M")||CarTypeChoice.equals("L")){
                System.out.println("-------------------------------Car Optional Specification----------------------------------");
                System.out.println("---Specification Type---------Default Options-------------Selection Options----------------");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("| Transmission Type           | M: Manual                 |A: Auto                           |");
                System.out.println("| Mileage                     | A: 200K/day               |B: 300K/day      C:Open Mileage   |");
                System.out.println("| Infant seat                 | N: No                     |Y: Yes                            |");
                System.out.println("| Handheld Navigation System  | N: No                     |Y: Yes                            |");
                System.out.println("-------------------------------------------------------------------------------------------");
                //Ask the user if he wants to change the above option:
                System.out.print("Would you like to update the above specification? Please enter the choice: (Y/N)?");
                String Specification = input.next();
                Specification = Specification.toUpperCase();
                
                if (Specification.equals("Y")){
                    // Ask the user to choose the options he wants
                    System.out.print("Please select the Transmission Type : ");
                    String Transmission = input.next();
                    Transmission= Transmission.toUpperCase();
                    
                if (Transmission.equals("A")){
                   System.out.println("Transmission Type changed to Auto");
                SpecificationCost += 10;}

                else if (Transmission.equals("M"))
                        System.out.println("Transmission Type changed to Manual");
                
                System.out.print("Please select the Mileage Type : ");
                String Mileage = input.next();
                Mileage = Mileage.toUpperCase();
                
                if (Mileage.equals("A"))
                    System.out.println("Mileage Type changed to choice A");
                else if (Mileage.equals("B")){
                     System.out.println("Mileage Type changed to choice B");
                SpecificationCost +=(0.15*CarCost);}
                else if (Mileage.equals("C")){
                    System.out.println("Mileage Type changed to choice C");
                SpecificationCost += (0.30*CarCost) ; }
                System.out.print("DO you want the Infant Seat option? ");
                String InfantSet = input.next();
                InfantSet=InfantSet.toUpperCase();
                
                if (InfantSet.equals("Y")){
                        System.out.println("Infant Seat option selected");
                SpecificationCost += 2;}
                
                System.out.print("DO you want the Handheld Navigation System option? ");
                String HandheldNavigationSystem = input.next();
                HandheldNavigationSystem = HandheldNavigationSystem.toUpperCase();
                
                if (InfantSet.equals("Y")){
                        System.out.println("Handheld Navigation System option selected");
                SpecificationCost += 4.99; }
                 }
               //  store the Default Specifications
                else if (Specification.equals("N")) 
                    System.out.println("Use the Default Specifications ");
                }
            }while (!(CarTypeChoice.equals("R")));
           
        
            
            
        }
        else if (Firstchoice==2){
            //print car insurance mnue in loop :
            String CarInsurance ;
            do {
                System.out.println("------------ Car Insurance ------------");
                System.out.println("---------------------------------------");
                System.out.println("| FC: Fully comprehensive            | ");
                System.out.println("| TPft: Third-party, fire and theft  | ");
                System.out.println("| TP: Third party                    | ");
                System.out.println("| PR:  Previous Menu                 | ");
            // ask user to enter his choice    
            System.out.print("> Please enter the choice: ");
                 CarInsurance = input.next();
                CarInsurance=CarInsurance.toUpperCase();
            if(CarInsurance.equals("FC"))
                InsuranceCost += CarCost*(0.30);
            else if (CarInsurance.equals("TPFT"))
                InsuranceCost += CarCost*(0.20);
            else if (CarInsurance.equals("TP"))
                InsuranceCost = CarCost*(0.10);
                
                
            }while (!(CarInsurance.equals("PR")));
        }
        else if (Firstchoice==3){
            
            String Name,phone,PreferredDateOfRenting,BuildingNumber,StreetName,City,ZipCode;
            // ask user For personal rental information
            System.out.print(" > Enter your name (first and last): ");
            input.nextLine();
            Name= input.nextLine();
            
            
            do{
            System.out.print(" > Enter 10 digit for phone number start with 0: ");
            phone= input.nextLine();
            }while(!(phone.length()==10 && phone.charAt(0)=='0'));
            
            System.out.println("> Fill-in your address information: ");
            System.out.println("		 Enter building number: ");
            BuildingNumber = input.nextLine();
            System.out.println("		 Enter street name: ");
            StreetName = input.nextLine();
            System.out.println("		 Enter city: ");
            City = input.nextLine();
            System.out.println("");
            System.out.println("		 Enter zip code: ");
            ZipCode = input.nextLine();
            System.out.println("");
            System.out.println("> When do you want renting the Car  : ");
            PreferredDateOfRenting = input.nextLine();
            System.out.println("> Enter the number of days that you would like to rent the car :");
            NumberOfRentingDay = input.nextInt();
            System.out.println("");
            //print booking details
            System.out.println("----------------------------------------------------------------------");
            System.out.println(" Your request was received; and The following is your booking details ");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Your Confirmation Reference Number is :1100_"+Name.toUpperCase());
            System.out.println("");
            System.out.println("Name: "+Name+"                Phone: "+phone);
            System.out.println("Number of Renting Day: "+NumberOfRentingDay);
            System.out.println("Preferred date of Renting: "+PreferredDateOfRenting);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            //Calculate cost and total
            SpecificationCost *=NumberOfRentingDay;
            CarCost *=NumberOfRentingDay;
            InsuranceCost *=NumberOfRentingDay;
            total=SpecificationCost+CarCost+InsuranceCost;
            //prit the result:
            System.out.println("*** Cost Breakdown *** ");
            System.out.println("------------------------------------------------------------------");
            System.out.println("	Car Cost     	Specification Cost     	Cost of Insurance ");
            System.out.println("------------------------------------------------------------------");
            System.out.println("         "+CarCost+"           "+SpecificationCost+"                 "+InsuranceCost);
            System.out.println("------------------------------------------------------------------");
            System.out.println(" Total Cost:          "+total);
            System.out.println("***********Thank you for being our valued customer *************");
            System.out.println("****  and you can make another booking from the below menu ****");
            
        }
        }
        
        }
        
    
}