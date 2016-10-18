import java.util.Scanner;

public class hehexdstringhandling
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        String pass = "false";

        System.out.println("what is ur first and last name");
        String name = input.nextLine();
        System.out.println(name.length());

        System.out.println("Enter Your Postcode");
        String post = input.nextLine();
        System.out.println(post.toUpperCase());

        while (pass.equals("false")){
            System.out.println("please enter a password of your choice");
            String p1 = input.nextLine();
            System.out.println("please re enter your password");
            String p2 = input.nextLine();
        
        

        	if (p1.equals(p2)){
            	System.out.println("password verified");
            	pass =("true");
            	
            	System.out.println(pass);
        }
        	else {
            	System.out.println("you suck");
        }

    }
    	int n = (name.indexOf(" "));
    	n++;
        for (int i = n; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
        
        
}
}


        