import java.io.PrintWriter;

public class run {
    public static void main(String[] args) {
        try 
        {
            // ghi dữ liệu vào file
            PrintWriter w = new PrintWriter("D:\\print.txt", "UTF-8");
            w.println("luc van lap");
            w.print("dai hoc king kong");
            w.println("19 tuoi");
            w.flush();
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
