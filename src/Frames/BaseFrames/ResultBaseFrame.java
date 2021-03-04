package Frames.BaseFrames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Frames.StateDeputyRegisterFrame;
import Models.Candidate;
import Models.StateDeputy;
import Models.Congressman;
import Models.Governator;
import Models.President;
import Models.Senator;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResultBaseFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfdGovernador;
	private JTextField tfdPresidente;
	private JTextField tfdSenador;
	private JTextField tfdDE;
	private JTextField tfdDF;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					ResultBaseFrame frame = new ResultBaseFrame();
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
	public ResultBaseFrame() {
		setTitle("Resultado Eleições - 2018");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTopResultado = new JPanel();
		contentPane.add(pnlTopResultado, BorderLayout.NORTH);
		
		JPanel pnlSouthResultado = new JPanel();
		contentPane.add(pnlSouthResultado, BorderLayout.SOUTH);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ResultBaseFrame.this.dispose();
				MainBaseFrame telaPrincipal = new MainBaseFrame();
				telaPrincipal.setVisible(true);
			}
		});
		pnlSouthResultado.add(btnVoltar);
		
		JPanel pnlLeftResultado = new JPanel();
		contentPane.add(pnlLeftResultado, BorderLayout.WEST);
		
		JPanel pnlRigthResultado = new JPanel();
		contentPane.add(pnlRigthResultado, BorderLayout.EAST);
		
		JPanel pnlCenterResultado = new JPanel();
		contentPane.add(pnlCenterResultado, BorderLayout.CENTER);
		pnlCenterResultado.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel pnlTopCenterResultado = new JPanel();
		pnlCenterResultado.add(pnlTopCenterResultado);
		pnlTopCenterResultado.setLayout(new BorderLayout(0, 0));
		
		JLabel lblResultadoEleicao = new JLabel("Resultado Elei\u00E7\u00F5es - 2018");
		lblResultadoEleicao.setHorizontalAlignment(SwingConstants.CENTER);
		pnlTopCenterResultado.add(lblResultadoEleicao, BorderLayout.CENTER);
		lblResultadoEleicao.setFont(new Font("Verdana", Font.BOLD, 25));
		
		JPanel pnlTop2CenterResultado = new JPanel();
		pnlTop2CenterResultado.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pnlCenterResultado.add(pnlTop2CenterResultado);
		pnlTop2CenterResultado.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Os candidatos eleitos são: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		pnlTop2CenterResultado.add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlCenterCenterResultado = new JPanel();
		pnlCenterResultado.add(pnlCenterCenterResultado);
		pnlCenterCenterResultado.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblPresidente = new JLabel("Presidente:");
		lblPresidente.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCenterCenterResultado.add(lblPresidente);
		
		tfdPresidente = new JTextField();
		tfdPresidente.setEditable(false);
		pnlCenterCenterResultado.add(tfdPresidente);
		tfdPresidente.setColumns(10);
		
		JLabel lblGovernador = new JLabel("Governador:");
		lblGovernador.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCenterCenterResultado.add(lblGovernador);
		
		tfdGovernador = new JTextField();
		tfdGovernador.setEditable(false);
		pnlCenterCenterResultado.add(tfdGovernador);
		tfdGovernador.setColumns(10);
		
		JLabel lblSenador = new JLabel("Senador:");
		lblSenador.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCenterCenterResultado.add(lblSenador);
		
		tfdSenador = new JTextField();
		tfdSenador.setEditable(false);
		pnlCenterCenterResultado.add(tfdSenador);
		tfdSenador.setColumns(10);
		
		JLabel lblDeputadoFederal = new JLabel("Deputado Federal:");
		lblDeputadoFederal.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCenterCenterResultado.add(lblDeputadoFederal);
		
		tfdDF = new JTextField();
		tfdDF.setEditable(false);
		pnlCenterCenterResultado.add(tfdDF);
		tfdDF.setColumns(10);
		for (Candidate candidato : MainBaseFrame.listaCandidatos) 
		{
			//String stringNumero = String.valueOf(candidato.getCandidateNumber());

			Candidate presidente = new President(" ", " ", 0);
			Candidate governador = new Governator("", "", 0);
			Candidate senador = new Senator("", "", 0);
			Candidate deputadoFederal = new Congressman("", "", 0);
			Candidate deputadoEstadual = new StateDeputy("", "", 0);
			
			if (candidato instanceof Models.President) 
			{
				if (Candidate.getNumVotes() > Candidate.getNumVotes()) 
				{
					presidente = candidato;
				}
			}
			
			if (candidato instanceof Models.Governator) 
			{
				if (Candidate.getNumVotes() > Candidate.getNumVotes()) 
				{
					governador = candidato;
				}
			}
			
			if (candidato instanceof Models.Senator) 
			{
				if (Candidate.getNumVotes() > Candidate.getNumVotes()) 
				{
					senador = candidato;
				}
			}
			
			if (candidato instanceof Models.Congressman) 
			{
				if (Candidate.getNumVotes() > Candidate.getNumVotes()) 
				{
					deputadoFederal = candidato;
				}
			}
			
			if (candidato instanceof Models.StateDeputy) 
			{
				if (Candidate.getNumVotes() > Candidate.getNumVotes()) 
				{
					deputadoEstadual = candidato;
				}
			}
		
			if (Candidate.getNumVotes() != 0)
			{
				tfdPresidente.setText(presidente.getName()+presidente.getCandidateParty()+presidente.getCandidateNumber()+" Votos: "+Candidate.getNumVotes());	
			}
			if (Candidate.getNumVotes() != 0)
			{
				tfdGovernador.setText(governador.getName()+" "+governador.getCandidateParty()+" "+governador.getCandidateNumber()+" Votos: "+Candidate.getNumVotes());
			}
			if (Candidate.getNumVotes() != 0) 
			{
				tfdSenador.setText(senador.getName()+" "+senador.getCandidateParty()+" "+senador.getCandidateNumber()+" Votos: "+Candidate.getNumVotes());	
			}
			if (Candidate.getNumVotes() != 0) 
			{
				tfdDF.setText(deputadoFederal.getName()+" "+deputadoFederal.getCandidateParty()+" "+deputadoFederal.getCandidateNumber()+" Votos: "+Candidate.getNumVotes());
			}
			if (Candidate.getNumVotes() != 0)
			{
				tfdDE.setText(deputadoEstadual.getName()+" "+deputadoEstadual.getCandidateParty()+" "+deputadoEstadual.getCandidateNumber()+" Votos: "+Candidate.getNumVotes());
			}
			
		}
		
		
		
		
		JLabel lblDeputadoEstadual = new JLabel("Deputado Estadual:");
		lblDeputadoEstadual.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCenterCenterResultado.add(lblDeputadoEstadual);
		
		StateDeputyRegisterFrame telaDE = new StateDeputyRegisterFrame();
		tfdDE = new JTextField();
		tfdDE.setEditable(false);
		pnlCenterCenterResultado.add(tfdDE);
		tfdDE.setColumns(10);
		for (Candidate candidato : MainBaseFrame.listaCandidatos) 
		{
			//String stringNumero = String.valueOf(candidato.getCandidateNumber());
			String nameCandidate = String.valueOf(candidato.getName());
			long votos=0;
			if (candidato instanceof Models.StateDeputy) 
			{
				if(votos<Candidate.getNumVotes()) 
				{
					votos = Candidate.getNumVotes();
				}
				
			tfdDE.setText(nameCandidate);
			}
		}
		
	}
	
	//manipula
	{
		for (Candidate candidato : MainBaseFrame.listaCandidatos) {
			if (candidato instanceof  President) {
				Candidate.getNumVotes();
			}
		}
	}

}
