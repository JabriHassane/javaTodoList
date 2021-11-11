package fg.classes;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel{
	
	//constructor
	
	List(){
		GridLayout layout =new GridLayout(10,1);
		layout.setVgap(5);
		
		 this.setLayout(layout);
		 this.setBackground(Color.decode("#48dbfb"));
		
	}

}
