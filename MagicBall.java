import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nWelcome to the Magic 8 Ball!");
        System.out.print("What is your wish: ");
        String wish = s.nextLine();
        s.close();

        int random = (int) (Math.random() * 20);

        String answer;
        
        if (random == 1) {
            answer = "It is certain";
        } else if (random == 2) {
            answer = "It is decidedly so";
        }  else if (random == 3) {
            answer = "Without a doubt";
        } else if (random == 4) {
            answer = "Yes, definitely";
        } else if (random == 5) {
            answer = "You may rely on it";
        } else if (random == 6) {
            answer = "As I see it, yes";
        } else if (random == 7) {
            answer = "Most likely";
        } else if (random == 8) {
            answer = "Outlook good";
        } else if (random == 9) {
            answer = "Yes";
        } else if (random == 10) {
            answer = "Signs point to yes";
        } else if (random == 11) {
            answer = "Reply hazy, try again";
        } else if (random == 12) {
            answer = "Ask again later";
        } else if (random == 13) {
            answer = "Better not tell you now";
        } else if (random == 14) {
            answer = "Very doubtful";
        } else if (random == 15) {
            answer = "Cannot predict now";
        } else if (random == 16) {
            answer = "Concentrate and ask again";
        } else if (random == 17) {
            answer = "Don't count on it";
        } else if (random == 18) {
            answer = "My reply is no";
        } else if (random == 19) {
            answer = "My sources say no";
        } else {
            answer = "Outlook is not so good";
        }
         System.out.println("\nThe Magic 8 ball says \"" + answer +"\".\n");
    }
}