package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.CandidatoPesquisaController;
import controller.FormatoPesquisaController;
import controller.TipoPesquisaController;
import model.CandidatoPesquisa;
import model.TipoPesquisa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCandidatoPesquisaUI extends JInternalFrame {
	private JTextField txtID;
	private JTextField txtVotos;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCandidatoPesquisaUI frame = new CadastroCandidatoPesquisaUI();
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
	public CadastroCandidatoPesquisaUI() {
		setResizable(true);
		setEnabled(false);
		setTitle("Cadastrar Pesquisa de um Candidato");
		setBounds(100, 100, 501, 366);
		
		JPanel pnCanPesquisa = new JPanel();
		pnCanPesquisa.setBorder(new TitledBorder(null, "Pesquisa de Candidato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CandidatoPesquisa t = new CandidatoPesquisa();
					t.setId(Integer.parseInt(txtID.getText())); // ????
					
					new CandidatoPesquisaController().salvar(t);
					JOptionPane.showMessageDialog(null, "Pesquisa de Candidato Salvo com Sucesso!");
					dispose();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar nova Pesquisa de Candidato");
				}
			}
		});
		btnSalvar.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(296, Short.MAX_VALUE)
					.addComponent(btnSalvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancelar)
					.addGap(45))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(pnCanPesquisa, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(73, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(pnCanPesquisa, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addGap(23))
		);
		
		JLabel lblID = new JLabel("ID");
		lblID.setVerticalAlignment(SwingConstants.TOP);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		
		JLabel lblDescricao = new JLabel("ID Candidato");
		
		txtVotos = new JTextField();
		txtVotos.setColumns(10);
		
		JLabel lblIdPesquisa = new JLabel("ID Pesquisa");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblVotos = new JLabel("Votos");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_pnCanPesquisa= new GroupLayout(pnCanPesquisa);
		gl_pnCanPesquisa.setHorizontalGroup(
			gl_pnCanPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnCanPesquisa.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_pnCanPesquisa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnCanPesquisa.createSequentialGroup()
							.addGroup(gl_pnCanPesquisa.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnCanPesquisa.createSequentialGroup()
									.addComponent(lblDescricao)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_pnCanPesquisa.createSequentialGroup()
									.addGap(22)
									.addComponent(lblID))
								.addGroup(gl_pnCanPesquisa.createSequentialGroup()
									.addGap(13)
									.addComponent(lblVotos)))
							.addGap(16)
							.addGroup(gl_pnCanPesquisa.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtVotos, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
							.addGap(57))
						.addComponent(lblIdPesquisa)))
		);
		gl_pnCanPesquisa.setVerticalGroup(
			gl_pnCanPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnCanPesquisa.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_pnCanPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblID)
						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_pnCanPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescricao)
						.addComponent(txtVotos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnCanPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdPesquisa)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_pnCanPesquisa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnCanPesquisa.createSequentialGroup()
							.addGap(7)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnCanPesquisa.createSequentialGroup()
							.addGap(10)
							.addComponent(lblVotos)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		pnCanPesquisa.setLayout(gl_pnCanPesquisa);
		getContentPane().setLayout(groupLayout);

	}

}
