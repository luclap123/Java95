package src.View;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import src.Module.Customer;

public class Save1 
{
    public static boolean savefile(ArrayList<Customer>List, String path)
    {
        try 
        {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for (Customer c : List)
            {
                String line = c.getName() + " " + c.getCode();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

public static ArrayList<Customer> readfile(String path)
{
        ArrayList<Customer> List = new ArrayList<Customer>();
        try 
        {
            FileInputStream fos = new FileInputStream(path);
            InputStreamReader osw = new InputStreamReader(fos, "UTF-8");
            BufferedReader bw = new BufferedReader(osw);
            String line = bw.readLine();
            while (line != null)
            {
                String[] arr = line.split(" ");
                Customer c = new Customer(arr[0], arr[1]);
                List.add(c);
                line = bw.readLine();
            }
            bw.close();
            return List;
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return List;

}
}
