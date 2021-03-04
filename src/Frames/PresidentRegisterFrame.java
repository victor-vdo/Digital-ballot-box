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

public class PresidentRegisterFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblNomePresidente, lblPartidoPresidente, lblNumeroPresidente;
	JTextField tfdNomePresidente, tfdPartidoPresidente,tfdNumeroPresidente;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PresidentRegisterFrame frame = new PresidentRegisterFrame();
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
	public PresidentRegisterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Cadastro Presidente");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTopCadastroPresidente = new JPanel();
		contentPane.add(pnlTopCadastroPresidente, BorderLayout.NORTH);
		
		JPanel pnlSouthCadastroPresidente = new JPanel();
		contentPane.add(pnlSouthCadastroPresidente, BorderLayout.SOUTH);
		
		JPanel pnlLeftCadastroPresidente = new JPanel();
		contentPane.add(pnlLeftCadastroPresidente, BorderLayout.WEST);
		
		JPanel pnlCadastroRightPresidente = new JPanel();
		contentPane.add(pnlCadastroRightPresidente, BorderLayout.EAST);
		
		JPanel pnlCenterCadastroPresidente = new JPanel();
		contentPane.add(pnlCenterCadastroPresidente, BorderLayout.CENTER);
		
		pnlLeftCadastroPresidente.setBorder(null);
		pnlLeftCadastroPresidente.setSize(50, 535);
		
		pnlCenterCadastroPresidente.setSize(500, 535);
		pnlLeftCadastroPresidente.setLayout(new GridLayout(10, 1, 0, 0));
		
		
		lblNomePresidente = new JLabel();
		lblNomePresidente.setText("Nome:");
		pnlLeftCadastroPresidente.add(lblNomePresidente);
		
		JLabel lblPartido = new JLabel("Partido:");
		pnlLeftCadastroPresidente.add(lblPartido);
		
		JLabel lblNumeroPresidente = new JLabel("N\u00FAmero:");
		pnlLeftCadastroPresidente.add(lblNumeroPresidente);
		
		JButton btnCadastrarPresidente = new JButton("Cadastrar");
		btnCadastrarPresidente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Candidate telaCadastroDF : MainBaseFrame.listaCandidatos) {
					String nome = tfdNomePresidente.getText();
					String partido = tfdNomePresidente.getText();
					String digNumero = tfdNomePresidente.getText();
					int numero = Integer.parseInt(digNumero);
					Governator presidente = new Governator(nome,partido,numero);
					MainBaseFrame.listaCandidatos.add(presidente);
				}
			}
		});
		pnlLeftCadastroPresidente.add(btnCadastrarPresidente);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PresidentRegisterFrame.this.dispose();
				RegisterBaseFrame TelaCadastro = new RegisterBaseFrame();
				TelaCadastro.setVisible(true);
			}
		});
		pnlLeftCadastroPresidente.add(btnVoltar);
		pnlCenterCadastroPresidente.setLayout(new GridLayout(10, 1, 0, 0));
		
		tfdNomePresidente = new JTextField();
		tfdNomePresidente.setHorizontalAlignment(SwingConstants.LEFT);
		pnlCenterCadastroPresidente.add(tfdNomePresidente);
		tfdNomePresidente.setColumns(10);
		
		tfdPartidoPresidente = new JTextField();
		pnlCenterCadastroPresidente.add(tfdPartidoPresidente);
		tfdPartidoPresidente.setColumns(10);
		
		tfdNumeroPresidente = new JTextField();
		pnlCenterCadastroPresidente.add(tfdNumeroPresidente);
		tfdNumeroPresidente.setColumns(10);
		
		
	}

}