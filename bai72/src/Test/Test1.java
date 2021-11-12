package src.Test;

import java.util.ArrayList;

import src.Module.Customer;
import src.View.Save1;

public class Test1 {
    public static void run()
    {
        ArrayList<Customer>List = new ArrayList<Customer>();
        List.add(new Customer("luc van lap", "1"));
        List.add(new Customer("phong", "2"));
        List.add(new Customer("vu", "3"));
        List.add(new Customer("tun", "4"));
        List.add(new Customer("up", "5"));

        boolean check = Save1.savefile(List, "D:\\meo.txt");
    }
    public static void main(String[] args) {
        // run();
        ArrayList<Customer>List = Save1.readfile("D:\\meo.txt");
        System.out.println("list of customer");
        System.out.println("name \t code");
        for (Customer c : List) {
            System.out.println(c);
        }
    }
}
