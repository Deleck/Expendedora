import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;

public class Window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1361, 686);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Window.class.getResource("/resources/agua.png")));
		lblNewLabel.setBounds(30, 10, 150, 243);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Window.class.getResource("/resources/coca.png")));
		lblNewLabel_1.setBounds(30, 263, 150, 150);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Window.class.getResource("/resources/fanta.png")));
		lblNewLabel_2.setBounds(30, 431, 150, 184);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AGUA");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3.setBounds(231, 48, 161, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("COCA COLA");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(231, 283, 161, 32);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("FANTA");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(231, 444, 161, 32);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("PRECIO: $1");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4.setBounds(231, 90, 101, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("PRECIO: $1.50");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(231, 332, 127, 23);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("PRECIO: $1.50");
		lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(231, 486, 150, 23);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(21, 423, 371, 216);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnFanta = new JButton("A3");
		btnFanta.setBounds(205, 99, 85, 21);
		panel.add(btnFanta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(21, 263, 371, 150);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCoca = new JButton("A2");
		btnCoca.setBounds(207, 105, 85, 21);
		panel_1.add(btnCoca);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.CYAN);
		panel_1_1.setBounds(21, 0, 371, 259);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnAgua = new JButton("A1");
		btnAgua.setBounds(209, 129, 85, 21);
		panel_1_1.add(btnAgua);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Window.class.getResource("/resources/lipton.png")));
		lblNewLabel_5.setBounds(413, 10, 150, 150);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Window.class.getResource("/resources/monster.png")));
		lblNewLabel_6.setBounds(413, 175, 150, 150);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(Window.class.getResource("/resources/sprite.png")));
		lblNewLabel_7.setBounds(412, 338, 150, 150);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("LIPTON");
		lblNewLabel_3_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3_1_2.setBounds(585, 27, 161, 32);
		frame.getContentPane().add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("PRECIO: $1.50");
		lblNewLabel_4_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(585, 76, 127, 23);
		frame.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("MONSTER");
		lblNewLabel_3_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3_1_3.setBounds(585, 192, 161, 32);
		frame.getContentPane().add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("PRECIO: $2");
		lblNewLabel_4_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_1_2.setBounds(585, 241, 127, 23);
		frame.getContentPane().add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("SPRITE");
		lblNewLabel_3_1_4.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3_1_4.setBounds(585, 352, 161, 32);
		frame.getContentPane().add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("PRECIO: $1.50");
		lblNewLabel_4_1_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_1_3.setBounds(585, 401, 127, 23);
		frame.getContentPane().add(lblNewLabel_4_1_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(50, 205, 50));
		panel_2.setBounds(402, 332, 371, 162);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnSprite = new JButton("A6");
		btnSprite.setBounds(181, 108, 85, 21);
		panel_2.add(btnSprite);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(402, 170, 371, 155);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnMonster = new JButton("A5");
		btnMonster.setBounds(182, 107, 85, 21);
		panel_3.add(btnMonster);
		btnMonster.setAlignmentY(Component.TOP_ALIGNMENT);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(0, 128, 0));
		panel_3_1.setBounds(402, 3, 371, 162);
		frame.getContentPane().add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JButton btnLipton = new JButton("A4");
		btnLipton.setBounds(185, 114, 85, 21);
		panel_3_1.add(btnLipton);
		
		JLabel lblNewLabel_8 = new JLabel("MAQUINA EXPENDEDORA");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_8.setBounds(413, 529, 360, 42);
		frame.getContentPane().add(lblNewLabel_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(822, 27, 515, 598);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblDinero = new JLabel("$0");
		lblDinero.setOpaque(true);
		lblDinero.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDinero.setBackground(Color.BLACK);
		lblDinero.setForeground(new Color(0, 255, 0));
		lblDinero.setHorizontalAlignment(SwingConstants.CENTER);
		lblDinero.setFont(new Font("Arial", Font.BOLD, 35));
		lblDinero.setBounds(63, 68, 408, 92);
		panel_4.add(lblDinero);
		
		JButton btnAgregarDinero = new JButton("Agregar Dinero");
		btnAgregarDinero.setBounds(160, 24, 224, 33);
		panel_4.add(btnAgregarDinero);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(63, 184, 408, 302);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(101, 10, 60, 60);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1.setBounds(171, 10, 60, 60);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2.setBounds(243, 10, 60, 60);
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(243, 80, 60, 60);
		panel_5.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(171, 80, 60, 60);
		panel_5.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_3.setBounds(101, 80, 60, 60);
		panel_5.add(btnNewButton_3);
		
		JButton btnNewButton_2_2 = new JButton("9");
		btnNewButton_2_2.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_2.setBounds(243, 150, 60, 60);
		panel_5.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(171, 150, 60, 60);
		panel_5.add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_4.setBounds(101, 150, 60, 60);
		panel_5.add(btnNewButton_4);
		
		JButton btnNewButton_2_3 = new JButton("X");
		btnNewButton_2_3.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_3.setBounds(243, 220, 60, 60);
		panel_5.add(btnNewButton_2_3);
		
		JButton btnNewButton_1_3 = new JButton("0");
		btnNewButton_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(171, 220, 60, 60);
		panel_5.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_9 = new JLabel("Su cambio:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(160, 523, 118, 42);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("$0");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9_1.setBounds(280, 523, 118, 42);
		panel_4.add(lblNewLabel_9_1);
	}

}
