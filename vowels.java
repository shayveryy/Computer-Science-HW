import java.util.Scanner;
public class vowels
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int length = word.length();
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a'|'e'|'i'|'o'|'u'|'A'|'E'|'I'|'O'|'U'){
                vowels++ ;
            }
            else {
                consonant++ ;
            }
        }
    }
}
                
             
        
