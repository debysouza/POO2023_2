package br.com.poo.sb.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class JLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCpf;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
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
	public JLogin() {
		setTitle("Sistema Bancário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 339);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloLogin = new JLabel("Login");
		tituloLogin.setBounds(209, 10, 69, 31);
		tituloLogin.setForeground(new Color(255, 128, 0));
		tituloLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(tituloLogin);
		
		textCpf = new JTextField();
		textCpf.setBounds(146, 102, 186, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(146, 176, 186, 20);
		contentPane.add(textSenha);
		
		JLabel labelCpf = new JLabel("CPF");
		labelCpf.setBounds(146, 85, 46, 14);
		contentPane.add(labelCpf);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setBounds(146, 160, 46, 14);
		contentPane.add(labelSenha);
		
		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = textCpf.getText();
				String senha = new String(textSenha.getPassword());
				if(cpf != null && senha != null && !cpf.isEmpty() && !senha.isEmpty()) {
					JOptionPane.showMessageDialog(botaoEntrar, "Bem-vindo(a), " 
							+ cpf);
				} else {
					JOptionPane.showMessageDialog(botaoEntrar, "Preencha todos "
							+ "os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		botaoEntrar.setBounds(189, 249, 89, 23);
		contentPane.add(botaoEntrar);
	}
}
