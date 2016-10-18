import java.util.Scanner;
public class level2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int wordnumber = 1;
        System.out.println("enter a saying");

        String saying = input.nextLine();
        int lwnght = saying.length();
        
        for (int i = 0; i  < saying.length(); i++){
            if (saying.charAt(i) == ' '){
                wordnumber = wordnumber+1;
            }
        }
        
        System.out.println(wordnumber);
        
        
       
             for (int i = saying.length()-1; i  >= 0 ; i--){

                System.out.print(saying.charAt(i));

            }
        }

    }




        