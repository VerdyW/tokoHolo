package tokoHOLO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener, MouseListener {

	Vector<User> users = new Vector<>();
	
	private JPanel contentPane;
	private JPasswordField passwordInput;
	private JTextField usernameInput;
	private JLabel lblNewLabel_2;
	private JButton loginBtn = new JButton("LOGIN");
	
	public User getOneUser(String username, String password) {
		User user = null;
		ResultSet rs = Connect.getConnection().executeQuery(
				
						"SELECT * FROM clerk WHERE username= '" + username + "' AND password = '" + password + "' "
				);
			try {
				while (rs.next()) {
					user = new User(rs.getString("clerkID"), rs.getString("clerkName"), rs.getString("username"), rs.getString("password"), rs.getString("userRole"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			users.add(user);
			return user;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		passwordInput = new JPasswordField();
		passwordInput.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		usernameInput = new JTextField();
		usernameInput.setFont(new Font("Tahoma", Font.PLAIN, 30));
		usernameInput.setColumns(10);
		
		lblNewLabel_2 = new JLabel("TEST");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 50));
		
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 40));
		loginBtn.addMouseListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(104)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addContainerGap(745, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
									.addGap(639))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(usernameInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
										.addComponent(passwordInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
									.addGap(22)))
							.addGap(85))))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(357)
					.addComponent(loginBtn, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
					.addGap(353))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(357)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
					.addGap(350))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(usernameInput, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(31)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(passwordInput, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(58)
					.addComponent(loginBtn, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
					.addGap(38))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		
		if (e.getSource() == loginBtn) {
			String username = usernameInput.getText();
			String password = passwordInput.getText();
			
			User user = getOneUser(username, password);
			if (user == null) {
				JOptionPane.showMessageDialog(this, "Wrong credentials" , "Error", JOptionPane.ERROR_MESSAGE );
			} else {
				JOptionPane.showMessageDialog(this, "Welcome " + user.getUsername() + "!");
				
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
