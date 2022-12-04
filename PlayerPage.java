import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PlayerPage extends JPanel{
	static JLabel label = new JLabel();

	public PlayerPage() {	

		label.setPreferredSize(new Dimension(100,30));
		add(label);

		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				CardLayoutS.showPage(1);
			}
		});
		add(backButton);
	}

	public static void setlabelText(String text) {
		label.setText("Hi "+text);
	}
}
