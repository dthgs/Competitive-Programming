
// https://ru.kattis.com/problems/triangle

public class Sierpinski {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int casenr = 1;
        while(io.hasMoreTokens()){

            int n = io.getInt(); // number of iterations
            /*if(n == 0 || n == 1){
                System.out.println("Case " + casenr + ": " + 1);
                casenr++;
                continue;
            }*/

            //double sideLength = 1;
            //double ans = 0;

            /*for (int i = 1; i <= n; i++) { // break the triangle
                sideLength /= 2;
                ans = Math.floor((n*(-1))*Math.log10(2) + (n) * Math.log10(3)) + 1;
                // ( sideLength * 3 ) * Math.pow(3, i)
                //
            }*/
            /*ans = Math.floor(  Math.log10(ans) ) + 1;
            int intans = (int) ans;*/
            double ans = Math.floor(   ( n*(-1) ) * Math.log10(2) + (n)*Math.log10(3) + Math.log10(3)   ) + 1;
            int intans = (int) ans;
            System.out.println( "Case " + casenr + ": " + intans  );
            casenr++;
        }
    }
}