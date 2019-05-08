package 다오;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxTest extends JFrame {

 //콤보박스에 나타낼 데이터를 배열에 저장합니다.

 String rainbow[] = {"나의 고향은?", "나의첫 애완동물은?", "나의 보물1호는?", "나의 부모님 성함은?", "나의 첫 별명은?"};

 JComboBox<String> combo; 
 JLabel msg;//색깔 중 하나를 선택하면, 라벨에 메세지를 띄웁니다.
 
 public JComboBoxTest(){
  setLayout(new BorderLayout());
  
  combo = new JComboBox<String>(rainbow);
  msg = new JLabel("      ");

  add( combo, BorderLayout.NORTH);
  add(msg, BorderLayout.CENTER);
  
  setSize(400, 300);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  //콤보박스에 addActionListener 이벤트 처리를 합니다.
   combo.addActionListener(new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {


    String color = combo.getSelectedItem().toString();
    msg.setText("비밀번호 힌트는 "+color+"입니다");
   }
  });
 }
 
 public static void main(String[] args) {
  new JComboBoxTest();
 }
} 
