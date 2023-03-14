import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class JavaSwingGUI extends JFrame implements ActionListener {

    //Frame & Panel Variable
    JFrame gFrame;
    JPanel gPanel;

    //Menu Variables
    JMenuBar gMenuBar;
    JMenuItem gMenuItem1, gMenuItem2;
    JMenu gMenu;

    //Text Field Variables
    JLabel gTitle;
    JLabel gEnterText;
    JLabel gWords;
    JLabel gCharacters;
    JTextArea gArea;  
    JButton gBtn;

    public JavaSwingGUI(){
        gFrame = new JFrame();
        gPanel = new JPanel();

        gMenu = new JMenu();
        gMenuBar = new JMenuBar();
        gMenuItem1 = new JMenuItem();
        gMenuItem2 = new JMenuItem();

        gTitle = new JLabel();
        gEnterText = new JLabel();
        gWords = new JLabel();
        gCharacters = new JLabel();

        gArea = new JTextArea();
        gBtn = new JButton();
        gBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            String text = gArea.getText();  
            String words[] = text.split("\\s"); 
            
            gWords.setText("Words: " + words.length);
            gWords.setForeground(Color.white);
            gWords.setFont(new Font("Helvetica", Font.BOLD, 15));
            gWords.setBounds(100,400,300,50);

            gCharacters.setText("Characters: " + text.length()); 
            gCharacters.setForeground(Color.white);
            gCharacters.setFont(new Font("Helvetica", Font.BOLD, 15));
            gCharacters.setBounds(300,400,300,50);
            }
        });
    }

    public void gProperties(){
    
        //Menu
        gMenu.setText("Menu");  
        gMenuItem1.setText("Item 1");
        gMenuItem2.setText("Item 2");
        gMenu.add(gMenuItem1);
        gMenu.add(gMenuItem2);
        gMenuBar.add(gMenu);

        //Text Field
        gArea.setBounds(135,100,200,200);
        gArea.setLineWrap(true);

        //Labels
        gTitle.setText("Words and Characters Counter");
        gTitle.setForeground(Color.white);
        gTitle.setFont(new Font("Helvetica", Font.BOLD, 20));
        gTitle.setBounds(100,0,300,50);

        //Input Text Label
        gEnterText.setText("Input Text");
        gEnterText.setForeground(Color.white);
        gEnterText.setFont(new Font("Helvetica", Font.BOLD, 15));
        gEnterText.setBounds(200,50,300,50);

        //Panels
        gPanel.setBackground(Color.pink);
        gPanel.setLayout(null);

        //Buttons
        gBtn.setText("Enter");
        gBtn.setBackground(Color.blue);
        gBtn.setForeground(Color.white);
        gBtn.setFont(new Font("Helvetica", Font.BOLD, 20));
        gBtn.setBounds(185,330,100,50); 
        
        //Add to Panels
        gPanel.add(gTitle);
        gPanel.add(gEnterText);
        gPanel.add(gBtn);
        gPanel.add(gArea);
        gPanel.add(gWords);
        gPanel.add(gCharacters);
        
        //Add to Frame
        gFrame.add(gPanel);
        
        //Frame
        gFrame.setTitle("Program ni Kiether");
        gFrame.setSize(500,600);
        gFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gFrame.setLocationRelativeTo(null);
        gFrame.setVisible(true);
        gFrame.setJMenuBar(gMenuBar);
        
    }

    //Allows the user's data input to be calculated using length function
    public void actionPerformed(ActionEvent e){
    String text = gArea.getText();  
    String words[] = text.split("\\s"); 
     
    gWords.setText("Words: " + words.length);
    gWords.setForeground(Color.white);
    gWords.setFont(new Font("Helvetica", Font.BOLD, 15));
    gWords.setBounds(100,400,300,50);

    gCharacters.setText("Characters: " + text.length()); 
    gCharacters.setForeground(Color.white);
    gCharacters.setFont(new Font("Helvetica", Font.BOLD, 15));
    gCharacters.setBounds(300,400,300,50);
    }
    
}  

