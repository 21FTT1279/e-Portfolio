import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomePage1 extends JPanel{
String text="";
//	String[] food = {"maggie", "rice"};
int[] n = {1,2};
	public HomePage1() {	
		
		JLabel label1 = new JLabel("What is your name?");
		add(label1);
		
//		JTextField textBox1 = new JTextField();
		JComboBox<Integer> textbox1 = new JComboBox<Integer>();
		for(int i=2; i<7; i++) { 
			textbox1.addItem(i); 
			add(textbox1); 
			}; 
		textbox1.setPreferredSize(new Dimension(100,30));
		
		add(textbox1);
		
		
		JButton nextButton = new JButton("NEXT");
		nextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
//				text = textbox1.getText();
				
				text = textbox1.getSelectedItem().toString();
					
				
				PlayerPage.setlabelText(text);
				CardLayoutS.showPage(2);
			}
		});
		add(nextButton);
}
}
