package Interface.Interfac.src.tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin {

	// Variáveis 	
	private JFrame frame;
	private JTextField input1;
	private JTextField input2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Tela / Janela 		
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Texto " Login" 		
		JLabel texto1 = new JLabel("Login:");
		texto1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		texto1.setBounds(72, 115, 46, 25);
		frame.getContentPane().add(texto1);
		
		// Input do login		
		input1 = new JTextField();
		input1.setBounds(124, 113, 186, 31);
		frame.getContentPane().add(input1);
		input1.setColumns(10);
		
		// Texto " Senha "		
		JLabel texto2 = new JLabel("Senha: ");
		texto2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		texto2.setBounds(72, 186, 46, 14);
		frame.getContentPane().add(texto2);
		
		// Input da senha 		
		input2 = new JTextField();
		input2.setColumns(10);
		input2.setBounds(124, 179, 186, 31);
		frame.getContentPane().add(input2);
		
		// Título		
		JLabel titulo = new JLabel("Login");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		titulo.setBounds(193, 47, 40, 25);
		frame.getContentPane().add(titulo);
		
		// Botão " Entrar "		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkLogin(input1.getText(),input2.getText())) {
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!");
				}else {
					JOptionPane.showMessageDialog(null,"Dados inválidos!","Mensagem",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnEntrar.setBounds(169, 241, 89, 31);
		frame.getContentPane().add(btnEntrar);
	}
	
	// Método de verificação 	
	public boolean checkLogin(String login, String senha) {
		return login.equals("Usuário") && senha.equals("123");
	}
}
