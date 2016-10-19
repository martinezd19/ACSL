import java.util.*;

public class pi {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       while(true) {
           int lines = Integer.parseInt(in.nextLine());
           if(lines == 0){break;}
           int[][] pairs = new int[2][lines];
           for(int i = 0; i < lines; i++) {
               String input = in.nextLine();
               pairs[0][i] = Integer.parseInt(input.split(" ")[0]);
               pairs[1][i] = Integer.parseInt(input.split(" ")[1]);
           }
       }
   } 
}
