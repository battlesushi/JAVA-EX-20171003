import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private Container cp;
    private JButton jbtnAdd=new JButton("Add");
    private JButton jbtn2Sub=new JButton("Sub");
    private JButton jbtn3=new JButton("jbtn3");
    private JButton jbtnExit=new JButton("Exit");
    private JLabel jlab=new JLabel("0");
    private int count=0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new GridLayout(5,1,3,3));
        cp.add(jbtnAdd);
        cp.add(jbtn2Sub);
        jlab.setHorizontalAlignment(JLabel.CENTER);
        cp.add(jlab);
        cp.add(jbtn3);
        cp.add(jbtnExit);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText(String.valueOf(++count));
            }
        });
        jbtn2Sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText(String.valueOf(--count));
            }
        });
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
