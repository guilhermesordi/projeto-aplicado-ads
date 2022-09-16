package view.ConsultaUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.CandidatoController;
import model.Candidato;
import view.CadastroUI.CadastroCandidatoUI;
import view.tables.CandidatoTableModel;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaPesquisaUI extends JInternalFrame {
	private JTable jtCandidato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaCandidatoUI frame = new ConsultaCandidatoUI();
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
	public ConsultaPesquisaUI() {

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 426, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 254, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		setTitle("Consultar Pesquisa");
		setBounds(100, 100, 660, 408);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Candidato candidato = new CandidatoTableModel(new CandidatoController().listar()).get(jtCandidato.getSelectedRow());
				CadastroCandidatoUI cadCandidatoUI = new CadastroCandidatoUI();				
				cadCandidatoUI.setCandidatoEdicao(candidato);
				cadCandidatoUI.setVisible(true);
				getParent().add(cadCandidatoUI, 0);
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Candidato candidato = new CandidatoTableModel(new CandidatoController().listar()).get(jtCandidato.getSelectedRow());
				try {
					new CandidatoController().excluir(candidato.getId());
					jtCandidato.setModel(new CandidatoTableModel(new CandidatoController().listar()));
					
					JOptionPane.showMessageDialog(null, "Candidato Excluido Com Sucesso");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao excluir produto");
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout1 = new GroupLayout(getContentPane());
		groupLayout1.setHorizontalGroup(
			groupLayout1.createParallelGroup(Alignment.CENTER)
				.addGroup(groupLayout1.createSequentialGroup()
					.addContainerGap(319, Short.MAX_VALUE)
					.addComponent(btnAlterar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExcluir)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancelar)
					.addGap(34))
				.addGroup(Alignment.LEADING, groupLayout1.createSequentialGroup()
					.addGap(25)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 587, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		groupLayout1.setVerticalGroup(
			groupLayout1.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout1.createSequentialGroup()
					.addGap(10)
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addGap(96)
					.addGroup(groupLayout1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnExcluir)
						.addComponent(btnAlterar))
					.addGap(25))
		);
		
		jtCandidato = new JTable();
		jtCandidato.setModel(new CandidatoTableModel(new CandidatoController().listar()));
		scrollPane.setViewportView(jtCandidato);
		getContentPane().setLayout(groupLayout1);

	}
}
