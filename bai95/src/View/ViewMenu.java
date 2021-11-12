package View;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.GridLayout;
import Module.MenuFood;

public class ViewMenu extends JFrame
{
    private MenuFood menuFood;
    
    public ViewMenu()
    {
        this.menuFood = new MenuFood();
        this.init();

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
        JPanel JPMain_food = new JPanel();
        JPMain_food.setLayout(new GridLayout(1, 3));
        JRadioButton com = new JRadioButton("Cơm");
        JRadioButton pho = new JRadioButton("Phở");
        JRadioButton bun = new JRadioButton("Bún");
        ButtonGroup group = new ButtonGroup();
        group.add(com);
        group.add(pho);
        group.add(bun);
        JPMain_food.add(com);
        JPMain_food.add(pho);
        JPMain_food.add(bun);
        

        this.add(header, "North");
        this.setVisible(true);
    }
}
