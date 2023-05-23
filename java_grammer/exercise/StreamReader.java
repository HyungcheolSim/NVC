package java_grammer.exercise;
import java.io.*;

public class StreamReader {
    public static void main(String[] args) throws IOException {
        //InputStream in=System.in;
        InputStreamReader reader=new InputStreamReader(System.in);
        //OutputStream out=System.out;
        OutputStreamWriter writer = new OutputStreamWriter(System.out);

        char[] cdata= new char[3]; //이제 char를 기본형으로 받을 수 있고 2개 이상의 값을 배열을 통해 받아올 수 있다.
        reader.read(cdata);
        int IcData = cdata[0]-'0';
        writer.write("입력받은 값: ");
        writer.write(cdata);
        writer.write("\n");
        writer.write(IcData+10+"\n");

        System.out.println("#######결과#######");
        writer.flush();
        writer.close();
    }

}
