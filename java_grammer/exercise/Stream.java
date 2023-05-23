package java_grammer.exercise;
import java.io.*;

public class Stream {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        OutputStream out = System.out;
        int idata = in.read();
        out.write(idata);
        out.flush();
        out.close();
    }
}
