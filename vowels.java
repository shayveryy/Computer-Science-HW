import java.util.Scanner;
public class vowels
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a saying");
        String word = input.nextLine();
        int length = word.length();
        int vowels = 0;
        int consonant = 0;
            for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a')
                vowels++ ;
            else if (word.charAt(i) == 'e')
                vowels++ ;
            else if (word.charAt(i) == 'i')
                vowels++ ;
            else if (word.charAt(i) == 'o')
                vowels++ ;
            else if (word.charAt(i) == 'u')
                vowels++ ;
            else if (word.charAt(i) == 'A')
                vowels++ ;
            else if (word.charAt(i) == 'E')
                vowels++ ;
            else if (word.charAt(i) == 'I')
                vowels++ ;
            else if (word.charAt(i) == 'O')
                vowels++ ;
            else if (word.charAt(i) == 'U')
                vowels++ ;
            
            
            
            else {
                consonant++ ;
                if (word.charAt(i) == ' '){
                consonant-- ;
               }
            }
        }
        System.out.println(vowels + "vowels");
    System.out.println(consonant + "consonants");
    } 
}