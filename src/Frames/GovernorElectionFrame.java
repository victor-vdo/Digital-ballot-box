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

public class GovernorElectionFrame extends JFrame {private static final long serialVersionUID = 1L;

private JPanel contentPane;

Timer timer;
JLabel lblPartidoGovernador, lblNumeroGovernador;
private JPanel pnlLeftEleicaoGovernador;
private JTextField tfdVotacaoGovernadorEleicao;
private JTextField tfdNome;
private JTextField tfdPartido;
private boolean segundo = true;
JButton  btnVotacaoGovernador0,btnVotacaoGovernador1, btnVotacaoGovernador2, btnVotacaoGovernador3, btnVotacaoGovernador4, btnVotacaoGovernador5, btnVotacaoGovernador6, btnVotacaoGovernador7, btnVotacaoGovernador8, btnVotacaoGovernador9,btnVotacaoGovernadorBranco, btnVotacaoGovernadorCorrigir;

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
			try {
				GovernorElectionFrame frame = new GovernorElectionFrame();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

public GovernorElectionFrame() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 800, 600);
	setTitle("Eleição 2018 - Governador");
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel pnlTopEleicaoGovernador = new JPanel();
	contentPane.add(pnlTopEleicaoGovernador, BorderLayout.NORTH);
	
	JPanel pnlSouthEleicaoGovernador = new JPanel();
	contentPane.add(pnlSouthEleicaoGovernador, BorderLayout.SOUTH);

	pnlLeftEleicaoGovernador = new JPanel();
	pnlLeftEleicaoGovernador.setBorder(null);
	pnlLeftEleicaoGovernador.setSize(50, 535);
	contentPane.add(pnlLeftEleicaoGovernador, BorderLayout.WEST);
	
	JPanel pnlRightEleicaoGovernador = new JPanel();
	pnlRightEleicaoGovernador.setSize(250, 468);
	contentPane.add(pnlRightEleicaoGovernador, BorderLayout.EAST);
	
	GridBagLayout gbl_pnlRightEleicaoGovernador = new GridBagLayout();
	gbl_pnlRightEleicaoGovernador.columnWeights = new double[]{0.0, 0.0, 0.0};
	gbl_pnlRightEleicaoGovernador.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	pnlRightEleicaoGovernador.setLayout(gbl_pnlRightEleicaoGovernador);
	
	tfdVotacaoGovernadorEleicao = new JTextField();
	GridBagConstraints gbc_tfdVotacaoGovernadorEleicao = new GridBagConstraints();
	gbc_tfdVotacaoGovernadorEleicao.gridwidth = 3;
	gbc_tfdVotacaoGovernadorEleicao.fill = GridBagConstraints.BOTH;
	gbc_tfdVotacaoGovernadorEleicao.insets = new Insets(0, 0, 5, 0);
	gbc_tfdVotacaoGovernadorEleicao.gridx = 0;
	gbc_tfdVotacaoGovernadorEleicao.gridy = 0;
	tfdVotacaoGovernadorEleicao.setEditable(false);
	pnlRightEleicaoGovernador.add(tfdVotacaoGovernadorEleicao, gbc_tfdVotacaoGovernadorEleicao);
	tfdVotacaoGovernadorEleicao.setColumns(10);
	
	JButton btnVotacaoGovernador1 = new JButton();
	btnVotacaoGovernador1.setText("1");
	GridBagConstraints gbc_btnVotacaoGovernador1 = new GridBagConstraints();
	gbc_btnVotacaoGovernador1.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoGovernador1.gridx = 0;
	gbc_btnVotacaoGovernador1.gridy = 1;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador1, gbc_btnVotacaoGovernador1);
	
	JButton btnVotacaoGovernador2 = new JButton("2");
	GridBagConstraints gbc_btnVotacaoGovernador2 = new GridBagConstraints();
	gbc_btnVotacaoGovernador2.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoGovernador2.gridx = 1;
	gbc_btnVotacaoGovernador2.gridy = 1;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador2, gbc_btnVotacaoGovernador2);
	
	JButton btnVotacaoGovernador3 = new JButton("3");
	GridBagConstraints gbc_btnVotacaoGovernador3 = new GridBagConstraints();
	gbc_btnVotacaoGovernador3.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoGovernador3.gridx = 2;
	gbc_btnVotacaoGovernador3.gridy = 1;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador3, gbc_btnVotacaoGovernador3);
	
	JButton btnVotacaoGovernador4 = new JButton("4");
	GridBagConstraints gbc_btnVotacaoGovernador4 = new GridBagConstraints();
	gbc_btnVotacaoGovernador4.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoGovernador4.gridx = 0;
	gbc_btnVotacaoGovernador4.gridy = 2;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador4, gbc_btnVotacaoGovernador4);
	
	JButton btnVotacaoGovernador5 = new JButton("5");
	GridBagConstraints gbc_btnVotacaoGovernador5 = new GridBagConstraints();
	gbc_btnVotacaoGovernador5.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoGovernador5.gridx = 1;
	gbc_btnVotacaoGovernador5.gridy = 2;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador5, gbc_btnVotacaoGovernador5);
	
	JButton btnVotacaoGovernador6 = new JButton("6");
	GridBagConstraints gbc_btnVotacaoGovernador6 = new GridBagConstraints();
	gbc_btnVotacaoGovernador6.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoGovernador6.gridx = 2;
	gbc_btnVotacaoGovernador6.gridy = 2;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador6, gbc_btnVotacaoGovernador6);
	
	JButton btnVotacaoGovernador7 = new JButton("7");
	GridBagConstraints gbc_btnVotacaoGovernador7 = new GridBagConstraints();
	gbc_btnVotacaoGovernador7.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoGovernador7.gridx = 0;
	gbc_btnVotacaoGovernador7.gridy = 3;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador7, gbc_btnVotacaoGovernador7);
	
	JButton btnVotacaoGovernador8 = new JButton("8");
	GridBagConstraints gbc_btnVotacaoGovernador8 = new GridBagConstraints();
	gbc_btnVotacaoGovernador8.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoGovernador8.gridx = 1;
	gbc_btnVotacaoGovernador8.gridy = 3;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador8, gbc_btnVotacaoGovernador8);
	
	JButton btnVotacaoGovernador9 = new JButton("9");
	GridBagConstraints gbc_btnVotacaoGovernador9 = new GridBagConstraints();
	gbc_btnVotacaoGovernador9.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoGovernador9.gridx = 2;
	gbc_btnVotacaoGovernador9.gridy = 3;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador9, gbc_btnVotacaoGovernador9);
	
	JButton btnVotacaoGovernadorBranco = new JButton("Branco");
	btnVotacaoGovernadorBranco.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfdVotacaoGovernadorEleicao.setText("Opção inválida !!");
			Reminder(1);
			
			 
		}
	});
	
	JButton btnVotacaoGovernador0 = new JButton("0");
	GridBagConstraints gbc_btnVotacaoGovernador0 = new GridBagConstraints();
	gbc_btnVotacaoGovernador0.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoGovernador0.gridx = 1;
	gbc_btnVotacaoGovernador0.gridy = 4;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernador0, gbc_btnVotacaoGovernador0);
	GridBagConstraints gbc_btnVotacaoGovernadorBranco = new GridBagConstraints();
	gbc_btnVotacaoGovernadorBranco.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoGovernadorBranco.insets = new Insets(0, 0, 0, 5);
	gbc_btnVotacaoGovernadorBranco.gridx = 0;
	gbc_btnVotacaoGovernadorBranco.gridy = 6;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernadorBranco, gbc_btnVotacaoGovernadorBranco);
	
	JButton btnVotacaoGovernadorCorrigi = new JButton("Corrigir");
	btnVotacaoGovernadorCorrigi.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfdVotacaoGovernadorEleicao.setText("");
		}
	});
	GridBagConstraints gbc_btnVotacaoGovernadorCorrigi = new GridBagConstraints();
	gbc_btnVotacaoGovernadorCorrigi.insets = new Insets(0, 0, 0, 5);
	gbc_btnVotacaoGovernadorCorrigi.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoGovernadorCorrigi.gridx = 1;
	gbc_btnVotacaoGovernadorCorrigi.gridy = 6;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernadorCorrigi, gbc_btnVotacaoGovernadorCorrigi);
	
	JButton btnVotacaoGovernadorConfirma = new JButton("Confirma");
	btnVotacaoGovernadorConfirma.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int opcao = JOptionPane.showConfirmDialog(null, "Confirmar voto?","Atenção !!",JOptionPane.YES_NO_OPTION);
			
			  if(opcao==0) 
			  {
				GovernorElectionFrame.this.dispose();
				SenatorElectionFrame telaSenador = new SenatorElectionFrame();
				telaSenador.getContentPane();
				telaSenador.setVisible(true);
				
				double numeroGovernador = Double.parseDouble(tfdVotacaoGovernadorEleicao.getText());
				
				for (Candidate candidato : MainBaseFrame.listaCandidatos) 
				{
					if (candidato instanceof Models.Governator) 
					{
			
						if (numeroGovernador == candidato.getCandidateNumber()) 
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
	
	btnVotacaoGovernador0.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("0");
		}
	});
	
	btnVotacaoGovernador1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("1");
		}
	});
	
	btnVotacaoGovernador2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("2");
		}
	});
	
	btnVotacaoGovernador3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("3");
		}
	});
	
	btnVotacaoGovernador4.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("4");
		}
	});
	
	btnVotacaoGovernador5.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("5");
		}
	});
	
	btnVotacaoGovernador6.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("6");
		}
	});
	
	btnVotacaoGovernador7.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("7");
		}
	});
	
	btnVotacaoGovernador8.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("8");
		}
	});
	
	btnVotacaoGovernador9.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("9");
		}
	});

	GridBagConstraints gbc_btnVotacaoGovernadorConfirma = new GridBagConstraints();
	gbc_btnVotacaoGovernadorConfirma.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoGovernadorConfirma.gridx = 2;
	gbc_btnVotacaoGovernadorConfirma.gridy = 6;
	pnlRightEleicaoGovernador.add(btnVotacaoGovernadorConfirma, gbc_btnVotacaoGovernadorConfirma);
	
	JPanel pnlCenterEleicaoGovernador = new JPanel();
	pnlCenterEleicaoGovernador.setSize(400, 535);
	contentPane.add(pnlCenterEleicaoGovernador, BorderLayout.CENTER);
	
	pnlLeftEleicaoGovernador.setLayout(new GridLayout(10, 1, 0, 0));
	GridBagLayout gbl_pnlCenterEleicaoGovernador = new GridBagLayout();
	gbl_pnlCenterEleicaoGovernador.columnWeights = new double[]{0.0, 1.0};
	gbl_pnlCenterEleicaoGovernador.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	pnlCenterEleicaoGovernador.setLayout(gbl_pnlCenterEleicaoGovernador);
	
	JLabel lblSeuVotoPara = new JLabel("Seu voto para: ");
	GridBagConstraints gbc_lblSeuVotoPara = new GridBagConstraints();
	gbc_lblSeuVotoPara.fill = GridBagConstraints.BOTH;
	gbc_lblSeuVotoPara.insets = new Insets(0, 0, 5, 0);
	gbc_lblSeuVotoPara.gridx = 1;
	gbc_lblSeuVotoPara.gridy = 0;
	pnlCenterEleicaoGovernador.add(lblSeuVotoPara, gbc_lblSeuVotoPara);
	
	JLabel lblGovernador = new JLabel("GOVERNADOR");
	lblGovernador.setHorizontalAlignment(SwingConstants.CENTER);
	lblGovernador.setFont(new Font("Verdana", Font.PLAIN, 42));
	GridBagConstraints gbc_lblGovernador = new GridBagConstraints();
	gbc_lblGovernador.fill = GridBagConstraints.BOTH;
	gbc_lblGovernador.insets = new Insets(0, 0, 5, 0);
	gbc_lblGovernador.gridx = 1;
	gbc_lblGovernador.gridy = 1;
	pnlCenterEleicaoGovernador.add(lblGovernador, gbc_lblGovernador);
	
	JLabel lblNome = new JLabel("Nome:");
	lblNome.setHorizontalAlignment(SwingConstants.LEFT);
	GridBagConstraints gbc_lblNome = new GridBagConstraints();
	gbc_lblNome.anchor = GridBagConstraints.EAST;
	gbc_lblNome.insets = new Insets(0, 0, 5, 5);
	gbc_lblNome.gridx = 0;
	gbc_lblNome.gridy = 5;
	pnlCenterEleicaoGovernador.add(lblNome, gbc_lblNome);
	
	tfdNome = new JTextField();
	tfdNome.setEditable(false);
	GridBagConstraints gbc_tfdNome = new GridBagConstraints();
	gbc_tfdNome.insets = new Insets(0, 0, 5, 0);
	gbc_tfdNome.fill = GridBagConstraints.HORIZONTAL;
	gbc_tfdNome.gridx = 1;
	gbc_tfdNome.gridy = 5;
	pnlCenterEleicaoGovernador.add(tfdNome, gbc_tfdNome);
	tfdNome.setColumns(10);
	
	JLabel lblPartido = new JLabel("Partido:");
	GridBagConstraints gbc_lblPartido = new GridBagConstraints();
	gbc_lblPartido.anchor = GridBagConstraints.EAST;
	gbc_lblPartido.insets = new Insets(0, 0, 0, 5);
	gbc_lblPartido.gridx = 0;
	gbc_lblPartido.gridy = 6;
	pnlCenterEleicaoGovernador.add(lblPartido, gbc_lblPartido);
	
	tfdPartido = new JTextField();
	tfdPartido.setEditable(false);
	GridBagConstraints gbc_tfdPartido = new GridBagConstraints();
	gbc_tfdPartido.fill = GridBagConstraints.HORIZONTAL;
	gbc_tfdPartido.gridx = 1;
	gbc_tfdPartido.gridy = 6;
	pnlCenterEleicaoGovernador.add(tfdPartido, gbc_tfdPartido);
	tfdPartido.setColumns(10);
}

 private void numDigi(String n)
 {
	 if (segundo == true) 
	 {
		 tfdVotacaoGovernadorEleicao.setText(tfdVotacaoGovernadorEleicao.getText() + n);
     } 
	 else 
	 {
		 tfdVotacaoGovernadorEleicao.setText("");
		 tfdVotacaoGovernadorEleicao.setText(tfdVotacaoGovernadorEleicao.getText() + n);
         segundo = true;
     }
 }//fim numDigi
    public void limpar()
    {
    	tfdVotacaoGovernadorEleicao.setText("");
        segundo = true;
    }//fim limpar
    
    public void Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }
    class RemindTask extends TimerTask {
        @Override
		public void run() {
            tfdVotacaoGovernadorEleicao.setText("");
            timer.cancel(); //Terminate the timer thread
        }
    }
}
