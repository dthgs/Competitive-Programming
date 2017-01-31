
// https://ru.kattis.com/problems/natjecanje

public class Natjecanje {
    static int DMG_TEAMS = 0;
    
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int N = io.getInt(); // (2 <= N <= 10) total teams
        int S = io.getInt(); // (2 <= S <= N) teams with damaged kayaks
        int R = io.getInt(); // (1 <= R <= N) teams with reserve kayaks
        boolean[] dmgarr = new boolean[12];
        boolean[] resarr = new boolean[12];
        
        for(int i = 0; i < S; i++) dmgarr[io.getInt()] = true; // fill dmgarr       
        for(int i = 0; i < R; i++) resarr[io.getInt()] = true; // fill resarr
        
        for(int i = 1; i < 11; i++){ // team needs its own boat
            if((dmgarr[i] == true) && (resarr[i] == true)){
                dmgarr[i] = false;
                resarr[i] = false;
            }
        }
        
        for(int i = 1; i < 11; i++){ // see if adjacent boats are free
            if(dmgarr[i] == true){
                if(resarr[i-1] == true){
                    resarr[i-1] = false;
                    dmgarr[i] = false;
                } else if(resarr[i+1] == true){
                    resarr[i+1] = false;
                    dmgarr[i] = false;
                }
            }
        }
        
        for(int i = 1; i < 11; i++){
            if(dmgarr[i] == true){
                DMG_TEAMS++;
            }
        }
        
        System.out.println(DMG_TEAMS);
    }
}