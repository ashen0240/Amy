public class QuadHex {
  public static void main(String[] args) {
    // 1. Make an array with the numbers 1-100
    int[] numbers = new int [100];
    int[] ted = {6,2,9,1,0,100,0,3};
    //System.out.println("  ");
    //System.out.println(numbers);
    //System.out.println(numbers[99]);
    for(int amy = 1; amy<=100; amy++){
      numbers[amy-1] = amy;
    }
    for(int h: numbers){
        //System.out.println(h);
    }

    for(int j = 0; j<= 99; j++){
      //System.out.println(numbers[j]);
    }

    //System.out.println(ted[1]);
    // 2. Loop through the array with the following conditions UNTIL 10 prime number are found:
    // If the number is prime, print the word "Prime" instead of the number.
    // If the number is a multiple of 4, print the word "Quad" instead of the number.
    // If the number is a multiple of 6, print the word "Hex" instead of the number.
    // If the number is both a multiple of 4 and 6 (i.e., a multiple of 12), print "QuadHex" instead of the number.
    // If the number is both prime and a multiple of 4 or 6, still print "Prime" and quad or hex or both.
    // If the number does not meet any of the above conditions, just print the number itself.
    // 3. After 10 prime numbers are found, print the number itself
    int count = 0;
    for(int l: numbers){
      String output = "";
      if(count < 10){
        if (isPrime(l)){
          count = count + 1;
          output = "Prime " + count;
        } 
        if(l%4 == 0){
          output = "Quad ";
        }
        if(l%6 == 0){
          output = output + "Hex";
        }
        if(l%4 != 0 && l%6 != 0 && !isPrime(l)){
          output = ""+l;
        }
      }
      else{
       output = ""+l;
      }
      System.out.println(output);
    }
  }


  public static boolean isPrime (int num){
    for(int i = 2; i <= num/2; i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
}



