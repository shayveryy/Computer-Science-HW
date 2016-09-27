import java.util.Scanner;
public class numberadder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in) ;
        int min, max ,total,numbersadded;
        float mean;
        String cont;
       
        System.out.println ("enter a number");
        int number = input.nextInt();
        min = number ;
        max = number ;
        total = number ;
        numbersadded = 1 ;
        mean = number ;
        cont="yes" ;
        
        while (!cont.equals("no")) {
            System.out.println ("enter a number");
            int number2 = input.nextInt();
            if (number2 > max){
                max = number2 ;
            }
            else if (number2 < min) {
                min = number2 ;
            }
            total = total + number2 ;
            numbersadded = numbersadded + 1 ;
            mean = total/numbersadded ;
            System.out.println (min);
            System.out.println (max);
            System.out.println (mean);
            System.out.println ("do you want to continue?");
            cont = input.nextLine();

        }
    }
}
            
           
                
              
            
          
            
       
        