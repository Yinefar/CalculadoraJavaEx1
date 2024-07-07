package calculatorAesthetic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class HiCalculator extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtS;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnC;
	private JButton btnDiv;
	private JButton btnMult;
	private JButton btnCero;
	private JButton btnPunt;
	private JButton btnEq;
	private JButton btnMas;
	private JButton btnMen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HiCalculator frame = new HiCalculator();
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
	public HiCalculator() {
		setBackground(new Color(0, 128, 128));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kanch\\Downloads\\calICon.png"));
		setForeground(Color.BLACK);
		setTitle("Aesthetic Calculator ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("HiDev");
			lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 11));
			lblNewLabel.setBounds(146, 0, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtS = 	new JTextField();
			txtS.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
			txtS.setBackground(new Color(248, 248, 255));
			txtS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					
					
				}
			});
			txtS.setBounds(23, 38, 285, 43);
			contentPane.add(txtS);
			txtS.setColumns(10);
		}
		{
			btn1 = new JButton("1");
			btn1.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn1.setIcon(null);
			btn1.setBackground(new Color(216, 191, 216));
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn1.setBounds(23, 317, 60, 43);
			contentPane.add(btn1);
		}
		{
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn2.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn2.setBackground(new Color(216, 191, 216));
			btn2.setBounds(93, 317, 60, 43);
			contentPane.add(btn2);
		}
		{
			btn3 = new JButton("3");
			btn3.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn3.setBackground(new Color(216, 191, 216));
			btn3.setBounds(163, 317, 60, 43);
			contentPane.add(btn3);
		}
		{
			btn4 = new JButton("4");
			btn4.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn4.setBackground(new Color(216, 191, 216));
			btn4.setBounds(23, 253, 60, 43);
			contentPane.add(btn4);
		}
		{
			btn5 = new JButton("5");
			btn5.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn5.setBackground(new Color(216, 191, 216));
			btn5.setBounds(93, 253, 60, 43);
			contentPane.add(btn5);
		}
		{
			btn6 = new JButton("6");
			btn6.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn6.setBackground(new Color(216, 191, 216));
			btn6.setBounds(163, 253, 60, 43);
			contentPane.add(btn6);
		}
		{
			btn7 = new JButton("7");
			btn7.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn7.setBackground(new Color(216, 191, 216));
			btn7.setBounds(23, 189, 60, 43);
			contentPane.add(btn7);
		}
		{
			btn8 = new JButton("8");
			btn8.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn8.setBackground(new Color(216, 191, 216));
			btn8.setBounds(93, 189, 60, 43);
			contentPane.add(btn8);
		}
		{
			btn9 = new JButton("9");
			btn9.setFont(new Font("Ravie", Font.PLAIN, 12));
			btn9.setBackground(new Color(216, 191, 216));
			btn9.setBounds(163, 189, 60, 43);
			contentPane.add(btn9);
		}
		{
			btnC = new JButton("C");
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				
				}
			});
			btnC.setFont(new Font("Ravie", Font.BOLD, 12));
			btnC.setBackground(new Color(175, 238, 238));
			btnC.setBounds(23, 124, 60, 43);
			contentPane.add(btnC);
		}
		{
			btnDiv = new JButton("/");
			btnDiv.setFont(new Font("Ravie", Font.BOLD, 12));
			btnDiv.setBackground(new Color(175, 238, 238));
			btnDiv.setBounds(93, 124, 60, 43);
			contentPane.add(btnDiv);
		}
		{
			btnMult = new JButton("*");
			btnMult.setFont(new Font("Ravie", Font.BOLD, 12));
			btnMult.setBackground(new Color(175, 238, 238));
			btnMult.setBounds(163, 124, 60, 43);
			contentPane.add(btnMult);
		}
		{
			btnCero = new JButton("0");
			btnCero.setFont(new Font("Ravie", Font.PLAIN, 12));
			btnCero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnCero.setBackground(new Color(216, 191, 216));
			btnCero.setBounds(23, 384, 134, 43);
			contentPane.add(btnCero);
		}
		{
			btnPunt = new JButton(".");
			btnPunt.setBackground(new Color(175, 238, 238));
			btnPunt.setBounds(163, 384, 60, 43);
			contentPane.add(btnPunt);
		}
		{
			btnEq = new JButton("=");
			btnEq.setFont(new Font("Ravie", Font.BOLD, 12));
			btnEq.setBackground(new Color(230, 230, 250));
			btnEq.setBounds(248, 317, 60, 110);
			contentPane.add(btnEq);
		}
		{
			btnMas = new JButton("+");
			btnMas.setFont(new Font("Ravie", Font.BOLD, 12));
			btnMas.setBackground(new Color(230, 230, 250));
			btnMas.setBounds(248, 189, 60, 107);
			contentPane.add(btnMas);
		}
		{
			btnMen = new JButton("-");
			btnMen.setFont(new Font("Ravie", Font.BOLD, 12));
			btnMen.setBackground(new Color(230, 230, 250));
			btnMen.setBounds(248, 124, 60, 43);
			contentPane.add(btnMen);
		}
	}
}
