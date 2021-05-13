import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Charts implements ActionListener {
    JFrame jf;
    JLabel jl,jl1;
    JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5;

    Charts(){
        jf = new JFrame();

        jl = new JLabel("Select Any one To proceed...");
        jl.setFont(new Font("Verdana",Font.PLAIN,22));
        jl.setBounds(600,50,400,50);
        jf.add(jl);

        jbtn1 = new JButton("Flow Chart");
        jbtn1.setFont(new Font("Verdana",Font.PLAIN,20));
        jbtn1.setBounds(200,150,150,50);
        jf.add(jbtn1);
        jbtn1.addActionListener(this);

        jbtn2 = new JButton("Gantt Chart");
        jbtn2.setFont(new Font("Verdana",Font.PLAIN,20));
        jbtn2.setBounds(480,150,200,50);
        jbtn2.addActionListener(this);
        jf.add(jbtn2);

        jbtn3 = new JButton("ER Diagram");
        jbtn3.setFont(new Font("Verdana",Font.PLAIN,20));
        jbtn3.setBounds(780,150,250,50);
        jbtn3.addActionListener(this);
        jf.add(jbtn3);

        jbtn4 = new JButton("Fish Bone");
        jbtn4.setFont(new Font("Verdana",Font.PLAIN,20));
        jbtn4.setBounds(1130,150,150,50);
        jbtn4.addActionListener(this);
        jf.add(jbtn4);

        jbtn5 = new JButton("Continue as Empty");
        jbtn5.setFont(new Font("Verdana",Font.PLAIN,15));
        jbtn5.setBounds(1200,700,200,40);
        jf.add(jbtn5);
        jbtn5.addActionListener(this);

        jl1 = new JLabel("");
        jl1.setFont(new Font("Verdana",Font.PLAIN,22));
        jl1.setBounds(600,250,400,50);
        jf.add(jl1);
        jl1.setVisible(false);


        jf.setTitle("Charts Template");
        jf.setSize(1920, 1200);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Charts();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
        if(text.equals("Flow Chart")){
//            JOptionPane.showMessageDialog(jf,"Open Flow Chart");
            jl1.setText("Sample Templates for"+" "+text);
            jl1.setVisible(true);
        }
        if(text.equals("Gantt Chart")){
//            JOptionPane.showMessageDialog(jf,"Open Gantt Chart");
            jl1.setText("Sample Templates for"+" "+text);
            jl1.setVisible(true);
        }
        if(text.equals("ER Diagram")){
//            JOptionPane.showMessageDialog(jf,"Open ER Diagram");
            jl1.setText("Sample Templates for"+" "+text);
            jl1.setVisible(true);

        }
        if(text.equals("Fish Bone")){
//            JOptionPane.showMessageDialog(jf,"Open Fish Bone");
            jl1.setText("Sample Templates for"+" "+text);
            jl1.setVisible(true);

        }
        if(text.equals("Continue as Empty")){
            new Draw();
        }
    }
}
