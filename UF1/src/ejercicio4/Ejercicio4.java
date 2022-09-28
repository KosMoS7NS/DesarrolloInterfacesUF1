package ejercicio4;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;

public class Ejercicio4 {

	private JFrame frame;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnIniciar;
	private Random random = new Random();
	private List<String> winnerList;
	private List<JButton> buttonList;
	private JButton btnPreparado;
	private JButton btnReinciar;
	private JLabel lblWinner;

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
		frame.setBounds(100, 100, 500, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btn1 = new JButton("");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.WHITE);
				btn1.setForeground(Color.GRAY);
								
				winnerList = checkWinner().stream()
						.map(Object::toString)
						.filter(button -> button.contains(btn1.getText()))
						.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");
					
			}
		});
		btn1.setEnabled(false);
		btn1.setBounds(61, 88, 89, 60);
		frame.getContentPane().add(btn1);

		btn2 = new JButton("");
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setBackground(Color.WHITE);
				btn2.setForeground(Color.GRAY);
				
				winnerList = checkWinner().stream()
					.map(Object::toString)
					.filter(button -> button.contains(btn2.getText()))
					.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");

			}
		});
		btn2.setEnabled(false);
		btn2.setBounds(61, 178, 89, 60);
		frame.getContentPane().add(btn2);

		btn3 = new JButton("");
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setBackground(Color.WHITE);
				btn3.setForeground(Color.GRAY);
								
				winnerList = checkWinner().stream()
					.map(Object::toString)
					.filter(button -> button.contains(btn3.getText()))
					.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");

			}
		});
		btn3.setEnabled(false);
		btn3.setBounds(61, 267, 89, 60);
		frame.getContentPane().add(btn3);

		btn4 = new JButton("");
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setBackground(Color.WHITE);
				btn4.setForeground(Color.GRAY);
								
				winnerList = checkWinner().stream()
					.map(Object::toString)
					.filter(button -> button.contains(btn4.getText()))
					.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");

			}
		});
		btn4.setEnabled(false);
		btn4.setBounds(198, 88, 89, 60);
		frame.getContentPane().add(btn4);

		btn5 = new JButton("");
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setBackground(Color.WHITE);
				btn5.setForeground(Color.GRAY);
								
				winnerList = checkWinner().stream()
					.map(Object::toString)
					.filter(button -> button.contains(btn5.getText()))
					.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");

			}
		});
		btn5.setEnabled(false);
		btn5.setBounds(198, 178, 89, 60);
		frame.getContentPane().add(btn5);

		btn6 = new JButton("");
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setBackground(Color.WHITE);
				btn6.setForeground(Color.GRAY);
								
				winnerList = checkWinner().stream()
					.map(Object::toString)
					.filter(button -> button.contains(btn6.getText()))
					.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");

			}
		});
		btn6.setEnabled(false);
		btn6.setBounds(198, 267, 89, 60);
		frame.getContentPane().add(btn6);

		btn7 = new JButton("");
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setBackground(Color.WHITE);
				btn7.setForeground(Color.GRAY);
								
				winnerList = checkWinner().stream()
					.map(Object::toString)
					.filter(button -> button.contains(btn7.getText()))
					.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");

			}
		});
		btn7.setEnabled(false);
		btn7.setBounds(334, 88, 89, 60);
		frame.getContentPane().add(btn7);

		btn8 = new JButton("");
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setBackground(Color.WHITE);
				btn8.setForeground(Color.GRAY);
								
				winnerList = checkWinner().stream()
					.map(Object::toString)
					.filter(button -> button.contains(btn8.getText()))
					.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");

			}
		});
		btn8.setEnabled(false);
		btn8.setBounds(334, 178, 89, 60);
		frame.getContentPane().add(btn8);

		btn9 = new JButton("");
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setBackground(Color.WHITE);
				btn9.setForeground(Color.GRAY);
								
				winnerList = checkWinner().stream()
					.map(Object::toString)
					.filter(button -> button.contains(btn9.getText()))
					.collect(Collectors.toList());
				
				if (!winnerList.isEmpty()) lblWinner.setText("Winner!");

			}
		});
		btn9.setEnabled(false);
		btn9.setBounds(334, 267, 89, 60);
		frame.getContentPane().add(btn9);

		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				randomButton();
				btnIniciar.setEnabled(false);
				btnPreparado.setEnabled(true);
				btnReinciar.setEnabled(true);
			}
		});
		btnIniciar.setBounds(99, 361, 110, 23);
		frame.getContentPane().add(btnIniciar);

		JLabel lblTitulo = new JLabel("Encuentra un número repetido");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setBounds(165, 37, 186, 14);
		frame.getContentPane().add(lblTitulo);

		btnPreparado = new JButton("Preparado");
		btnPreparado.setEnabled(false);
		btnPreparado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enableButtons();
				noContentButton();
				btnPreparado.setEnabled(false);
			}
		});
		btnPreparado.setBounds(296, 361, 110, 23);
		frame.getContentPane().add(btnPreparado);

		btnReinciar = new JButton("Reinciar");
		btnReinciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciar.setEnabled(true);
				btnReinciar.setEnabled(false);
				lblWinner.setText("");
				defaultColor();
				disableButtons();
				randomButton();
			}
		});
		btnReinciar.setEnabled(false);
		btnReinciar.setBounds(187, 421, 110, 23);
		frame.getContentPane().add(btnReinciar);
		
		lblWinner = new JLabel("");
		lblWinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWinner.setBounds(377, 425, 46, 14);
		frame.getContentPane().add(lblWinner);
	}

	public void defaultColor() {
		buttonList = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
		buttonList.forEach(button -> {
			button.setBackground(Color.LIGHT_GRAY);
			button.setForeground(Color.WHITE);
		});
	}

	public void noContentButton() {
		buttonList = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
		buttonList.forEach(button -> {
			button.setBackground(Color.GRAY);
			button.setForeground(Color.GRAY);
		});

	}

	public void disableButtons() {
		buttonList = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
		buttonList.forEach(button -> button.setEnabled(false));

	}

	public void enableButtons() {
		buttonList = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
		buttonList.forEach(button -> button.setEnabled(true));

	}

	public List<JButton> randomButton() {
		buttonList = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);

		buttonList.forEach(button -> button.setText(String.valueOf(random.nextInt(10))));
		return buttonList;
		
	}

	public List<?> checkWinner() {
		buttonList = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);

		List<String> listButtonValue = buttonList.stream()
		.map(button -> button.getText())
		.collect(Collectors.toList());
		
		return buttonList.stream()
				.map(button -> button.getText())
				.filter(button -> Collections.frequency(listButtonValue, button) > 1)
				.collect(Collectors.toList());
		
	}
}
