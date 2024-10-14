/* computer is made of transistors that are on or off 👍

🅒🅞🅜🅟🅤🅣🅔🅡 🅘🅢 🅤🅢🅔🅢 🅣🅡🅐🅝🅢🅘🅣🅞🅡🅢 🅣🅞 🅜🅐🅚🅔 🅛🅞🅖🅘🅒 🅖🅐🅣🅔🅢 🅣🅗🅐🅣 🅒🅐🅝 🅟🅔🅡🅕🅞🅡🅜 & 🅞🅡 🅔🅣🅒.

🅿🅷🆈🆂🅸🅲🅰🅻 🅻🅰🅽🅶🆄🅰🅶🅴 - 🅱🅰🅺🅴🅳 🅾🅽🆃🅾 🆃🅷🅴 🅲🅾🅼🅿🆄🆃🅴🆁 

Lower level

machine code - all 1s and 0s
assembly - basic instructions such as "add x and y" "move x to y"
c - first language with if statements, for loops, super lightning fast
c++, java, python - all programmed in c

Higher level

compilier - takes code and turns it into machine code
programming languages are programmed in other programming languages

Memory:
All memory is 1 and 0, memory is a place to put 1 and 0s - hard drive

Computer science vs software engineering:
Software eng: practice of coding programs
Computer science: is the theory of computing
*/

public class Notes {
  public static void main(String[] args) {
    
    // printing
    System.out.print("HONK ");
    System.out.println("mimimimi");
    //%s = string %d = int
    System.out.printf("Hi my name is %s and I am %d years old.\n", "Amy", 241);
    System.out.println("Hello\n\"Hello\"");
    
    //variables and data type
    
    //primitive types
    boolean s = true;
    int a = 5;
    double p = 3.14159265358979323846264338327950288419716939937510582097494459230;

    //objects
    String amysName = "Amy";

    //operations
    int b = 9 + 4;
    double h = 3 + 0.14;
    int c = 5-2;
    int d = 5*23;
    int esadukfloasdf = 6/2;

    //must be two ints
    int f = 7%2;
    System.out.println("7%2 is " + f);

    //int division always round down (trunctating) - use double for decimal
    int g = 7/2;
    System.out.println("int 7/2 is " + g);

    //casting between types
    double i = (double) b;
    int j = (int) h;
    System.out.println(j);

    a += 6;
    System.out.println(a);
    a =+ 6;
    System.out.println(a);
    a = a + 6;
    System.out.println(a);
    a -= 12;
    System.out.println(a);
    a *= 0;
    System.out.println(a);
    a += 12;
    a /= 2;
    System.out.println(a);
    a %= 4;
    System.out.println(a);

    /*
    be careful adding subtracting dividing multiplying doubles
    watch out for type mismatches
    double * int = double
    if and int over an int has a decimal it is rounded down to the nearest integer
    an int divided by a double is a double
    a double divided by an int is a double
    you cant have the same variable multiple times
    you can turn an int into a double or a double into an int
    you can use %s for a string and %d for an int while printing
    you can use %f for a double while printing
    you can use %c for a char while printing
    a char is a single character
    */

    //declare
    int ab;
    //initializing
    ab = 1;
    int abc = 1;

    
    // strings are objects that have function

    String dog = "ted"; 
    String cat = "bob";
    String dogcat = 7 + dog + cat.concat("hello");
    System.out.println(dogcat + 7);
    System.out.println(dogcat.length());
    System.out.println(dogcat.substring(1, 4));
    //object_instance.function(arguments);
    //index counting starts at 0, substring does not included second number

    //arrays
    //new is a keyword that creates a new object by telling the computer to give it more memory on the heap
    /*
    memory is divided the stack and the heap
    stack hold static memory determined during complile time
    heap holds dynamically allocated memory
      */
    //0,0,0
    int[] array = new int[3];
    
    int[] array2 = {1,2,3};
    
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;

    // == is for comparison
    if (/*boolean value*/ abc == 1){
      System.out.println("true");
    }
    
    if (abc == 2){
      System.out.println("false");
    }
    else if (abc == 1){
      System.out.println("ajsdhflasd");
    }
    else{
      System.out.println("true");
    }

    if (abc == 1 && abc != 0){}
    if (abc == 1 || abc != 0){}
      System.out.println("true");
    for (/*initial statement*/ int asdfa = 0; /*condition*/ asdfa < 3; /*action*/ asdfa ++){
      System.out.println(asdfa);
    }
    /* 
    variables store memory addresses. the data for the variable is stored at the memory address. 
    
    2 arrays might not be equal even if they have the same words because the memory addresses are not the same.

    since the memory addresses of bob and bob1 are different, it won't print out anything even though the information inside the memory addresses are the same
    */

    String[] bob = new String[]{"twot", "twot"};
    String[] bob1 = new String[]{"twot", "twot"};

    if(bob==bob1){
      System.out.println("he");
    }
    // import java.util.Arrays;
    // if (Arrays.equals(names,names2)){
    //   System.out.println("hello!");
    // }

    // for an object, they have functions that do stuff. to use the functions, use .function(arguments)
    String asdfhjlkhasd = "s";
    System.out.println(asdfhjlkhasd.length());
    //https://www.w3schools.com/java/java_ref_string.asp

    //For each loops can serve the same function as regular for loops, but for each loops only work on arrays
    //Arrays start at a 0th term and then go to 1st, 2nd, etc.
    
    int [] arrayarray = {8,7,6,5,4,3,2,1};
    for(int e: arrayarray){
      System.out.println(e);
    }
    int[][] arr = new int[3][4];
    int[][] ay = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };

    for(int[] jim: arr){
      for(int rat = 0; rat < jim.length; rat++){
        jim[rat] = 1;
      }
    }
    for(int[] jat: arr){
      for(int mat = 0; mat < jat.length; mat++){
        System.out.print(jat[mat] + " ");
      }
      System.out.println(" ");
    }
  }
}