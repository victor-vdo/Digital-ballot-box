package Frames.BaseFrames;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import Frames.PresidentElectionFrame;
import Models.Candidate;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class MainBaseFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnlCentralCadastrar;
	public static List<Candidate> listaCandidatos = new ArrayList<Candidate>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainBaseFrame frame = new MainBaseFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainBaseFrame() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlADMCentral = new JPanel();
		pnlADMCentral.setMaximumSize(new Dimension(200, 100));
		contentPane.add(pnlADMCentral, BorderLayout.CENTER);
		pnlADMCentral.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel label = new JLabel("");
		pnlADMCentral.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(MainBaseFrame.class.getResource("/Imagens/eleicoes-2018.jpg")));
		lblNewLabel.setSize(250,150);
		pnlADMCentral.add(lblNewLabel);
		
		
		JPanel pnlADMNorth = new JPanel();
		pnlADMNorth.setMaximumSize(new Dimension(200, 100));
		pnlADMNorth.setSize(600, 200);
		contentPane.add(pnlADMNorth, BorderLayout.NORTH);
		
		JLabel lblADMNorth = new JLabel("           ");
		lblADMNorth.setSize(600, 200);
		pnlADMNorth.add(lblADMNorth);
		
		JPanel pnlADMLeft = new JPanel();
		contentPane.add(pnlADMLeft, BorderLayout.WEST);
		pnlADMLeft.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblADMLeft = new JLabel("Menu:");
		lblADMLeft.setForeground(Color.BLUE);
		lblADMLeft.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		lblADMLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblADMLeft.setName("");
		pnlADMLeft.add(lblADMLeft);
		
		pnlCentralCadastrar = new JPanel();
		pnlADMLeft.add(pnlCentralCadastrar);
		pnlCentralCadastrar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnlCentralCadastrar.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnCadastrarCandidato = new JButton("Cadastrar candidato");
		pnlCentralCadastrar.add(btnCadastrarCandidato);
		btnCadastrarCandidato.setFont(new Font("Verdana", Font.BOLD, 25));
		
		JPanel pnlCentralVotar = new JPanel();
		pnlADMLeft.add(pnlCentralVotar);
		pnlCentralVotar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnlCentralVotar.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnVotar = new JButton("Votar");
		pnlCentralVotar.add(btnVotar);
		btnVotar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainBaseFrame.this.dispose();
				PresidentElectionFrame telaEleicaoPresidente = new PresidentElectionFrame();
				telaEleicaoPresidente.getContentPane();
				telaEleicaoPresidente.setVisible(true);
			}
		});
		btnVotar.setFont(new Font("Verdana", Font.BOLD, 25));
		
		JPanel pnlCentralResultado = new JPanel();
		pnlADMLeft.add(pnlCentralResultado);
		pnlCentralResultado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnlCentralResultado.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainBaseFrame.this.dispose();
				ResultBaseFrame telaResultado = new ResultBaseFrame();
				telaResultado.setVisible(true);
			}
		});
		btnResultado.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlCentralResultado.add(btnResultado);
		
		btnCadastrarCandidato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MainBaseFrame.this.dispose();
				RegisterBaseFrame telaCad = new RegisterBaseFrame();
				
				telaCad.setVisible(true);
				
			}
		});
		
		JPanel pnlADMRight = new JPanel();
		contentPane.add(pnlADMRight, BorderLayout.EAST);
		
		JLabel lblADMRight = new JLabel("                   ");
		pnlADMRight.add(lblADMRight);
		
		JPanel pnlADMSouth = new JPanel();
		contentPane.add(pnlADMSouth, BorderLayout.SOUTH);
		
		JLabel lblADMSouth = new JLabel("                         ");
		pnlADMSouth.add(lblADMSouth);
	}
}
