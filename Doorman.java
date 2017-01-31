
// https://ru.kattis.com/problems/doorman

public class Doorman {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int max_difference = io.getInt();
        String input = io.getWord();

        StringBuilder sb = new StringBuilder(input);
        //io.println(sb);
        //io.flush();
        int M = 0;
        int W = 0;

        for(int i = 0; i < input.length(); i++){
            char person = sb.charAt(i);

            if(Math.abs(M-W) == max_difference){ // reached the limit, check line

                if(person == 'M' && M>W) { // more males inside
                    if (sb.charAt(i + 1) == 'M') { // two males in line, stop
                        break;
                    }
                }
                if(person == 'M' && M>W){ // more males inside
                    if(sb.charAt(i+1) == 'W'){ // female is second in line, continue
                        W++;  // TODO erase char at i+1 and try same char again
                        sb.setCharAt(i+1, 'X');
                        i--;
                        continue;
                    }
                }
                if(person == 'M' && W>M){ // more females inside, continue
                    M++;
                    continue;
                }
                if(person == 'W' && W>M) { // more females inside
                    if (sb.charAt(i + 1) == 'W') { // two females in line, stop
                        break;
                    }
                }
                if(person == 'W' && W>M){ // more females inside
                    if(sb.charAt(i+1) == 'M'){ // male is second in line, continue
                        M++;
                        sb.setCharAt(i+1, 'X');
                        i--;
                        continue;
                    }
                }
                if(person == 'W' && M>W){ // more males inside, continue
                    W++;
                    continue;
                }

            }
            
            if(person == 'W'){
                W++;
                continue;
            }
            if(person == 'M'){
                M++;
                continue;
            }
        }

        io.println(M+W);
        io.flush();
    }
}