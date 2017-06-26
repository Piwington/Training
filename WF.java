import java.awt.*;
import java.awt.event.*;
public class WF {
	public static void main(String[] args) {
		Frame win=new Frame("ADD");
		TextField T1=new TextField(3);
		TextField T2=new TextField(3);
		TextField T3=new TextField(4);
		Button B1=new Button("=");
		FlowLayout FL=new FlowLayout();
		win.setLayout(FL);
		win.add(T1);
		win.add(new Label("+"));
		win.add(T2);
		win.add(B1);
		win.add(T3);
		win.setSize(400,100);
		B1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent T){
		int A,B,C;
		A=Integer.parseInt(T1.getText());
		B=Integer.parseInt(T2.getText());
		C=A+B;
		T3.setText(Integer.toString(C));
	}});
		win.setVisible(true);
	}
}