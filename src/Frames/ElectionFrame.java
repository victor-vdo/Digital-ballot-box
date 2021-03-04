package Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Enums.ECandidate;
import Frames.BaseFrames.MainBaseFrame;
import Frames.SenatorElectionFrame.RemindTask;
import Models.Candidate;

public class ElectionFrame extends JFrame {

	Timer timer;
	private JPanel contentPane;
	private ECandidate _eCandidate;
	private boolean segundo = true;
	private JTextField tfdVote;
	
	ElectionFrame(ECandidate ecandidate){
		_eCandidate = ecandidate;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectionFrame frame = new ElectionFrame();
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
	public ElectionFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Eleição 2021 - " + getTitle(_eCandidate));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlTopEleicaoSenador = new JPanel();
		contentPane.add(pnlTopEleicaoSenador, BorderLayout.NORTH);
		
		JPanel pnlSouthEleicaoSenador = new JPanel();
		contentPane.add(pnlSouthEleicaoSenador, BorderLayout.SOUTH);

		JPanel pnlLeft = new JPanel();
		pnlLeft.setBorder(null);
		pnlLeft.setSize(50, 535);
		contentPane.add(pnlLeft, BorderLayout.WEST);
		
		JPanel pnlRight = new JPanel();
		pnlRight.setSize(250, 468);
		contentPane.add(pnlRight, BorderLayout.EAST);
		
		GridBagLayout gbl_pnlRightEleicaoSenador = new GridBagLayout();
		gbl_pnlRightEleicaoSenador.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_pnlRightEleicaoSenador.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		pnlRight.setLayout(gbl_pnlRightEleicaoSenador);
		
		JTextField tfdVote = new JTextField();
		GridBagConstraints gbc_tfdVote = new GridBagConstraints();
		gbc_tfdVote.gridwidth = 3;
		gbc_tfdVote.fill = GridBagConstraints.BOTH;
		gbc_tfdVote.insets = new Insets(0, 0, 5, 0);
		gbc_tfdVote.gridx = 0;
		gbc_tfdVote.gridy = 0;
		tfdVote.setEditable(false);
		pnlRight.add(tfdVote, gbc_tfdVote);
		tfdVote.setColumns(10);
		
		JButton btnVote1 = new JButton();
		btnVote1.setText("1");
		GridBagConstraints gbc_btnVote1 = new GridBagConstraints();
		gbc_btnVote1.insets = new Insets(0, 0, 5, 5);
		gbc_btnVote1.gridx = 0;
		gbc_btnVote1.gridy = 1;
		pnlRight.add(btnVote1, gbc_btnVote1);
		
		JButton btnVote2 = new JButton("2");
		GridBagConstraints gbc_btnVote2 = new GridBagConstraints();
		gbc_btnVote2.insets = new Insets(0, 0, 5, 5);
		gbc_btnVote2.gridx = 1;
		gbc_btnVote2.gridy = 1;
		pnlRight.add(btnVote2, gbc_btnVote2);
		
		JButton btnVote3 = new JButton("3");
		GridBagConstraints gbc_btnVote3 = new GridBagConstraints();
		gbc_btnVote3.insets = new Insets(0, 0, 5, 0);
		gbc_btnVote3.gridx = 2;
		gbc_btnVote3.gridy = 1;
		pnlRight.add(btnVote3, gbc_btnVote3);
		
		JButton btnVote4 = new JButton("4");
		GridBagConstraints gbc_btnVote4 = new GridBagConstraints();
		gbc_btnVote4.insets = new Insets(0, 0, 5, 5);
		gbc_btnVote4.gridx = 0;
		gbc_btnVote4.gridy = 2;
		pnlRight.add(btnVote4, gbc_btnVote4);
		
		JButton btnVote5 = new JButton("5");
		GridBagConstraints gbc_btnVote5 = new GridBagConstraints();
		gbc_btnVote5.insets = new Insets(0, 0, 5, 5);
		gbc_btnVote5.gridx = 1;
		gbc_btnVote5.gridy = 2;
		pnlRight.add(btnVote5, gbc_btnVote5);
		
		JButton btnVote6 = new JButton("6");
		GridBagConstraints gbc_btnVote6 = new GridBagConstraints();
		gbc_btnVote6.insets = new Insets(0, 0, 5, 0);
		gbc_btnVote6.gridx = 2;
		gbc_btnVote6.gridy = 2;
		pnlRight.add(btnVote6, gbc_btnVote6);
		
		JButton btnVote7 = new JButton("7");
		GridBagConstraints gbc_btnVote7 = new GridBagConstraints();
		gbc_btnVote7.insets = new Insets(0, 0, 5, 5);
		gbc_btnVote7.gridx = 0;
		gbc_btnVote7.gridy = 3;
		pnlRight.add(btnVote7, gbc_btnVote7);
		
		JButton btnVote8 = new JButton("8");
		GridBagConstraints gbc_btnVote8 = new GridBagConstraints();
		gbc_btnVote8.insets = new Insets(0, 0, 5, 5);
		gbc_btnVote8.gridx = 1;
		gbc_btnVote8.gridy = 3;
		pnlRight.add(btnVote8, gbc_btnVote8);
		
		JButton btnVote9 = new JButton("9");
		GridBagConstraints gbc_btnVote9 = new GridBagConstraints();
		gbc_btnVote9.insets = new Insets(0, 0, 5, 0);
		gbc_btnVote9.gridx = 2;
		gbc_btnVote9.gridy = 3;
		pnlRight.add(btnVote9, gbc_btnVote9);
		
		JButton btnVoteWhite = new JButton("Branco");
		btnVoteWhite.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfdVote.setText("Opção inválida !!");
				Reminder(1);
				
				 
			}
		});
		
		JButton btnVotacaoSenador0 = new JButton("0");
		GridBagConstraints gbc_btnVote0 = new GridBagConstraints();
		gbc_btnVote0.insets = new Insets(0, 0, 5, 5);
		gbc_btnVote0.gridx = 1;
		gbc_btnVote0.gridy = 4;
		pnlRight.add(btnVotacaoSenador0, gbc_btnVote0);
		GridBagConstraints gbc_btnVoteWhite = new GridBagConstraints();
		gbc_btnVoteWhite.fill = GridBagConstraints.BOTH;
		gbc_btnVoteWhite.insets = new Insets(0, 0, 0, 5);
		gbc_btnVoteWhite.gridx = 0;
		gbc_btnVoteWhite.gridy = 6;
		pnlRight.add(btnVoteWhite, gbc_btnVoteWhite);
		
		JButton btnVoteRevise = new JButton("Corrigir");
		btnVoteRevise.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfdVote.setText("");
			}
		});
		GridBagConstraints gbc_btnVoteRevise = new GridBagConstraints();
		gbc_btnVoteRevise.insets = new Insets(0, 0, 0, 5);
		gbc_btnVoteRevise.fill = GridBagConstraints.BOTH;
		gbc_btnVoteRevise.gridx = 1;
		gbc_btnVoteRevise.gridy = 6;
		pnlRight.add(btnVoteRevise, gbc_btnVoteRevise);
		
		JButton btnVoteConfirm = new JButton("Confirma");
		btnVoteConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null, "Confirmar voto?","Atenção !!",JOptionPane.YES_NO_OPTION);
				
				  if(opcao==0) 
				  {
					ElectionFrame.this.dispose();
					ElectionFrame electionFrame = new ElectionFrame();
					electionFrame.getContentPane();
					electionFrame.setVisible(true);
					
					double numberCandidate = Double.parseDouble(tfdVote.getText());
					
					for (Candidate candidato : MainBaseFrame.listaCandidatos) 
					{
						//if (candidato instanceof Models.Congressman) 
						//{
						//	if (numberCandidate == candidato.getCandidateNumber()) 
						//	{
						//		candidato.increaseVote();
						//	}
						//}
							
						if (numberCandidate == candidato.getCandidateNumber()) 
						{
							candidato.increaseVote();
						}
					}
				  }
			
			}
		});
		
		btnVotacaoSenador0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("0");
			}
		});
		
		btnVote1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("1");
			}
		});
		
		btnVote2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("2");
			}
		});
		
		btnVote3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("3");
			}
		});
		
		btnVote4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("4");
			}
		});
		
		btnVote5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("5");
			}
		});
		
		btnVote6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("6");
			}
		});
		
		btnVote7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("7");
			}
		});
		
		btnVote8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("8");
			}
		});
		
		btnVote9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDigi("9");
			}
		});

		GridBagConstraints gbc_btnVotacaoSenadorConfirma = new GridBagConstraints();
		gbc_btnVotacaoSenadorConfirma.fill = GridBagConstraints.BOTH;
		gbc_btnVotacaoSenadorConfirma.gridx = 2;
		gbc_btnVotacaoSenadorConfirma.gridy = 6;
		pnlRight.add(btnVoteConfirm, gbc_btnVotacaoSenadorConfirma);
		
		JPanel pnlCenterEleicaoSenador = new JPanel();
		pnlCenterEleicaoSenador.setSize(400, 535);
		contentPane.add(pnlCenterEleicaoSenador, BorderLayout.CENTER);
		
		pnlLeft.setLayout(new GridLayout(10, 1, 0, 0));
		GridBagLayout gbl_pnlCenterEleicaoSenador = new GridBagLayout();
		gbl_pnlCenterEleicaoSenador.columnWeights = new double[]{0.0, 1.0};
		gbl_pnlCenterEleicaoSenador.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		pnlCenterEleicaoSenador.setLayout(gbl_pnlCenterEleicaoSenador);
		
		JLabel lblSeuVotoPara = new JLabel("Seu voto para: ");
		GridBagConstraints gbc_lblSeuVotoPara = new GridBagConstraints();
		gbc_lblSeuVotoPara.fill = GridBagConstraints.BOTH;
		gbc_lblSeuVotoPara.insets = new Insets(0, 0, 5, 0);
		gbc_lblSeuVotoPara.gridx = 1;
		gbc_lblSeuVotoPara.gridy = 0;
		pnlCenterEleicaoSenador.add(lblSeuVotoPara, gbc_lblSeuVotoPara);
		
		JLabel lblSenador = new JLabel("SENADOR");
		lblSenador.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenador.setFont(new Font("Verdana", Font.PLAIN, 42));
		GridBagConstraints gbc_lblSenador = new GridBagConstraints();
		gbc_lblSenador.fill = GridBagConstraints.BOTH;
		gbc_lblSenador.insets = new Insets(0, 0, 5, 0);
		gbc_lblSenador.gridx = 1;
		gbc_lblSenador.gridy = 1;
		pnlCenterEleicaoSenador.add(lblSenador, gbc_lblSenador);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 5;
		pnlCenterEleicaoSenador.add(lblNome, gbc_lblNome);
		
		JTextField tfdNome = new JTextField();
		tfdNome.setEditable(false);
		GridBagConstraints gbc_tfdNome = new GridBagConstraints();
		gbc_tfdNome.insets = new Insets(0, 0, 5, 0);
		gbc_tfdNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfdNome.gridx = 1;
		gbc_tfdNome.gridy = 5;
		pnlCenterEleicaoSenador.add(tfdNome, gbc_tfdNome);
		tfdNome.setColumns(10);
		
		JLabel lblPartido = new JLabel("Partido:");
		GridBagConstraints gbc_lblPartido = new GridBagConstraints();
		gbc_lblPartido.anchor = GridBagConstraints.EAST;
		gbc_lblPartido.insets = new Insets(0, 0, 0, 5);
		gbc_lblPartido.gridx = 0;
		gbc_lblPartido.gridy = 6;
		pnlCenterEleicaoSenador.add(lblPartido, gbc_lblPartido);
		
		JTextField tfdPartido = new JTextField();
		tfdPartido.setEditable(false);
		GridBagConstraints gbc_tfdPartido = new GridBagConstraints();
		gbc_tfdPartido.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfdPartido.gridx = 1;
		gbc_tfdPartido.gridy = 6;
		pnlCenterEleicaoSenador.add(tfdPartido, gbc_tfdPartido);
		tfdPartido.setColumns(10);
	}

	 private void numDigi(String n)
	 {
		 if (segundo == true) 
		 {
			 tfdVote.setText(tfdVote.getText() + n);
	     } 
		 else 
		 {
			 tfdVote.setText("");
			 tfdVote.setText(tfdVote.getText() + n);
	         segundo = true;
	     }
	 }//fim numDigi
	    public void limpar()
	    {
	    	tfdVote.setText("");
	        segundo = true;
	    }//fim limpar
	    
	    public void Reminder(int seconds) {
	        timer = new Timer();
	        timer.schedule(new RemindTask(), seconds*1000);
	    }
	    class RemindTask extends TimerTask {
	        @Override
			public void run() {
	            tfdVote.setText("");
	            timer.cancel(); //Terminate the timer thread
	        }
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
