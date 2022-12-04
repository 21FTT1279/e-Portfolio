import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class CardLayoutS {
	static JFrame frame;
	static CardLayout cardLayout;
	static JPanel contentPane;
	

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400,100);

        cardLayout = new CardLayout();
        contentPane = new JPanel(cardLayout);
        frame.add(contentPane);

        HomePage1 hPage = new HomePage1();
        contentPane.add(hPage, "Home");
        PlayerPage pPage = new PlayerPage();
        contentPane.add(pPage, "Player");
        
        showPage(1);
        
        frame.setVisible(true);
	}
	
	public static void showPage(int pageNumber) {
		switch(pageNumber) {
		case 1: cardLayout.show(contentPane, "Home"); break;
		case 2: cardLayout.show(contentPane, "Player"); break;
		}
}
}