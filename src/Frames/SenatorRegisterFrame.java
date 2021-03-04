package Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Frames.BaseFrames.RegisterBaseFrame;
import Frames.BaseFrames.MainBaseFrame;
import Models.Candidate;
import Models.Governator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SenatorRegisterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblNomeSenador, lblPartidoSenador, lblNumeroSenador;
	JTextField tfdNomeSenador, tfdPartidoSenador,tfdNumeroSenador;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					SenatorRegisterFrame frame = new SenatorRegisterFrame();
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
	public SenatorRegisterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Cadastro Senador");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTopCadastroSenador = new JPanel();
		contentPane.add(pnlTopCadastroSenador, BorderLayout.NORTH);
		
		JPanel pnlSouthCadastroSenador = new JPanel();
		contentPane.add(pnlSouthCadastroSenador, BorderLayout.SOUTH);
		
		JPanel pnlLeftCadastroSenador = new JPanel();
		contentPane.add(pnlLeftCadastroSenador, BorderLayout.WEST);
		
		JPanel pnlCadastroRightSenador = new JPanel();
		contentPane.add(pnlCadastroRightSenador, BorderLayout.EAST);
		
		JPanel pnlCenterCadastroSenador = new JPanel();
		contentPane.add(pnlCenterCadastroSenador, BorderLayout.CENTER);
		
		pnlLeftCadastroSenador.setBorder(null);
		pnlLeftCadastroSenador.setSize(50, 535);
		
		pnlCenterCadastroSenador.setSize(500, 535);
		pnlLeftCadastroSenador.setLayout(new GridLayout(10, 1, 0, 0));
		
		
		lblNomeSenador = new JLabel();
		lblNomeSenador.setText("Nome:");
		pnlLeftCadastroSenador.add(lblNomeSenador);
		
		JLabel lblPartido = new JLabel("Partido:");
		pnlLeftCadastroSenador.add(lblPartido);
		
		JLabel lblNumeroSenador = new JLabel("N\u00FAmero:");
		pnlLeftCadastroSenador.add(lblNumeroSenador);
		
		JButton btnCadastrarSenador = new JButton("Cadastrar");
		btnCadastrarSenador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Candidate telaCadastroDF : MainBaseFrame.listaCandidatos) {
					String nome = tfdNomeSenador.getText();
					String partido = tfdPartidoSenador.getText();
					String digNumero = tfdNumeroSenador.getText();
					int numero = Integer.parseInt(digNumero);
					Governator senador = new Governator(nome,partido,numero);
					MainBaseFrame.listaCandidatos.add(senador);
				}
			}
		});
		pnlLeftCadastroSenador.add(btnCadastrarSenador);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SenatorRegisterFrame.this.dispose();
				RegisterBaseFrame TelaCadastro = new RegisterBaseFrame();
				TelaCadastro.setVisible(true);
			}
		});
		pnlLeftCadastroSenador.add(btnVoltar);
		pnlCenterCadastroSenador.setLayout(new GridLayout(10, 1, 0, 0));
		
		tfdNomeSenador = new JTextField();
		tfdNomeSenador.setHorizontalAlignment(SwingConstants.LEFT);
		pnlCenterCadastroSenador.add(tfdNomeSenador);
		tfdNomeSenador.setColumns(10);
		
		
		tfdNumeroSenador = new JTextField();
		pnlCenterCadastroSenador.add(tfdNumeroSenador);
		tfdNumeroSenador.setColumns(10);
		
		tfdPartidoSenador = new JTextField();
		pnlCenterCadastroSenador.add(tfdPartidoSenador);
		tfdPartidoSenador.setColumns(10);
		
	}

}
