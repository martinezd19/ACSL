import java.util.*;
        
public class detective {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());
        for(int i = 0; i < cases; i++) {
            int lines = Integer.parseInt(in.nextLine());
            HashMap<String, String[]> map = new HashMap<>();
            HashMap<String, Boolean> mapVisited = new HashMap<>();
            for(int x = 0; x < lines-1; x++) {
                String[] names = in.nextLine().split(" ");
                String[] suspects = {names[1], names[2]};
                map.put(names[0], suspects);
                mapVisited.put(names[0], false);
            }
            boolean done = false;
            String[] suspects;
            String witness;
            if(map.get("Margarita")[0].equals("James")) {
                witness = map.get("Margarita")[1];
            } else {
                witness = map.get("Margarita")[0];
            }
            Queue<String> queue = new LinkedList<>();
            HashMap<String, String> path = new HashMap<>();
            queue.add(witness);
            mapVisited.put(witness, true);
            mapVisited.put("Margarita", true);
            path.put(witness, "Margarita");
            int length = -1;
            while(!queue.isEmpty()) {
                witness = queue.poll();
                suspects = map.get(witness);
                if(suspects == null) {
                    continue;
                }
                if(suspects[0].equals("James") || suspects[1].equals("James")) {
                    length = 0;
                    while(true) {
                        witness = path.get(witness);
                        length++;
                        if(witness.equals("Margarita")) {
                            break;
                        }
                    }
                    break;
                }
                for(int x = 0; x < 2; x++) {
                    if(!mapVisited.get(map.get(witness)[i])) {
                        queue.add(map.get(witness)[i]);
                        path.put(map.get(witness)[i], witness);
                    }
                }
            }
            System.out.println(length);
        }
    }
}
