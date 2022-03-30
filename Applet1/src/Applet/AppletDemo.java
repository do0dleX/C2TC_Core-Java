package Applet;

import java.awt.*;
import java.applet.Applet;

public class AppletDemo extends Applet{
	Button b;
	TextField t;
	public void init() {
		b = new Button("Submit");
		t = new TextField();
		
		add(b);
		add(t);
	}

}
