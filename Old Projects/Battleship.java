import java.util.Random;
import java.util.Scanner;
public class Battleship {
    //makes it easier to change the length (change 1 place instead of all)
    static int SIZE = 6;
    static int SHIPLENGTH = 3;
    static int TRIES = 10;
    //makes row grid
    public static void main(String[] args){
        boolean [][] ship = new boolean [SIZE][SIZE];
        placeShip(ship);
        for(int i = 0; i < SIZE; i++){
            //makes column grid
            for(int j = 0; j<SIZE; j++){
                //formats
                //System.out.print(ship[i][j] + " ");
            }
           // System.out.println("    ");
        }
        //sets board as o for empty
        String [][] tracker = new String [SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                tracker[i][j] = "o";
            }
        }
        //makes sure player only has 10 guesses
        Scanner s = new Scanner(System.in);
        int hits = 0;
        for(int t = 0; t < TRIES; t++){
            //1. show person the board
            System.out.println("Heres your board :)");
            print2Darray(tracker);
            //2. ask them to make a guess
            System.out.println("Make a guess. Type 2 numbers like this: 3 4. You have " + (TRIES-t) + " guesses left");
            int x = s.nextInt();
            int y = s.nextInt();
            //makes sure player doesn't guess a place twice
            while(tracker[x][y] != "o"){
                System.out.println("You already tried that you dummy! Make another guess");
                x = s.nextInt();
                y = s.nextInt();
            }
            //3. tell them what happened and show then the new board
             //a) check if they hit or missed
             if(ship[x][y]){
                hits++;
                t = t - 1;
                tracker[x][y] = "h";
                //tells them how many tries it took to hit the ship
                if(hits == 3){
                    System.out.println("You have sunken the sinkable ship! You took " + (t+1) + " turns");
                    break;
                }
                else{
                    if(t != 9){
                    System.out.println("You have hit part of the ship!!!!! Keep going for more");
                    }
                }
            }
            //if missed
             else{
                tracker[x][y] = "m";
                System.out.println("You have missed!");
             }
             //b) update tracker array
            //4. if they hit they get another turn
        }
        if(hits != 3){
            System.out.println("You lose");
        }
    }
    public static void print2Darray(String[][] array){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("   ");
        }
    }

   
    //so basically the placeShip function creates a 2D array of booleans. 
    //it creates spots like grid[0][0] and grid[3][4]
    //randomly chooses a spot
    //makes ship horizontal or vertical
    //makes sure the ship is smaller than the grip/fits in grid
    //checks if spot is open
    //restarts if spot is closed and stuff
    //doesn't exit if your ship is rlly big like a paper towel
    //doesn't exit if whole thing is filled

    //randomly places ship
    public static void placeShip(boolean[][] grid) {
        Random rand = new Random();
        boolean placed = false;

        while (!placed) {
            boolean horizontal = rand.nextBoolean();
            int row = rand.nextInt(SIZE);
            int col = rand.nextInt(SIZE);
            
            //chooses if ship is vertical or horizontal
            if (horizontal && col + SHIPLENGTH <= SIZE) {
                if (canPlaceShip(grid, row, col, true)) {
                    for (int i = 0; i < SHIPLENGTH; i++) grid[row][col + i] = true;
                    placed = true;
                }
            } else if (!horizontal && row + SHIPLENGTH <= SIZE) {
                if (canPlaceShip(grid, row, col, false)) {
                    for (int i = 0; i < SHIPLENGTH; i++) grid[row + i][col] = true;
                    placed = true;
                }
            }
        }
    }

    private static boolean canPlaceShip(boolean[][] grid, int row, int col, boolean horizontal) {
        for (int i = 0; i < SHIPLENGTH; i++) {
            if (horizontal && grid[row][col + i]) return false;
            if (!horizontal && grid[row + i][col]) return false;
        }
        return true;
        }    
}
