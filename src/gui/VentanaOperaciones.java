package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import java.awt.CardLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import java.awt.Frame;


public class VentanaOperaciones extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCantidadMonedas;
	double valor;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOperaciones frame = new VentanaOperaciones();
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
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setRootPaneCheckingEnabled(false);
		setType(Type.UTILITY);
		setVisible(true);
		setBounds(100, 100, 617, 438);
		contentPane = new JPanel();
		contentPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		contentPane.setBackground(Color.WHITE);
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.setFocusTraversalPolicyProvider(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		textCantidadMonedas = new JTextField();
		textCantidadMonedas.setBounds(183, 92, 240, 27);
		textCantidadMonedas.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textCantidadMonedas.setText("");
			}
		});
		contentPane.setLayout(null);
		textCantidadMonedas.setForeground(SystemColor.windowBorder);
		textCantidadMonedas.setSelectedTextColor(Color.LIGHT_GRAY);
		textCantidadMonedas.setBackground(Color.WHITE);
		textCantidadMonedas.setSelectionColor(Color.GRAY);
		textCantidadMonedas.setText("CANTIDAD DE MONEDA A CONVERTIR");
		textCantidadMonedas.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textCantidadMonedas.setAlignmentY(Component.TOP_ALIGNMENT);
		textCantidadMonedas.setBorder(null);
		contentPane.add(textCantidadMonedas);
		textCantidadMonedas.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(183, 121, 247, 2);
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(349, 160, 80, 80);
		lblNewLabel_3.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/convertidordemonedas/icons8-convertir-80.png")));
		contentPane.add(lblNewLabel_3);
		
		JLabel Title_Monedas = new JLabel("Convertidor de Monedas");
		Title_Monedas.setBounds(223, 54, 331, 27);
		Title_Monedas.setHorizontalAlignment(SwingConstants.CENTER);
		Title_Monedas.setFont(new Font("Roboto", Font.BOLD, 25));
		contentPane.add(Title_Monedas);
		
		JLabel lblNewLabel_1 = new JLabel("DE");
		lblNewLabel_1.setBounds(183, 169, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A");
		lblNewLabel_2.setBounds(535, 169, 40, 14);
		lblNewLabel_2.setForeground(SystemColor.desktop);
		contentPane.add(lblNewLabel_2);
		
		JTextArea boxResultado = new JTextArea();
		boxResultado.setBounds(182, 269, 199, 42);
		boxResultado.setFont(new Font("Roboto Black", Font.PLAIN, 20));
		boxResultado.setAutoscrolls(false);
		contentPane.add(boxResultado);
		
		JComboBox tipoDivisa_1 = new JComboBox();
		tipoDivisa_1.setBounds(182, 194, 119, 22);
		tipoDivisa_1.setBorder(null);
		tipoDivisa_1.setModel(new DefaultComboBoxModel(new String[] {"USD$", "EUR€", "MXN$", "COP$", "VESBs", "GBP£", "JPY¥", "KRW₩"}));
		tipoDivisa_1.setForeground(SystemColor.desktop);
		contentPane.add(tipoDivisa_1);
		
		JComboBox tipoDivisa_2 = new JComboBox();
		tipoDivisa_2.setBounds(456, 194, 119, 22);
		tipoDivisa_2.setBorder(null);
		tipoDivisa_2.setModel(new DefaultComboBoxModel(new String[] {"USD$", "EUR€", "MXN$", "COP$", "VESBs", "GBP£", "JPY¥", "KRW₩"}));
		contentPane.add(tipoDivisa_2);
		
		JButton btnButtonConvertir = new JButton("CONVERTIR");
		btnButtonConvertir.setBounds(182, 322, 408, 67);
		btnButtonConvertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnButtonConvertir.setBackground(new Color(0, 94, 137));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnButtonConvertir.setBackground(new Color(41,136,192));
			}
		});
		btnButtonConvertir.setVerifyInputWhenFocusTarget(false);
		btnButtonConvertir.setIgnoreRepaint(true);
		btnButtonConvertir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnButtonConvertir.setHideActionText(true);
		btnButtonConvertir.setBorderPainted(false);
		btnButtonConvertir.setFont(new Font("Roboto", Font.BOLD, 33));
		btnButtonConvertir.setBorder(null);
		btnButtonConvertir.setBackground(new Color(41, 136, 192));
		btnButtonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(textCantidadMonedas.getText());
				int divisa1 = tipoDivisa_1.getSelectedIndex();
				int divisa2 = tipoDivisa_2.getSelectedIndex();
				
				//Puente
				
				Operaciones puente = new Operaciones();
				
				puente.setValor(valor);
				puente.setDivisa1(divisa1);
				puente.setDivisa2(divisa2);
				
				//Ejecutar el metodo
				
				double resultadoFinal = puente.convertir();
				
				boxResultado.setText("");
				
				//Mostrar
				
				boxResultado.append("" + resultadoFinal);
			}
			
		});
		
		btnButtonConvertir.setForeground(new Color(255, 255, 255));
		contentPane.add(btnButtonConvertir);
		
		JLabel labelResultado = new JLabel("Resultado");
		labelResultado.setBounds(182, 244, 119, 14);
		contentPane.add(labelResultado);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 172, 400);
		lblNewLabel_4.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/convertidordemonedas/city.png")));
		contentPane.add(lblNewLabel_4);
		
		
	}
}
