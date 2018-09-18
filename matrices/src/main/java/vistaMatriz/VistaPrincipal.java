package vistaMatriz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaPrincipal {

	private JFrame frmCalculadoraDeMatrices;
	private JButton btnDeterminante;
	public JFrame getFrmCalculadoraDeMatrices() {
		return frmCalculadoraDeMatrices;
	}

	public void setFrmCalculadoraDeMatrices(JFrame frmCalculadoraDeMatrices) {
		this.frmCalculadoraDeMatrices = frmCalculadoraDeMatrices;
	}

	public JButton getBtnDeterminante() {
		return btnDeterminante;
	}

	public void setBtnDeterminante(JButton btnDeterminante) {
		this.btnDeterminante = btnDeterminante;
	}

	private JTextField m11;
	private JTextField m12;
	private JTextField m13;
	private JTextField m14;
	private JTextField m21;
	private JTextField m22;
	private JTextField m23;
	private JTextField m24;
	private JTextField m31;
	private JTextField m32;
	private JTextField m33;
	private JTextField m34;
	private JTextField m41;
	private JTextField m42;
	private JTextField m43;
	private JTextField m44;
	private JTextField txtDeterminante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal window = new VistaPrincipal();
					window.frmCalculadoraDeMatrices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDeMatrices = new JFrame();
		frmCalculadoraDeMatrices.setResizable(false);
		frmCalculadoraDeMatrices.setTitle("Calculadora de Matrices");
		frmCalculadoraDeMatrices.setBounds(100, 100, 450, 250);
		frmCalculadoraDeMatrices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDeMatrices.getContentPane().setLayout(null);
		
		m11 = new JTextField();
		m11.setBounds(37, 34, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m11);
		m11.setColumns(10);
		
		m12 = new JTextField();
		m12.setBounds(133, 34, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m12);
		m12.setColumns(10);
		
		m13 = new JTextField();
		m13.setBounds(229, 34, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m13);
		m13.setColumns(10);
		
		m14 = new JTextField();
		m14.setBounds(325, 34, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m14);
		m14.setColumns(10);
		
		m21 = new JTextField();
		m21.setBounds(37, 65, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m21);
		m21.setColumns(10);
		
		m22 = new JTextField();
		m22.setBounds(133, 65, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m22);
		m22.setColumns(10);
		
		m23 = new JTextField();
		m23.setBounds(229, 65, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m23);
		m23.setColumns(10);
		
		m24 = new JTextField();
		m24.setBounds(325, 65, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m24);
		m24.setColumns(10);
		
		m31 = new JTextField();
		m31.setBounds(37, 96, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m31);
		m31.setColumns(10);
		
		m32 = new JTextField();
		m32.setBounds(133, 96, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m32);
		m32.setColumns(10);
		
		m33 = new JTextField();
		m33.setBounds(229, 96, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m33);
		m33.setColumns(10);
		
		m34 = new JTextField();
		m34.setBounds(325, 96, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m34);
		m34.setColumns(10);
		
		m41 = new JTextField();
		m41.setBounds(37, 127, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m41);
		m41.setColumns(10);
		
		m42 = new JTextField();
		m42.setBounds(133, 127, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m42);
		m42.setColumns(10);
		
		m43 = new JTextField();
		m43.setBounds(229, 127, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m43);
		m43.setColumns(10);
		
		m44 = new JTextField();
		m44.setBounds(325, 127, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(m44);
		m44.setColumns(10);
		
		btnDeterminante = new JButton("Determinante :");
		btnDeterminante.setBounds(166, 165, 149, 28);
		frmCalculadoraDeMatrices.getContentPane().add(btnDeterminante);
		
		txtDeterminante = new JTextField();
		txtDeterminante.setEnabled(true);
		txtDeterminante.setBounds(325, 166, 86, 20);
		frmCalculadoraDeMatrices.getContentPane().add(txtDeterminante);
		txtDeterminante.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mega Calculadora de Matrices");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(69, 11, 312, 14);
		frmCalculadoraDeMatrices.getContentPane().add(lblNewLabel);
	}

	public JTextField getM11() {
		return m11;
	}

	public void setM11(JTextField m11) {
		this.m11 = m11;
	}

	public JTextField getM12() {
		return m12;
	}

	public void setM12(JTextField m12) {
		this.m12 = m12;
	}

	public JTextField getM13() {
		return m13;
	}

	public void setM13(JTextField m13) {
		this.m13 = m13;
	}

	public JTextField getM14() {
		return m14;
	}

	public void setM14(JTextField m14) {
		this.m14 = m14;
	}

	public JTextField getM21() {
		return m21;
	}

	public void setM21(JTextField m21) {
		this.m21 = m21;
	}

	public JTextField getM22() {
		return m22;
	}

	public void setM22(JTextField m22) {
		this.m22 = m22;
	}

	public JTextField getM23() {
		return m23;
	}

	public void setM23(JTextField m23) {
		this.m23 = m23;
	}

	public JTextField getM24() {
		return m24;
	}

	public void setM24(JTextField m24) {
		this.m24 = m24;
	}

	public JTextField getM31() {
		return m31;
	}

	public void setM31(JTextField m31) {
		this.m31 = m31;
	}

	public JTextField getM32() {
		return m32;
	}

	public void setM32(JTextField m32) {
		this.m32 = m32;
	}

	public JTextField getM33() {
		return m33;
	}

	public void setM33(JTextField m33) {
		this.m33 = m33;
	}

	public JTextField getM34() {
		return m34;
	}

	public void setM34(JTextField m34) {
		this.m34 = m34;
	}

	public JTextField getM41() {
		return m41;
	}

	public void setM41(JTextField m41) {
		this.m41 = m41;
	}

	public JTextField getM42() {
		return m42;
	}

	public void setM42(JTextField m42) {
		this.m42 = m42;
	}

	public JTextField getM43() {
		return m43;
	}

	public void setM43(JTextField m43) {
		this.m43 = m43;
	}

	public JTextField getM44() {
		return m44;
	}

	public void setM44(JTextField m44) {
		this.m44 = m44;
	}

	public JTextField getTxtDeterminante() {
		return txtDeterminante;
	}

	public void setTxtDeterminante(JTextField txtDeterminante) {
		this.txtDeterminante = txtDeterminante;
	}
}
