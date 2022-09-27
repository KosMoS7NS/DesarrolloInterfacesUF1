package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Ejercicio4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 window = new Ejercicio4();
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
	public Ejercicio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("0");
		btn1.setEnabled(false);
		btn1.setBounds(61, 88, 89, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("0");
		btn2.setEnabled(false);
		btn2.setBounds(61, 178, 89, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("0");
		btn3.setEnabled(false);
		btn3.setBounds(61, 267, 89, 60);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("0");
		btn4.setEnabled(false);
		btn4.setBounds(198, 88, 89, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("0");
		btn5.setEnabled(false);
		btn5.setBounds(198, 178, 89, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("0");
		btn6.setEnabled(false);
		btn6.setBounds(198, 267, 89, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("0");
		btn7.setEnabled(false);
		btn7.setBounds(334, 88, 89, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("0");
		btn8.setEnabled(false);
		btn8.setBounds(334, 178, 89, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("0");
		btn9.setEnabled(false);
		btn9.setBounds(334, 267, 89, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(198, 358, 89, 23);
		frame.getContentPane().add(btnIniciar);
		
		JLabel lblTitulo = new JLabel("Encuentra 2 números identicos");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setBounds(165, 37, 186, 14);
		frame.getContentPane().add(lblTitulo);
	}
}
