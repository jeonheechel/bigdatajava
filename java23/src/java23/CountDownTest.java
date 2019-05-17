package java23;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CountDownTest extends JFrame {

    private JLabel label, label2, label3;
    
    public CountDownTest() {

        setTitle("카운트다운");

        setSize(1000, 1000);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Start1");
        label2 = new JLabel();
        label3 = new JLabel();

        label.setFont(new Font("Serif", Font.BOLD, 70));
        label2.setFont(new Font("Serif", Font.BOLD, 100));
        label3.setFont(new Font("Serif", Font.BOLD, 70));
        label.setForeground(Color.blue);
        label2.setForeground(Color.RED);
        label3.setForeground(Color.GREEN);
        setLayout(new FlowLayout());
        add(label);
        add(label2);
        add(label3);

        String name = JOptionPane.showInputDialog("게임하실 이름을 입력하세요.");
        (new MyThread1(name)).start();
        (new MyThread2()).start();
        (new MyThread3()).start();

        setVisible(true);

    }

    class MyThread1 extends Thread {
        String name;
        
        public MyThread1(String name) {
            this.name = name;
        }
        public void run() {
            int i = 0;
            while(true) {
            //for (int i = 500; i >= 0; i--) {
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                label.setText(name+ "의 게임 시작 :" + i + "");
                i++;
            }
        }
    }
        
      class MyThread2 extends Thread {

            public void run() {
                String[] imgs = {"1.jpg", "2.jpg", "3.jpg",
                		"4.jpg", "5.jpg", "6.jpg","7.jpg",
                		"1.jpg", "2.jpg", "3.jpg",
                		"4.jpg", "5.jpg", "6.jpg","7.jpg",
                		"1.jpg", "2.jpg", "3.jpg",
                		"4.jpg", "5.jpg", "6.jpg","7.jpg",
                		"1.jpg", "2.jpg", "3.jpg",
                		"4.jpg", "5.jpg", "6.jpg","7.jpg",
                		"1.jpg", "2.jpg", "3.jpg",
                		"4.jpg", "5.jpg", "6.jpg","7.jpg",
                };
                for (int i = 0; i < imgs.length; i++) {
                    try {
                        Thread.sleep(1000);
                        ImageIcon icon = new ImageIcon(imgs[i]);
                        label2.setIcon(icon);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                }
            }
        }

        class MyThread3 extends Thread {
            
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000);
                        Calendar cal = Calendar.getInstance();
                        label3.setText(cal.getTime()+"");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                }
                    
                }
            }

    public static void main(String[] args) {
        
        CountDownTest t = new CountDownTest();

    }

}