import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        int [] [] listTwo = new int [5][5];
        // 2 Dimensional array
        int x = 0;
        int y = 0;
        while (x < 5) {
            listTwo[x][y] = (int)(Math.random()*10);

            while (y <5){
                listTwo [x] [y] = (int)(Math.random()*10);
                System.out.print(listTwo[x][y]+" | ");
                y++;
            }
            System.out.println("");
            y=0;
            x++;
        }
    }
}
