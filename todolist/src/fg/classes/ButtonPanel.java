package fg.classes;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class ButtonPanel extends JPanel{
	
	private JButton addTask;
	private JButton clear;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	//constructur
	
	public ButtonPanel() {

		this.setPreferredSize(new Dimension(400,60));
		
		addTask = new JButton("Ajouter une Tache");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		this.add(addTask);
		
		this.add(Box.createHorizontalStrut(30));
		clear = new JButton("Tach Fini");
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		this.add(clear);
	}
	
	public JButton getAddTask() {
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}

}
