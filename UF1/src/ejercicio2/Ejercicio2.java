package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 {

	private JFrame frame;
	private JRadioButton rdbtnComoNuevo;
	private JRadioButton rdbtnBueno;
	private JRadioButton rdbtnAlgunDesperfecto;
	private JButton btnAceptar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 window = new Ejercicio2();
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
	public Ejercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 529, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModelo.setBounds(40, 28, 46, 14);
		frame.getContentPane().add(lblModelo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Arosa", "Ferrari", "Seat", "Opel", "Mercedes"}));
		comboBox.setBounds(170, 24, 113, 22);
		frame.getContentPane().add(comboBox);
		
		JSlider slider = new JSlider();
		slider.setFont(new Font("Tahoma", Font.PLAIN, 11));
		slider.setMajorTickSpacing(5000);
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setBorder(null);
		slider.setMinorTickSpacing(5000);
		slider.setMaximum(50000);
		slider.setValue(25000);
		slider.setBounds(40, 220, 433, 37);
		frame.getContentPane().add(slider);
		
		rdbtnComoNuevo = new JRadioButton("Como nuevo");
		rdbtnComoNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnBueno.setEnabled(false);
				rdbtnAlgunDesperfecto.setEnabled(false);
			}
		});
		rdbtnComoNuevo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnComoNuevo.setBounds(40, 74, 194, 23);
		frame.getContentPane().add(rdbtnComoNuevo);
		
		rdbtnBueno = new JRadioButton("Bueno");
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnComoNuevo.setEnabled(false);
				rdbtnAlgunDesperfecto.setEnabled(false);
			}
		});
		rdbtnBueno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnBueno.setBounds(40, 100, 194, 23);
		frame.getContentPane().add(rdbtnBueno);
		
		rdbtnAlgunDesperfecto = new JRadioButton("Algún desperfecto");
		rdbtnAlgunDesperfecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnComoNuevo.setEnabled(false);
				rdbtnBueno.setEnabled(false);
			}
		});
		rdbtnAlgunDesperfecto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnAlgunDesperfecto.setBounds(40, 126, 194, 23);
		frame.getContentPane().add(rdbtnAlgunDesperfecto);
		
		JLabel lblNewLabel = new JLabel("Kilometros: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(54, 182, 109, 14);
		frame.getContentPane().add(lblNewLabel);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnComoNuevo.setEnabled(true);
				rdbtnBueno.setEnabled(true);
				rdbtnAlgunDesperfecto.setEnabled(true);
				rdbtnComoNuevo.setSelected(false);
				rdbtnBueno.setSelected(false);
				rdbtnAlgunDesperfecto.setSelected(false);
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.setBounds(384, 345, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		JLabel lblNewLabel_1 = new JLabel("KM: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(237, 293, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
