import java.util.*;
        
public class detective {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());
        for(int i = 0; i < cases; i++) {
            int lines = Integer.parseInt(in.nextLine());
            HashMap<String, String[]> map = new HashMap<>();
            for(int x = 0; x < lines; x++) {
                String[] names = in.nextLine().split(" ");
                String[] suspects = {names[1], names[2]};
                map.put(names[0], suspects);
            }
            boolean done = false;
            String[] suspects;
            for(int x = 0; x < lines; x++) {
                
            }
        }
    }
}
