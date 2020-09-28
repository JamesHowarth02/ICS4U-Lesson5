package lucky7;

import java.util.Scanner;

public class Lucky7 {
    static Scanner scan = new Scanner(System.in);
    public static int persistInput(String inputText) {
        int numberInput = 0;
        System.out.print(inputText);
        try{
            numberInput = scan.nextInt();
            if(numberInput>0) {
                System.out.println("[!] Invalid input detected: please enter an integer greater than 0.");
                return persistInput(inputText);
            }else{
               return numberInput; 
            }
        }catch(Exception e) {
            scan.next();
            System.out.println("[!] Invalid input detected. Please enter valid integers only.");
            return persistInput(inputText);
        }
    }
    
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        int Cash = 0, Trials = 0;
        int highscoreCash = 0, highscoreTrials = 0;
        Cash = persistInput("Enter currency amount: ");
        
        while(Cash>0) {
            int roll;
            dice1.roll();
            dice2.roll();
            Trials = Trials + 1;
            roll = dice1.getValue() + dice2.getValue();
            
            if(roll == 7) {
                Cash = Cash + 4;
            }else{
                Cash = Cash - 1;
            }
            
            if(Cash>highscoreCash) { 
                highscoreCash = Cash;
                highscoreTrials = Trials;
            }
        }
        System.out.println("You are broke after: " + Trials + " rolls.");
        System.out.println("You should have quit after " + highscoreTrials + " rolls when you had $" + highscoreCash);
    }
}
