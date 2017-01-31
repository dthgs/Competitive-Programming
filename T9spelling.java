import java.util.Scanner;

// https://ru.kattis.com/problems/t9spelling

public class T9spelling{
    static char LAST_CHAR;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char currChar;
        String consume = in.nextLine();

        for(int i = 0; i < n; i++){
            String input = in.nextLine();
            System.out.print("Case #" + (i+1) + ": ");
            for(int j = 0; j < input.length(); j++){
                currChar = input.charAt(j);
                printT9(currChar);
                LAST_CHAR = currChar;
            }
            System.out.println();
        }
        in.close();
    }

    public static void printT9(char currChar){
        switch (currChar) {
            case ' ':
                if(LAST_CHAR == ' ')
                    System.out.print(" ");
                System.out.print("0");
                break;
            case 'a':
                if(LAST_CHAR >= 'a' && LAST_CHAR <= 'c')
                    System.out.print(" ");
                System.out.print("2");
                break;
            case 'b':
                if(LAST_CHAR >= 'a' && LAST_CHAR <= 'c')
                    System.out.print(" ");
                System.out.print("22");
                break;
            case 'c':
                if(LAST_CHAR >= 'a' && LAST_CHAR <= 'c')
                    System.out.print(" ");
                System.out.print("222");
                break;
            case 'd':
                if(LAST_CHAR >= 'd' && LAST_CHAR <= 'f')
                    System.out.print(" ");
                System.out.print("3");
                break;
            case 'e':
                if(LAST_CHAR >= 'd' && LAST_CHAR <= 'f')
                    System.out.print(" ");
                System.out.print("33");
                break;
            case 'f':
                if(LAST_CHAR >= 'd' && LAST_CHAR <= 'f')
                    System.out.print(" ");
                System.out.print("333");
                break;
            case 'g':
                if(LAST_CHAR >= 'g' && LAST_CHAR <= 'i')
                    System.out.print(" ");
                System.out.print("4");
                break;
            case 'h':
                if(LAST_CHAR >= 'g' && LAST_CHAR <= 'i')
                    System.out.print(" ");
                System.out.print("44");
                break;
            case 'i':
                if(LAST_CHAR >= 'g' && LAST_CHAR <= 'i')
                    System.out.print(" ");
                System.out.print("444");
                break;
            case 'j':
                if(LAST_CHAR >= 'j' && LAST_CHAR <= 'l')
                    System.out.print(" ");
                System.out.print("5");
                break;
            case 'k':
                if(LAST_CHAR >= 'j' && LAST_CHAR <= 'l')
                    System.out.print(" ");
                System.out.print("55");
                break;
            case 'l':
                if(LAST_CHAR >= 'j' && LAST_CHAR <= 'l')
                    System.out.print(" ");
                System.out.print("555");
                break;
            case 'm':
                if(LAST_CHAR >= 'm' && LAST_CHAR <= 'o')
                    System.out.print(" ");
                System.out.print("6");
                break;
            case 'n':
                if(LAST_CHAR >= 'm' && LAST_CHAR <= 'o')
                    System.out.print(" ");
                System.out.print("66");
                break;
            case 'o':
                if(LAST_CHAR >= 'm' && LAST_CHAR <= 'o')
                    System.out.print(" ");
                System.out.print("666");
                break;
            case 'p':
                if(LAST_CHAR >= 'p' && LAST_CHAR <= 's')
                    System.out.print(" ");
                System.out.print("7");
                break;
            case 'q':
                if(LAST_CHAR >= 'p' && LAST_CHAR <= 's')
                    System.out.print(" ");
                System.out.print("77");
                break;
            case 'r':
                if(LAST_CHAR >= 'p' && LAST_CHAR <= 's')
                    System.out.print(" ");
                System.out.print("777");
                break;
            case 's':
                if(LAST_CHAR >= 'p' && LAST_CHAR <= 's')
                    System.out.print(" ");
                System.out.print("7777");
                break;
            case 't':
                if(LAST_CHAR >= 't' && LAST_CHAR <= 'v')
                    System.out.print(" ");
                System.out.print("8");
                break;
            case 'u':
                if(LAST_CHAR >= 't' && LAST_CHAR <= 'v')
                    System.out.print(" ");
                System.out.print("88");
                break;
            case 'v':
                if(LAST_CHAR >= 't' && LAST_CHAR <= 'v')
                    System.out.print(" ");
                System.out.print("888");
                break;
            case 'w':
                if(LAST_CHAR >= 'w' && LAST_CHAR <= 'z')
                    System.out.print(" ");
                System.out.print("9");
                break;
            case 'x':
                if(LAST_CHAR >= 'w' && LAST_CHAR <= 'z')
                    System.out.print(" ");
                System.out.print("99");
                break;
            case 'y':
                if(LAST_CHAR >= 'w' && LAST_CHAR <= 'z')
                    System.out.print(" ");
                System.out.print("999");
                break;
            case 'z':
                if(LAST_CHAR >= 'w' && LAST_CHAR <= 'z')
                    System.out.print(" ");
                System.out.print("9999");
                break;
        }
    }
}