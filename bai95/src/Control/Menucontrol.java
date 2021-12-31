package Control;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.text.View;

import View.ViewMenu;
public class Menucontrol implements Action 
{
    private ViewMenu View;
    public Menucontrol(ViewMenu View)
    {
        this.View = View;
    }
    public void actionPerformed(ActionEvent e)
    {
        String mainFood ="";
        Enumeration <AbstractButton> buttons_Main = View.group.getElements();
        while (buttons_Main.hasMoreElements())
        {
            AbstractButton a = buttons_Main.nextElement();
            if (a.isSelected())
            {
                mainFood = a.getText();
            }
        }
        String subFood ="";
        Enumeration <AbstractButton> buttons_Sub = View.group_sub.getElements();
        while (buttons_Sub.hasMoreElements())
        {
            AbstractButton a = buttons_Sub.nextElement();
            if (a.isSelected())
            {
                subFood = subFood + a.getText()+"; ";
            }
        }
        View.menuFood.setMain_Food(mainFood);
        View.menuFood.setSub_Food(subFood);
        View.menuFood.result();
        View.face();
    }
    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
}
