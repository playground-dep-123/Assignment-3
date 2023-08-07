import java.util.Scanner;

public class Demo1{
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter Your Name: ");
        String name=scanner.nextLine();
        if((name.length()>0 & name.strip().length()>0)==false)
        {

            System.out.println("\033[31:1mInvalid Name");
            return;

       
        }
       

        
        System.out.print("Enter Your Age: ");
        int age=scanner.nextInt();
        scanner.nextLine();
        if((10<=age & age<=18)==false){
            System.out.println("\033[31:1mInvalid Age");
            return;

        }
        //Subject 1
        System.out.print("Enter Your Subject 1: ");
        String subject1=scanner.nextLine();

        if(subject1.startsWith("se-")==false)
        {
            System.out.println("\033[31:1mInvalid Subject");
            return;

            
        }
        System.out.print("Enter Your Marks 1:");
        double marks1=scanner.nextDouble();
        scanner.nextLine();

        if((0<=marks1 & 100>=marks1)==false){
            System.out.println("\033[31:1mInvalid Marks");
            return;
        }

        //Subject 2
         System.out.print("Enter Your Subject 2: ");
        String subject2=scanner.nextLine();

        if((subject2.startsWith("se-") && subject2.equals(subject1)))
        {
            System.out.println("\033[31:1mInvalid Subject");
            return;

            
        }
        System.out.print("Enter Your Marks 2:");
        double marks2=scanner.nextDouble();
        scanner.nextLine();

        if((0<=marks2 & 100>=marks2)==false){
            System.out.println("\033[31:1mInvalid Marks");
            return;
        }
//Subject 3
         System.out.print("Enter Your Subject 3: ");
        String subject3=scanner.nextLine();

        if((subject2.startsWith("se-") && (subject3.equals(subject1) || subject3.equals(subject2))))
        {
            System.out.println("\033[31:1mInvalid Subject");
            return;

            
        }
        System.out.print("Enter Your Marks 3:");
        double marks3=scanner.nextDouble();
        scanner.nextLine();

        if((0<=marks3 & 100>=marks3)==false){
            System.out.println("\033[31:1mInvalid Marks");
            return;
        }


       



    

        
        
        
    
        

    

    }
}


        