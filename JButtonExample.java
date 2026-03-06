import javax.swing.*;
import java.awt.event.*;
public class JButtonExample {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Button Example");
        JButton btn = new JButton("Click Me");
        btn.setBounds(180,120,100,30);
        JToggleButton toggle = new JToggleButton("ON/OFF");
        toggle.setBounds(30,20,100,30);
        JCheckBox cb = new JCheckBox("Java");
        cb.setBounds(30,60,100,30);
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        r1.setBounds(30,100,100,30);
        r2.setBounds(30,130,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        toggle.addActionListener(e -> {
            if(toggle.isSelected())
                System.out.println("Toggle ON");
            else
                System.out.println("Toggle OFF");
        });
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cb.isSelected())
                    System.out.println("Java Checkbox Selected");
                if(r1.isSelected())
                    System.out.println("Male Selected");
                else if(r2.isSelected())
                    System.out.println("Female Selected");
                System.out.println("Button Clicked");
            }
        });
        frame.add(btn);
        frame.add(toggle);
        frame.add(cb);
        frame.add(r1);
        frame.add(r2);
        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}