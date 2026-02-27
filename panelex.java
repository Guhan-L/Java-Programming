import javax.swing.*;
public class panelex{
  public static void main(String[] args){
    JFrame frame=new JFrame("Panel Example");
    JPanel panel=new JPanel();
    panel.add(new JButton("Click Me"));
    panel.add(new JLabel("Hello"));
    frame.add(panel);
    frame.setSize(1000,800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }}
