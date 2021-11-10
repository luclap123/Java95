package View;

import java.awt.BorderLayout;
import java.awt.Image;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Iconpr extends JFrame {
    private JMenuBar menubar;
    private JMenu menu, menu2, submenu;
    private JMenuItem i1, i2, i3, i4;
    private JButton JB1;
    private JLabel Label;

    public Iconpr() {
        // tạo cửa sổ
        this.setTitle("Icon");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // tạo menu
        menubar = new JMenuBar();
        menu = new JMenu("File");
        menu2 = new JMenu("Edit");
        submenu = new JMenu("Submenu");
        i1 = new JMenuItem("open");
        i1.setIcon(new ImageIcon(getClass().getResource("picture\\open.png")));
        i2 = new JMenuItem("save");
        i2.setIcon(new ImageIcon(getClass().getResource("picture\\save.png")));
        i3 = new JMenuItem("exit");
        i3.setIcon(new ImageIcon(getClass().getResource("picture\\exit.png")));
        i4 = new JMenuItem("about");
        i4.setIcon(new ImageIcon(getClass().getResource("picture\\about.png")));
        menu.add(i1);
        menu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        menu.add(submenu);
        menubar.add(menu);
        menubar.add(menu2);

        // set icon
        URL url = getClass().getResource("picture\\vscode.png");
        Image image = new ImageIcon(url).getImage();
        this.setIconImage(image);

        // tạo button
        JB1 = new JButton("Button");

        // tạo label
        Label = new JLabel("Label");

        this.setLayout(new BorderLayout());
        this.add(menubar, BorderLayout.NORTH);
        this.add(JB1, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
