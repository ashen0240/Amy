import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class CatMouse {
    static int rowSize = 5;
    static int columnSize = 7;
    public static void main(String[] args) {

        // 1. Make a 2D array
        String [][] array = new String [rowSize][columnSize];
            for(int i = 0; i < rowSize; i++){
                for(int j = 0; j < columnSize; j++){
                    array[i][j] = "0";
                    //System.out.print(array[i][j] + " ");
                }
                //System.out.println("   ");
            }
        // 2. Put a cat in the top left corner
        array[0][0] = "C";
        int [] cat = new int [2];
        array[rowSize - 1][columnSize - 1] = "M";
        int [] mouse = new int [2];
        mouse[0] = rowSize - 1;
        mouse[1] = columnSize - 1;
        print2Darray(array);
        // 3. Put a mouse in the bottom right corner
        // 4. Ask which direction you want the cat to move in
        for(int h = 0; h < 10; h++){
            System.out.println("Hey you have " + (10-h) + " moves left ToT");
            Scanner s = new Scanner(System.in);
            System.out.println("What direction would you like to move in?");
            String dir = s.nextLine();

            if(dir.equals("right") && cat[1] < columnSize - 1){
                // 1. change the c to an 0
                array[cat[0]][cat[1]] = "0";
                // 2. change the 0 to c
                
                // 3. change the cat array
                cat[1] = cat[1]+1;
                array[cat[0]][cat[1]] = "C";
            }
            else if(dir.equals("left") && cat[1] > 0){
                array[cat[0]][cat[1]] = "0";
                cat[1] = cat[1]-1;
                array[cat[0]][cat[1]] = "C";
            }
            else if(dir.equals("up") && cat[0] > 0){
                array[cat[0]][cat[1]] = "0";
                cat[0] = cat[0] - 1;
                array[cat[0]][cat[1]] = "C";
            }
            else{
                if(cat[0] < rowSize - 1){
                    array[cat[0]][cat[1]] = "0";
                    cat[0] = cat[0] + 1;
                    array[cat[0]][cat[1]] = "C";
                }
            }
            int randomNum = (int) (Math.random() * 4); // 0 to 3
            //down
            if(randomNum == 0 && mouse[0] < rowSize - 1){
                array[mouse[0]][mouse[1]] = "0";
                mouse[0] = mouse[0] + 1;
                array[mouse[0]][mouse[1]] = "M";
            }
            //right
            else if(randomNum == 1 && mouse[1] < columnSize - 1){
                array[mouse[0]][mouse[1]] = "0";
                mouse[1] = mouse[1] + 1;
                array[mouse[0]][mouse[1]] = "M";
            }
            //left
            else if(randomNum == 2 && mouse[1] > 0){
                array[mouse[0]][mouse[1]] = "0";
                mouse[1] = mouse[1] - 1;
                array[mouse[0]][mouse[1]] = "M";
            }
            //up
            else{
                if(mouse[0] > 0){
                    array[mouse[0]][mouse[1]] = "0";
                    mouse[0] = mouse[0] - 1;
                    array[mouse[0]][mouse[1]] = "M";
                }
            }
            if(Arrays.equals(cat,mouse)){
                array[mouse[0]][mouse[1]] = "%";
                System.out.println("yay you win. you took " + h + " tries");
                break;
            }
            print2Darray(array);
        }
        if(!Arrays.equals(cat,mouse)){
            System.out.println("you lost T_T");
        }
        // 5. Move the mouse
        // 6. Check if cat caught mouse
        //     a. If cat caught mouse display how many tries it took
        //     b. If cat did not catch mouse then keep going forever
    }
    public static void print2Darray(String[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("   ");
        }
    }

}
