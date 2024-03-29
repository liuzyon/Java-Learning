package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimpleEvent extends JFrame{

    /**
     * 动作事件监听器
     */
    private static final long serialVersionUID = 1L;
    private JButton jb=new JButton("我是按钮，请单击我");
    public SimpleEvent(){
        setLayout(null);
        setSize(200,100);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp=getContentPane();
        cp.add(jb);
        jb.setBounds(10, 10,100,30);
        jb.addActionListener(new jbAction()); //给按钮添加监听器
        setVisible(true);
    }
    class jbAction implements ActionListener{
        public void actionPerformed(ActionEvent arg0) {
            jb.setText("我被单击了");
        }
    }
    public static void main(String[] args) {
        new SimpleEvent();
    }
}
