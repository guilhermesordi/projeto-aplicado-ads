package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.FormatoPesquisaController;
import controller.TipoPesquisaController;
import model.TipoPesquisa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroTipoPesquisaUI extends JInternalFrame {
	private JTextField txtID;
	private JTextField txtDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTipoPesquisaUI frame = new CadastroTipoPesquisaUI();
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
	public CadastroTipoPesquisaUI() {
		setResizable(true);
		setEnabled(false);
		setTitle("Cadastrar Tipo Pesquisa");
		setBounds(100, 100, 501, 366);
		
		JPanel pnTipoPesquisa = new JPanel();
		pnTipoPesquisa.setBorder(new TitledBorder(null, "Tipo Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TipoPesquisa t = new TipoPesquisa();
					t.setId(Integer.parseInt(txtID.getText())); // ????
					t.setDescricao(txtDescricao.getText());
					
					new TipoPesquisaController().salvar(t);
					JOptionPane.showMessageDialog(null, "Tipo de Pesquisa Salvo com Sucesso!");
					dispose();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar novo Tipo de Pesquisa");
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
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(pnTipoPesquisa, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(177, Short.MAX_VALUE)
					.addComponent(btnSalvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancelar)
					.addGap(45))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(pnTipoPesquisa, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addGap(23))
		);
		
		JLabel lblID = new JLabel("ID");
		lblID.setVerticalAlignment(SwingConstants.TOP);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição");
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		GroupLayout gl_pnTipoPesquisa = new GroupLayout(pnTipoPesquisa);
		gl_pnTipoPesquisa.setHorizontalGroup(
			gl_pnTipoPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnTipoPesquisa.createSequentialGroup()
					.addGap(71)
					.addGroup(gl_pnTipoPesquisa.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblID)
						.addComponent(lblDescricao))
					.addGroup(gl_pnTipoPesquisa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnTipoPesquisa.createSequentialGroup()
							.addGap(5)
							.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnTipoPesquisa.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))))
		);
		gl_pnTipoPesquisa.setVerticalGroup(
			gl_pnTipoPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnTipoPesquisa.createSequentialGroup()
					.addGroup(gl_pnTipoPesquisa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnTipoPesquisa.createSequentialGroup()
							.addGap(10)
							.addComponent(lblID)
							.addGap(18)
							.addGroup(gl_pnTipoPesquisa.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDescricao)))
						.addGroup(gl_pnTipoPesquisa.createSequentialGroup()
							.addGap(5)
							.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		pnTipoPesquisa.setLayout(gl_pnTipoPesquisa);
		getContentPane().setLayout(groupLayout);

	}

}
