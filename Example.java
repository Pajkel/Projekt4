import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Example extends JFrame implements ActionListener {

    private JButton btn1 = new JButton("Wyslij");
    private JButton btn2 = new JButton("Wyczysc");
    private JTextField text1 = new JTextField("");
    private JTextField text2 = new JTextField("");
    private JLabel label1 = new JLabel("Podaj haslo:");
    private JLabel label2 = new JLabel("Uzytkownik:");
    private JMenuBar bar = new JMenuBar();
    private JMenu m2 = new JMenu("- Komputery");
    private JMenu m3 = new JMenu("- Pamieci Ram");
    private JMenu m4 = new JMenu("- Praca");
    private JMenu m5 = new JMenu("- O nas");
    private JMenu m6 = new JMenu("- Pomoc");
    private JMenuItem i1 = new JMenuItem("Przyklad");
    private JMenuItem i2 = new JMenuItem("Przyklad");
    private JMenuItem i3 = new JMenuItem("Przyklad");
    private JMenuItem i4 = new JMenuItem("Przyklad");
    private JMenuItem i5 = new JMenuItem("Przyklad");
    private JMenuItem i6 = new JMenuItem("Przyklad");
    private JMenuItem w1 = new JMenuItem("Przyklad");
    private JMenuItem w2 = new JMenuItem("Przyklad");
    private JMenuItem w3 = new JMenuItem("Przyklad");
    private JMenuItem w4 = new JMenuItem("Przyklad");
    private JMenuItem w5 = new JMenuItem("Przyklad");
    private JMenuItem w6 = new JMenuItem("Przyklad");
    private JMenuItem a1 = new JMenuItem("Przyklad");
    private JMenuItem b1 = new JMenuItem("Przyklad");
    private JMenuItem b2 = new JMenuItem("Przyklad");
    private JMenuItem c1 = new JMenuItem("Przyklad");
    private JMenuItem c2 = new JMenuItem("Przyklad");
    private JMenu submenu = new JMenu("Sub Menu");
    private JLabel image = new JLabel(new ImageIcon("p30.jpg"));

    Example() {
        setTitle("Logowanie do aplikacji");
        setSize(540,520);
        setVisible(true);
        setLayout(null);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn1.setBounds(50,400,150,30);
        btn2.setBounds(280,400,150,30);
        text1.setBounds(118,300,310,32);
        text2.setBounds(120,200,310,32);
        label1.setBounds(10,300,310,32);
        label2.setBounds(10,200,310,32);
        bar.setBounds(0,0,540,34);
        image.setBounds(0,0,541,60);
        add(btn1);
        add(btn2);
        add(text1);
        add(text2);
        add(label1);
        add(label2);
        add(bar);
        bar.add(m2);
        bar.add(m3);
        bar.add(m3);
        bar.add(m4);
        bar.add(m5);
        bar.add(m6);
        m2.add(i1);
        m2.add(i2);
        m2.add(i3);
        m2.add(i4);
        m2.add(i5);
        m2.add(i6);
        m3.add(w1);
        m3.add(w2);
        m3.add(w3);
        m3.add(w4);
        m3.add(w5);
        m3.add(w6);
        m6.add(a1);
        m4.add(b1);
        m4.add(b2);
        m5.add(c1);
        m5.add(c2);
        m2.add(submenu);
        submenu.add(c2);
        add(image);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            if (text1.getText().length() < 1) {
                JOptionPane.showMessageDialog(this, "Haslo jest zbyt krotkie");
            }
            if(text2.getText().length() < 1) {
                JOptionPane.showMessageDialog(this, "Nazwa uzytkownika jest zbyt krotka");
            }
        }
        if(e.getSource() == btn2) {
            text1.setText("");
        }
    }
    public static void main(String[] args) {
        new Example();
    }


}

