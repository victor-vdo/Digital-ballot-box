package Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Enums.ECandidate;
import Frames.BaseFrames.MainBaseFrame;
import Frames.BaseFrames.RegisterBaseFrame;
import Models.Candidate;
import Models.Congressman;
import java.awt.Font;

public class RegisterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public String title;
	JLabel lblPoliticalName, lblPoliticalParty, lblPoliticalNumber;
	JTextField tfdPoliticalName, tfdPoliticalParty,tfdPoliticalNumber;
	private ECandidate _eCandidate;
	
	RegisterFrame(ECandidate ecandidate){
		_eCandidate = ecandidate;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame frame = new RegisterFrame();
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
	public RegisterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle(getTitle(_eCandidate));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTop = new JPanel();
		contentPane.add(pnlTop, BorderLayout.NORTH);
		
		JPanel pnlBottom = new JPanel();
		contentPane.add(pnlBottom, BorderLayout.SOUTH);
		
		JPanel pnlLeft = new JPanel();
		contentPane.add(pnlLeft, BorderLayout.WEST);
		
		JPanel pnlRight = new JPanel();
		contentPane.add(pnlRight, BorderLayout.EAST);
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		pnlLeft.setBorder(null);
		pnlLeft.setSize(50, 535);
		
		pnlCenter.setSize(500, 535);
		pnlLeft.setLayout(new GridLayout(10, 1, 0, 0));
		
		
		lblPoliticalName = new JLabel();
		lblPoliticalName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPoliticalName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoliticalName.setText("Nome:");
		pnlLeft.add(lblPoliticalName);
		
		JLabel lblPartido = new JLabel("Partido:");
		lblPartido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPartido.setHorizontalAlignment(SwingConstants.CENTER);
		pnlLeft.add(lblPartido);
		
		JLabel lblNumeroDF = new JLabel("N\u00FAmero:");
		lblNumeroDF.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNumeroDF.setHorizontalAlignment(SwingConstants.CENTER);
		pnlLeft.add(lblNumeroDF);
		
		JButton btnCadastrarDF = new JButton("Cadastrar");
		btnCadastrarDF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
					String name = tfdPoliticalName.getText();
					String politicalParty = tfdPoliticalParty.getText();
					String digNumber = tfdPoliticalNumber.getText();
					int number = Integer.parseInt(digNumber);
					Candidate candidate = new Candidate(name, politicalParty, number, _eCandidate);
					MainBaseFrame.listaCandidatos.add(candidate);
				}
			}
		);
		pnlLeft.add(btnCadastrarDF);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RegisterFrame.this.dispose();
				RegisterBaseFrame TelaCadastro = new RegisterBaseFrame();
				TelaCadastro.setVisible(true);
			}
		});
		pnlLeft.add(btnVoltar);
		pnlCenter.setLayout(new GridLayout(10, 1, 0, 0));
		
		tfdPoliticalName = new JTextField();
		tfdPoliticalName.setHorizontalAlignment(SwingConstants.LEFT);
		pnlCenter.add(tfdPoliticalName);
		tfdPoliticalName.setColumns(10);
		
		tfdPoliticalParty = new JTextField();
		pnlCenter.add(tfdPoliticalParty);
		tfdPoliticalParty.setColumns(10);
		
		tfdPoliticalNumber = new JTextField();
		pnlCenter.add(tfdPoliticalNumber);
		tfdPoliticalNumber.setColumns(10);
	}
	
	public String getTitle(ECandidate ecandidate) {
		switch(ecandidate.ordinal()) {
		case 0:
			return "Deputado Federal";
		case 1:
			return "Governador";
		case 2:
			return "Presidente";
		case 3:
			return "Senador";
		case 4:
			return "Deputado Estadual";
			default:
				return "Indefinido";
		}
	}
	

}
