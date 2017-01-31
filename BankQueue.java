import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// https://ru.kattis.com/problems/bank

public class BankQueue {
	
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int N = io.getInt(); // total people in queue
        int T = io.getInt(); // time until bank closes
        money[] arr = new money[N];
        boolean[] times = new boolean[T];
        int elapsed = 0;
        int total = 0;

        for(int i = 0; i < N; i++){ // read input n times
            money m = new money();
            m.money = io.getInt();
            m.mins = io.getInt();
            arr[i] = m;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < N; i++){ // loop through the reversed list and try to add highest ones
            if(elapsed >= T) break;
            if(times[arr[i].mins] == false){
                total += arr[i].money;
                elapsed++;
                times[arr[i].mins] = true;
            } else {
                int temp = arr[i].mins;
                for(; temp >= 0; temp--){ // find the next empty space
                    if(times[temp] == false) {
                        total += arr[i].money;
                        elapsed++;
                        times[temp] = true;
                        break;
                    }
                }
            }
        }
        io.println(total);
        io.flush();
    }
}

class money implements Comparable<money>{
    public final Comparator<money> sort = null;
    int money;
    int mins;

    @Override
    public int compareTo(money that){
        if(this.money > that.money){
            return 1;
        }
        if(this.money == that.money){
            if(this.mins < that.mins){
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}

    /*for(int i = 0; i < n; i++){ // print the reverse sorted array
        io.println(arr[i].money + " " + arr[i].mins);
        io.flush();
    }*/

// slide 16