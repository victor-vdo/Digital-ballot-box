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

public class CongressmanElectionFrame extends JFrame {private static final long serialVersionUID = 1L;

private JPanel contentPane;

Timer timer;
JLabel lblPartidoDF, lblNumeroDF;
private JPanel pnlLeftEleicaoDF;
private JTextField tfdVotacaoDFEleicao;
private JTextField tfdNome;
private JTextField tfdPartido;
private boolean segundo = true;
JButton btnVotacaoDF0, btnVotacaoDF1, btnVotacaoDF2, btnVotacaoDF3, btnVotacaoDF4, btnVotacaoDF5, btnVotacaoDF6, btnVotacaoDF7, btnVotacaoDF8, btnVotacaoDF9,btnVotacaoDFBranco, btnVotacaoDFCorrigir;

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
			try {
				CongressmanElectionFrame frame = new CongressmanElectionFrame();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

public CongressmanElectionFrame() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 800, 600);
	setTitle("Eleição 2018 - Deputado Federal");
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel pnlTopEleicaoDF = new JPanel();
	contentPane.add(pnlTopEleicaoDF, BorderLayout.NORTH);
	
	JPanel pnlSouthEleicaoDF = new JPanel();
	contentPane.add(pnlSouthEleicaoDF, BorderLayout.SOUTH);

	pnlLeftEleicaoDF = new JPanel();
	pnlLeftEleicaoDF.setBorder(null);
	pnlLeftEleicaoDF.setSize(50, 535);
	contentPane.add(pnlLeftEleicaoDF, BorderLayout.WEST);
	
	JPanel pnlRightEleicaoDF = new JPanel();
	pnlRightEleicaoDF.setSize(250, 468);
	contentPane.add(pnlRightEleicaoDF, BorderLayout.EAST);
	
	GridBagLayout gbl_pnlRightEleicaoDF = new GridBagLayout();
	gbl_pnlRightEleicaoDF.columnWeights = new double[]{0.0, 0.0, 0.0};
	gbl_pnlRightEleicaoDF.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	pnlRightEleicaoDF.setLayout(gbl_pnlRightEleicaoDF);
	
	tfdVotacaoDFEleicao = new JTextField();
	GridBagConstraints gbc_tfdVotacaoDFEleicao = new GridBagConstraints();
	gbc_tfdVotacaoDFEleicao.gridwidth = 3;
	gbc_tfdVotacaoDFEleicao.fill = GridBagConstraints.BOTH;
	gbc_tfdVotacaoDFEleicao.insets = new Insets(0, 0, 5, 0);
	gbc_tfdVotacaoDFEleicao.gridx = 0;
	gbc_tfdVotacaoDFEleicao.gridy = 0;
	tfdVotacaoDFEleicao.setEditable(false);
	pnlRightEleicaoDF.add(tfdVotacaoDFEleicao, gbc_tfdVotacaoDFEleicao);
	tfdVotacaoDFEleicao.setColumns(10);
	
	JButton btnVotacaoDF1 = new JButton();
	btnVotacaoDF1.setText("1");
	GridBagConstraints gbc_btnVotacaoDF1 = new GridBagConstraints();
	gbc_btnVotacaoDF1.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoDF1.gridx = 0;
	gbc_btnVotacaoDF1.gridy = 1;
	pnlRightEleicaoDF.add(btnVotacaoDF1, gbc_btnVotacaoDF1);
	
	JButton btnVotacaoDF2 = new JButton("2");
	GridBagConstraints gbc_btnVotacaoDF2 = new GridBagConstraints();
	gbc_btnVotacaoDF2.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoDF2.gridx = 1;
	gbc_btnVotacaoDF2.gridy = 1;
	pnlRightEleicaoDF.add(btnVotacaoDF2, gbc_btnVotacaoDF2);
	
	JButton btnVotacaoDF3 = new JButton("3");
	GridBagConstraints gbc_btnVotacaoDF3 = new GridBagConstraints();
	gbc_btnVotacaoDF3.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoDF3.gridx = 2;
	gbc_btnVotacaoDF3.gridy = 1;
	pnlRightEleicaoDF.add(btnVotacaoDF3, gbc_btnVotacaoDF3);
	
	JButton btnVotacaoDF4 = new JButton("4");
	GridBagConstraints gbc_btnVotacaoDF4 = new GridBagConstraints();
	gbc_btnVotacaoDF4.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoDF4.gridx = 0;
	gbc_btnVotacaoDF4.gridy = 2;
	pnlRightEleicaoDF.add(btnVotacaoDF4, gbc_btnVotacaoDF4);
	
	JButton btnVotacaoDF5 = new JButton("5");
	GridBagConstraints gbc_btnVotacaoDF5 = new GridBagConstraints();
	gbc_btnVotacaoDF5.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoDF5.gridx = 1;
	gbc_btnVotacaoDF5.gridy = 2;
	pnlRightEleicaoDF.add(btnVotacaoDF5, gbc_btnVotacaoDF5);
	
	JButton btnVotacaoDF6 = new JButton("6");
	GridBagConstraints gbc_btnVotacaoDF6 = new GridBagConstraints();
	gbc_btnVotacaoDF6.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoDF6.gridx = 2;
	gbc_btnVotacaoDF6.gridy = 2;
	pnlRightEleicaoDF.add(btnVotacaoDF6, gbc_btnVotacaoDF6);
	
	JButton btnVotacaoDF7 = new JButton("7");
	GridBagConstraints gbc_btnVotacaoDF7 = new GridBagConstraints();
	gbc_btnVotacaoDF7.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoDF7.gridx = 0;
	gbc_btnVotacaoDF7.gridy = 3;
	pnlRightEleicaoDF.add(btnVotacaoDF7, gbc_btnVotacaoDF7);
	
	JButton btnVotacaoDF8 = new JButton("8");
	GridBagConstraints gbc_btnVotacaoDF8 = new GridBagConstraints();
	gbc_btnVotacaoDF8.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoDF8.gridx = 1;
	gbc_btnVotacaoDF8.gridy = 3;
	pnlRightEleicaoDF.add(btnVotacaoDF8, gbc_btnVotacaoDF8);
	
	JButton btnVotacaoDF9 = new JButton("9");
	GridBagConstraints gbc_btnVotacaoDF9 = new GridBagConstraints();
	gbc_btnVotacaoDF9.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoDF9.gridx = 2;
	gbc_btnVotacaoDF9.gridy = 3;
	pnlRightEleicaoDF.add(btnVotacaoDF9, gbc_btnVotacaoDF9);
	
	JButton btnVotacaoDFBranco = new JButton("Branco");
	btnVotacaoDFBranco.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfdVotacaoDFEleicao.setText("Opção inválida !!");
			Reminder(1);
			
			 
		}
	});
	
	JButton btnVotacaoDF0 = new JButton("0");
	GridBagConstraints gbc_btnVotacaoDF0 = new GridBagConstraints();
	gbc_btnVotacaoDF0.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoDF0.gridx = 1;
	gbc_btnVotacaoDF0.gridy = 4;
	pnlRightEleicaoDF.add(btnVotacaoDF0, gbc_btnVotacaoDF0);
	GridBagConstraints gbc_btnVotacaoDFBranco = new GridBagConstraints();
	gbc_btnVotacaoDFBranco.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoDFBranco.insets = new Insets(0, 0, 0, 5);
	gbc_btnVotacaoDFBranco.gridx = 0;
	gbc_btnVotacaoDFBranco.gridy = 6;
	pnlRightEleicaoDF.add(btnVotacaoDFBranco, gbc_btnVotacaoDFBranco);
	
	JButton btnVotacaoDFCorrigi = new JButton("Corrigir");
	btnVotacaoDFCorrigi.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfdVotacaoDFEleicao.setText("");
		}
	});
	GridBagConstraints gbc_btnVotacaoDFCorrigi = new GridBagConstraints();
	gbc_btnVotacaoDFCorrigi.insets = new Insets(0, 0, 0, 5);
	gbc_btnVotacaoDFCorrigi.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoDFCorrigi.gridx = 1;
	gbc_btnVotacaoDFCorrigi.gridy = 6;
	pnlRightEleicaoDF.add(btnVotacaoDFCorrigi, gbc_btnVotacaoDFCorrigi);
	
	JButton btnVotacaoDFConfirma = new JButton("Confirma");
	btnVotacaoDFConfirma.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int opcao = JOptionPane.showConfirmDialog(null, "Confirmar voto?","Atenção !!",JOptionPane.YES_NO_OPTION);
			
		  if(opcao==0) 
		  {
			CongressmanElectionFrame.this.dispose();
			StateDeputyElectionFrame TelaEleicaoDeputadoEstadual = new StateDeputyElectionFrame();
			TelaEleicaoDeputadoEstadual.getContentPane();
			TelaEleicaoDeputadoEstadual.setVisible(true);
			
			double numeroDF = Double.parseDouble(tfdVotacaoDFEleicao.getText());
			
			for (Candidate candidato : MainBaseFrame.listaCandidatos) 
			{
				if (candidato instanceof Models.Congressman) 
				{
		
					if (numeroDF == candidato.getCandidateNumber()) 
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
	
	btnVotacaoDF0.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("0");
		}
	});
	
	btnVotacaoDF1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("1");
		}
	});
	
	btnVotacaoDF2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("2");
		}
	});
	
	btnVotacaoDF3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("3");
		}
	});
	
	btnVotacaoDF4.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("4");
		}
	});
	
	btnVotacaoDF5.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("5");
		}
	});
	
	btnVotacaoDF6.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("6");
		}
	});
	
	btnVotacaoDF7.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("7");
		}
	});
	
	btnVotacaoDF8.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("8");
		}
	});
	
	btnVotacaoDF9.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("9");
		}
	});

	GridBagConstraints gbc_btnVotacaoDFConfirma = new GridBagConstraints();
	gbc_btnVotacaoDFConfirma.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoDFConfirma.gridx = 2;
	gbc_btnVotacaoDFConfirma.gridy = 6;
	pnlRightEleicaoDF.add(btnVotacaoDFConfirma, gbc_btnVotacaoDFConfirma);
	
	JPanel pnlCenterEleicaoDF = new JPanel();
	pnlCenterEleicaoDF.setSize(400, 535);
	contentPane.add(pnlCenterEleicaoDF, BorderLayout.CENTER);
	
	pnlLeftEleicaoDF.setLayout(new GridLayout(10, 1, 0, 0));
	GridBagLayout gbl_pnlCenterEleicaoDF = new GridBagLayout();
	gbl_pnlCenterEleicaoDF.columnWeights = new double[]{0.0, 1.0};
	gbl_pnlCenterEleicaoDF.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	pnlCenterEleicaoDF.setLayout(gbl_pnlCenterEleicaoDF);
	
	JLabel lblSeuVotoPara = new JLabel("Seu voto para: ");
	GridBagConstraints gbc_lblSeuVotoPara = new GridBagConstraints();
	gbc_lblSeuVotoPara.fill = GridBagConstraints.BOTH;
	gbc_lblSeuVotoPara.insets = new Insets(0, 0, 5, 0);
	gbc_lblSeuVotoPara.gridx = 1;
	gbc_lblSeuVotoPara.gridy = 0;
	pnlCenterEleicaoDF.add(lblSeuVotoPara, gbc_lblSeuVotoPara);
	
	JLabel lblDF = new JLabel("DEP. FEDERAL");
	lblDF.setHorizontalAlignment(SwingConstants.CENTER);
	lblDF.setFont(new Font("Verdana", Font.PLAIN, 42));
	GridBagConstraints gbc_lblDF = new GridBagConstraints();
	gbc_lblDF.fill = GridBagConstraints.BOTH;
	gbc_lblDF.insets = new Insets(0, 0, 5, 0);
	gbc_lblDF.gridx = 1;
	gbc_lblDF.gridy = 1;
	pnlCenterEleicaoDF.add(lblDF, gbc_lblDF);
	
	JLabel lblNome = new JLabel("Nome:");
	lblNome.setHorizontalAlignment(SwingConstants.LEFT);
	GridBagConstraints gbc_lblNome = new GridBagConstraints();
	gbc_lblNome.anchor = GridBagConstraints.EAST;
	gbc_lblNome.insets = new Insets(0, 0, 5, 5);
	gbc_lblNome.gridx = 0;
	gbc_lblNome.gridy = 5;
	pnlCenterEleicaoDF.add(lblNome, gbc_lblNome);
	
	tfdNome = new JTextField();
	tfdNome.setEditable(false);
	GridBagConstraints gbc_tfdNome = new GridBagConstraints();
	gbc_tfdNome.insets = new Insets(0, 0, 5, 0);
	gbc_tfdNome.fill = GridBagConstraints.HORIZONTAL;
	gbc_tfdNome.gridx = 1;
	gbc_tfdNome.gridy = 5;
	pnlCenterEleicaoDF.add(tfdNome, gbc_tfdNome);
	tfdNome.setColumns(10);
	
	JLabel lblPartido = new JLabel("Partido:");
	GridBagConstraints gbc_lblPartido = new GridBagConstraints();
	gbc_lblPartido.anchor = GridBagConstraints.EAST;
	gbc_lblPartido.insets = new Insets(0, 0, 0, 5);
	gbc_lblPartido.gridx = 0;
	gbc_lblPartido.gridy = 6;
	pnlCenterEleicaoDF.add(lblPartido, gbc_lblPartido);
	
	tfdPartido = new JTextField();
	tfdPartido.setEditable(false);
	GridBagConstraints gbc_tfdPartido = new GridBagConstraints();
	gbc_tfdPartido.fill = GridBagConstraints.HORIZONTAL;
	gbc_tfdPartido.gridx = 1;
	gbc_tfdPartido.gridy = 6;
	pnlCenterEleicaoDF.add(tfdPartido, gbc_tfdPartido);
	tfdPartido.setColumns(10);
}

 private void numDigi(String n)
 {
	 if (segundo == true) 
	 {
		 tfdVotacaoDFEleicao.setText(tfdVotacaoDFEleicao.getText() + n);
     } 
	 else 
	 {
		 tfdVotacaoDFEleicao.setText("");
		 tfdVotacaoDFEleicao.setText(tfdVotacaoDFEleicao.getText() + n);
         segundo = true;
     }
 }//fim numDigi
    public void limpar()
    {
    	tfdVotacaoDFEleicao.setText("");
        segundo = true;
    }//fim limpar
    
    public void Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }
    class RemindTask extends TimerTask {
        @Override
		public void run() {
            tfdVotacaoDFEleicao.setText("");
            timer.cancel(); //Terminate the timer thread
        }
    }
}
