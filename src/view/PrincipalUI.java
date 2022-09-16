package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.CadastroUI.CadastroCandidatoPesquisaUI;
import view.CadastroUI.CadastroCandidatoUI;
import view.CadastroUI.CadastroFormatoPesquisaUI;
import view.CadastroUI.CadastroPesquisaUI;
import view.CadastroUI.CadastroTipoPesquisaUI;
import view.ConsultaUI.ConsultaCandidatoPesquisaUI;
import view.ConsultaUI.ConsultaCandidatoUI;
import view.ConsultaUI.ConsultaFormatoPesquisaUI;
import view.ConsultaUI.ConsultaPesquisaUI;
import view.ConsultaUI.ConsultaTipoPesquisaUI;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.FlowLayout;

public class PrincipalUI extends JFrame {

	private static final long serialVersionUID = 1L;
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
				ConsultaTipoPesquisaUI tipoPesquisa = new  ConsultaTipoPesquisaUI();
				tipoPesquisa.setVisible(true);
				contentPane.add(tipoPesquisa, 0);
			}
		});
		mnRPesquisas.add(mnRTipoPesquisas);

		JMenuItem mntmRFormatoPesquisas = new JMenuItem("Formato Pesquisa");
		mntmRFormatoPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaFormatoPesquisaUI formPesq = new ConsultaFormatoPesquisaUI();
				formPesq.setVisible(true);
				contentPane.add(formPesq, 0);
				
			}
		});
		mnRPesquisas.add(mntmRFormatoPesquisas);
		
		JMenuItem mntmRPesquisas = new JMenuItem("Pesquisas");
		mntmRPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaPesquisaUI pesq = new ConsultaPesquisaUI();
				pesq.setVisible(true);
				contentPane.add(pesq, 0);
				
			}
		});
		mnRPesquisas.add(mntmRPesquisas);
		
		JMenuItem mntmRPesquisaCandidato = new JMenuItem("Pesquisa de Candidato");
		mntmRPesquisaCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaCandidatoPesquisaUI pesqCand = new ConsultaCandidatoPesquisaUI();
				pesqCand.setVisible(true);
				contentPane.add(pesqCand, 0);
				
			}
		});
		mnRPesquisas.add(mntmRPesquisaCandidato);
		/////
		
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
