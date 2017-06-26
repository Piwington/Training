import java.awt.*;
import java.awt.event.*;
public class WindowButtonText {
	public static void main(String[] args) {
		Frame win=new Frame();
		TextField T1=new TextField();
		Button B1=new Button("Can't Close Me");
		win.add(T1,BorderLayout.NORTH);
		win.add(B1,BorderLayout.CENTER);
		win.setSize(200,200);
		Event E=new Event(T1);
		B1.addActionListener(E);
		win.setVisible(true);
	}
}
class Event implements ActionListener{
	TextField X;
	public Event(TextField T){
		X=T;
	}
	public void actionPerformed(ActionEvent T){
		X.setText("You Did It");
	}
}