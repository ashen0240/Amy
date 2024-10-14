public class Array2D {
    public static void main(String[] args) {
    int [][] array = new int [10][10];
        for(int row = 0; row < 10; row++){
            for(int column = 0; column < 10; column++){
            array[row][column]= row +1;
            }
        }
        for(int row = 0; row < 10; row++){
            for(int column = 0; column < 10; column++){
            System.out.print(array[row][column] + " ");
            }
            System.out.println("  ");
        }
    }    
}
