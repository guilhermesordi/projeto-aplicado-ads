package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.FlowLayout;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
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
	public PrincipalUI() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 484);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		///// CADASTROS
		JMenu mbCadastros = new JMenu("Cadastrar");
		menuBar.add(mbCadastros);
		/////
		JMenuItem mntmCCandidatos = new JMenuItem("Candidatos");
		mntmCCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCandidatoUI cadCandidato = new CadastroCandidatoUI();
				cadCandidato.setVisible(true);
				contentPane.add(cadCandidato, 0); 
				
			}
		});
		mbCadastros.add(mntmCCandidatos);

		JMenu mnCPesquisas = new JMenu("Pesquisas");
		mbCadastros.add(mnCPesquisas);
		JMenuItem mnCTipoPesquisas = new JMenuItem("Tipo Pesquisa");
		mnCTipoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroTipoPesquisaUI tipoPesquisa = new  CadastroTipoPesquisaUI();
				tipoPesquisa.setVisible(true);
				contentPane.add(tipoPesquisa, 0);
			}
		});
		mnCPesquisas.add(mnCTipoPesquisas);

		JMenuItem mntmCFormatoPesquisas = new JMenuItem("Formato Pesquisa");
		mntmCFormatoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFormatoPesquisaUI formPesq = new CadastroFormatoPesquisaUI();
				formPesq.setVisible(true);
				contentPane.add(formPesq, 0);
				
			}
		});
		mnCPesquisas.add(mntmCFormatoPesquisas);
		
		JMenuItem mntmPesquisas = new JMenuItem("Pesquisas");
		mntmPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPesquisaUI pesq = new CadastroPesquisaUI();
				pesq.setVisible(true);
				contentPane.add(pesq, 0);
				
			}
		});
		mnCPesquisas.add(mntmPesquisas);
		
		JMenuItem mntmPesquisaCandidato = new JMenuItem("Pesquisa de Candidato");
		mntmPesquisaCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCandidatoPesquisaUI pesqCand = new CadastroCandidatoPesquisaUI();
				pesqCand.setVisible(true);
				contentPane.add(pesqCand, 0);
				
			}
		});
		mnCPesquisas.add(mntmPesquisaCandidato);
		/////

		///// CONSULTAS
		JMenu mbConsultar = new JMenu("Consultar");
		menuBar.add(mbConsultar);
		/////
		JMenuItem mntmRCandidatos = new JMenuItem("Candidatos");
		mntmRCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaCandidatoUI conCandidato = new ConsultaCandidatoUI();
				conCandidato.setVisible(true);
				contentPane.add(conCandidato, 0); 
				
			}
		});
		mbConsultar.add(mntmRCandidatos);

		JMenu mnRPesquisas = new JMenu("Pesquisas");
		mbConsultar.add(mnRPesquisas);
		
		JMenuItem mnRTipoPesquisas = new JMenuItem("Tipo Pesquisa");
		mnRTipoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroTipoPesquisaUI tipoPesquisa = new  CadastroTipoPesquisaUI();
				tipoPesquisa.setVisible(true);
				contentPane.add(tipoPesquisa, 0);
			}
		});
		mnRPesquisas.add(mnRTipoPesquisas);

		JMenuItem mntmRFormatoPesquisas = new JMenuItem("Formato Pesquisa");
		mntmRFormatoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFormatoPesquisaUI formPesq = new CadastroFormatoPesquisaUI();
				formPesq.setVisible(true);
				contentPane.add(formPesq, 0);
				
			}
		});
		mnRPesquisas.add(mntmRFormatoPesquisas);
		
		JMenuItem mntmRPesquisas = new JMenuItem("Pesquisas");
		mntmRPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPesquisaUI pesq = new CadastroPesquisaUI();
				pesq.setVisible(true);
				contentPane.add(pesq, 0);
				
			}
		});
		mnRPesquisas.add(mntmRPesquisas);
		
		JMenuItem mntmRPesquisaCandidato = new JMenuItem("Pesquisa de Candidato");
		mntmRPesquisaCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCandidatoPesquisaUI pesqCand = new CadastroCandidatoPesquisaUI();
				pesqCand.setVisible(true);
				contentPane.add(pesqCand, 0);
				
			}
		});
		mnRPesquisas.add(mntmRPesquisaCandidato);
		/////
		
		///// ATUALIZAR
		JMenu mbAtualizar = new JMenu("Atualizar");
		menuBar.add(mbAtualizar);
		/////
		
		JMenuItem mntmUCandidatos = new JMenuItem("Candidatos");
		mntmUCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaCandidatoUI updtCandidato = new ConsultaCandidatoUI();
				updtCandidato.setVisible(true);
				contentPane.add(updtCandidato, 0); 
				
			}
		});
		mbAtualizar.add(mntmUCandidatos);
		
		JMenu mnUPesquisas = new JMenu("Pesquisas");
		mbAtualizar.add(mnUPesquisas);
		
		JMenuItem mnUTipoPesquisas = new JMenuItem("Tipo Pesquisa");
		mnUTipoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroTipoPesquisaUI updtTipoPesquisa = new CadastroTipoPesquisaUI();
				updtTipoPesquisa.setVisible(true);
				contentPane.add(updtTipoPesquisa, 0);
			}
		});
		mnUPesquisas.add(mnUTipoPesquisas);

		JMenuItem mntmUFormatoPesquisas = new JMenuItem("Formato Pesquisa");
		mntmUFormatoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFormatoPesquisaUI updtFormPesq = new CadastroFormatoPesquisaUI();
				updtFormPesq.setVisible(true);
				contentPane.add(updtFormPesq, 0);
				
			}
		});
		mnUPesquisas.add(mntmUFormatoPesquisas);
		
		JMenuItem mntmUPesquisas = new JMenuItem("Pesquisas");
		mntmUPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPesquisaUI updtPesq = new CadastroPesquisaUI();
				updtPesq.setVisible(true);
				contentPane.add(updtPesq, 0);
				
			}
		});
		mnUPesquisas.add(mntmUPesquisas);
		
		JMenuItem mntmUPesquisaCandidato = new JMenuItem("Pesquisa de Candidato");
		mntmUPesquisaCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCandidatoPesquisaUI updtPesqCand = new CadastroCandidatoPesquisaUI();
				updtPesqCand.setVisible(true);
				contentPane.add(updtPesqCand, 0);
				
			}
		});
		mnUPesquisas.add(mntmUPesquisaCandidato);
		/////
		
		///// REMOVER
		JMenu mbRemover = new JMenu("Remover");
		menuBar.add(mbRemover);
		/////
		
		JMenuItem mntmDCandidatos = new JMenuItem("Candidatos");
		mntmDCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaCandidatoUI dltCandidato = new ConsultaCandidatoUI();
				dltCandidato.setVisible(true);
				contentPane.add(dltCandidato, 0); 
				
			}
		});
		mbRemover.add(mntmDCandidatos);
		
		JMenu mnDPesquisas = new JMenu("Pesquisas");
		mbRemover.add(mnDPesquisas);
		
		JMenuItem mnDTipoPesquisas = new JMenuItem("Tipo Pesquisa");
		mnDTipoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroTipoPesquisaUI dltTipoPesquisa = new CadastroTipoPesquisaUI();
				dltTipoPesquisa.setVisible(true);
				contentPane.add(dltTipoPesquisa, 0);
			}
		});
		mnDPesquisas.add(mnDTipoPesquisas);

		JMenuItem mntmDFormatoPesquisas = new JMenuItem("Formato Pesquisa");
		mntmDFormatoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFormatoPesquisaUI dltFormPesq = new CadastroFormatoPesquisaUI();
				dltFormPesq.setVisible(true);
				contentPane.add(dltFormPesq, 0);
				
			}
		});
		mnDPesquisas.add(mntmDFormatoPesquisas);
		
		JMenuItem mntmDPesquisas = new JMenuItem("Pesquisas");
		mntmDPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPesquisaUI dltPesq = new CadastroPesquisaUI();
				dltPesq.setVisible(true);
				contentPane.add(dltPesq, 0);
				
			}
		});
		mnDPesquisas.add(mntmDPesquisas);
		
		JMenuItem mntmDPesquisaCandidato = new JMenuItem("Pesquisa de Candidato");
		mntmDPesquisaCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCandidatoPesquisaUI dltPesqCand = new CadastroCandidatoPesquisaUI();
				dltPesqCand.setVisible(true);
				contentPane.add(dltPesqCand, 0);
				
			}
		});
		mnDPesquisas.add(mntmDPesquisaCandidato);
		
		
		
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
