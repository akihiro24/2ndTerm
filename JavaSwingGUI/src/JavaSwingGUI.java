import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class JavaSwingGUI {

    //Frame & Panel Variable
    JFrame f;
    JPanel p;

    //Menu Variables
    JMenuBar jMenuBar;
    JMenuItem m1;

    //Text Field Variables
    JLabel lbl1,lbl2;  
    JTextArea area;  
    JButton btn;

    
    public JavaSwingGUI(){
        f = new JFrame();
    }

    public void GUIProperties(){
    
        //Menu

        //Text Field

        //Labels

        //Panels
        p.setBackground(Color.BLUE);
        p.setLayout(null);

        //Buttons

        //Add to Frame
        f.add(p);
    
        //Frame
        f.setTitle("Program ni Kiether");
        f.setSize(800,600);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }







    
}
