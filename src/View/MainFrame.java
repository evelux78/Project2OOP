package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.Fermi;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField value3;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		Fermi fermi = new Fermi();
		Vector<Integer> game = new Vector<Integer>();
		game = fermi.GenerateRandom(game);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel labelTitulo = new JLabel("Farmi Guessing Game");
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 1;
		gbc_labelTitulo.gridy = 0;
		contentPane.add(labelTitulo, gbc_labelTitulo);
		
		JLabel labelBtn = new JLabel("Enter your three guesses (0-9)");
		GridBagConstraints gbc_labelBtn = new GridBagConstraints();
		gbc_labelBtn.insets = new Insets(0, 0, 5, 5);
		gbc_labelBtn.gridx = 1;
		gbc_labelBtn.gridy = 1;
		contentPane.add(labelBtn, gbc_labelBtn);
		
		JLabel label = new JLabel("HINTS:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 13;
		gbc_label.gridy = 1;
		contentPane.add(label, gbc_label);
		
		value1 = new JTextField();
		value1.setForeground(Color.BLACK);
		GridBagConstraints gbc_valor1 = new GridBagConstraints();
		gbc_valor1.insets = new Insets(0, 0, 5, 5);
		gbc_valor1.fill = GridBagConstraints.HORIZONTAL;
		gbc_valor1.gridx = 1;
		gbc_valor1.gridy = 4;
		contentPane.add(value1, gbc_valor1);
		value1.setColumns(10);
		
		JTextArea resultadoTextArea = new JTextArea();
		resultadoTextArea.setLineWrap(true);
		resultadoTextArea.setEditable(false);
		GridBagConstraints gbc_resultadoTextArea = new GridBagConstraints();
		gbc_resultadoTextArea.gridwidth = 10;
		gbc_resultadoTextArea.gridheight = 8;
		gbc_resultadoTextArea.fill = GridBagConstraints.BOTH;
		gbc_resultadoTextArea.gridx = 9;
		gbc_resultadoTextArea.gridy = 4;
		contentPane.add(resultadoTextArea, gbc_resultadoTextArea);
		
		value2 = new JTextField();
		GridBagConstraints gbc_valor2 = new GridBagConstraints();
		gbc_valor2.insets = new Insets(0, 0, 5, 5);
		gbc_valor2.fill = GridBagConstraints.HORIZONTAL;
		gbc_valor2.gridx = 1;
		gbc_valor2.gridy = 5;
		contentPane.add(value2, gbc_valor2);
		value2.setColumns(10);
		
		value3 = new JTextField();
		GridBagConstraints gbc_valor3 = new GridBagConstraints();
		gbc_valor3.insets = new Insets(0, 0, 5, 5);
		gbc_valor3.fill = GridBagConstraints.HORIZONTAL;
		gbc_valor3.gridx = 1;
		gbc_valor3.gridy = 6;
		contentPane.add(value3, gbc_valor3);
		value3.setColumns(10);
		
		JButton btnOk = new JButton("ok");
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.insets = new Insets(0, 0, 5, 5);
		gbc_btnOk.gridx = 1;
		gbc_btnOk.gridy = 7;
		contentPane.add(btnOk, gbc_btnOk);
		
		JButton btnReset = new JButton("Reset");
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.insets = new Insets(0, 0, 5, 5);
		gbc_btnReset.gridx = 1;
		gbc_btnReset.gridy = 8;
		contentPane.add(btnReset, gbc_btnReset);
	}

}
