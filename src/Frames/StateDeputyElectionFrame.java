package Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Frames.BaseFrames.MainBaseFrame;
import Models.Candidate;

import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class StateDeputyElectionFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	Timer timer;
	JLabel lblPartidoDE, lblNumeroDE;
	private JPanel pnlLeftEleicaoDE;
	private JTextField tfdVotacaoDEEleicao;
	private JTextField tfdNome;
	private JTextField tfdPartido;
    private boolean segundo = true;
    JButton btnVotacaoDE0, btnVotacaoDE1, btnVotacaoDE2, btnVotacaoDE3, btnVotacaoDE4, btnVotacaoDE5, btnVotacaoDE6, btnVotacaoDE7, btnVotacaoDE8, btnVotacaoDE9,btnVotacaoDEBranco, btnVotacaoDECorrigir;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					StateDeputyElectionFrame frame = new StateDeputyElectionFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StateDeputyElectionFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Eleição 2018 - Deputado Estadual");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTopEleicaoDE = new JPanel();
		contentPane.add(pnlTopEleicaoDE, BorderLayout.NORTH);
		
		JPanel pnlSouthEleicaoDE = new JPanel();
		contentPane.add(pnlSouthEleicaoDE, BorderLayout.SOUTH);
	
		pnlLeftEleicaoDE = new JPanel();
		pnlLeftEleicaoDE.setBorder(null);
		pnlLeftEleicaoDE.setSize(50, 535);
		contentPane.add(pnlLeftEleicaoDE, BorderLayout.WEST);
		
		JPanel pnlRightEleicaoDE = new JPanel();
		pnlRightEleicaoDE.setSize(250, 468);
		contentPane.add(pnlRightEleicaoDE, BorderLayout.EAST);
		
		GridBagLayout gbl_pnlRightEleicaoDE = new GridBagLayout();
		gbl_pnlRightEleicaoDE.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_pnlRightEleicaoDE.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		pnlRightEleicaoDE.setLayout(gbl_pnlRightEleicaoDE);
		
		tfdVotacaoDEEleicao = new JTextField();
		GridBagConstraints gbc_tfdVotacaoDEEleicao = new GridBagConstraints();
		gbc_tfdVotacaoDEEleicao.gridwidth = 3;
		gbc_tfdVotacaoDEEleicao.fill = GridBagConstraints.BOTH;
		gbc_tfdVotacaoDEEleicao.insets = new Insets(0, 0, 5, 0);
		gbc_tfdVotacaoDEEleicao.gridx = 0;
		gbc_tfdVotacaoDEEleicao.gridy = 0;
		tfdVotacaoDEEleicao.setEditable(false);
		pnlRightEleicaoDE.add(tfdVotacaoDEEleicao, gbc_tfdVotacaoDEEleicao);
		tfdVotacaoDEEleicao.setColumns(10);
		
		JButton btnVotacaoDE1 = new JButton();
		btnVotacaoDE1.setText("1");
		GridBagConstraints gbc_btnVotacaoDE1 = new GridBagConstraints();
		gbc_btnVotacaoDE1.insets = new Insets(0, 0, 5, 5);
		gbc_btnVotacaoDE1.gridx = 0;
		gbc_btnVotacaoDE1.gridy = 1;
		pnlRightEleicaoDE.add(btnVotacaoDE1, gbc_btnVotacaoDE1);
		
		JButton btnVotacaoDE2 = new JButton("2");
		GridBagConstraints gbc_btnVotacaoDE2 = new GridBagConstraints();
		gbc_btnVotacaoDE2.insets = new Insets(0, 0, 5, 5);
		gbc_btnVotacaoDE2.gridx = 1;
		gbc_btnVotacaoDE2.gridy = 1;
		pnlRightEleicaoDE.add(btnVotacaoDE2, gbc_btnVotacaoDE2);
		
		JButton btnVotacaoDE3 = new JButton("3");
		GridBagConstraints gbc_btnVotacaoDE3 = new GridBagConstraints();
		gbc_btnVotacaoDE3.insets = new Insets(0, 0, 5, 0);
		gbc_btnVotacaoDE3.gridx = 2;
		gbc_btnVotacaoDE3.gridy = 1;
		pnlRightEleicaoDE.add(btnVotacaoDE3, gbc_btnVotacaoDE3);
		
		JButton btnVotacaoDE4 = new JButton("4");
		GridBagConstraints gbc_btnVotacaoDE4 = new GridBagConstraints();
		gbc_btnVotacaoDE4.insets = new Insets(0, 0, 5, 5);
		gbc_btnVotacaoDE4.gridx = 0;
		gbc_btnVotacaoDE4.gridy = 2;
		pnlRightEleicaoDE.add(btnVotacaoDE4, gbc_btnVotacaoDE4);
		
		JButton btnVotacaoDE5 = new JButton("5");
		GridBagConstraints gbc_btnVotacaoDE5 = new GridBagConstraints();
		gbc_btnVotacaoDE5.insets = new Insets(0, 0, 5, 5);
		gbc_btnVotacaoDE5.gridx = 1;
		gbc_btnVotacaoDE5.gridy = 2;
		pnlRightEleicaoDE.add(btnVotacaoDE5, gbc_btnVotacaoDE5);
		
		JButton btnVotacaoDE6 = new JButton("6");
		GridBagConstraints gbc_btnVotacaoDE6 = new GridBagConstraints();
		gbc_btnVotacaoDE6.insets = new Insets(0, 0, 5, 0);
		gbc_btnVotacaoDE6.gridx = 2;
		gbc_btnVotacaoDE6.gridy = 2;
		pnlRightEleicaoDE.add(btnVotacaoDE6, gbc_btnVotacaoDE6);
		
		JButton btnVotacaoDE7 = new JButton("7");
		GridBagConstraints gbc_btnVotacaoDE7 = new GridBagConstraints();
		gbc_btnVotacaoDE7.insets = new Insets(0, 0, 5, 5);
		gbc_btnVotacaoDE7.gridx = 0;
		gbc_btnVotacaoDE7.gridy = 3;
		pnlRightEleicaoDE.add(btnVotacaoDE7, gbc_btnVotacaoDE7);
		
		JButton btnVotacaoDE8 = new JButton("8");
		GridBagConstraints gbc_btnVotacaoDE8 = new GridBagConstraints();
		gbc_btnVotacaoDE8.insets = new Insets(0, 0, 5, 5);
		gbc_btnVotacaoDE8.gridx = 1;
		gbc_btnVotacaoDE8.gridy = 3;
		pnlRightEleicaoDE.add(btnVotacaoDE8, gbc_btnVotacaoDE8);
		
		JButton btnVotacaoDE9 = new JButton("9");
		GridBagConstraints gbc_btnVotacaoDE9 = new GridBagConstraints();
		gbc_btnVotacaoDE9.insets = new Insets(0, 0, 5, 0);
		gbc_btnVotacaoDE9.gridx = 2;
		gbc_btnVotacaoDE9.gridy = 3;
		pnlRightEleicaoDE.add(btnVotacaoDE9, gbc_btnVotacaoDE9);
		
		JButton btnVotacaoDEBranco = new JButton("Branco");
		btnVotacaoDEBranco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfdVotacaoDEEleicao.setText("Opção inválida !!");
				Reminder(1);		 
			}
		});
		
		JButton btnVotacaoDE0 = new JButton("0");
		GridBagConstraints gbc_btnVotacaoDE0 = new GridBagConstraints();
		gbc_btnVotacaoDE0.insets = new Insets(0, 0, 5, 5);
		gbc_btnVotacaoDE0.gridx = 1;
		gbc_btnVotacaoDE0.gridy = 4;
		pnlRightEleicaoDE.add(btnVotacaoDE0, gbc_btnVotacaoDE0);
		GridBagConstraints gbc_btnVotacaoDEBranco = new GridBagConstraints();
		gbc_btnVotacaoDEBranco.fill = GridBagConstraints.BOTH;
		gbc_btnVotacaoDEBranco.insets = new Insets(0, 0, 0, 5);
		gbc_btnVotacaoDEBranco.gridx = 0;
		gbc_btnVotacaoDEBranco.gridy = 6;
		pnlRightEleicaoDE.add(btnVotacaoDEBranco, gbc_btnVotacaoDEBranco);
		
		JButton btnVotacaoDECorrigi = new JButton("Corrigir");
		btnVotacaoDECorrigi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfdVotacaoDEEleicao.setText("");
			}
		});
		GridBagConstraints gbc_btnVotacaoDECorrigi = new GridBagConstraints();
		gbc_btnVotacaoDECorrigi.insets = new Insets(0, 0, 0, 5);
		gbc_btnVotacaoDECorrigi.fill = GridBagConstraints.BOTH;
		gbc_btnVotacaoDECorrigi.gridx = 1;
		gbc_btnVotacaoDECorrigi.gridy = 6;
		pnlRightEleicaoDE.add(btnVotacaoDECorrigi, gbc_btnVotacaoDECorrigi);
		
		JButton btnVotacaoDEConfirma = new JButton("Confirma");
		btnVotacaoDEConfirma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null, "Confirmar voto?","Atenção !!",JOptionPane.YES_NO_OPTION);
				
				  if(opcao==0) 
				  {
					StateDeputyElectionFrame.this.dispose();
					MainBaseFrame telaPrincipal = new MainBaseFrame();
					telaPrincipal.getContentPane();
					telaPrincipal.setVisible(true);
					
					double numeroDE = Double.parseDouble(tfdVotacaoDEEleicao.getText());
					
					for (Candidate candidato : MainBaseFrame.listaCandidatos) 
					{
						if (candidato instanceof Models.StateDeputy) 
						{
				
							if (numeroDE == candidato.getCandidateNumber()) 
							{
								candidato.increaseVote();
							}
						}
					}
				  }
				  else
				  {
					  
				  }
			}
		});
		
		btnVotacaoDE0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("0");
			}
		});
		
		btnVotacaoDE1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("1");
			}
		});
		
		btnVotacaoDE2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("2");
			}
		});
		
		btnVotacaoDE3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("3");
			}
		});
		
		btnVotacaoDE4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("4");
			}
		});
		
		btnVotacaoDE5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("5");
			}
		});
		
		btnVotacaoDE6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("6");
			}
		});
		
		btnVotacaoDE7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("7");
			}
		});
		
		btnVotacaoDE8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("8");
			}
		});
		
		btnVotacaoDE9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("9");
			}
		});
	
		GridBagConstraints gbc_btnVotacaoDEConfirma = new GridBagConstraints();
		gbc_btnVotacaoDEConfirma.fill = GridBagConstraints.BOTH;
		gbc_btnVotacaoDEConfirma.gridx = 2;
		gbc_btnVotacaoDEConfirma.gridy = 6;
		pnlRightEleicaoDE.add(btnVotacaoDEConfirma, gbc_btnVotacaoDEConfirma);
		
		JPanel pnlCenterEleicaoDE = new JPanel();
		pnlCenterEleicaoDE.setSize(400, 535);
		contentPane.add(pnlCenterEleicaoDE, BorderLayout.CENTER);
		
		pnlLeftEleicaoDE.setLayout(new GridLayout(10, 1, 0, 0));
		GridBagLayout gbl_pnlCenterEleicaoDE = new GridBagLayout();
		gbl_pnlCenterEleicaoDE.columnWeights = new double[]{0.0, 1.0};
		gbl_pnlCenterEleicaoDE.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		pnlCenterEleicaoDE.setLayout(gbl_pnlCenterEleicaoDE);
		
		JLabel lblSeuVotoPara = new JLabel("Seu voto para: ");
		GridBagConstraints gbc_lblSeuVotoPara = new GridBagConstraints();
		gbc_lblSeuVotoPara.fill = GridBagConstraints.BOTH;
		gbc_lblSeuVotoPara.insets = new Insets(0, 0, 5, 0);
		gbc_lblSeuVotoPara.gridx = 1;
		gbc_lblSeuVotoPara.gridy = 0;
		pnlCenterEleicaoDE.add(lblSeuVotoPara, gbc_lblSeuVotoPara);
		
		JLabel lblDE = new JLabel("DEP. ESTADUAL");
		lblDE.setHorizontalAlignment(SwingConstants.CENTER);
		lblDE.setFont(new Font("Verdana", Font.PLAIN, 42));
		GridBagConstraints gbc_lblDE = new GridBagConstraints();
		gbc_lblDE.fill = GridBagConstraints.BOTH;
		gbc_lblDE.insets = new Insets(0, 0, 5, 0);
		gbc_lblDE.gridx = 1;
		gbc_lblDE.gridy = 1;
		pnlCenterEleicaoDE.add(lblDE, gbc_lblDE);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 5;
		pnlCenterEleicaoDE.add(lblNome, gbc_lblNome);
		
		tfdNome = new JTextField();
		tfdNome.setEditable(false);
		GridBagConstraints gbc_tfdNome = new GridBagConstraints();
		gbc_tfdNome.insets = new Insets(0, 0, 5, 0);
		gbc_tfdNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfdNome.gridx = 1;
		gbc_tfdNome.gridy = 5;
		pnlCenterEleicaoDE.add(tfdNome, gbc_tfdNome);
		tfdNome.setColumns(10);
		
		JLabel lblPartido = new JLabel("Partido:");
		GridBagConstraints gbc_lblPartido = new GridBagConstraints();
		gbc_lblPartido.anchor = GridBagConstraints.EAST;
		gbc_lblPartido.insets = new Insets(0, 0, 0, 5);
		gbc_lblPartido.gridx = 0;
		gbc_lblPartido.gridy = 6;
		pnlCenterEleicaoDE.add(lblPartido, gbc_lblPartido);
		
		tfdPartido = new JTextField();
		tfdPartido.setEditable(false);
		GridBagConstraints gbc_tfdPartido = new GridBagConstraints();
		gbc_tfdPartido.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfdPartido.gridx = 1;
		gbc_tfdPartido.gridy = 6;
		pnlCenterEleicaoDE.add(tfdPartido, gbc_tfdPartido);
		tfdPartido.setColumns(10);
	}
	
	 private void numDigi(String n)
	 {
		 if (segundo == true) 
		 {
			 tfdVotacaoDEEleicao.setText(tfdVotacaoDEEleicao.getText() + n);
	     } 
		 else 
		 {
			 tfdVotacaoDEEleicao.setText("");
			 tfdVotacaoDEEleicao.setText(tfdVotacaoDEEleicao.getText() + n);
	         segundo = true;
	     }
	 }//fim numDigi
	    public void limpar()
	    {
	    	tfdVotacaoDEEleicao.setText("");
            segundo = true;
	    }//fim limpar
	    
	    public void Reminder(int seconds) {
	        timer = new Timer();
	        timer.schedule(new RemindTask(), seconds*1000);
	    }
	    class RemindTask extends TimerTask {
	        @Override
			public void run() {
	            tfdVotacaoDEEleicao.setText("");
	            timer.cancel(); //Terminate the timer thread
	        }
	    }
}
