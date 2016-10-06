import java.util.*;

public class Chess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());
        for(int i = 0; i < cases; i++) {
            String[] coords = in.nextLine().split(" ");
            int x1 = Integer.parseInt(coords[0]), y1 = Integer.parseInt(coords[1]), x2 = Integer.parseInt(coords[2]), y2 = Integer.parseInt(coords[3]);
            int xr = Math.max(x1, x2);
            int yr = (Math.max(x1, x2) == x1) ? y1 : y2;
            int xl = Math.min(x1, x2);
            int yl = (Math.min(x1, x2) == x1) ? y1 : y2;
            //left point m=1, right point m=-1
            int xint = ((yr+xr)-(yl-xl))/2;
            int yint = xint + (yl-xl);
            if(xint > 0 && yint > 0) {
                System.out.print(xint + " " + yint + " ");
            }
            //left point m=-1, right point m=1
            xint = ((yl+xl)-(yr-xr))/2;
            yint = xint + (yr-xr);
            if(xint > 0 && yint > 0) {
                System.out.print(xint + " " + yint + " ");
            }
            System.out.println("");
        }
    }
}
