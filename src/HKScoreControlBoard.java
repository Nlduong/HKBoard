import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class HKScoreControlBoard extends JFrame {

	private JPanel contentPane;
	static int interval;
	static Timer timer;
	
	/**
	 * Launch the application.
	 */

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player player = new Player(); 
					
					int countdown = 100;				   
				    countdown = countdown - 1;				    
				     
					    
					player.setPlayerName("nlduong");
					player.setScore(countdown);;
					HKScoreControlBoard frame = new HKScoreControlBoard();
					frame.setVisible(true);
					//ScoreBoard frame1 = new ScoreBoard();
					//frame1.setVisible(true);
					//TimeBoard frame2 = new TimeBoard();
					//frame2.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HKScoreControlBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(35, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		ScoreBoard sb = new ScoreBoard();
		sb.setVisible(true);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int delay = 1000;
				    int period = 1000;
				    timer = new Timer();
				    interval = 1000;
				  
				    timer.scheduleAtFixedRate(new TimerTask() {

				        public void run() {
				        	int a = setInterval();
				        	lblNewLabel.setText(String.valueOf(a));				        
				        	sb.showTime(String.valueOf(a));
				        }
				    }, delay, period);
			}
			
		});
		btnNewButton.setBounds(71, 207, 89, 23);
		contentPane.add(btnNewButton);
	}
	public HKScoreControlBoard(Player player) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTextTime = new JLabel("TxtTime");
		
		lblTextTime.setText(String.valueOf(player.getScore()));
		lblTextTime.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblTextTime, BorderLayout.CENTER);
	}
	private static final int setInterval() {
	    if (interval == 1)
	        timer.cancel();
	    return --interval;
	}
	
	
}


