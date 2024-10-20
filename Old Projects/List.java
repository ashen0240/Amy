import java.util.Scanner;
public class List {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the to-do list!");

        int next=0;
        String[] list = {"empty", "empty", "empty", "empty", "empty"};
        while(true){
            System.out.println("Would you like to view the list, add, remove from the list, or quit?");
            String userInput = scanner.nextLine();
        if(userInput.equals("view")){
           for(int i=0; i<5; i++){
            System.out.println((i+1)+"."+ list[i]);
           }
        }
        else if(userInput.equals("add")){
            if(next == 5){
                System.out.println("No more spaces");
                continue;
            }
            System.out.println("What would you like to add?");
            String addInput = scanner.nextLine();
            list[next] = addInput;
            next = next+1;
         }
         else if(userInput.equals("remove")){
            System.out.println("Which number would you like to remove?");
            int playerInput = scanner.nextInt();
            scanner.nextLine();
            list[playerInput-1] = "empty";
         }
         else if(userInput.equals("quit")){
            return;
            
        }
    }
}
}