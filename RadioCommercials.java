import java.util.Arrays;

// https://ru.kattis.com/problems/commercials

public class RadioCommercials {
    static int[] arr = new int[100100];
    static int[] mem = new int[100100];
    static boolean[] comp = new boolean[100100];
    //memset(comp, 0, sizeof(comp));
    //Arrays.fill(comp , false);

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int N = io.getInt(); // number of commercial breaks in a day
        int P = io.getInt(); // price of one commercial break

        for(int i = 0; i < N; i++){
            arr[i] = io.getInt() - P;
        }

        int maximum = 0;

        for(int i = 0; i < N; i++){
                maximum = Math.max(maximum, max_sum(i));
        }

        io.println(maximum);
        io.flush();
    }

    public static int max_sum(int i) {
        if (i == 0) {
            return arr[i];
        }
        if (comp[i]) {
            return mem[i];
        }
        int res = Math.max(arr[i], arr[i] + max_sum(i - 1));
        mem[i] = res;
        comp[i] = true;
        return res;
    }
}