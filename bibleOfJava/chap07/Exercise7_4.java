package bibleOfJava.chap07;

class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME=100;
    final int MIN_VOLUME=0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL=1;
    //
    public void setChannel(int channel){
        prevChannel=this.channel;
        this.channel=channel;
    }
    public int getChannel(){
        return channel;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public int getVolume(){
        return volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
public class Exercise7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH: "+t.getChannel());

        t.setChannel(20);
        System.out.println("CH: "+t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH: "+ t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH: "+ t.getChannel());
    }
}
