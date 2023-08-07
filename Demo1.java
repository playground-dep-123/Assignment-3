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
        int codeSubject1=Integer.parseInt(subject1.substring(3));


        if(subject1.startsWith("SE-")==false)
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
          int codeSubject2=Integer.parseInt(subject2.substring(3));

        if((subject2.startsWith("SE-") && subject2.equals(subject1)))
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
          int codeSubject3=Integer.parseInt(subject3.substring(3));

        if((subject2.startsWith("SE-") && (subject3.equals(subject1) || subject3.equals(subject2))))
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


       double totalMarks=marks1+marks2+marks3;
       double avgMarks=totalMarks/3;




String status;

if(avgMarks>=75)status="Distinguish pass";

else if(avgMarks>=65) status="Credit Pass";
else if(avgMarks>=55) status="Pass";
else status="Fail";

String subject="Maths";

final String colorRed="\033[31;1m";
final String colorGreen="\033[32;1m";
final String colorBlue="\033[34;1m";
final String colorYellow="\033[38;1m";
final String COLORRESET="\033[0m";
final String COLOUR=colorBlue;


    System.out.println("+"+"-".repeat(53)+"+");
    System.out.printf("|Name   : \033[32;1m%-43s\033[0m |\n",name.toUpperCase());
    System.out.printf("|Age    : \033[31:1m%d\033[0m %-39s  |\n",age,"Years old");
    System.out.printf("|Status : %s%-41s\033[0m   |\n",colorBlue,status);
    System.out.printf("|Total  : %-15.2f Avg:%.2f%-17s  |\n",totalMarks,avgMarks,"%");
    System.out.println("+"+"-".repeat(53)+"+");

    System.out.printf("|%-16s| %-15s |%-18s|\n","Subject","Marks","Status");
    System.out.println("+"+"-".repeat(53)+"+");
    System.out.printf("|SE-%-16s| %-15.2f |%s%-18s%s|\n",subject,marks1,COLOUR,status,COLORRESET);
    System.out.printf("|%-16s| %-15.2f |%s%-18s%s|\n",subject,marks1,COLOUR,status,COLORRESET);
        System.out.printf("|%-16s| %-15.2f |%s%-18s%s|\n",subject,marks1,COLOUR,status,COLORRESET);
     System.out.println("+"+"-".repeat(53)+"+");







    

        
        
        
    
        

    

    }
}


        