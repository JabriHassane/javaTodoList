package fg.classes;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame{

	private TitleBar title;
	
	private List list;
	
	private ButtonPanel btnPanel;

	//Constructor's
	
	public AppFrame() {
		this.setSize(400,700);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		
		title = new TitleBar();
		list = new List();
		btnPanel = new ButtonPanel();

		this.add(title, BorderLayout.NORTH);
		this.add(btnPanel, BorderLayout.SOUTH);
		
		this.add(list, BorderLayout.CENTER);
	}
	
	public AppFrame(TitleBar title, List list, ButtonPanel btnPanel) {
		super();
		this.title = title;
		this.list = list;
		this.btnPanel = btnPanel;
	}
	
	
}
