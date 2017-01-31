
// https://ru.kattis.com/problems/pet

public class Pet {
	
    public static void main(String[] args) {
    	
        Kattio io = new Kattio(System.in, System.out);

        int asum = 0;
        int max = 0;
        int contestant = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                int grade = io.getInt();
                asum += grade;
            }
            if(asum > max){
                max = asum;
                contestant = i+1;
            }
            asum = 0;
        }

        io.print(contestant + " " + max);
        io.flush();

    }
}