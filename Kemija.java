import java.util.Scanner;

// https://ru.kattis.com/problems/kemija08

public class Kemija {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            System.out.print(a);
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                i += 2;
            }
        }
    }
}