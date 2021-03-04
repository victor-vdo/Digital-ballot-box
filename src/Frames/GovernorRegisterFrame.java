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

public class GovernorRegisterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblNomeGovernador, lblPartidoGovernador, lblNumeroGovernador;
	JTextField tfdNomeGovernador, tfdPartidoGovernador,tfdNumeroGovernador;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GovernorRegisterFrame frame = new GovernorRegisterFrame();
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
	public GovernorRegisterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Cadastro Governador");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTopCadastroGovernador = new JPanel();
		contentPane.add(pnlTopCadastroGovernador, BorderLayout.NORTH);
		
		JPanel pnlSouthCadastroGovernador = new JPanel();
		contentPane.add(pnlSouthCadastroGovernador, BorderLayout.SOUTH);
		
		JPanel pnlLeftCadastroGovernador = new JPanel();
		contentPane.add(pnlLeftCadastroGovernador, BorderLayout.WEST);
		
		JPanel pnlCadastroRightGovernador = new JPanel();
		contentPane.add(pnlCadastroRightGovernador, BorderLayout.EAST);
		
		JPanel pnlCenterCadastroGovernador = new JPanel();
		contentPane.add(pnlCenterCadastroGovernador, BorderLayout.CENTER);
		
		pnlLeftCadastroGovernador.setBorder(null);
		pnlLeftCadastroGovernador.setSize(50, 535);
		
		pnlCenterCadastroGovernador.setSize(500, 535);
		pnlLeftCadastroGovernador.setLayout(new GridLayout(10, 1, 0, 0));
		
		
		lblNomeGovernador = new JLabel();
		lblNomeGovernador.setText("Nome:");
		pnlLeftCadastroGovernador.add(lblNomeGovernador);
		
		JLabel lblPartido = new JLabel("Partido:");
		pnlLeftCadastroGovernador.add(lblPartido);
		
		JLabel lblNumeroGovernador = new JLabel("N\u00FAmero:");
		pnlLeftCadastroGovernador.add(lblNumeroGovernador);
		
		JButton btnCadastrarGovernador = new JButton("Cadastrar");
		btnCadastrarGovernador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Candidate telaCadastroDF : MainBaseFrame.listaCandidatos) {
					String nome = tfdNomeGovernador.getText();
					String partido = tfdPartidoGovernador.getText();
					String digNumero = tfdNumeroGovernador.getText();
					int numero = Integer.parseInt(digNumero);
					Governator governador = new Governator(nome,partido,numero);
					MainBaseFrame.listaCandidatos.add(governador);
				}
			}
		});
		pnlLeftCadastroGovernador.add(btnCadastrarGovernador);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GovernorRegisterFrame.this.dispose();
				RegisterBaseFrame TelaCadastro = new RegisterBaseFrame();
				TelaCadastro.setVisible(true);
			}
		});
		pnlLeftCadastroGovernador.add(btnVoltar);
		pnlCenterCadastroGovernador.setLayout(new GridLayout(10, 1, 0, 0));
		
		tfdNomeGovernador = new JTextField();
		tfdNomeGovernador.setHorizontalAlignment(SwingConstants.LEFT);
		pnlCenterCadastroGovernador.add(tfdNomeGovernador);
		tfdNomeGovernador.setColumns(10);
		
		
		tfdNumeroGovernador = new JTextField();
		pnlCenterCadastroGovernador.add(tfdNumeroGovernador);
		tfdNumeroGovernador.setColumns(10);
		
		tfdPartidoGovernador = new JTextField();
		pnlCenterCadastroGovernador.add(tfdPartidoGovernador);
		tfdPartidoGovernador.setColumns(10);
		
	}

}