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
            if((xr-xl) > (yr-yl)) {
                int yint1 = xr + yr;
                int yint2 = -1*(xl + yl);
                int yint = (int)(yint1+yint2)/2;
                if(yint >= 0) {
                    int xint = Math.abs((yr-yint) + xr);
                    System.out.print(xint +" "+yint+" ");
                }
            }
        }
    }
}