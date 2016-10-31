import java.util.Scanner;
public class DANGER
{
    public static void main(String[] args)
    {

		Scanner input = new Scanner(System.in);
        String Word = "RANDOM";
        String progress = "";
        while (!progress.equals(Word)){
            progress = "";
            System.out.println("Guess the 6 letter word!: ");
            String phrase = input.nextLine();
            phrase = phrase.toUpperCase();
            if (phrase.length() != 6){
                System.out.println("You must enter a six letter word!");
            }else{
                for (int i=0; i <= 5;){
                    
                    if (phrase.charAt(i) == Word.charAt(i)){
                        char phraseCh = phrase.charAt(i);
                        progress += String.valueOf(phraseCh);
                    }else{
                        progress += "?";
                    }
                    i++;
                }
                System.out.println(progress);
            }
        }
        System.out.println("WELL DONE, YOU GUESSED IT: Random!");
    }
}
        

        
