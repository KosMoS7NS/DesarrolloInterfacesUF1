package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio3 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 window = new Ejercicio3();
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
	public Ejercicio3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 357, 244);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNum1 = new JLabel("Nº 1");
		lblNum1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNum1.setBounds(24, 41, 47, 23);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Nº 2");
		lblNum2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNum2.setBounds(24, 95, 47, 23);
		frame.getContentPane().add(lblNum2);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(81, 43, 86, 20);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(81, 97, 86, 20);
		frame.getContentPane().add(textFieldNum2);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResultado.setBounds(10, 153, 59, 14);
		frame.getContentPane().add(lblResultado);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setColumns(10);
		textFieldResultado.setBounds(81, 151, 86, 20);
		frame.getContentPane().add(textFieldResultado);
		
		JButton btnMas = new JButton("+");
		btnMas.setBounds(213, 42, 47, 23);
		frame.getContentPane().add(btnMas);
		
		JButton btnMenos = new JButton("-");
		btnMenos.setBounds(270, 42, 47, 23);
		frame.getContentPane().add(btnMenos);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setBounds(213, 96, 47, 23);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(270, 96, 47, 23);
		frame.getContentPane().add(btnDividir);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBorrar.setBounds(213, 149, 104, 23);
		frame.getContentPane().add(btnBorrar);
	}
}
