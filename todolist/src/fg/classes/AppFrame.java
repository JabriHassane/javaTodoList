package fg.classes;

import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

public class AppFrame extends JFrame{

	private TitleBar title;
	
	private List list;
	
	private ButtonPanel btnPanel;
	
	private JButton addTask;
	private JButton clear;

	//Constructor
	
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
		
		addTask = btnPanel.getAddTask();
		clear = btnPanel.getClear();
		
		addListeners();
	}
	

	public void addListeners() {
		addTask.addMouseListener( new MouseAdapter() {
			
			
			public void mousePressed(MouseEvent e) {
				Task task = new Task();
				list.add(task);
				list.updatNumbers();
				task.getDone().addMouseListener( new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						task.changeState();
						revalidate();
					}
				});
				revalidate();

			}
		});
		
		clear.addMouseListener( new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				list.removeCompletedTasks();
				repaint();
			}
		});
	}
	
}
