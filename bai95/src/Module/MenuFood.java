package Module;

import java.util.StringTokenizer;

public class MenuFood {
    private String main_Food;
    private String sub_Food;
    private int price;
    
    public MenuFood() {
        this.main_Food = "";
        this.sub_Food = "";
        this.price = 0;
    }

    public String getMain_Food() {
        return main_Food;
    }

    public void setMain_Food(String main_Food) {
        this.main_Food = main_Food;
    }

    public String getSub_Food() {
        return sub_Food;
    }

    public void setSub_Food(String sub_Food) {
        this.sub_Food = sub_Food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void result() {
        this.price =0;
        if (this.main_Food.equals("Cơm")) {
            price = price + 15000;
        }
        else if (this.main_Food.equals("Phở")) {
            price = price + 20000;
        }
        else if (this.main_Food.equals("Bún")) {
            price = price + 25000;
        }

        StringTokenizer stk = new StringTokenizer(this.sub_Food, ";");
        while (stk.hasMoreTokens()) {
            String sub = stk.nextToken();
            if (sub.equals("Trà sữa")) {
                price = price + 10000;
            }
            else if (sub.equals("Nước ngọt")) {
                price = price + 15000;
            }
            else if (sub.equals("Trà đá")) {
                price = price + 20000;
            }
            else if (sub.equals("Kem")) {
                price = price + 25000;
            }
        }
    }
    
}
