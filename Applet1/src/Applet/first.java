package Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class first extends Applet{
TextField t;
Button b1,b2;
public void init() {
	add(b1 = new Button("Click"));
	add(t = new TextField(5));
	add(b2 = new Button("Clear"));
}
public boolean action(Event e,Object o) {
	if(e.target.equals(b1)) {
		t.setText("Hello");
		
	}
	if(e.target.equals(b2)) {
		t.setText(" ");
		
	}
	return true;
}
}
