package 인터페이스;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsMain {
    private JTextField idText;
    private JTextField titleText;
    private JTextField contentText;
    private JTextField etcText;
    public BbsMain() {
        JFrame f = new JFrame("나의 게시판 만들기");
        f.getContentPane().setBackground(new Color(0, 255, 0));
        f.setSize(411, 608);
        FlowLayout flow = new FlowLayout();
        f.getContentPane().setLayout(flow);
        
        JLabel label = new JLabel("<아이디>");
        label.setForeground(Color.BLUE);
        label.setFont(new Font("굴림", Font.BOLD, 30));
        f.getContentPane().add(label);
        
        idText = new JTextField();
        idText.setBackground(Color.YELLOW);
        idText.setForeground(Color.BLUE);
        idText.setFont(new Font("굴림", Font.BOLD, 30));
        f.getContentPane().add(idText);
        idText.setColumns(10);
        
        JLabel label_1 = new JLabel("<<제 목>>");
        label_1.setForeground(Color.BLUE);
        label_1.setFont(new Font("굴림", Font.BOLD, 30));
        f.getContentPane().add(label_1);
        
        titleText = new JTextField();
        titleText.setForeground(Color.RED);
        titleText.setFont(new Font("굴림", Font.BOLD, 30));
        titleText.setColumns(10);
        titleText.setBackground(Color.YELLOW);
        f.getContentPane().add(titleText);
        
        JLabel label_2 = new JLabel("<<내 용>>");
        label_2.setForeground(Color.BLUE);
        label_2.setFont(new Font("굴림", Font.BOLD, 30));
        f.getContentPane().add(label_2);
        
        contentText = new JTextField();
        contentText.setForeground(Color.RED);
        contentText.setFont(new Font("굴림", Font.BOLD, 30));
        contentText.setColumns(10);
        contentText.setBackground(Color.YELLOW);
        f.getContentPane().add(contentText);
        
        JLabel label_3 = new JLabel("<<기 타>>");
        label_3.setForeground(Color.BLUE);
        label_3.setFont(new Font("굴림", Font.BOLD, 30));
        f.getContentPane().add(label_3);
        
        etcText = new JTextField();
        etcText.setForeground(Color.RED);
        etcText.setFont(new Font("굴림", Font.BOLD, 30));
        etcText.setColumns(10);
        etcText.setBackground(Color.YELLOW);
        f.getContentPane().add(etcText);
        
        JButton btnNewButton = new JButton("BBS 검색하기");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputId = idText.getText();
                BbsDAO dao = new BbsDAO();
                BbsDTO dto = dao.select(inputId);
                String id = dto.getId();
                String title = dto.getTitle();
                String content = dto.getContent();
                String etc = dto.getEtc();
                idText.setText(id);
                titleText.setText(title);
                contentText.setText(content);
                etcText.setText(etc);
            }
        });
        btnNewButton.setBackground(new Color(255, 0, 255));
        btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
        f.getContentPane().add(btnNewButton);
        
        JButton btnBbs = new JButton("BBS 삽입하기");
        btnBbs.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BbsDTO  dto = new BbsDTO();
        		dto.setId(idText.getText());	
        		dto.setTitle(titleText.getText());
        		dto.setContent(contentText.getText());
        		dto.setEtc(etcText.getText());	
        		BbsDAO dao = new BbsDAO();
        		dao.insert(dto);
        		
        	}
        });
        btnBbs.setFont(new Font("굴림", Font.PLAIN, 30));
        btnBbs.setBackground(Color.MAGENTA);
        f.getContentPane().add(btnBbs);
        
        JButton btnBbs_1 = new JButton("BBS 업데이트");
        btnBbs_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BbsDTO  dto = new BbsDTO();
        		dto.setId(idText.getText());	
        		dto.setTitle(titleText.getText());
        		dto.setContent(contentText.getText());
        		dto.setEtc(etcText.getText());	
        		BbsDAO dao = new BbsDAO();
        		dao.update(dto);
        		
        		
        	}
        });
        btnBbs_1.setFont(new Font("굴림", Font.PLAIN, 30));
        btnBbs_1.setBackground(Color.MAGENTA);
        f.getContentPane().add(btnBbs_1);
        
        JButton btnBbs_2 = new JButton("BBS 삭제하기");
        btnBbs_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		BbsDAO dao = new BbsDAO();
        		String id = idText.getText();	
        		dao.delete(id);
        		
        	}
        });
        btnBbs_2.setFont(new Font("굴림", Font.PLAIN, 30));
        btnBbs_2.setBackground(Color.MAGENTA);
        f.getContentPane().add(btnBbs_2);
        
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        BbsMain name = new BbsMain();
    }

}


