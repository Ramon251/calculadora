package calculadora_;

public class calc {
	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class Calculadora extends JFrame {
		
		

		private JPanel contentPane;
		private JTextField textField;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Calculadora frame = new Calculadora();
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
		public Calculadora() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 295, 301);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(10, 11, 252, 37);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JButton button = new JButton("1");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button.setBounds(10, 59, 56, 40);
			contentPane.add(button);
			
			JButton button_1 = new JButton("2");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_1.setBounds(76, 59, 58, 40);
			contentPane.add(button_1);
			
			JButton button_2 = new JButton("3");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_2.setBounds(144, 59, 56, 40);
			contentPane.add(button_2);
			
			JButton button_3 = new JButton("4");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_3.setBounds(10, 110, 56, 40);
			contentPane.add(button_3);
			
			JButton button_4 = new JButton("5");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_4.setBounds(76, 110, 58, 40);
			contentPane.add(button_4);
			
			JButton button_5 = new JButton("6");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_5.setBounds(144, 110, 56, 40);
			contentPane.add(button_5);
			
			JButton button_6 = new JButton("7");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_6.setBounds(10, 161, 56, 40);
			contentPane.add(button_6);
			
			JButton button_7 = new JButton("8");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_7.setBounds(76, 161, 58, 40);
			contentPane.add(button_7);
			
			JButton button_8 = new JButton("9");
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_8.setBounds(144, 161, 56, 40);
			contentPane.add(button_8);
			
			JButton button_9 = new JButton("+");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_9.setBounds(206, 59, 58, 40);
			contentPane.add(button_9);
			
			JButton button_10 = new JButton("-");
			button_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_10.setBounds(206, 112, 56, 36);
			contentPane.add(button_10);
			
			JButton btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnX.setBounds(206, 161, 56, 40);
			contentPane.add(btnX);
			
			JButton button_11 = new JButton("0");
			button_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_11.setBounds(10, 212, 124, 36);
			contentPane.add(button_11);
			
			JButton button_12 = new JButton("\u00F7");
			button_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_12.setBounds(206, 212, 56, 36);
			contentPane.add(button_12);
			
			JButton button_13 = new JButton("=");
			button_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_13.setBounds(144, 212, 56, 36);
			contentPane.add(button_13);
		}
	}

}
