import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

// https://ru.kattis.com/problems/cd

public class CD {
    static int CAN_SELL = 0;
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
 
        while(true){
            Set<Integer> set = new HashSet<Integer>();
            int n = io.getInt(); // nr of cds jack
            int m = io.getInt(); // nr of cds jill
            if(m == 0 && n == 0){
                break;
            }
                
            for(int i = 0; i < n; i++){
                set.add(io.getInt());
            }
            for(int i = 0; i < m; i++){
                if(set.contains(io.getInt())){
                    CAN_SELL++;
                }
            }
            //io.println(CAN_SELL);
            System.out.println(CAN_SELL);
            CAN_SELL = 0;
        }
        
        io.close();
        
    }
    
    // the binary search
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}