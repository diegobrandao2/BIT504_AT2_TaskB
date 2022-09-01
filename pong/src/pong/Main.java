import javax.swing.JFrame;

public class Main extends JFrame {
	
	private final static String WINDOW_TITLE = "Pong";
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;

	public Main() {
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(true);   //resizable is now true
		add(new PongPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Changes for the experiment_1 branch
		
		
	}
	
	public static void main (String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
				
			}
		});
	}

}