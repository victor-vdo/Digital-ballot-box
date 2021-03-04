package Frames.BaseFrames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Frames.StateDeputyRegisterFrame;
import Frames.CongressmanRegisterFrame;
import Frames.GovernorRegisterFrame;
import Frames.PresidentRegisterFrame;
import Frames.SenatorRegisterFrame;
import Frames.PresidentElectionFrame;

public class RegisterBaseFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel conteinerCadastro;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					RegisterBaseFrame frame = new RegisterBaseFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegisterBaseFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Cadastro de candidatos");
		
		conteinerCadastro = new JPanel();
		conteinerCadastro.setBorder(new EmptyBorder(5, 5, 5, 5));
		conteinerCadastro.setLayout(new BorderLayout(0, 0));
		setContentPane(conteinerCadastro);
		
		JPanel pnlNorthTelaCadastro = new JPanel();
		conteinerCadastro.add(pnlNorthTelaCadastro, BorderLayout.NORTH);
		
		JPanel pnlSouthTelaCadastro = new JPanel();
		conteinerCadastro.add(pnlSouthTelaCadastro, BorderLayout.SOUTH);
		
		JPanel pnlLeftTelaCadastro = new JPanel();
		conteinerCadastro.add(pnlLeftTelaCadastro, BorderLayout.WEST);
		
		JPanel pnlRightTelaCadastro = new JPanel();
		conteinerCadastro.add(pnlRightTelaCadastro, BorderLayout.EAST);
		
		JPanel pnlCenterTelaCadastro = new JPanel();
		conteinerCadastro.add(pnlCenterTelaCadastro, BorderLayout.CENTER);
		
		JLabel label_3 = new JLabel("");
		pnlCenterTelaCadastro.setLayout(new GridLayout(7, 3, 0, 0));
		
		JButton button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RegisterBaseFrame.this.dispose();
				MainBaseFrame telaPrincipal = new MainBaseFrame();
				telaPrincipal.setVisible(true);
				
			}
		});
		button.setBounds(0, 0, 97, 25);
		pnlCenterTelaCadastro.add(button);
		
		JLabel label_2 = new JLabel("");
		pnlCenterTelaCadastro.add(label_2);
		
		JLabel label_4 = new JLabel("");
		pnlCenterTelaCadastro.add(label_4);
		
		JLabel lblNewLabel = new JLabel("");
		pnlCenterTelaCadastro.add(lblNewLabel);
		
		JButton btnCadastroPresidente = new JButton("Cadastro Presidente");
		btnCadastroPresidente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RegisterBaseFrame.this.dispose();
				PresidentRegisterFrame telaCadastroPresidente = new PresidentRegisterFrame();
				telaCadastroPresidente.getContentPane();
				telaCadastroPresidente.setVisible(true);
					
			}
		});
		btnCadastroPresidente.setLocation(12, 221);
		btnCadastroPresidente.setSize(200, 50);
		pnlCenterTelaCadastro.add(btnCadastroPresidente);
		
		JLabel label_5 = new JLabel("");
		pnlCenterTelaCadastro.add(label_5);
		
		JLabel label_6 = new JLabel("");
		pnlCenterTelaCadastro.add(label_6);
		
		JButton btnCadastroGovernador = new JButton("Cadastro Governador");
		btnCadastroGovernador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RegisterBaseFrame.this.dispose();
				GovernorRegisterFrame telaCadastroGovernador = new GovernorRegisterFrame();
				telaCadastroGovernador.getContentPane();
				telaCadastroGovernador.setVisible(true);
			}
		});
		btnCadastroGovernador.setLocation(12, 158);
		btnCadastroGovernador.setSize(200, 50);
		pnlCenterTelaCadastro.add(btnCadastroGovernador);
		
		JLabel lblNewLabel_1 = new JLabel("");
		pnlCenterTelaCadastro.add(lblNewLabel_1);
		
		JButton btnCadastroSenador = new JButton("Cadastro Senador");
		btnCadastroSenador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RegisterBaseFrame.this.dispose();
				SenatorRegisterFrame telaCadastroSenador = new SenatorRegisterFrame();
				telaCadastroSenador.getContentPane();
				telaCadastroSenador.setVisible(true);
			}
		});
		
		JLabel label_7 = new JLabel("");
		pnlCenterTelaCadastro.add(label_7);
		btnCadastroSenador.setLocation(12, 284);
		btnCadastroSenador.setSize(200, 50);
		pnlCenterTelaCadastro.add(btnCadastroSenador);
		
		JLabel label_8 = new JLabel("");
		pnlCenterTelaCadastro.add(label_8);
		
		JButton btnCadastroDF = new JButton("Cadastro Deputado Federal");
		btnCadastroDF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RegisterBaseFrame.this.dispose();
				CongressmanRegisterFrame telaCadastroDF = new CongressmanRegisterFrame();
				telaCadastroDF.getContentPane();
				telaCadastroDF.setVisible(true);
			}
		});
		
		JLabel label_9 = new JLabel("");
		pnlCenterTelaCadastro.add(label_9);
		btnCadastroDF.setLocation(12, 95);
		btnCadastroDF.setSize(200, 50);
		pnlCenterTelaCadastro.add(btnCadastroDF);
		
		JLabel label_10 = new JLabel("");
		pnlCenterTelaCadastro.add(label_10);
		
		JButton btnCadastroDE = new JButton("Cadastro Deputado Estadual");
		btnCadastroDE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RegisterBaseFrame.this.dispose();
				StateDeputyRegisterFrame telaCadastroDE = new StateDeputyRegisterFrame();
				telaCadastroDE.getContentPane();
				telaCadastroDE.setVisible(true);
			
			}
		});
		
		JLabel label = new JLabel("");
		pnlCenterTelaCadastro.add(label);
		btnCadastroDE.setLocation(12, 32);
		btnCadastroDE.setSize(200, 50);
		pnlCenterTelaCadastro.add(btnCadastroDE);
		
		JLabel label_1 = new JLabel("");
		pnlCenterTelaCadastro.add(label_1);
		pnlCenterTelaCadastro.add(label_3);
		
		JButton btnVotar = new JButton("Iniciar Vota\u00E7\u00E3o");
		btnVotar.setForeground(Color.RED);
		btnVotar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RegisterBaseFrame.this.dispose();
				PresidentElectionFrame telaEleicaoPresidente = new PresidentElectionFrame();
				telaEleicaoPresidente.setVisible(true);
			}
		});
		pnlCenterTelaCadastro.add(btnVotar);
		
	}
}
