import java.util.Scanner;

// https://ru.kattis.com/problems/toilet

public class Toilet {
    static int COUNTER_LEAVE_UP;
    static int COUNTER_LEAVE_DOWN;
    static int COUNTER_LEAVE_LIKE_U_WANT;
    static char POS_LEAVE_UP;
    static char POS_LEAVE_DOWN;
    static char POS_LEAVE_LIKE_U_WANT;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char currChar;
        POS_LEAVE_UP = POS_LEAVE_DOWN = POS_LEAVE_LIKE_U_WANT = input.charAt(0);
        
        for(int i = 1; i < input.length(); i++){
            currChar = input.charAt(i);
            leaveUp(currChar);
            leaveDown(currChar);
            leaveLike(currChar);
        }
        
        in.close();
        System.out.println(COUNTER_LEAVE_UP);
        System.out.println(COUNTER_LEAVE_DOWN);
        System.out.println(COUNTER_LEAVE_LIKE_U_WANT);
    }
    
    public static void leaveUp(char currChar){
        if(currChar == 'D' && POS_LEAVE_UP == 'D'){
            COUNTER_LEAVE_UP++;
        }
        if(currChar == 'D' && POS_LEAVE_UP == 'U'){
            COUNTER_LEAVE_UP++;
            COUNTER_LEAVE_UP++;
        }
        if(currChar == 'U' && POS_LEAVE_UP == 'D'){
            COUNTER_LEAVE_UP++;
        }
        POS_LEAVE_UP = 'U';
    }
    
    public static void leaveDown(char currChar){
        if(currChar == 'U' && POS_LEAVE_DOWN == 'U'){
            COUNTER_LEAVE_DOWN++;
        }
        if(currChar == 'D' && POS_LEAVE_DOWN == 'U'){
            COUNTER_LEAVE_DOWN++;
        }
        if(currChar == 'U' && POS_LEAVE_DOWN == 'D'){
            COUNTER_LEAVE_DOWN++;
            COUNTER_LEAVE_DOWN++;
        }
        POS_LEAVE_DOWN = 'D';
        //System.out.println("Cnt:" + COUNTER_LEAVE_DOWN + " " + "currChar:" + currChar + " " + "POS:" + POS_LEAVE_DOWN);
    }
    
    public static void leaveLike(char currChar){
        if(currChar != POS_LEAVE_LIKE_U_WANT){
            COUNTER_LEAVE_LIKE_U_WANT++;
        }
        POS_LEAVE_LIKE_U_WANT = currChar;
    }
}