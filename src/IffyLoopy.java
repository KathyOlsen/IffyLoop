import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        //Loopy
        String words = "";
        System.out.println("Please enter 5 random words. ");
        for(int i = 1; i <= 5; i++){
            System.out.println("Your word: ");
            words = words + " " + key.nextLine();
        }
        System.out.println(words);
        System.out.println();

        //Iffy Loop
        Boolean redEyes;
        String tryAgain="";
        while(!tryAgain.equalsIgnoreCase("n")) {
            System.out.println("Are your eyes red? (y/n)");
            String input = key.nextLine();
            redEyes = input.equalsIgnoreCase("y");

            if (redEyes) {
                System.out.println("Get some sleep! Also, Voldemort called and he wants his eyes back.");
            } else {
                System.out.println("You look great!");
            }
            System.out.println();
            System.out.println("Do you want to try again? (y/n)");
            tryAgain = key.nextLine();
        }
        System.out.println("Goodbye!");
    }
}