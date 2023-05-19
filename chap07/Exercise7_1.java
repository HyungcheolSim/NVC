package chap07;


//섯다 카드 20장을 담는 섯다 카드 배열을 초기화 해라.
//섯다카드는 1~10까지의 ㅜㅅㅅ자가 적힌 한 쌍씩 있고 숫자가 1,3,8 인 경우에 둘 중에 한 장은 광이여야 한다.(isKwang=true);



class SutdaDeck{
    final int CARD_NUM=20;
    SutdaCard[] cards=new SutdaCard[CARD_NUM];
    SutdaDeck(){
        for(int i=0;i<cards.length;i++){
            int num=i%10+1;
            boolean isKwang=(i<10)&&(num==1||num==3||num==8);
            //boolean 변수 사용 방법..
            cards[i]=new SutdaCard(num,isKwang);

        }
    }

    public void shuffle(){
        for(int i=0;i<cards.length;i++){
            int number=(int)Math.random()*cards.length;
            SutdaCard temp=cards[i];
            cards[i]=cards[number];
            cards[number]=temp;
        }
    }
    public SutdaCard pick(int index){
        if(index<0||index>=CARD_NUM)
            return null;
        return cards[index];
    }
    //위의 메소드를 재활용해서 유효성검사 코드가 중복되지 않도록 하고 효율성을 높인다.
    public SutdaCard pick(){
        return pick((int)Math.random()* cards.length);
    }

}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num,boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }
    public String toString(){
        return num+ (isKwang?"K":"");
    }
}
public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck= new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0;i<deck.cards.length;i++){
            System.out.print(deck.cards[i]+",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
