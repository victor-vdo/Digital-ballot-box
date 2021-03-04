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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class PresidentElectionFrame extends JFrame {private static final long serialVersionUID = 1L;

private JPanel contentPane;

Timer timer;
JLabel lblPartidoPresidente, lblNumeroPresidente;
private JPanel pnlLeftEleicaoPresidente;
private JTextField tfdVotacaoPresidenteEleicao;
private JTextField tfdNome;
private JTextField tfdPartido;
private boolean segundo = true;
JButton btnVotacaoPresidente0,btnVotacaoPresidente1, btnVotacaoPresidente2, btnVotacaoPresidente3, btnVotacaoPresidente4, btnVotacaoPresidente5, btnVotacaoPresidente6, btnVotacaoPresidente7, btnVotacaoPresidente8, btnVotacaoPresidente9,btnVotacaoPresidenteBranco, btnVotacaoPresidenteCorrigir;

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
			try {
				PresidentElectionFrame frame = new PresidentElectionFrame();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

public PresidentElectionFrame() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 800, 600);
	setTitle("Eleição 2018 - Presidente");
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel pnlTopEleicaoPresidente = new JPanel();
	contentPane.add(pnlTopEleicaoPresidente, BorderLayout.NORTH);
	
	JPanel pnlSouthEleicaoPresidente = new JPanel();
	contentPane.add(pnlSouthEleicaoPresidente, BorderLayout.SOUTH);

	pnlLeftEleicaoPresidente = new JPanel();
	pnlLeftEleicaoPresidente.setBorder(null);
	pnlLeftEleicaoPresidente.setSize(50, 535);
	contentPane.add(pnlLeftEleicaoPresidente, BorderLayout.WEST);
	
	JPanel pnlRightEleicaoPresidente = new JPanel();
	pnlRightEleicaoPresidente.setSize(250, 468);
	contentPane.add(pnlRightEleicaoPresidente, BorderLayout.EAST);
	
	GridBagLayout gbl_pnlRightEleicaoPresidente = new GridBagLayout();
	gbl_pnlRightEleicaoPresidente.columnWeights = new double[]{0.0, 0.0, 0.0};
	gbl_pnlRightEleicaoPresidente.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	pnlRightEleicaoPresidente.setLayout(gbl_pnlRightEleicaoPresidente);
	
	tfdVotacaoPresidenteEleicao = new JTextField();
	GridBagConstraints gbc_tfdVotacaoPresidenteEleicao = new GridBagConstraints();
	gbc_tfdVotacaoPresidenteEleicao.gridwidth = 3;
	gbc_tfdVotacaoPresidenteEleicao.fill = GridBagConstraints.BOTH;
	gbc_tfdVotacaoPresidenteEleicao.insets = new Insets(0, 0, 5, 0);
	gbc_tfdVotacaoPresidenteEleicao.gridx = 0;
	gbc_tfdVotacaoPresidenteEleicao.gridy = 0;
	tfdVotacaoPresidenteEleicao.setEditable(false);
	pnlRightEleicaoPresidente.add(tfdVotacaoPresidenteEleicao, gbc_tfdVotacaoPresidenteEleicao);
	tfdVotacaoPresidenteEleicao.setColumns(10);
	
	JButton btnVotacaoPresidente1 = new JButton();
	btnVotacaoPresidente1.setText("1");
	GridBagConstraints gbc_btnVotacaoPresidente1 = new GridBagConstraints();
	gbc_btnVotacaoPresidente1.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoPresidente1.gridx = 0;
	gbc_btnVotacaoPresidente1.gridy = 1;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente1, gbc_btnVotacaoPresidente1);
	
	JButton btnVotacaoPresidente2 = new JButton("2");
	GridBagConstraints gbc_btnVotacaoPresidente2 = new GridBagConstraints();
	gbc_btnVotacaoPresidente2.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoPresidente2.gridx = 1;
	gbc_btnVotacaoPresidente2.gridy = 1;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente2, gbc_btnVotacaoPresidente2);
	
	JButton btnVotacaoPresidente3 = new JButton("3");
	GridBagConstraints gbc_btnVotacaoPresidente3 = new GridBagConstraints();
	gbc_btnVotacaoPresidente3.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoPresidente3.gridx = 2;
	gbc_btnVotacaoPresidente3.gridy = 1;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente3, gbc_btnVotacaoPresidente3);
	
	JButton btnVotacaoPresidente4 = new JButton("4");
	GridBagConstraints gbc_btnVotacaoPresidente4 = new GridBagConstraints();
	gbc_btnVotacaoPresidente4.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoPresidente4.gridx = 0;
	gbc_btnVotacaoPresidente4.gridy = 2;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente4, gbc_btnVotacaoPresidente4);
	
	JButton btnVotacaoPresidente5 = new JButton("5");
	GridBagConstraints gbc_btnVotacaoPresidente5 = new GridBagConstraints();
	gbc_btnVotacaoPresidente5.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoPresidente5.gridx = 1;
	gbc_btnVotacaoPresidente5.gridy = 2;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente5, gbc_btnVotacaoPresidente5);
	
	JButton btnVotacaoPresidente6 = new JButton("6");
	GridBagConstraints gbc_btnVotacaoPresidente6 = new GridBagConstraints();
	gbc_btnVotacaoPresidente6.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoPresidente6.gridx = 2;
	gbc_btnVotacaoPresidente6.gridy = 2;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente6, gbc_btnVotacaoPresidente6);
	
	JButton btnVotacaoPresidente7 = new JButton("7");
	GridBagConstraints gbc_btnVotacaoPresidente7 = new GridBagConstraints();
	gbc_btnVotacaoPresidente7.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoPresidente7.gridx = 0;
	gbc_btnVotacaoPresidente7.gridy = 3;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente7, gbc_btnVotacaoPresidente7);
	
	JButton btnVotacaoPresidente8 = new JButton("8");
	GridBagConstraints gbc_btnVotacaoPresidente8 = new GridBagConstraints();
	gbc_btnVotacaoPresidente8.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoPresidente8.gridx = 1;
	gbc_btnVotacaoPresidente8.gridy = 3;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente8, gbc_btnVotacaoPresidente8);
	
	JButton btnVotacaoPresidente9 = new JButton("9");
	GridBagConstraints gbc_btnVotacaoPresidente9 = new GridBagConstraints();
	gbc_btnVotacaoPresidente9.insets = new Insets(0, 0, 5, 0);
	gbc_btnVotacaoPresidente9.gridx = 2;
	gbc_btnVotacaoPresidente9.gridy = 3;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente9, gbc_btnVotacaoPresidente9);
	
	JButton btnVotacaoPresidenteBranco = new JButton("Branco");
	btnVotacaoPresidenteBranco.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfdVotacaoPresidenteEleicao.setText("Opção inválida !!");
			Reminder(1);
			
			 
		}
	});
	
	JButton btnVotacaoPresidente0 = new JButton("0");
	GridBagConstraints gbc_btnVotacaoPresidente0 = new GridBagConstraints();
	gbc_btnVotacaoPresidente0.insets = new Insets(0, 0, 5, 5);
	gbc_btnVotacaoPresidente0.gridx = 1;
	gbc_btnVotacaoPresidente0.gridy = 4;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidente0, gbc_btnVotacaoPresidente0);
	GridBagConstraints gbc_btnVotacaoPresidenteBranco = new GridBagConstraints();
	gbc_btnVotacaoPresidenteBranco.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoPresidenteBranco.insets = new Insets(0, 0, 0, 5);
	gbc_btnVotacaoPresidenteBranco.gridx = 0;
	gbc_btnVotacaoPresidenteBranco.gridy = 6;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidenteBranco, gbc_btnVotacaoPresidenteBranco);
	
	JButton btnVotacaoPresidenteCorrigi = new JButton("Corrigir");
	btnVotacaoPresidenteCorrigi.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfdVotacaoPresidenteEleicao.setText("");
		}
	});
	GridBagConstraints gbc_btnVotacaoPresidenteCorrigi = new GridBagConstraints();
	gbc_btnVotacaoPresidenteCorrigi.insets = new Insets(0, 0, 0, 5);
	gbc_btnVotacaoPresidenteCorrigi.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoPresidenteCorrigi.gridx = 1;
	gbc_btnVotacaoPresidenteCorrigi.gridy = 6;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidenteCorrigi, gbc_btnVotacaoPresidenteCorrigi);
	
	JButton btnVotacaoPresidenteConfirma = new JButton("Confirma");
	btnVotacaoPresidenteConfirma.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			PresidentElectionFrame.this.dispose();
			GovernorElectionFrame TelaEleicaoGovernador = new GovernorElectionFrame();
			TelaEleicaoGovernador.getContentPane();
			TelaEleicaoGovernador.setVisible(true);
		}
	});
	
	btnVotacaoPresidente0.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("0");
		}
	});
	
	btnVotacaoPresidente1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("1");
		}
	});
	
	btnVotacaoPresidente2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("2");
		}
	});
	
	btnVotacaoPresidente3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("3");
		}
	});
	
	btnVotacaoPresidente4.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("4");
		}
	});
	
	btnVotacaoPresidente5.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("5");
		}
	});
	
	btnVotacaoPresidente6.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("6");
		}
	});
	
	btnVotacaoPresidente7.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("7");
		}
	});
	
	btnVotacaoPresidente8.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("8");
		}
	});
	
	btnVotacaoPresidente9.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			numDigi("9");
		}
	});

	GridBagConstraints gbc_btnVotacaoPresidenteConfirma = new GridBagConstraints();
	gbc_btnVotacaoPresidenteConfirma.fill = GridBagConstraints.BOTH;
	gbc_btnVotacaoPresidenteConfirma.gridx = 2;
	gbc_btnVotacaoPresidenteConfirma.gridy = 6;
	pnlRightEleicaoPresidente.add(btnVotacaoPresidenteConfirma, gbc_btnVotacaoPresidenteConfirma);
	
	JPanel pnlCenterEleicaoPresidente = new JPanel();
	pnlCenterEleicaoPresidente.setSize(400, 535);
	contentPane.add(pnlCenterEleicaoPresidente, BorderLayout.CENTER);
	
	pnlLeftEleicaoPresidente.setLayout(new GridLayout(10, 1, 0, 0));
	GridBagLayout gbl_pnlCenterEleicaoPresidente = new GridBagLayout();
	gbl_pnlCenterEleicaoPresidente.columnWeights = new double[]{0.0, 1.0};
	gbl_pnlCenterEleicaoPresidente.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	pnlCenterEleicaoPresidente.setLayout(gbl_pnlCenterEleicaoPresidente);
	
	JLabel lblSeuVotoPara = new JLabel("Seu voto para: ");
	GridBagConstraints gbc_lblSeuVotoPara = new GridBagConstraints();
	gbc_lblSeuVotoPara.fill = GridBagConstraints.BOTH;
	gbc_lblSeuVotoPara.insets = new Insets(0, 0, 5, 0);
	gbc_lblSeuVotoPara.gridx = 1;
	gbc_lblSeuVotoPara.gridy = 0;
	pnlCenterEleicaoPresidente.add(lblSeuVotoPara, gbc_lblSeuVotoPara);
	
	JLabel lblPresidente = new JLabel("PRESIDENTE");
	lblPresidente.setHorizontalAlignment(SwingConstants.CENTER);
	lblPresidente.setFont(new Font("Verdana", Font.PLAIN, 42));
	GridBagConstraints gbc_lblPresidente = new GridBagConstraints();
	gbc_lblPresidente.fill = GridBagConstraints.BOTH;
	gbc_lblPresidente.insets = new Insets(0, 0, 5, 0);
	gbc_lblPresidente.gridx = 1;
	gbc_lblPresidente.gridy = 1;
	pnlCenterEleicaoPresidente.add(lblPresidente, gbc_lblPresidente);
	
	JLabel lblNome = new JLabel("Nome:");
	lblNome.setHorizontalAlignment(SwingConstants.LEFT);
	GridBagConstraints gbc_lblNome = new GridBagConstraints();
	gbc_lblNome.anchor = GridBagConstraints.EAST;
	gbc_lblNome.insets = new Insets(0, 0, 5, 5);
	gbc_lblNome.gridx = 0;
	gbc_lblNome.gridy = 5;
	pnlCenterEleicaoPresidente.add(lblNome, gbc_lblNome);
	
	tfdNome = new JTextField();
	tfdNome.setEditable(false);
	GridBagConstraints gbc_tfdNome = new GridBagConstraints();
	gbc_tfdNome.insets = new Insets(0, 0, 5, 0);
	gbc_tfdNome.fill = GridBagConstraints.HORIZONTAL;
	gbc_tfdNome.gridx = 1;
	gbc_tfdNome.gridy = 5;
	pnlCenterEleicaoPresidente.add(tfdNome, gbc_tfdNome);
	tfdNome.setColumns(10);
	
	JLabel lblPartido = new JLabel("Partido:");
	GridBagConstraints gbc_lblPartido = new GridBagConstraints();
	gbc_lblPartido.anchor = GridBagConstraints.EAST;
	gbc_lblPartido.insets = new Insets(0, 0, 0, 5);
	gbc_lblPartido.gridx = 0;
	gbc_lblPartido.gridy = 6;
	pnlCenterEleicaoPresidente.add(lblPartido, gbc_lblPartido);
	
	tfdPartido = new JTextField();
	tfdPartido.setEditable(false);
	GridBagConstraints gbc_tfdPartido = new GridBagConstraints();
	gbc_tfdPartido.fill = GridBagConstraints.HORIZONTAL;
	gbc_tfdPartido.gridx = 1;
	gbc_tfdPartido.gridy = 6;
	pnlCenterEleicaoPresidente.add(tfdPartido, gbc_tfdPartido);
	tfdPartido.setColumns(10);
}

 private void numDigi(String n)
 {
	 if (segundo == true) 
	 {
		 tfdVotacaoPresidenteEleicao.setText(tfdVotacaoPresidenteEleicao.getText() + n);
     } 
	 else 
	 {
		 tfdVotacaoPresidenteEleicao.setText("");
		 tfdVotacaoPresidenteEleicao.setText(tfdVotacaoPresidenteEleicao.getText() + n);
         segundo = true;
     }
 }//fim numDigi
    public void limpar()
    {
    	tfdVotacaoPresidenteEleicao.setText("");
        segundo = true;
    }//fim limpar
    
    public void Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }
    class RemindTask extends TimerTask {
        @Override
		public void run() {
            tfdVotacaoPresidenteEleicao.setText("");
            timer.cancel(); //Terminate the timer thread
        }
    }
}
