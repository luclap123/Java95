package View;

import javax.swing.JFrame;

import Module.MyNotePad;

public class ViewNotePad extends JFrame{
    private MyNotePad myNotePad;
    
    //tạo bảng hiển thị
    public ViewNotePad(MyNotePad myNotePad)
    {
        this.myNotePad = new MyNotePad();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("My NotePad");

        // tạo bảng hiển thị
        

        
    }
}
