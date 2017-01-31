import java.util.Arrays;
import java.util.Collections;

// https://ru.kattis.com/problems/plantingtrees

public class PlantingTrees {
    static int DAYS = 0;
    static int MIN_DAYS = 2;
    
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int N = io.getInt();
        Integer[] arr = new Integer[N];
        
        for(int i = 0; i < N; i++) // read input to array
            arr[i] = io.getInt();
        
        Arrays.sort(arr, Collections.reverseOrder()); // sort input
        
        for(int i = 0; i < N; i++){
            arr[i] -= N - i;
            MIN_DAYS++;
        }
        
        for(int i = 0; i < N; i++){ // planting trees loop
            //DAYS++;   // takes a day to plant the tree
            plantTree(arr[i]);
        }
        System.out.println(DAYS + MIN_DAYS);
    }
    
    public static void plantTree(int curr){
        if(curr > DAYS){
            DAYS = curr;
        }
    }
}