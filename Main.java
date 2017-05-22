import java.awt.BorderLayout; 

import javax.swing.JFrame;

public class Main{

    public static void main(String[] args) {

        JFrame frame = new JFrame("KanyeGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        KanyePanel kanyePanel = new KanyePanel();
        frame.add(kanyePanel, BorderLayout.CENTER);

        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
