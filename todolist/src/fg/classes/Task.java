package fg.classes;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel{
	
	private JLabel index;
	private JTextField taskName;
	private JButton done;
	
	private boolean checked;
	
	
	//constructor
	public Task() {
		this.setPreferredSize(new Dimension(40,20));
		 this.setBackground(Color.decode("#48dbfb"));
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index, BorderLayout.WEST);
		
		taskName = new JTextField("Entrer une tache");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.decode("#54a0ff"));
		
		this.add(taskName, BorderLayout.CENTER);
		
		done = new JButton("Entrer");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		this.add(done, BorderLayout.EAST);
	}
	
	public JButton getDone() {
		return done;
	}

	public void changeIndex(int num) {
		this.index.setText(num+"");
		this.revalidate();
	}
	
	public void changeState() {
		this.setBackground(Color.green);
		taskName.setBackground(Color.green);
		checked = true;
	}
	
	
	
	
}
