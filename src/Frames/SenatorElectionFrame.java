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

public class SenatorElectionFrame extends JFrame {private static final long serialVersionUID = 1L;

private JPanel contentPane;

Timer timer;
JLabel lblPartidoSenador, lblNumeroSenador;
private JPanel pnlLeftEleicaoSenador;
private JTextField tfdVotacaoSenadorEleicao;
private JTextField tfdNome;
private JTextField tfdPartido;
private boolean segundo = true;
JButton btnVotacaoSenador0, btnVotacaoSenador1, btnVotacaoSenador2, btnVotacaoSenador3, btnVotacaoSenador4, btnVotacaoSenador5, btnVotacaoSenador6, btnVotacaoSenador7, btnVotacaoSenador8, btnVotacaoSenador9,btnVotacaoSenadorBranco, btnVotacaoSenadorCorrigir;

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
			try {
				SenatorElectionFrame frame = new SenatorElectionFrame();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

public SenatorElectionFrame() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 800, 600);
	setTitle("Eleição 2018 - Senador");
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel pnlTopEleicaoSenador = new JPanel();
	contentPane.add(pnlTopEleicaoSenador, BorderLayout.NORTH);
	
	JPanel pnlSouthEleicaoSenador = new JPanel();
	contentPane.add(pnlSouthEleicaoSenador, BorderLayout.SOUTH);

	pnlLeftEleicaoSenador = new JPanel();
	pnlLeftEleicaoSenador.setBorder(null);
	pnlLeftEleicaoSenador.setSize(50, 535);
	contentPane.add(pnlLeftEleicaoSenador, BorderLayout.WEST);
	
	JPanel pnlRightEleicaoSenador = new JPanel();
	pnlRightEleicaoSenador.setSize(250, 468);
	contentPane.add(pnlRightEleicaoSenador, BorderLayout.EAST);
	
	GridBagLayout gbl_pnlRightEleicaoSenador = new GridBagLayout();
	gbl_pnlRightEleicaoSenador.columnWeights = new double[]{0.0, 0.0, 0.0};
	gbl_pnlRightEleicaoSenador.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	pnlRightEleicaoSenador.setLayout(gbl_pnlRightEleicaoSenador);
	
	tfdVotacaoSenadorEleicao = new JTextField();
	GridBagConstraints gbc_tfdVotacaoSenadorEleicao = new GridBagConstraints();
	gbc_tfdVotacaoSenadorEleicao.gridwidth = 3;
	gbc_tfdVotacaoSenadorEleicao.fill = GridBagConstraints.BOTH;
	gbc_tfdVotacaoSenadorEleicao.insets = new Insets(0, 0, 5, 0);
	gbc_tfdVotacaoSenadorEleicao.gridx = 0;
	gbc_tfdVotacaoSenadorEleicao.gridy = 0;
	tfdVotacaoSenadorEleicao.setEditable(false);
	pnlRightEleicaoSenador.add(tfdVotacaoSenadorEleicao, gbc_tfdVotacaoSenadorEleicao);
	tfdVotacaoSenadorEleicao.setColumns(10);
	
	JButton btnVotacaoSenador1 = new JButton();
	btnVotacaoSenador1.setText("1");
	GridBagConstraints gbc_btnVotacaoSenador1 = new GridBagConstraints();
	gbc_btnVotacaoSenador1.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoSenador1.gridx = 0;
	gbc_btnVotacaoSenador1.gridy = 1;
	pnlRightEleicaoSenador.add(btnVotacaoSenador1, gbc_btnVotacaoSenador1);
	
	JButton btnVotacaoSenador2 = new JButton("2");
	GridBagConstraints gbc_btnVotacaoSenador2 = new GridBagConstraints();
	gbc_btnVotacaoSenador2.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoSenador2.gridx = 1;
	gbc_btnVotacaoSenador2.gridy = 1;
	pnlRightEleicaoSenador.add(btnVotacaoSenador2, gbc_btnVotacaoSenador2);
	
	JButton btnVotacaoSenador3 = new JButton("3");
	GridBagConstraints gbc_btnVotacaoSenador3 = new GridBagConstraints();
	gbc_btnVotacaoSenador3.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoSenador3.gridx = 2;
	gbc_btnVotacaoSenador3.gridy = 1;
	pnlRightEleicaoSenador.add(btnVotacaoSenador3, gbc_btnVotacaoSenador3);
	
	JButton btnVotacaoSenador4 = new JButton("4");
	GridBagConstraints gbc_btnVotacaoSenador4 = new GridBagConstraints();
	gbc_btnVotacaoSenador4.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoSenador4.gridx = 0;
	gbc_btnVotacaoSenador4.gridy = 2;
	pnlRightEleicaoSenador.add(btnVotacaoSenador4, gbc_btnVotacaoSenador4);
	
	JButton btnVotacaoSenador5 = new JButton("5");
	GridBagConstraints gbc_btnVotacaoSenador5 = new GridBagConstraints();
	gbc_btnVotacaoSenador5.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoSenador5.gridx = 1;
	gbc_btnVotacaoSenador5.gridy = 2;
	pnlRightEleicaoSenador.add(btnVotacaoSenador5, gbc_btnVotacaoSenador5);
	
	JButton btnVotacaoSenador6 = new JButton("6");
	GridBagConstraints gbc_btnVotacaoSenador6 = new GridBagConstraints();
	gbc_btnVotacaoSenador6.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoSenador6.gridx = 2;
	gbc_btnVotacaoSenador6.gridy = 2;
	pnlRightEleicaoSenador.add(btnVotacaoSenador6, gbc_btnVotacaoSenador6);
	
	JButton btnVotacaoSenador7 = new JButton("7");
	GridBagConstraints gbc_btnVotacaoSenador7 = new GridBagConstraints();
	gbc_btnVotacaoSenador7.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoSenador7.gridx = 0;
	gbc_btnVotacaoSenador7.gridy = 3;
	pnlRightEleicaoSenador.add(btnVotacaoSenador7, gbc_btnVotacaoSenador7);
	
	JButton btnVotacaoSenador8 = new JButton("8");
	GridBagConstraints gbc_btnVotacaoSenador8 = new GridBagConstraints();
	gbc_btnVotacaoSenador8.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoSenador8.gridx = 1;
	gbc_btnVotacaoSenador8.gridy = 3;
	pnlRightEleicaoSenador.add(btnVotacaoSenador8, gbc_btnVotacaoSenador8);
	
	JButton btnVotacaoSenador9 = new JButton("9");
	GridBagConstraints gbc_btnVotacaoSenador9 = new GridBagConstraints();
	gbc_btnVotacaoSenador9.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoSenador9.gridx = 2;
	gbc_btnVotacaoSenador9.gridy = 3;
	pnlRightEleicaoSenador.add(btnVotacaoSenador9, gbc_btnVotacaoSenador9);
	
	JButton btnVotacaoSenadorBranco = new JButton("Branco");
	btnVotacaoSenadorBranco.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfdVotacaoSenadorEleicao.setText("Opção inválida !!");
			Reminder(1);
			
			 
		}
	});
	
	JButton btnVotacaoSenador0 = new JButton("0");
	GridBagConstraints gbc_btnVotacaoSenador0 = new GridBagConstraints();
	gbc_btnVotacaoSenador0.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoSenador0.gridx = 1;
	gbc_btnVotacaoSenador0.gridy = 4;
	pnlRightEleicaoSenador.add(btnVotacaoSenador0, gbc_btnVotacaoSenador0);
	GridBagConstraints gbc_btnVotacaoSenadorBranco = new GridBagConstraints();
	gbc_btnVotacaoSenadorBranco.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoSenadorBranco.insets = new Insets(0, 0, 0, 5);
	gbc_btnVotacaoSenadorBranco.gridx = 0;
	gbc_btnVotacaoSenadorBranco.gridy = 6;
	pnlRightEleicaoSenador.add(btnVotacaoSenadorBranco, gbc_btnVotacaoSenadorBranco);
	
	JButton btnVotacaoSenadorCorrigi = new JButton("Corrigir");
	btnVotacaoSenadorCorrigi.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfdVotacaoSenadorEleicao.setText("");
		}
	});
	GridBagConstraints gbc_btnVotacaoSenadorCorrigi = new GridBagConstraints();
	gbc_btnVotacaoSenadorCorrigi.insets = new Insets(0, 0, 0, 5);
	gbc_btnVotacaoSenadorCorrigi.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoSenadorCorrigi.gridx = 1;
	gbc_btnVotacaoSenadorCorrigi.gridy = 6;
	pnlRightEleicaoSenador.add(btnVotacaoSenadorCorrigi, gbc_btnVotacaoSenadorCorrigi);
	
	JButton btnVotacaoSenadorConfirma = new JButton("Confirma");
	btnVotacaoSenadorConfirma.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int opcao = JOptionPane.showConfirmDialog(null, "Confirmar voto?","Atenção !!",JOptionPane.YES_NO_OPTION);
			
			  if(opcao==0) 
			  {
				SenatorElectionFrame.this.dispose();
				CongressmanElectionFrame telaDF = new CongressmanElectionFrame();
				telaDF.getContentPane();
				telaDF.setVisible(true);
				
				double numeroSenador = Double.parseDouble(tfdVotacaoSenadorEleicao.getText());
				
				for (Candidate candidato : MainBaseFrame.listaCandidatos) 
				{
					if (candidato instanceof Models.Senator) 
					{
			
						if (numeroSenador == candidato.getCandidateNumber()) 
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
	
	btnVotacaoSenador0.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("0");
		}
	});
	
	btnVotacaoSenador1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("1");
		}
	});
	
	btnVotacaoSenador2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("2");
		}
	});
	
	btnVotacaoSenador3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("3");
		}
	});
	
	btnVotacaoSenador4.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("4");
		}
	});
	
	btnVotacaoSenador5.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("5");
		}
	});
	
	btnVotacaoSenador6.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("6");
		}
	});
	
	btnVotacaoSenador7.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("7");
		}
	});
	
	btnVotacaoSenador8.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("8");
		}
	});
	
	btnVotacaoSenador9.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("9");
		}
	});

	GridBagConstraints gbc_btnVotacaoSenadorConfirma = new GridBagConstraints();
	gbc_btnVotacaoSenadorConfirma.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoSenadorConfirma.gridx = 2;
	gbc_btnVotacaoSenadorConfirma.gridy = 6;
	pnlRightEleicaoSenador.add(btnVotacaoSenadorConfirma, gbc_btnVotacaoSenadorConfirma);
	
	JPanel pnlCenterEleicaoSenador = new JPanel();
	pnlCenterEleicaoSenador.setSize(400, 535);
	contentPane.add(pnlCenterEleicaoSenador, BorderLayout.CENTER);
	
	pnlLeftEleicaoSenador.setLayout(new GridLayout(10, 1, 0, 0));
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
	
	tfdNome = new JTextField();
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
	
	tfdPartido = new JTextField();
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
		 tfdVotacaoSenadorEleicao.setText(tfdVotacaoSenadorEleicao.getText() + n);
     } 
	 else 
	 {
		 tfdVotacaoSenadorEleicao.setText("");
		 tfdVotacaoSenadorEleicao.setText(tfdVotacaoSenadorEleicao.getText() + n);
         segundo = true;
     }
 }//fim numDigi
    public void limpar()
    {
    	tfdVotacaoSenadorEleicao.setText("");
        segundo = true;
    }//fim limpar
    
    public void Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }
    class RemindTask extends TimerTask {
        @Override
		public void run() {
            tfdVotacaoSenadorEleicao.setText("");
            timer.cancel(); //Terminate the timer thread
        }
    }
}
