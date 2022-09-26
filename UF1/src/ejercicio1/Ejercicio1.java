package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JRadioButton rdbtn1Curso;
	private JRadioButton rdbtn2Curso;
	private JCheckBox chckbxRepetidor;
	private JButton btnAceptar;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
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
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Ejercicio1.class.getResource("/resources/LogoMakr.png")));
		lblLogo.setBounds(264, 11, 160, 194);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(25, 28, 60, 21);
		frame.getContentPane().add(lblNombre);
		
		JLabel lbl1Apellido = new JLabel("1er apellido");
		lbl1Apellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl1Apellido.setBounds(25, 72, 71, 21);
		frame.getContentPane().add(lbl1Apellido);
		
		JLabel lbl2Apellido = new JLabel("2do apellido");
		lbl2Apellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl2Apellido.setBounds(25, 116, 71, 21);
		frame.getContentPane().add(lbl2Apellido);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				rdbtn1Curso.setEnabled(true);
				rdbtn2Curso.setEnabled(true);
				rdbtn1Curso.setSelected(false);
				rdbtn2Curso.setSelected(false);
				chckbxRepetidor.setSelected(false);
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.setBounds(299, 228, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		rdbtn1Curso = new JRadioButton("1er Curso");
		rdbtn1Curso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtn2Curso.setEnabled(false);
			}
		});
		rdbtn1Curso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtn1Curso.setBounds(25, 194, 109, 23);
		frame.getContentPane().add(rdbtn1Curso);
		
		rdbtn2Curso = new JRadioButton("2do Curso");
		rdbtn2Curso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtn1Curso.setEnabled(false);
			}
		});
		rdbtn2Curso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtn2Curso.setBounds(25, 228, 109, 23);
		frame.getContentPane().add(rdbtn2Curso);
		
		chckbxRepetidor = new JCheckBox("Repetidor");
		chckbxRepetidor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxRepetidor.setBounds(147, 228, 97, 23);
		frame.getContentPane().add(chckbxRepetidor);
		
		textField = new JTextField();
		textField.setBounds(111, 29, 133, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(111, 73, 133, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(111, 117, 133, 20);
		frame.getContentPane().add(textField_2);
	}
}
