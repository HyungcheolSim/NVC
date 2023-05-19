package programmers;

//옹알이(1)

import java.util.ArrayList;

class Babbling {
    public static void main(String[] args) {
        int answer = 0;
        //babbling의 문장들 중 pro의 배열 조합에서 조합 가능한 것들로만 구성이 가능할 때 그 문장을 발음 가능.
        //babbling 문자열들 중에서 pro 배열의 단어들을 뺐을 때 남은 게 없으면 count++
        String[] pro = {"aya", "ye", "woo", "ma"};
        //String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"} ;
                String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        for (int k = 0; k < babbling.length; k++) {
            for (int i = 0; i < pro.length; i++) {
                if (babbling[k].startsWith(pro[i])||babbling[k].endsWith(pro[i])) {
                    System.out.println(pro[i]+"를 포함");
                    babbling[k] = babbling[k].replace(pro[i], "");
                    System.out.println(babbling[k]);
                }

            }
        }
        for (int k = 0; k < babbling.length; k++) {
            if(babbling[k].equals(""))
                answer++;
        }
        System.out.println("발음가능: "+answer);
    }
}
