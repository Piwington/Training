import java.awt.*;
import java.awt.event.*;
public class WindowFlow {
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
		Event2 E=new Event2(T1,T2,T3);
		B1.addActionListener(E);
		win.setVisible(true);
	}
}
class Event2 implements ActionListener{
	TextField X,Y,Z;
	public Event2(TextField T1,TextField T2,TextField T3){
		X=T1;
		Y=T2;
		Z=T3;
	}
	public void actionPerformed(ActionEvent T){
		int A,B,C;
		A=Integer.parseInt(X.getText());
		B=Integer.parseInt(Y.getText());
		C=A+B;
		Z.setText(Integer.toString(C));
	}
}