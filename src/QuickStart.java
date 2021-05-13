import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuickStart implements ActionListener {

    JFrame jf;
    JRadioButton jr1, jr2, jr3, jr4;
    JLabel jl1, jl2;
    JButton jb1, jb2, jb3;
    ButtonGroup bg;

    QuickStart(){
        jf = new JFrame();

        jl1 = new JLabel("Quick Start");
        jl1.setBounds(500,40,200,50);
        jl1.setFont(new Font("Verdana",Font.PLAIN,25));
        jf.add(jl1);

        jl2 = new JLabel("Recent Work");
        jl2.setBounds(70,10,200,50);
        jl2.setFont(new Font("Verdana",Font.PLAIN,18));
        jf.add(jl2);

        bg = new ButtonGroup();

        jr1 = new JRadioButton("Create New File");
        jr1.setBounds(380,100,250,50);
        bg.add(jr1);

        jr2 = new JRadioButton("Open Existing File");
        jr2.setBounds(380,160,250,50);
        bg.add(jr2);

        jr3 = new JRadioButton("Import From Drive");
        jr3.setBounds(380,220,250,50);
        bg.add(jr3);

        jr4 = new JRadioButton("Help");
        jr4.setBounds(380,280,250,50);
        bg.add(jr4);

        jf.add(jr1);
        jf.add(jr2);
        jf.add(jr3);
        jf.add(jr4);

        jb1 = new JButton("Continue");
        jb1.setBounds(620,350,90,30);
        jb1.addActionListener(this);
        jf.add(jb1);

        JSeparator s = new JSeparator();
        s.setOrientation(SwingConstants.VERTICAL);
        s.setBounds(300,0,10,490);
        s.setBackground(Color.BLACK);
        jf.add(s);

        jf.setTitle("Quick Start");
        jf.setSize(800, 500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new QuickStart();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jr1.isSelected()){
            System.out.println("create new selected");
            new createNewProject();
            jf.setVisible(false);
        }else if(jr2.isSelected()){
            JOptionPane.showMessageDialog(jf,"Existing File");
        }else if(jr3.isSelected()){
            JOptionPane.showMessageDialog(jf,"Import from Drive");
        }
    }
}
