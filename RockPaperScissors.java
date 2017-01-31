import java.util.Scanner;

// https://ru.kattis.com/problems/rockpaperscissors

public class RockPaperScissors {
	static double WIN_P1;
	static double WIN_P2;
	static double LOSS_P1;
	static double LOSS_P2;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			String input = in.nextLine();
			String[] a = input.split(" ");
			int n = Integer.parseInt(a[0]); // players
			if(n == 0)
				break;
			int k = Integer.parseInt(a[1]); // games
			
			for(int i = 0; i < ((k*n*(n-1)) / 2) ; i++){
				String game = in.nextLine();
				if(whoWins(game) == 1){
					WIN_P1++;
					LOSS_P2++;
				}
				if(whoWins(game) == 2){
					WIN_P2++;
					LOSS_P1++;
				}
			}
			
			if(WIN_P1 == 0 && WIN_P2 == 0){
				System.out.println("-");
			} else if(WIN_P1 == 1 && WIN_P2 == 0){
				System.out.println("1.000");
				System.out.println("0.000");
			} else if(WIN_P2 == 1.0 && WIN_P1 == 0){
				System.out.println("0.000");
				System.out.println("1.000");
			} else {
				System.out.println(round(WIN_P1 / (WIN_P1 + LOSS_P1), 3));
				System.out.println(round(WIN_P2 / (WIN_P2 + LOSS_P2), 3));
			}
			
			WIN_P1 = WIN_P2 = LOSS_P1 = LOSS_P2 = 0;
			System.out.println();
		}
		in.close();
	}
	
	public static int whoWins(String game){
		String[] arr = game.split(" ");
		if(arr[0].equals("1")){ // p1
			if(arr[1].equals("rock")){
				if(arr[3].equals("paper")){
					return 2;
				}
				if(arr[3].equals("scissors")){
					return 1;
				} else {
					return 0;
				}
			}
			if(arr[1].equals("paper")){
				if(arr[3].equals("rock")){
					return 1;
				}
				if(arr[3].equals( "scissors")){
					return 2;
				} else {
					return 0;
				}
			}
			if(arr[1].equals("scissors")){
				if(arr[3] == "rock"){
					return 2;
				}
				if(arr[3].equals("paper")){
					return 1;
				} else {
					return 0;
				}
			}
		} else { // p2
			if(arr[1].equals("rock")){
				if(arr[3].equals("paper")){
					return 1;
				}
				if(arr[3].equals("scissors")){
					return 2;
				} else {
					return 0;
				}
			}
			if(arr[1].equals("paper")){
				if(arr[3].equals("rock")){
					return 2;
				}
				if(arr[3].equals("scissors")){
					return 1;
				} else {
					return 0;
				}
			}
			if(arr[1].equals("scissors")){
				if(arr[3].equals("rock")){
					return 1;
				}
				if(arr[3].equals("paper")){
					return 2;
				} else {
					return 0;
				}
			}
		}
		return 0;
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
}