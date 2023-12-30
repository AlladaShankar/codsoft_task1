import java.util.Scanner;
import java.util.Random;
class NumberGame{
    static Scanner sc=new Scanner(System.in);
    static int maxAttempts=10;
    static int userGuess(){
        Random r = new Random();
        int k = r.nextInt(100);
     System.out.println("I have generated a random number between 1 and 100");
     System.out.println("Can you guess the number!! You have a total of " + maxAttempts + " attempts.");
      for(int i=0;i<maxAttempts;i=i+1){
            System.out.println("Your Attempt number:" + (i+1));
            System.out.println("Guess the number:");
            int m=sc.nextInt();
            if(k==m){
                return maxAttempts-i;}
            else{
                if(k>m){
                System.out.println("Too low");}
                else{
                System.out.println("Too high");}
            }
        }
        return 0;
      }
    public static void main(String[] args){
     System.out.println("Welcome to the Number Guessing Game!");
        NumberGame j=new NumberGame();
        System.out.println("Score:" + j.userGuess());
        while(true){
        System.out.println("You want play again:");
        String l=sc.next();
        if(l.equals("yes")){
            System.out.println("Score:" + j.userGuess());}
        else{
            System.out.println("Thank you for playing");
            break;}
        }
    }
}