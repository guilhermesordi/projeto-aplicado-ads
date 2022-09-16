package view.CadastroUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.FormatoPesquisaController;
import controller.PesquisaController;
import controller.TipoPesquisaController;
import model.Pesquisa;
import model.TipoPesquisa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPesquisaUI extends JInternalFrame {
	private JTextField txtID;
	private JTextField txtInst;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPesquisaUI frame = new CadastroPesquisaUI();
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
	public CadastroPesquisaUI() {
		setResizable(true);
		setEnabled(false);
		setTitle("Cadastrar Pesquisa");
		setBounds(100, 100, 501, 366);
		
		JPanel pnPesquisa = new JPanel();
		pnPesquisa.setBorder(new TitledBorder(null, "Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Pesquisa t = new Pesquisa();
					t.setId(Integer.parseInt(txtID.getText())); // ????
					t.setInstituicao(txtInst.getText());
					
					new PesquisaController().salvar(t);
					JOptionPane.showMessageDialog(null, "Pesquisa Salva com Sucesso!");
					dispose();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar nova Pesquisa");
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
					.addComponent(pnPesquisa, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(73, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(pnPesquisa, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addGap(23))
		);
		
		JLabel lblID = new JLabel("ID");
		lblID.setVerticalAlignment(SwingConstants.TOP);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Instituição");
		
		txtInst = new JTextField();
		txtInst.setColumns(10);
		
		JLabel lblData = new JLabel("Data");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblLocal = new JLabel("Local");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblMdiaDeIdade = new JLabel("Média de Idade");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblFormato = new JLabel("Formato");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout gl_pnPesquisa = new GroupLayout(pnPesquisa);
		gl_pnPesquisa.setHorizontalGroup(
			gl_pnPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnPesquisa.createSequentialGroup()
					.addGap(71)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescricao)
						.addComponent(lblID)
						.addComponent(lblData)
						.addGroup(gl_pnPesquisa.createSequentialGroup()
							.addGap(1)
							.addComponent(lblLocal))
						.addComponent(lblTipo)
						.addComponent(lblMdiaDeIdade)
						.addComponent(lblFormato))
					.addGap(5)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtInst, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_pnPesquisa.setVerticalGroup(
			gl_pnPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnPesquisa.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblID))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescricao)
						.addComponent(txtInst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblData))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocal)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMdiaDeIdade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFormato)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		pnPesquisa.setLayout(gl_pnPesquisa);
		getContentPane().setLayout(groupLayout);

	}

}
