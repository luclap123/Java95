package View;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Control.Menucontrol;

import java.awt.GridLayout;
import java.awt.BorderLayout;



import Module.MenuFood;

public class ViewMenu extends JFrame
{
    public MenuFood menuFood;
    public JRadioButton com;
    public JRadioButton pho;
    public JRadioButton bun;
    public ButtonGroup group;
    public JCheckBox traSua;
    public JCheckBox nuocNgot;
    public JCheckBox traDa;
    public JCheckBox kem;
    public ButtonGroup group_sub;
    public JLabel info_client;
    public ViewMenu()
    {
        this.menuFood = new MenuFood();
        this.init();
        this.setVisible(true);
    } 
    public void init()
    {
        this.setTitle("View Menu Food");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Menu food");
        
        JPanel header = new JPanel();
        header.add(label);

        // tạo menu món chính
        JPanel JPMain_food = new JPanel();
        JPMain_food.setLayout(new GridLayout(1, 3));
        com = new JRadioButton("Cơm");
        pho = new JRadioButton("Phở");
        bun = new JRadioButton("Bún");

        // nhóm các radio button
        group = new ButtonGroup();
        group.add(com);
        group.add(pho);
        group.add(bun);

        // thêm các radio button vào panel
        JPMain_food.add(com);
        JPMain_food.add(pho);
        JPMain_food.add(bun);
        
        // tạo menu món phụ
        JPanel JPsub_food = new JPanel();
        JPsub_food.setLayout(new GridLayout(2, 2));
        traSua = new JCheckBox("Trà sữa");
        nuocNgot = new JCheckBox("Nước ngọt");
        traDa = new JCheckBox("Trà đá");
        kem = new JCheckBox("Kem");
        group_sub = new ButtonGroup();
        group_sub.add(traSua);
        group_sub.add(nuocNgot);
        group_sub.add(traDa);
        group_sub.add(kem);

        JPsub_food.add(traSua);
        JPsub_food.add(nuocNgot);
        JPsub_food.add(traDa);
        JPsub_food.add(kem);


        // gộp hai menu lại
        JPanel big_Menu = new JPanel();
        big_Menu.setLayout(new GridLayout(2, 1));
        big_Menu.add(JPMain_food);
        big_Menu.add(JPsub_food);

        // tạo thông tin và thanh toán
        JPanel info = new JPanel();
        info_client = new JLabel();
        JButton pay = new JButton("thanh toán");
        Action ac = new Menucontrol(this);
        pay.addActionListener((java.awt.event.ActionListener) ac);
        info.add(info_client);
        info.add(pay);

        this.add(big_Menu, BorderLayout.CENTER);
        this.add(info, BorderLayout.SOUTH);
        this.add(header, "North");
    }
    public void face() 
    {
        String kq ="main food: "+this.menuFood.getMain_Food()
                +"; sub food: "+this.menuFood.getSub_Food()
                +"; price: "+this.menuFood.getPrice();
        this.info_client.setText(kq);
    }
   
}
