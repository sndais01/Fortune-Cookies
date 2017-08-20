package javaapplication10;
import java.util.Scanner;
public class FortuneCookieDriver {
    public static void main (String[] args) throws InputTooLongException{
        
        
        InputTooLongException problem = new InputTooLongException("Input is too large, choose a smaller number.");

        FortuneCookie f1, f2, f3, f4;
        int userInput;
        
        f1 = new FortuneOne();
        f2 = new FortuneTwo();
        f3 = new FortuneThree();
        f4 = new FortuneFour();
        
        String one = "1, 5, 13, 12, 22";
        String two = "16, 7, 23, 12, 5";
        String three = "23, 19, 17, 6, 13";
        String four = "12, 15, 27, 4, 9";
        
        System.out.println("You\'ve finished your meal at a chinese restaurant. How many fortune cookies would you like? (no more than 4 cookies)");
        Scanner scan = new Scanner(System.in);
        userInput = scan.nextInt();
        
        if(userInput == 0){
            System.out.println("So you started a new diet, huh??");
        }else if(userInput == 1){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
        }else if(userInput == 2){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
        }else if(userInput == 3){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
            System.out.print("Fortune: ");
            f3.fortune();
            System.out.print("Lucky Numbers: ");
            f3.luckyNumber(three);
            System.out.println("");
        }else if(userInput == 4){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
            System.out.print("Fortune: ");
            f3.fortune();
            System.out.print("Lucky Numbers: ");
            f3.luckyNumber(three);
            System.out.println("");
            System.out.print("Fortune: ");
            f4.fortune();
            System.out.print("Lucky Numbers: ");
            f4.luckyNumber(four);
            System.out.println("");
        }else if(userInput >= 5){
            try{
                throw problem;
            }
            catch(InputTooLongException e){
                System.out.println(e.getMessage());
            }
            userInput = scan.nextInt();
             if(userInput == 0){
            System.out.println("So you started a new diet, huh?");
        }else if(userInput == 1){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
        }else if(userInput == 2){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
        }else if(userInput == 3){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
            System.out.print("Fortune: ");
            f3.fortune();
            System.out.print("Lucky Numbers: ");
            f3.luckyNumber(three);
            System.out.println("");
        }else if(userInput == 4){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
            System.out.print("Fortune: ");
            f3.fortune();
            System.out.print("Lucky Numbers: ");
            f3.luckyNumber(three);
            System.out.println("");
            System.out.print("Fortune: ");
            f4.fortune();
            System.out.print("Lucky Numbers: ");
            f4.luckyNumber(four);
            System.out.println("");
        }else if(userInput >= 5){
            try{
                throw problem;
            }
            catch(InputTooLongException e){
                System.out.println(e.getMessage());
            }
            userInput = scan.nextInt();
             if(userInput == 0){
            System.out.println("So you started a new diet, huh?");
        }else if(userInput == 1){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
        }else if(userInput == 2){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
        }else if(userInput == 3){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
            System.out.print("Fortune: ");
            f3.fortune();
            System.out.print("Lucky Numbers: ");
            f3.luckyNumber(three);
            System.out.println("");
        }else if(userInput == 4){
            System.out.print("Fortune: ");
            f1.fortune();
            System.out.print("Lucky Numbers: ");
            f1.luckyNumber(one);
            System.out.println("");
            System.out.print("Fortune: ");
            f2.fortune();
            System.out.print("Lucky Numbers: ");
            f2.luckyNumber(two);
            System.out.println("");
            System.out.print("Fortune: ");
            f3.fortune();
            System.out.print("Lucky Numbers: ");
            f3.luckyNumber(three);
            System.out.println("");
            System.out.print("Fortune: ");
            f4.fortune();
            System.out.print("Lucky Numbers: ");
            f4.luckyNumber(four);
            System.out.println("");
        }else if(userInput >= 5){
            try{
                throw problem;
            }
            catch(InputTooLongException e){
                System.out.println(e.getMessage());
            }
            userInput = scan.nextInt();
            System.out.println("Sorry, we just ran out of fortune cookies.");
        }
        }
        }
        
        System.out.println("End of main method."); 
        scan.close(); 
        
    }
}
