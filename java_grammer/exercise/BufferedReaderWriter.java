package java_grammer.exercise;
import java.io.*;
import java.util.StringTokenizer;

public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str= "a,b,c,";
        StringTokenizer st=new StringTokenizer(str,",") ;

        String s1=st.nextToken();
        String s2=st.nextToken();
        String s3=st.nextToken();

        String s = br.readLine();
        int i=Integer.parseInt(s);
        br.close();
        bw.write("입력 받은 값: "+s);
        bw.newLine();//개행 메소드
        bw.write("입력 받은 값 + 10 : "+(i+10)+"\n");
        bw.write("입력 받은 값 + 10 : "+(Integer.parseInt(s)+10)+"\n");
        bw.newLine();//개행 메소드
        bw.flush();
        bw.close();
    }
}
