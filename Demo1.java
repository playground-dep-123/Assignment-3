import java.util.Scanner;


public class Demo1{
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
     
        final String colorGreen="\033[32;1m";
        final String colorRed="\033[31;1m";
        final String colorYellow="\033[33;1m";
        final String colorBlue="\033[34;1m";
        final String COLOUR;
        final String COLOURSUB1;
        final String COLOURSUB2;
        final String COLOURSUB3;
        String status;
        final String COLORRESET="\033[0m";
        String marksStatusSub1;
         String marksStatusSub2;
          String marksStatusSub3;
        
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
        


        if(subject1.startsWith("SE-")==false)
        {
            System.out.println("\033[31:1mInvalid Subject");
            return;

            
        }
        int codeSubject1=Integer.parseInt(subject1.substring(3));
        System.out.print("Enter Your Marks 1:");
        double marks1=scanner.nextDouble();
        scanner.nextLine();
         


        if((0<=marks1 & 100>=marks1)==false){
            System.out.println("\033[31:1mInvalid Marks");
            return;
        }
         if(marks1>=75)
        {
            marksStatusSub1="Distinguish pass";
            COLOURSUB1=colorBlue;
        }
        else if(marks1>=65){
            marksStatusSub1="Credit Pass";
            COLOURSUB1=colorGreen;
            
            
        } 
        else if(marks1>=55){
            marksStatusSub1="Pass";
            COLOURSUB1=colorYellow;
            
        } 
        else {
            marksStatusSub1="Fail";
            COLOURSUB1=colorRed;
        }
        


        //Subject 2
         System.out.print("Enter Your Subject 2: ");
        String subject2=scanner.nextLine();
          

        if((subject2.startsWith("SE-") && subject2.equals(subject1)))
        {
            System.out.println("\033[31:1mInvalid Subject");
            return;

            
        }
        int codeSubject2=Integer.parseInt(subject2.substring(3));
        System.out.print("Enter Your Marks 2:");
        double marks2=scanner.nextDouble();
        scanner.nextLine();


        if((0<=marks2 & 100>=marks2)==false){
            System.out.println("\033[31:1mInvalid Marks");
            return;
        }

          if(marks2>=75)
        {
            marksStatusSub2="Distinguish pass";
            COLOURSUB2=colorBlue;
        }
        else if(marks2>=65){
            marksStatusSub2="Credit Pass";
            COLOURSUB2=colorGreen;
            
            
        } 
        else if(marks2>=55){
            marksStatusSub2="Pass";
            COLOURSUB2=colorYellow;
            
        } 
        else {
            marksStatusSub2="Fail";
            COLOURSUB2=colorRed;
        }
        
        //Subject 3
         System.out.print("Enter Your Subject 3: ");
        String subject3=scanner.nextLine();
         

        if((subject2.startsWith("SE-") && (subject3.equals(subject1) || subject3.equals(subject2))))
        {
            System.out.println("\033[31:1mInvalid Subject");
            return;

            
        }
         int codeSubject3=Integer.parseInt(subject3.substring(3));
        System.out.print("Enter Your Marks 3:");
        double marks3=scanner.nextDouble();
        scanner.nextLine();


        if((0<=marks3 & 100>=marks3)==false){
            System.out.println("\033[31:1mInvalid Marks");
            return;
        }

        if(marks3>=75)
        {
            marksStatusSub3="Distinguish pass";
            COLOURSUB3=colorBlue;
        }
        else if(marks3>=65){
            marksStatusSub3="Credit Pass";
            COLOURSUB3=colorGreen;
            
            
        } 
        else if(marks3>=55){
            marksStatusSub3="Pass";
            COLOURSUB3=colorYellow;
            
        } 
        else {
            marksStatusSub3="Fail";
            COLOURSUB3=colorRed;
        }
        

        double totalMarks=marks1+marks2+marks3;
        double avgMarks=totalMarks/3;
         if(avgMarks>=75)
        {
            status="Distinguish pass";
            COLOUR=colorBlue;
        }
        else if(avgMarks>=65){
            status="Credit Pass";
            COLOUR=colorGreen;
            
            
        } 
        else if(avgMarks>=55){
            status="Pass";
            COLOUR=colorYellow;
            
        } 
        else {
            status="Fail";
            COLOUR=colorRed;
        }
        
        
        
       






    System.out.println("+"+"-".repeat(53)+"+");
    System.out.printf("|Name   : \033[32;1m%-43s\033[0m |\n",name.toUpperCase());
    System.out.printf("|Age    : \033[31:1m%d\033[0m %-39s  |\n",age,"Years old");
    System.out.printf("|Status : %s%-41s\033[0m   |\n",COLOUR,status);
    System.out.printf("|Total  : %-15.2f Avg:%.2f%-17s  |\n",totalMarks,avgMarks,"%");
    System.out.println("+"+"-".repeat(53)+"+");

    System.out.printf("|%-16s| %-15s |%-18s|\n","Subject","Marks","Status");
    System.out.println("+"+"-".repeat(53)+"+");
    System.out.printf("|SE-%03d%10s| %-15.2f |%s%-18s%s|\n",codeSubject1,"",marks1,COLOURSUB1,marksStatusSub1,COLORRESET);
    System.out.printf("|SE-%03d%-10s| %-15.2f |%s%-18s%s|\n",codeSubject2,"",marks2,COLOURSUB2,marksStatusSub2,COLORRESET);
        System.out.printf("|SE-%03d%-10s| %-15.2f |%s%-18s%s|\n",codeSubject3,"",marks3,COLOURSUB3,marksStatusSub3,COLORRESET);
     System.out.println("+"+"-".repeat(53)+"+");







    

        
        
        
    
        

    

    }
}


        