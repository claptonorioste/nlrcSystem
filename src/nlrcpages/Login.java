package nlrcpages;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dbquery.DBConnection;
import dbquery.DBQuery;
import design.RoundTextField;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Window.Type;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label_1;
	private JLabel lblLogin;
	private JPasswordField passwordField;
	private static String accountID;

	public static String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Login() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' h:mm a");
		Date date = new Date(System.currentTimeMillis());
		DBConnection.dbConnector();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("NLRC MANAGEMENT SYSTEM");
	
		pack();
		setBounds(100, 100, 524, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(27, 37, 46));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(32, 0, 91, 93);
		Image img = new ImageIcon(this.getClass().getResource("/logoS.png")).getImage();
		setIconImage(img);
		label.setIcon(new ImageIcon(img));
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(240, 248, 255));
		
		textField = new JTextField(){
			@Override protected void paintComponent(Graphics g) {
			    if (!isOpaque() && getBorder() instanceof RoundTextField) {
			      Graphics2D g2 = (Graphics2D) g.create();
			      g2.setPaint(getBackground());
			      g2.fill(((RoundTextField) getBorder()).getBorderShape(
			          0, 0, getWidth() - 1, getHeight() - 1,getHeight() - 1));
			     
			      
			      g2.dispose();
			    }
			   
			    super.paintComponent(g);
			  }
			  @Override public void updateUI() {
			    super.updateUI();
			    setOpaque(false);
			  
			    
			    setBorder(new RoundTextField(24));
			  }
		};
		textField.setColumns(10);
		
		label_1 = new JLabel("Password:");
		label_1.setForeground(new Color(240, 248, 255));
		
		JPanel panel = new JPanel(){
			@Override protected void paintComponent(Graphics g) {
			    if (!isOpaque() && getBorder() instanceof RoundTextField) {
			      Graphics2D g2 = (Graphics2D) g.create();
			      g2.setPaint(getBackground());
			      g2.fill(((RoundTextField) getBorder()).getBorderShape(
			          0, 0, getWidth() - 1, getHeight() - 1,getHeight() - 1));
			      
			      g2.dispose();
			    }
			   
			    super.paintComponent(g);
			  }
			  @Override public void updateUI() {
			    super.updateUI();
			    setOpaque(false);
			  
			    
			    setBorder(new RoundTextField(28));
			  }
		};
		panel.setBackground(Color.decode("#5cb85c"));
		
		passwordField = new JPasswordField(){
			@Override protected void paintComponent(Graphics g) {
			    if (!isOpaque() && getBorder() instanceof RoundTextField) {
			      Graphics2D g2 = (Graphics2D) g.create();
			      g2.setPaint(getBackground());
			      g2.fill(((RoundTextField) getBorder()).getBorderShape(
			          0, 0, getWidth() - 1, getHeight() - 1,getHeight() - 1));
			     
			      g2.dispose();
			    }
			   
			    super.paintComponent(g);
			  }
			  @Override public void updateUI() {
			    super.updateUI();
			    setOpaque(false);
			  
			    
			    setBorder(new RoundTextField(24));
			  }
		};;
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(110)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
						.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
					.addGap(110))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(200)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 195, Short.MAX_VALUE)
					.addGap(203))
				.addComponent(label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
					.addGap(1)
					.addComponent(lblUsername)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(78))
		);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(240, 248, 255));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblLogin, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
					.addGap(0))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(0)
					.addComponent(lblLogin, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addGap(0))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		panel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ResultSet rs = DBQuery.getLogin(textField.getText(), passwordField.getText());
				try {
					if("".equals(textField.getText()) || "".equals(passwordField.getText())) {
						JOptionPane.showMessageDialog(null, "Please Input Username or Password!");
					}else {
						if(rs.next()) {
							if("admin".equals(rs.getString("userType"))) {
								setAccountID(rs.getString("EID"));
								DBQuery.insertLoggin(formatter.format(date).toString(), rs.getString("name")+" "+rs.getString("surename"));
							
								MainPage a = new MainPage();
								setVisible(false);
								a.pack();
								a.setVisible(true);
								a.setLocationRelativeTo(null);
								a.setResizable(false);
								a.setExtendedState(JFrame.MAXIMIZED_BOTH);
								
								
								
							}else {
								setAccountID(rs.getString("EID"));
								DBQuery.insertLoggin(formatter.format(date).toString(), rs.getString("name")+" "+rs.getString("surename"));
								
								EditorFrame b = new EditorFrame();
								setVisible(false);
								b.pack();
								b.setVisible(true);
								b.setLocationRelativeTo(null);
								b.setResizable(false);
								b.setExtendedState(JFrame.MAXIMIZED_BOTH);
								
								
							}
							
						}
						else {
							JOptionPane.showMessageDialog(null, "Username or Password Doesn't Match!");
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel.setBackground(Color.decode("#449d44"));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				panel.setBackground(Color.decode("#5cb85c"));
			}
		});
	}
}
