package tela.exibindo_nome;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exibindo_nome {

	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exibindo_nome window = new exibindo_nome();
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
	public exibindo_nome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	// Janela 	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(450, 350);
		
		// Título da tela 		
		JLabel titulo = new JLabel("Exibindo Nome");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titulo.setBounds(165, 35, 121, 14);
		frame.getContentPane().add(titulo);
		
		// Texto 1		
		JLabel texto1 = new JLabel("Digite o seu nome: ");
		texto1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		texto1.setBounds(56, 102, 112, 22);
		frame.getContentPane().add(texto1);
		
		// Input 		
		input = new JTextField();
		input.setBounds(175, 104, 156, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		// Botão Mostrar
		// Criando a  função "Mostrar"  
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//	Criando uma tela para exibir o nome 			
				JOptionPane.showMessageDialog(null,"Nome: " + input.getText());
			}

			}
		);		
		btnMostrar.setBounds(165, 163, 89, 23);
		frame.getContentPane().add(btnMostrar);
		
		// Botão Sair 	
		// Criando a função " Sair "		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Comando que fecha a Janela 				
				System.exit(0);
			}
		});
		btnSair.setBounds(165, 209, 89, 23);
		frame.getContentPane().add(btnSair);
	}
}
