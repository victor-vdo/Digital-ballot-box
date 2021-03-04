package Frames.BaseFrames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ElectionBaseFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					ElectionBaseFrame frame = new ElectionBaseFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ElectionBaseFrame() {
		setTitle("Eleição 2018");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlNorthEleicao = new JPanel();
		contentPane.add(pnlNorthEleicao, BorderLayout.NORTH);
		
		JPanel pnlSouthEleicao = new JPanel();
		contentPane.add(pnlSouthEleicao, BorderLayout.SOUTH);
		
		JPanel pnlLeftEleicao = new JPanel();
		contentPane.add(pnlLeftEleicao, BorderLayout.WEST);
		
		JPanel pnlRightEleicao = new JPanel();
		contentPane.add(pnlRightEleicao, BorderLayout.EAST);
		
		JPanel pnlCenterEleicao = new JPanel();
		contentPane.add(pnlCenterEleicao, BorderLayout.CENTER);		
	}

}
