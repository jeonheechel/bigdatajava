package java23;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
 
public class CarGame2 extends JFrame {
 
    Image img1 = Toolkit.getDefaultToolkit().getImage("1-.jpg");
    Image img2 = Toolkit.getDefaultToolkit().getImage("2-.jpg");
    Image img3 = Toolkit.getDefaultToolkit().getImage("3-.jpg");
    Image img4 = Toolkit.getDefaultToolkit().getImage("4-.jpg");
    
    int x1 = 200;
    int y1 = 200;
    int xstate1 = 1;
    
    int x2 = 200;
    int y2 = 200;
    int xstate2 = 1;
    
    int x3 = 200;
    int y3 = 200;
    int xstate3 = 1;
    
    class Ground extends JPanel {
 
        @Override
        public void paint(Graphics g) {
            g.drawImage(img4, 0, 0, this); // 맵 그리기!
            g.drawImage(img1, x1, y1, this); // 맵 그리기!
            g.drawImage(img2, x2, y2, this); // 맵 그리기!
            g.drawImage(img3, x3, y3, this); // 맵 그리기!
            repaint();
        }
    }// Ground : 클래스 종료
 
    
    class star1 extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
 
                if (xstate1 > 0) {
                    x1 += 1;
                    y1 = 200 - (int) Math.sqrt((-x1 * x1) + 400 * x1 - 17500);
                    if (x1 == 350) {
                        xstate1 = -1;
                    }
                }
 
                if (xstate1 < 0) {
                    x1 -= 1;
                    y1 = 200 + (int) Math.sqrt((-x1 * x1) + 400 * x1 - 17500);
                    if (x1 == 50) {
                        xstate1 = 1;
                    }
                }
                repaint();
            }
        }
    } // star : 클래스 종료
    
    
    class star3 extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
 
                if (xstate3 > 0) {
                    x3 += 1;
                    y3 = 200 - (int) Math.sqrt((-x3 * x3) + 400 * x3 - 17500);
                    if (x3 == 350) {
                        xstate3 = -1;
                    }
                }
 
                if (xstate3 < 0) {
                    x3 -= 1;
                    y3 = 200 + (int) Math.sqrt((-x3 * x3) + 400 * x3 - 17500);
                    if (x3 == 50) {
                        xstate3 = 1;
                    }
                }
                repaint();
            }
        }
    } // star : 클래스 종료
    
    
    class star2 extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (xstate2 > 0) {
                    x2 += 1;
                    y2 = 200 - (int) Math.sqrt((-x2 * x2) + 400 * x2 - 17500);
                    if (x2 == 350) {
                        xstate2 = -1;
                    }
                }
 
                if (xstate2 < 0) {
                    x2 -= 1;
                    y2 = 200 + (int) Math.sqrt((-x2 * x2) + 400 * x2 - 17500);
                    if (x2 == 50) {
                        xstate2 = 1;
                    }
                }
                repaint();
            }
        }
    } // star : 클래스 종료
    
    
 
//    Math.sqrt(2);
    Ground ground = new Ground();
    star2 sta2 =new star2();
    star1 sta1 = new star1();
    star3 sta3 = new star3();
 
    public CarGame2() {
        
        sta1.start();
        sta2.start();
        sta3.start();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        ground.setBackground(Color.GRAY);
        ground.setBounds(12, 10, 470, 451);
        getContentPane().add(ground);
 
        // x*x
 
        getContentPane().setLayout(null);
        setResizable(false);
        setResizable(false);
        setSize(500, 500);
        setVisible(true);
    }// 생성자 종료
 
    public static void main(String[] args) {
        new CarGame2();
    }
 
}// 클래스 종료
