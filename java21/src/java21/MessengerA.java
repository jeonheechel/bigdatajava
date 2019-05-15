 package java21;


import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerA extends JFrame {
    JTextArea list;
    JTextField input;
    DatagramSocket socket;
    
    public MessengerA() throws Exception {
        socket = new DatagramSocket(5000);
        list = new JTextArea(6, 20);
        list.setFont(new Font("Monospaced", Font.BOLD, 30));
        list.setForeground(Color.BLUE);
        list.setBackground(Color.CYAN);
        input = new JTextField();
        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = input.getText();
//              System.out.println("내가 입력한 값: " + data);
                list.append("희철 입력>> " + str + "\n");
                input.setText("");
                
                    DatagramSocket socket;
                    try {
                        socket = new DatagramSocket();
                        //소켓으로 패킷을 전송한다.
                        byte[] data = str.getBytes();
                        InetAddress ip = InetAddress.getByName("192.168.0.132");
                        
                        DatagramPacket packet 
                        = new DatagramPacket(data, data.length, ip, 5000);
                        
                        socket.send(packet);
                        socket.close();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
            }
        });
        input.setFont(new Font("굴림", Font.BOLD, 30));
        input.setBackground(Color.GREEN);
        input.setForeground(Color.RED);
        setTitle("메신저A 채팅화면");
        getContentPane().add(list, BorderLayout.CENTER);
        getContentPane().add(input, BorderLayout.SOUTH);
        pack();
        list.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }

    public void process() throws Exception {
        //패킷 받는 코드(무한 루프)
        while(true) {
            byte[] data = new byte[256];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            list.append("정은 입력>> " + new String(data) + "\n");
        }
    }
    public static void main(String[] args) throws Exception {
        MessengerA name = new MessengerA();
        name.process();//보내기 전에 받는 코드가 먼저 돌아가야 함.
    }
}