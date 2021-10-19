import java.io.*;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"Text.txt";
        FileInputStream fis = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
       // String l1 = br.readLine();
      //  String l2 = br.readLine();
        //System.out.println(l1);
       // System.out.println(l2);
        String x;
        while ((x=br.readLine())!=null){
            System.out.println(x);

        }


    }
}
