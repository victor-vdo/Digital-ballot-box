package Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Frames.BaseFrames.RegisterBaseFrame;
import Frames.BaseFrames.MainBaseFrame;
import Models.StateDeputy;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StateDeputyRegisterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblNomeDE, lblPartidoDE, lblNumeroDE;
	JTextField tfdNomeDE, tfdPartidoDE,tfdNumeroDE;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					StateDeputyRegisterFrame frame = new StateDeputyRegisterFrame();
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
	public StateDeputyRegisterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Cadastro Deputado Estadual");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTopCadastroDE = new JPanel();
		contentPane.add(pnlTopCadastroDE, BorderLayout.NORTH);
		
		JPanel pnlSouthCadastroDE = new JPanel();
		contentPane.add(pnlSouthCadastroDE, BorderLayout.SOUTH);
		
		JPanel pnlLeftCadastroDE = new JPanel();
		contentPane.add(pnlLeftCadastroDE, BorderLayout.WEST);
		
		JPanel pnlCadastroRightDE = new JPanel();
		contentPane.add(pnlCadastroRightDE, BorderLayout.EAST);
		
		JPanel pnlCenterCadastroDE = new JPanel();
		contentPane.add(pnlCenterCadastroDE, BorderLayout.CENTER);
		
		pnlLeftCadastroDE.setBorder(null);
		pnlLeftCadastroDE.setSize(50, 535);
		
		pnlCenterCadastroDE.setSize(500, 535);
		pnlLeftCadastroDE.setLayout(new GridLayout(10, 1, 0, 0));
		
		
		lblNomeDE = new JLabel();
		lblNomeDE.setText("Nome:");
		pnlLeftCadastroDE.add(lblNomeDE);
		
		JLabel lblPartido = new JLabel("Partido:");
		pnlLeftCadastroDE.add(lblPartido);
		
		JLabel lblNumeroDE = new JLabel("N\u00FAmero:");
		pnlLeftCadastroDE.add(lblNumeroDE);
		
		JButton btnCadastrarDE = new JButton("Cadastrar");
		btnCadastrarDE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
					String nome = tfdNomeDE.getText();
					String partido = tfdPartidoDE.getText();
					String digNumero = tfdNumeroDE.getText();
					int numero = Integer.parseInt(digNumero);
					StateDeputy DE = new StateDeputy(nome,partido,numero);
					int opcao = JOptionPane.showConfirmDialog(null,"Cadastrar candidato?", "Sim ou não?", JOptionPane.YES_NO_OPTION);
					MainBaseFrame.listaCandidatos.add(DE);
				}
		});
		pnlLeftCadastroDE.add(btnCadastrarDE);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StateDeputyRegisterFrame.this.dispose();
				RegisterBaseFrame TelaCadastro = new RegisterBaseFrame();
				TelaCadastro.setVisible(true);
			}
		});
		pnlLeftCadastroDE.add(btnVoltar);
		pnlCenterCadastroDE.setLayout(new GridLayout(10, 1, 0, 0));
		
		tfdNomeDE = new JTextField();
		tfdNomeDE.setHorizontalAlignment(SwingConstants.LEFT);
		pnlCenterCadastroDE.add(tfdNomeDE);
		tfdNomeDE.setColumns(10);
		
		tfdPartidoDE = new JTextField();
		pnlCenterCadastroDE.add(tfdPartidoDE);
		tfdPartidoDE.setColumns(10);
		
		tfdNumeroDE = new JTextField();
		pnlCenterCadastroDE.add(tfdNumeroDE);
		tfdNumeroDE.setColumns(10);
		
	}

}