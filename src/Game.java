import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(sc.hasNextInt()) {
            int input = sc.nextInt();
        } else {
            System.out.print("Not a number!");
        }
    }
}
