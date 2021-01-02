/**
 * Shape Patterns in Java
 */
import java.util.Scanner;
public class Patterns {
public static Scanner in = new Scanner(System.in);
public static int size = 0;

public static void Square_Shape(){
    System.out.print("Enter the size of square: ");
    size = in.nextInt();

    for(int rows = 0; rows < size; ++rows){
      for(int cols = 0; cols < size; cols++){
        System.out.print  (" * ");
      }
      System.out.println();
    }
}

public static void Left_Triangle(){
    System.out.print("Enter the size of Left Triangle: ");
    size = in.nextInt();

    for(int rows = 0; rows < size; rows++){
      for(int cols = 0; cols < rows; cols++){
        System.out.print(" * ");
      }
      System.out.println();
    }
}

public static void Right_Triangle(){
    System.out.print("Enter size of Right Triangle: ");
    size = in.nextInt();
    int i = size;

    for(int rows = 0; rows < size; rows++){
      i = i - 1;
      for(int space = 0; space < i; space++){
        System.out.print(" ");
      }
      for(int cols = 0; cols < rows; cols++){
        System.out.print("*");
      }
      System.out.println();
    }
}

public static void Full_Triangle(){
    System.out.print("Enter size of Full Triangle: ");
    size = in.nextInt();
    int i = size;

    for(int rows = 0; rows < size; rows++){
      i = i - 1;
      for(int space = 0; space < i; space++){
        System.out.print(" ");
      }
      for(int cols = 0; cols < (rows * 2 - 1); ++cols){
        System.out.print("*");
      }
      System.out.println();
    }
}

public static void Diamond_Shape(){
    System.out.print("Enter size of Diamond: ");
    size = in.nextInt();

    int i = size;
    for(int rows = 1; rows <= size; rows++){
      i = i - 1;
      for(int space = 1; space <= i; space++){
        System.out.print(" ");
      }
      for(int cols = 1; cols <= (rows * 2 - 1); cols++){
        System.out.print("*");
      }
      System.out.println();
    }
    i = 1;
    for(int rows = 1; rows <= size - 1; rows++){
      for(int space = 1; space <= i; space++){
        System.out.print(" ");
      }
      i++;
      for(int cols = 1; cols <= 2 * (size - rows) - 1; cols++){
        System.out.print("*");
      }
      System.out.println();
    }
}
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("[1]. Square");
        System.out.println("[2]. Left Triangle");
        System.out.println("[3]. Right Triangle");
        System.out.println("[4]. Full Triangle");
        System.out.println("[5]. Diamond");
        System.out.print("< = = = = = Choose a Shape = = = = = >");
        choice = in.nextInt();

        if(choice == 1){
            Square_Shape();
        }
        else if(choice == 2){
            Left_Triangle();
        }
        else if(choice == 3){
            Right_Triangle();
        }
        else if(choice == 4){
            Full_Triangle();
        }
        else if(choice == 5){
            Diamond_Shape();
        }
    }
}
