package bibleOfJava.exer;

public class hi {
    public static void main(String[] args) {
        int[] emergency=new int[]{30,10,23,6,100};
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){

            int idx = 1;
            for(int j=0; j < answer.length; j++){
                if(answer[j] != 0){
                    continue;
                }
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
    }
}

