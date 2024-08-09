import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> uniqueElements = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = -1;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            uniqueElements.add(num);
            // if (deque.size() > m){
            //     deque.pollFirst();
            // }
            // if (deque.size() == m){
            //     maxUnique = Math.max(maxUnique, uniqueElements.size());
            // }
            if (deque.size() == m){
                if (uniqueElements.size()>maxUnique){
                    maxUnique = uniqueElements.size();
                }
                int first = (int)deque.remove();
                if (!deque.contains(first)){
                    uniqueElements.remove(first);
                }
            }
        }
        System.out.println(maxUnique);
    }
}