import java.io.PrintWriter;
import java.util.Scanner;

// https://ru.kattis.com/problems/8queens

public class EightQueens {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        char[][] arr = new char[8][8];
        
        for(int i = 0; i < 8; i++){
            String input = in.nextLine();
            for(int j = 0; j < 8; j++){ // fylla fylkid med bordinu
                arr[i][j] = input.charAt(j);
            }
        }
        
        if(!checkEightQ(arr) || !checkVertical(arr) || !checkHorizontal(arr) || !checkDiagonal(arr)){
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }
    }
    
    public static boolean checkEightQ(char[][] arr){
        int cnt = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(arr[i][j] == '*'){
                    cnt++;
                }
            }
        }
        if(cnt == 8)
            return true;
        else
            return false;
    }
    
    public static boolean checkVertical(char[][] arr){
        for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if(arr[i][j] == '*'){
                        int cnt = 0;
                        for(int k = 0; k < 8; k++){
                            if(arr[k][j] == '*'){
                                cnt++;
                            }
                        }
                        if(cnt > 1){
                            return false;
                        }
                    }
                }
        }
        return true;
    }
    
    public static boolean checkHorizontal(char[][] arr){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(arr[i][j] == '*'){
                    int cnt = 0;
                    for(int k = 0; k < 8; k++){
                        if(arr[j][k] == '*'){
                            cnt++;
                        }
                    }
                    if(cnt > 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean checkDiagonal(char[][] arr){
        for(int i = 0; i < 8; i++){ // rows
            for(int j = 0; j < 8; j++){ // cols
                if(arr[i][j] == '*'){
                    int cnt = 0;
                    for(int k = 0; k < 8; k++){ // rows
                        for(int z = 0; z < 8; z++){ // cols
                            if(arr[k][z] == '*'){
                                if(Math.abs(i - k) == Math.abs(j - z)){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(cnt > 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean outOfBounds(char[][] arr){
        return true;
    }
}