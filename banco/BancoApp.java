package banco;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BancoApp {

	private JFrame frame;
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
					BancoApp window = new BancoApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BancoApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(45, 13, 56, 16);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(30, 32, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblConta = new JLabel("Conta");
		lblConta.setBounds(45, 52, 56, 16);
		frame.getContentPane().add(lblConta);
		
		textField_1 = new JTextField();
		textField_1.setBounds(30, 67, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(45, 87, 56, 16);
		frame.getContentPane().add(lblSaldo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(30, 102, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double saldo = Double.parseDouble(textField_2.getText());
				String nome = (textField.getText());
				String conta = (textField_1.getText());
				ContaBancaria c1 = new ContaBancaria(nome, conta, saldo);
				double saque = Double.parseDouble(textField_3.getText());
				JOptionPane.showMessageDialog(btnSacar, c1.sacar(saque));
				
			}
		});
		
		btnSacar.setBounds(158, 31, 97, 25);
		frame.getContentPane().add(btnSacar);
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double saldo = Double.parseDouble(textField_2.getText());
				String nome = (textField.getText());
				String conta = (textField_1.getText());
				ContaBancaria c1 = new ContaBancaria(nome, conta, saldo);
				double saque = Double.parseDouble(textField_4.getText());
				JOptionPane.showMessageDialog(btnDepositar, c1.depositar(saque));
			}
		});
		btnDepositar.setBounds(158, 101, 97, 25);
		frame.getContentPane().add(btnDepositar);
		
		textField_3 = new JTextField();
		textField_3.setBounds(260, 32, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(260, 102, 116, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblValorDoSaque = new JLabel("Valor do saque:");
		lblValorDoSaque.setBounds(276, 13, 91, 16);
		frame.getContentPane().add(lblValorDoSaque);
		
		JLabel lblValorDoDeposito = new JLabel("Valor do deposito:");
		lblValorDoDeposito.setBounds(267, 87, 116, 16);
		frame.getContentPane().add(lblValorDoDeposito);
		
		JLabel lblSaldoAtual = new JLabel("Informacoes:");
		lblSaldoAtual.setBounds(30, 188, 97, 37);
		frame.getContentPane().add(lblSaldoAtual);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(124, 176, 276, 60);
		frame.getContentPane().add(lblNewLabel);
	}
}
