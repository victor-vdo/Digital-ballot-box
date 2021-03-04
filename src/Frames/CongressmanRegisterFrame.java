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
import Models.Congressman;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CongressmanRegisterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblNomeDF, lblPartidoDF, lblNumeroDF;
	JTextField tfdNomeDF, tfdPartidoDF,tfdNumeroDF;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CongressmanRegisterFrame frame = new CongressmanRegisterFrame();
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
	public CongressmanRegisterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Cadastro Deputado Federal");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTopCadastroDF = new JPanel();
		contentPane.add(pnlTopCadastroDF, BorderLayout.NORTH);
		
		JPanel pnlSouthCadastroDF = new JPanel();
		contentPane.add(pnlSouthCadastroDF, BorderLayout.SOUTH);
		
		JPanel pnlLeftCadastroDF = new JPanel();
		contentPane.add(pnlLeftCadastroDF, BorderLayout.WEST);
		
		JPanel pnlCadastroRightDF = new JPanel();
		contentPane.add(pnlCadastroRightDF, BorderLayout.EAST);
		
		JPanel pnlCenterCadastroDF = new JPanel();
		contentPane.add(pnlCenterCadastroDF, BorderLayout.CENTER);
		
		pnlLeftCadastroDF.setBorder(null);
		pnlLeftCadastroDF.setSize(50, 535);
		
		pnlCenterCadastroDF.setSize(500, 535);
		pnlLeftCadastroDF.setLayout(new GridLayout(10, 1, 0, 0));
		
		
		lblNomeDF = new JLabel();
		lblNomeDF.setText("Nome:");
		pnlLeftCadastroDF.add(lblNomeDF);
		
		JLabel lblPartido = new JLabel("Partido:");
		pnlLeftCadastroDF.add(lblPartido);
		
		JLabel lblNumeroDF = new JLabel("N\u00FAmero:");
		pnlLeftCadastroDF.add(lblNumeroDF);
		
		JButton btnCadastrarDF = new JButton("Cadastrar");
		btnCadastrarDF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
					String nome = tfdNomeDF.getText();
					String partido = tfdPartidoDF.getText();
					String digNumero = tfdNumeroDF.getText();
					int numero = Integer.parseInt(digNumero);
					Congressman DF = new Congressman(nome,partido,numero);
					MainBaseFrame.listaCandidatos.add(DF);
				}
			}
		);
		pnlLeftCadastroDF.add(btnCadastrarDF);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CongressmanRegisterFrame.this.dispose();
				RegisterBaseFrame TelaCadastro = new RegisterBaseFrame();
				TelaCadastro.setVisible(true);
			}
		});
		pnlLeftCadastroDF.add(btnVoltar);
		pnlCenterCadastroDF.setLayout(new GridLayout(10, 1, 0, 0));
		
		tfdNomeDF = new JTextField();
		tfdNomeDF.setHorizontalAlignment(SwingConstants.LEFT);
		pnlCenterCadastroDF.add(tfdNomeDF);
		tfdNomeDF.setColumns(10);
		
		
		tfdNumeroDF = new JTextField();
		pnlCenterCadastroDF.add(tfdNumeroDF);
		tfdNumeroDF.setColumns(10);
		
		tfdPartidoDF = new JTextField();
		pnlCenterCadastroDF.add(tfdPartidoDF);
		tfdPartidoDF.setColumns(10);
		
	}

}