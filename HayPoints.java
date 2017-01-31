import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

// https://ru.kattis.com/problems/haypoints

public class HayPoints {
    static int THESUM;
    
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        TreeMap<String, Integer> st = new TreeMap<String, Integer>();
        //int[] sums = new int[m];
        String mn = in.nextLine();
        String[] intmn = mn.split(" ");
        int m = Integer.parseInt(intmn[0]); // nr of words in the Hay Point dictionary
        int n = Integer.parseInt(intmn[1]); // nr of job descriptions
        
        for(int i = 0; i < m; i++){
            String input = in.nextLine();
            String[] arr = input.split(" ");
            st.put(arr[0], Integer.parseInt(arr[1]));
        }
        
        for(int i = 0; i < n; i++){
            while(true){
                String jobsline = in.nextLine();
                String[] jobslinearr = jobsline.split(" ");
                if(jobsline.equals(".")){
                    break;
                } else {
                    for(int j = 0; j < jobslinearr.length; j++){
                        if(st.containsKey(jobslinearr[j])){
                            int value = st.get(jobslinearr[j]);
                            THESUM += value;
                        }
                    }
                }
            }
            
            out.println(THESUM);
            THESUM = 0;
        }
    }
}