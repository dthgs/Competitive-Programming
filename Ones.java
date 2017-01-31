
// https://ru.kattis.com/problems/ones

public class Ones {
	
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        while(io.hasMoreTokens()) {
            int number = io.getInt();
            long start = 1;
            int cnt = 1;

            while (start % number != 0) {
                start = (start * 10) + 1;
                start = start % number;
                cnt++;
            }

            //io.println(String.valueOf(start).length());
            io.println(cnt);
            io.flush();
        }
    }
}