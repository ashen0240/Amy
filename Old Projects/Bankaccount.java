import java.util.Scanner;

public class Bankaccount {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //1. the program greets the user
        System.out.println("greetings, user \n");

        //2. the program asks for the users login info
        String userName = "IWannaPlayAdoptMe";
        String password = "FluffyWps3";
        //3. if the user is not logged it, it repeats
        boolean loggedIn = false;
        for(int j = 3; j > 0 && loggedIn==false; j--){
            System.out.println("You have " + (j) + " attempts left!!!");
            System.out.println("Please enter your username");
            String usernameInput = scanner.nextLine();
            System.out.println("Please enter your password");
            String passwordInput = scanner.nextLine();
            if(userName.equals(usernameInput) && password.equals(passwordInput)){
                loggedIn = true;
            }
        }
        if(!loggedIn){
            System.out.println("CALLING THE COPS RN");
        }
        else{
            int balance = 1000;
            while(true){
                System.out.println("Would you like to view your balance, deposit money, withdraw money, or logout even though you just signed in?");
                String choiceInput = scanner.nextLine();
                if(choiceInput.equals("deposit")){
                    System.out.println("How much money would you like to deposit?");
                    int depositInput = scanner.nextInt();
                    balance = balance + depositInput;
                    System.out.println("Your new balance is " + balance);
                }
                else if(choiceInput.equals("withdraw")){
                    System.out.println("How much money would you like to withdraw?");
                    int withdrawInput = scanner.nextInt();
                    if(withdrawInput > balance){
                        System.out.println("Don't try to cheat the system >:(");
                    }
                    else{
                        balance = balance - withdrawInput;
                        System.out.println("Your new balance is " + balance);
                    }
                }
                else if(choiceInput.equals("logout")){
                    System.out.println("Why'd you waste my time 😭");
                    break;
                }
                else{
                    System.out.println("Are you sure you would like to view your very poor account?");
                    String lifechoiceInput = scanner.nextLine();
                    if(lifechoiceInput.equals("yes")){
                        System.out.println(balance);
                    }
                    else{
                        System.out.println("Good decision");
                    }


                }
            scanner.nextLine();
            } 
        }
        //4. if the user is logged in, they can do 3 things
            //1. they can view their balance
            //2. they can deposit money
            //3. they can withdraw money


    }
    
}
