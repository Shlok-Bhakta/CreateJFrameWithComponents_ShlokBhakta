import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JAction2 extends JFrame implements ActionListener{
    JLabel label = new JLabel("Enter your name");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");
    public JAction2(){
        super("Frame with components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
        button.addActionListener(this);
        field.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if(source == button){
            label.setText("You clicked the button");
        }else{
            label.setText("You pressed Enter");
        }
    }
    
}
