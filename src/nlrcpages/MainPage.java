package nlrcpages;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.sql.Connection;


import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.Connection;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import dbquery.DBConnection;
import dbquery.DBQuery;
import design.RoundTextField;
import net.proteanit.sql.DbUtils;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JLayeredPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import design.TableColorRender;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;


public class MainPage extends JFrame {
	
	private int col;
    private int rowz, manage=0;
    private String caseView = "",caseNum="",dapDate="",ofw_type="";
    private String caseViewT = "";
    private String accountNo = "";
    private int activeHome = 1,activeUser=0,activeManage=0,activeLogin=0,activeSettings=0, edit = 0,editAcc=0;
	
	private JPanel contentPane;
	Connection connection = null;
	private JTable dataTable;
	JPanel layeredPane;
	private JTextField textField;
	//globalize buttons
	JPanel btnHome;
	JPanel btnUser;
	JPanel btnManage;
	JPanel btnLogin;
	JTextPane printTMonth; 
	
	//btn logo containers
	JPanel panel_3;
	JPanel panel_2;
	JPanel buttonlogo1;
	JPanel buttonlogo2;
	
	int click =0;
	private JTextField tfCnum;
	private JTextField induCode;
	private JTextField natureOfC;
	private JTextField natureofA;
	private JTextField ammOfAward;
	private JTextField appealFee;
	private JTextField bondFee;
	private JTextField titleTF;
	private JTextField courierAir;
	private JTextField LA;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JComboBox appealfeeM;
	private JComboBox appealfeeD;
	private JComboBox appealfeeY;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private JComboBox comboBox;
	
	private JComboBox OECCMonth;
	private JComboBox OECCDay;
	private JComboBox OECCYear;
	
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox rab_num;
	private JComboBox comboBox_5;

	String ctype ="";
	Timer timer;
	String monthList[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
	String currency[] = {"PHP ₱","US $","AUD $","NZ $","HK $","SG $","CAN $","JAP ¥","EURO €","KOR ₩","SAR","BRIT £"};
	private JTable table_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField respon;
	private JTextField appealOr;
	private JTextField BondAmount;
	private JTextField bondDate;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField tfPonente;
	private JTextField mrFiled1;
	private JTextField mrFiled2;
	private JTextArea reamarkTf;
	private JComboBox nlrcM;
	private JComboBox nlrcD;
	private JComboBox nlrcY;
	private JComboBox dateAppPonenteM;	
	private JComboBox dateAppPoneneteD;
	private JComboBox dateAppPoneneteY;
	private JComboBox ponenteDM;
	private JComboBox ponenteDD;
	private JComboBox ponenteDY;
	private JComboBox entryJM;
	private JComboBox entryJD;	
	private JComboBox entryJY ;
	private JComboBox dateMRM1;
	private JComboBox dateMRD1;
	private JComboBox dateMRY1;
	private JComboBox dEntryJID;
	private JComboBox dEntryJIM;
	private JComboBox dEntryJIY;
	private JComboBox dAppealRM;
	private JComboBox dMailM;
		
	private JComboBox dMailD;
		
	private JComboBox dMailY;
		
	private JComboBox dAppealRD;
		
	private JComboBox dAppealRY;
	
	private JComboBox dateRemandedM ;
	private JComboBox dateRemandedD; 
	private JComboBox dateRemandedY;
	
	private JComboBox bondDD;
	private JComboBox bondDM;
	private JComboBox bondDY;
	
	private JComboBox rabDM;
		
	private JComboBox rabDD;
		
	private JComboBox rabDY;
		
	private JComboBox dPromY;
		
	private JComboBox dPromD;
		
	private JComboBox dProM;
	private JComboBox bndm;
	private JComboBox bndd;
	private JComboBox bndy;
	private JComboBox dateMRM2;
	private JComboBox dateMRD2;
	private JComboBox dateMRY2;
	private JComboBox ammCurrency;
	private JComboBox comboBox_6;
	private JComboBox ofw;
	private JScrollPane scrollPane_3;
	private JComboBox appelant;
	private JTextArea other;
	private JTextArea taDecisiononApp;
	private JTextArea decisionMR1;
	private JTextArea decisionMR2;
	private JComboBox comboBox_4;

	/**
	 * Create the frame.
	 */
	
	
	public MainPage() {
		
		connection = DBConnection.dbConnector();
		setUndecorated(true);
		
	
		getContentPane().setBackground(Color.decode("#1b252e"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		setBounds(100, 100, 1312, 1370);
		
		 
		  
		JPanel companyLabel = new JPanel();
		companyLabel.setBackground(Color.decode("#25313e"));

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(Color.decode("#41586e"));

		Border blackline = BorderFactory.createLineBorder(Color.black);

		JPanel dataPanel = new JPanel();
		dataPanel.setBackground(Color.BLACK);

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(dataPanel, GroupLayout.PREFERRED_SIZE, 744, Short.MAX_VALUE))
				.addComponent(companyLabel, GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(companyLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(sidePanel, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(dataPanel, GroupLayout.PREFERRED_SIZE, 569, Short.MAX_VALUE)))
					.addGap(2))
		);
			
		;
		
			 
			 dataPanel.setLayout(new CardLayout(0, 0));
 
			 layeredPane = new JPanel();
			 dataPanel.add(layeredPane, "name_64430120782704");
			 layeredPane.setLayout(new CardLayout(0, 0));
 		
			 JPanel home = new JPanel();
			 home.setBackground(Color.decode("#1b252e"));
			 layeredPane.add(home, "name_64533364253644");
 		
 				JScrollPane scrollPane = new JScrollPane();
 				scrollPane.getVerticalScrollBar().setBackground(Color.black);
 			    scrollPane.getHorizontalScrollBar().setBackground(Color.black);
 			
 			  
 			  
 				
 				

 				dataTable = new JTable() {
 				    @Override
 				    public boolean isCellEditable(int row, int column) {
 				        // This is how we disable editing:
 				        return false;
 				    }
 				   public boolean getScrollableTracksViewportWidth()
 		            {
 		                return getPreferredSize().width < getParent().getWidth();
 		            }
 				   public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
				        Component returnComp = super.prepareRenderer(renderer, row, column);
				        
				        Color mac = Color.decode("#005662");
				        Color mer = Color.decode("#1565c0");
				        Color mac_ofw = Color.decode("#1b5e20");
				        Color cc = Color.decode("#d32f2f");
				        Color whiteColor = Color.decode("#32455c");
				        if (!returnComp.getBackground().equals(getSelectionBackground())){
				        	int modelRow = convertRowIndexToModel(row);
				        	ctype = getModel().getValueAt(modelRow, 3).toString();
				            Color bg = (ctype.equals("MAC No.") ? mac : (ctype.equals("MER No.") ? mer : (ctype.equals("MAC-OFW") ? mac_ofw : (ctype.equals("CC No.") ? cc : null))));
				            returnComp .setBackground(bg);
				            returnComp.setForeground(Color.white);
				            bg = null;
				        }else if(isRowSelected(row)) {
				        	returnComp.setBackground(new Color(0,0,0,150));
				        	returnComp.setForeground(Color.white);
				        }
				        return returnComp;
				    }
 				   
	
		};
		
		dataTable.setFocusable(false);
	
		
		

	
		
		


 				    
 				   
       
 				
 				dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
 				
 				JTableHeader Theader = dataTable.getTableHeader();
 				
 				scrollPane.setViewportView(dataTable);
 				scrollPane.getViewport().setBackground(Color.decode("#1b252e"));
 				
 				DefaultTableModel tm = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryCaseTitle());
 				
 				tm.addColumn("#");
 				dataTable.setModel(tm);
 				dataTable.moveColumn(5,0);
 				

 				
 			
 				
 				JLabel lblSearch = new JLabel("Search:");
 				lblSearch.setForeground(Color.WHITE);
 				
 				textField = new JTextField() {
 					@Override protected void paintComponent(Graphics g) {
 					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
 					      Graphics2D g2 = (Graphics2D) g.create();
 					      g2.setPaint(getBackground());
 					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
 					          0, 0, getWidth() - 1, getHeight() - 1,15));
 					      
 					      g2.dispose();
 					    }
 					    super.paintComponent(g);
 					  }
 					  @Override public void updateUI() {
 					    super.updateUI();
 					    setOpaque(false);
 					  
 					    
 					    setBorder(new RoundTextField(15));
 					  }
 				};
 				textField.addKeyListener(new KeyAdapter() {
 					@Override
 					public void keyReleased(KeyEvent e) {
 							if(textField.getText().equals("")) {
 								timer.setDelay(10000);
 								timer.start();
 							}else {
 								timer.stop();
 							}

 							DefaultTableModel tm = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.querySearch(textField.getText(), textField.getText(), textField.getText()));
 			 				
 			 				tm.addColumn("#");
 			 				dataTable.setModel(tm);
 			 				dataTable.moveColumn(5,0);
 							theader();
 						  
 					}
 				});
 				textField.setBackground(Color.WHITE);;
 				textField.setColumns(10);
 				
 				JLabel lblNlrcRecord = new JLabel("  NLRC RECORD");
 				lblNlrcRecord.setFont(new Font("Arial",Font.BOLD,15));
 				lblNlrcRecord.setForeground(Color.WHITE);
 				
 				JPanel panel_19 = new JPanel();
 				panel_19.setBackground(Color.decode("#005662"));
 				
 				JPanel panel_16 = new JPanel();
 				panel_16.setBackground( Color.decode("#1565c0"));
 				
 				JLabel label_14 = new JLabel("MER");
 				label_14.setHorizontalAlignment(SwingConstants.CENTER);
 				label_14.setForeground(Color.WHITE);
 				
 				JPanel panel_18 = new JPanel();
 				panel_18.setBackground(Color.decode("#d32f2f"));
 				
 				JLabel label_16 = new JLabel("CC");
 				label_16.setHorizontalAlignment(SwingConstants.CENTER);
 				label_16.setForeground(Color.WHITE);
 				
 				JButton btnPrintCase = new JButton("PRINT CASE");
 				btnPrintCase.addActionListener(new ActionListener() {
 					public void actionPerformed(ActionEvent arg0) {
 						CardLayout cl = (CardLayout) layeredPane.getLayout();
  				        cl.show(layeredPane, "name_494275942197838");
 					}
 				});
 				GroupLayout gl_home = new GroupLayout(home);
 				gl_home.setHorizontalGroup(
 					gl_home.createParallelGroup(Alignment.LEADING)
 						.addGroup(gl_home.createSequentialGroup()
 							.addComponent(lblNlrcRecord, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
 							.addPreferredGap(ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
 							.addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
 							.addPreferredGap(ComponentPlacement.RELATED)
 							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
 							.addContainerGap())
 						.addGroup(gl_home.createSequentialGroup()
 							.addGap(3)
 							.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
 							.addGap(2)
 							.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
 							.addGap(2)
 							.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
 							.addPreferredGap(ComponentPlacement.RELATED, 612, Short.MAX_VALUE)
 							.addComponent(btnPrintCase)
 							.addContainerGap())
 						.addGroup(gl_home.createSequentialGroup()
 							.addGap(1)
 							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE))
 				);
 				gl_home.setVerticalGroup(
 					gl_home.createParallelGroup(Alignment.LEADING)
 						.addGroup(gl_home.createSequentialGroup()
 							.addGroup(gl_home.createParallelGroup(Alignment.LEADING, false)
 								.addGroup(gl_home.createSequentialGroup()
 									.addGap(8)
 									.addGroup(gl_home.createParallelGroup(Alignment.BASELINE, false)
 										.addGroup(gl_home.createSequentialGroup()
 											.addGap(3)
 											.addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
 										.addGroup(gl_home.createSequentialGroup()
 											.addGap(1)
 											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
 								.addGroup(gl_home.createSequentialGroup()
 									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 									.addComponent(lblNlrcRecord, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
 							.addPreferredGap(ComponentPlacement.RELATED)
 							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
 							.addPreferredGap(ComponentPlacement.RELATED)
 							.addGroup(gl_home.createParallelGroup(Alignment.TRAILING)
 								.addGroup(gl_home.createParallelGroup(Alignment.TRAILING, false)
 									.addComponent(panel_16, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
 									.addComponent(panel_19, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
 									.addComponent(panel_18, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
 								.addComponent(btnPrintCase))
 							.addGap(6))
 				);
 				GroupLayout gl_panel_18 = new GroupLayout(panel_18);
 				gl_panel_18.setHorizontalGroup(
 					gl_panel_18.createParallelGroup(Alignment.LEADING)
 						.addComponent(label_16, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
 				);
 				gl_panel_18.setVerticalGroup(
 					gl_panel_18.createParallelGroup(Alignment.LEADING)
 						.addComponent(label_16, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
 				);
 				panel_18.setLayout(gl_panel_18);
 				GroupLayout gl_panel_16 = new GroupLayout(panel_16);
 				gl_panel_16.setHorizontalGroup(
 					gl_panel_16.createParallelGroup(Alignment.LEADING)
 						.addComponent(label_14, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
 				);
 				gl_panel_16.setVerticalGroup(
 					gl_panel_16.createParallelGroup(Alignment.TRAILING)
 						.addGroup(Alignment.LEADING, gl_panel_16.createSequentialGroup()
 							.addGap(1)
 							.addComponent(label_14, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
 							.addGap(0))
 				);
 				panel_16.setLayout(gl_panel_16);
 				
 				JLabel lblMac = new JLabel("MAC");
 				lblMac.setHorizontalAlignment(SwingConstants.CENTER);
 				lblMac.setForeground(Color.WHITE);
 				GroupLayout gl_panel_19 = new GroupLayout(panel_19);
 				gl_panel_19.setHorizontalGroup(
 					gl_panel_19.createParallelGroup(Alignment.LEADING)
 						.addComponent(lblMac, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
 				);
 				gl_panel_19.setVerticalGroup(
 					gl_panel_19.createParallelGroup(Alignment.LEADING)
 						.addGroup(gl_panel_19.createSequentialGroup()
 							.addComponent(lblMac, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
 							.addGap(0))
 				);
 				panel_19.setLayout(gl_panel_19);
 				home.setLayout(gl_home);
 				dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseClicked(java.awt.event.MouseEvent evt) {
				       jTable1MouseClicked(evt);
				 }
			});
 		
 		JPanel userProfile = new JPanel();
 		userProfile.setBackground(Color.BLACK);
 		layeredPane.add(userProfile, "name_453519779875562");
 		
 		JPanel panel_68 = new JPanel();
 		panel_68.setBackground(new Color(27, 37, 46));
 		
 		JLabel label_40 = new JLabel("Name:");
 		label_40.setForeground(Color.WHITE);
 		label_40.setFont(new Font("Arial", Font.BOLD, 15));
 		GroupLayout gl_panel_68 = new GroupLayout(panel_68);
 		gl_panel_68.setHorizontalGroup(
 			gl_panel_68.createParallelGroup(Alignment.LEADING)
 				.addGroup(Alignment.TRAILING, gl_panel_68.createSequentialGroup()
 					.addContainerGap()
 					.addComponent(label_40, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
 		);
 		gl_panel_68.setVerticalGroup(
 			gl_panel_68.createParallelGroup(Alignment.TRAILING)
 				.addGroup(Alignment.LEADING, gl_panel_68.createSequentialGroup()
 					.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
 					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 		);
 		panel_68.setLayout(gl_panel_68);
 		
 		JPanel panel_71 = new JPanel();
 		panel_71.setBackground(new Color(27, 37, 46));
 		
 		JLabel lblEname = new JLabel("ename");
 		lblEname.setForeground(Color.WHITE);
 		GroupLayout gl_panel_71 = new GroupLayout(panel_71);
 		gl_panel_71.setHorizontalGroup(
 			gl_panel_71.createParallelGroup(Alignment.LEADING)
 				.addGroup(Alignment.TRAILING, gl_panel_71.createSequentialGroup()
 					.addContainerGap()
 					.addComponent(lblEname, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
 		);
 		gl_panel_71.setVerticalGroup(
 			gl_panel_71.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblEname, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
 		);
 		panel_71.setLayout(gl_panel_71);
 		
 		JPanel panel_72 = new JPanel();
 		panel_72.setBackground(new Color(27, 37, 46));
 		
 		JLabel label_44 = new JLabel("Surname");
 		label_44.setForeground(Color.WHITE);
 		label_44.setFont(new Font("Arial", Font.BOLD, 15));
 		GroupLayout gl_panel_72 = new GroupLayout(panel_72);
 		gl_panel_72.setHorizontalGroup(
 			gl_panel_72.createParallelGroup(Alignment.LEADING)
 				.addGroup(Alignment.TRAILING, gl_panel_72.createSequentialGroup()
 					.addContainerGap()
 					.addComponent(label_44, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
 		);
 		gl_panel_72.setVerticalGroup(
 			gl_panel_72.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_72.createSequentialGroup()
 					.addComponent(label_44, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
 					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 		);
 		panel_72.setLayout(gl_panel_72);
 		
 		JPanel panel_75 = new JPanel();
 		panel_75.setBackground(new Color(27, 37, 46));
 		
 		JLabel lblEsurname = new JLabel("esurname");
 		lblEsurname.setForeground(Color.WHITE);
 		GroupLayout gl_panel_75 = new GroupLayout(panel_75);
 		gl_panel_75.setHorizontalGroup(
 			gl_panel_75.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_75.createSequentialGroup()
 					.addContainerGap()
 					.addComponent(lblEsurname, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
 		);
 		gl_panel_75.setVerticalGroup(
 			gl_panel_75.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblEsurname, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
 		);
 		panel_75.setLayout(gl_panel_75);
 		
 		JPanel panel_76 = new JPanel();
 		panel_76.setBackground(new Color(27, 37, 46));
 		
 		JLabel label_48 = new JLabel("Account Type:");
 		label_48.setForeground(Color.WHITE);
 		label_48.setFont(new Font("Arial", Font.BOLD, 13));
 		GroupLayout gl_panel_76 = new GroupLayout(panel_76);
 		gl_panel_76.setHorizontalGroup(
 			gl_panel_76.createParallelGroup(Alignment.LEADING)
 				.addGroup(Alignment.TRAILING, gl_panel_76.createSequentialGroup()
 					.addContainerGap()
 					.addComponent(label_48, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
 		);
 		gl_panel_76.setVerticalGroup(
 			gl_panel_76.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_76.createSequentialGroup()
 					.addComponent(label_48, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
 					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 		);
 		panel_76.setLayout(gl_panel_76);
 		
 		JPanel panel_79 = new JPanel();
 		panel_79.setBackground(new Color(27, 37, 46));
 		
 		JLabel lblEtype = new JLabel("eType");
 		lblEtype.setForeground(Color.WHITE);
 		GroupLayout gl_panel_79 = new GroupLayout(panel_79);
 		gl_panel_79.setHorizontalGroup(
 			gl_panel_79.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_79.createSequentialGroup()
 					.addContainerGap()
 					.addComponent(lblEtype, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
 		);
 		gl_panel_79.setVerticalGroup(
 			gl_panel_79.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblEtype, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
 		);
 		panel_79.setLayout(gl_panel_79);
 		
 		JPanel panel_112 = new JPanel();
 		panel_112.setBackground(new Color(27, 37, 46));
 		
 		JLabel label_85 = new JLabel("NLRC RECORD - USER PROFILE");
 		label_85.setHorizontalAlignment(SwingConstants.CENTER);
 		label_85.setForeground(Color.WHITE);
 		label_85.setFont(new Font("Arial", Font.BOLD, 20));
 		GroupLayout gl_panel_112 = new GroupLayout(panel_112);
 		gl_panel_112.setHorizontalGroup(
 			gl_panel_112.createParallelGroup(Alignment.LEADING)
 				.addGap(0, 719, Short.MAX_VALUE)
 				.addGap(0, 719, Short.MAX_VALUE)
 				.addGroup(gl_panel_112.createSequentialGroup()
 					.addComponent(label_85, GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
 					.addGap(62))
 		);
 		gl_panel_112.setVerticalGroup(
 			gl_panel_112.createParallelGroup(Alignment.LEADING)
 				.addGap(0, 34, Short.MAX_VALUE)
 				.addGap(0, 34, Short.MAX_VALUE)
 				.addGroup(gl_panel_112.createSequentialGroup()
 					.addGap(1)
 					.addComponent(label_85, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
 					.addGap(0, 0, Short.MAX_VALUE))
 		);
 		panel_112.setLayout(gl_panel_112);
 		
 		JPanel panel_4 = new JPanel();
 		panel_4.setBackground(new Color(27, 37, 46));
 		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
 		gl_panel_4.setHorizontalGroup(
 			gl_panel_4.createParallelGroup(Alignment.LEADING)
 				.addGap(0, 354, Short.MAX_VALUE)
 				.addGap(0, 354, Short.MAX_VALUE)
 				.addGap(0, 354, Short.MAX_VALUE)
 		);
 		gl_panel_4.setVerticalGroup(
 			gl_panel_4.createParallelGroup(Alignment.LEADING)
 				.addGap(0, 29, Short.MAX_VALUE)
 				.addGap(0, 29, Short.MAX_VALUE)
 				.addGap(0, 29, Short.MAX_VALUE)
 		);
 		panel_4.setLayout(gl_panel_4);
 		
 		JPanel panel_63 = new JPanel();
 		panel_63.setBackground(new Color(27, 37, 46));
 		GroupLayout gl_panel_63 = new GroupLayout(panel_63);
 		gl_panel_63.setHorizontalGroup(
 			gl_panel_63.createParallelGroup(Alignment.LEADING)
 				.addGap(0, 354, Short.MAX_VALUE)
 				.addGap(0, 354, Short.MAX_VALUE)
 				.addGap(0, 354, Short.MAX_VALUE)
 		);
 		gl_panel_63.setVerticalGroup(
 			gl_panel_63.createParallelGroup(Alignment.LEADING)
 				.addGap(0, 29, Short.MAX_VALUE)
 				.addGap(0, 29, Short.MAX_VALUE)
 				.addGap(0, 29, Short.MAX_VALUE)
 		);
 		panel_63.setLayout(gl_panel_63);
 		
 		JPanel panel_64 = new JPanel();
 		panel_64.setBackground(new Color(27, 37, 46));
 		
 		JPanel panel_66 = new JPanel(){
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
			  
			    
			    setBorder(new RoundTextField(29));
			  }
		};
 		panel_66.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent arg0) {
 				//account manage
 				editAcc = 1;	
 				 try {
 					ResultSet rs = DBQuery.getEmployee(Login.getAccountID());
 					while(rs.next()) {
 						textField_3.setText(rs.getString("name"));
 						textField_4.setText(rs.getString("surename"));
 						textField_5.setText(rs.getString("username"));
 						textField_6.setText(rs.getString("password"));
 					  }
 			      	} catch (SQLException e1) {
 					
 					e1.printStackTrace();
 			      	}
 				CardLayout cl = (CardLayout) layeredPane.getLayout();
				cl.show(layeredPane, "name_712085930183766"); 
 			}
 			@Override
 			public void mouseEntered(MouseEvent arg0) {
 				panel_66.setBackground(Color.decode("#449d44"));
 			}
 			@Override
 			public void mouseExited(MouseEvent arg0) {
 				panel_66.setBackground(Color.decode("#5cb85c"));
 			}
 		});
		
 		panel_66.setBackground(Color.decode("#5cb85c"));
 		
 		JLabel lblEdit_1 = new JLabel("Manage Profile");
 		lblEdit_1.setForeground(Color.WHITE);
 		lblEdit_1.setHorizontalAlignment(SwingConstants.CENTER);
 		GroupLayout gl_panel_66 = new GroupLayout(panel_66);
 		gl_panel_66.setHorizontalGroup(
 			gl_panel_66.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblEdit_1, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
 		);
 		gl_panel_66.setVerticalGroup(
 			gl_panel_66.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblEdit_1, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
 		);
 		panel_66.setLayout(gl_panel_66);
 		GroupLayout gl_panel_64 = new GroupLayout(panel_64);
 		gl_panel_64.setHorizontalGroup(
 			gl_panel_64.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_64.createSequentialGroup()
 					.addGap(300)
 					.addComponent(panel_66, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
 					.addGap(300))
 		);
 		gl_panel_64.setVerticalGroup(
 			gl_panel_64.createParallelGroup(Alignment.LEADING)
 				.addComponent(panel_66, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
 		);
 		panel_64.setLayout(gl_panel_64);
 		
 		JPanel panel_65 = new JPanel();
 		panel_65.setBackground(new Color(27, 37, 46));
 		GroupLayout gl_panel_65 = new GroupLayout(panel_65);
 		gl_panel_65.setHorizontalGroup(
 			gl_panel_65.createParallelGroup(Alignment.LEADING)
 				.addGap(0, 354, Short.MAX_VALUE)
 				.addGap(0, 354, Short.MAX_VALUE)
 				.addGap(0, 354, Short.MAX_VALUE)
 		);
 		gl_panel_65.setVerticalGroup(
 			gl_panel_65.createParallelGroup(Alignment.LEADING)
 				.addGap(0, 29, Short.MAX_VALUE)
 				.addGap(0, 29, Short.MAX_VALUE)
 				.addGap(0, 29, Short.MAX_VALUE)
 		);
 		panel_65.setLayout(gl_panel_65);
 		GroupLayout gl_userProfile = new GroupLayout(userProfile);
 		gl_userProfile.setHorizontalGroup(
 			gl_userProfile.createParallelGroup(Alignment.TRAILING)
 				.addGroup(gl_userProfile.createSequentialGroup()
 					.addGroup(gl_userProfile.createParallelGroup(Alignment.LEADING)
 						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
 						.addComponent(panel_65, GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
 						.addComponent(panel_112, GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
 						.addGroup(gl_userProfile.createSequentialGroup()
 							.addGap(1)
 							.addGroup(gl_userProfile.createParallelGroup(Alignment.LEADING)
 								.addComponent(panel_63, GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
 								.addComponent(panel_64, GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)))
 						.addGroup(gl_userProfile.createSequentialGroup()
 							.addGap(1)
 							.addGroup(gl_userProfile.createParallelGroup(Alignment.TRAILING)
 								.addComponent(panel_76, 0, 0, Short.MAX_VALUE)
 								.addComponent(panel_72, 0, 0, Short.MAX_VALUE)
 								.addComponent(panel_68, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
 							.addGap(1)
 							.addGroup(gl_userProfile.createParallelGroup(Alignment.TRAILING)
 								.addComponent(panel_71, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
 								.addComponent(panel_75, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
 								.addComponent(panel_79, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))))
 					.addGap(1))
 		);
 		gl_userProfile.setVerticalGroup(
 			gl_userProfile.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_userProfile.createSequentialGroup()
 					.addComponent(panel_112, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
 					.addGap(1)
 					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
 					.addGap(1)
 					.addGroup(gl_userProfile.createParallelGroup(Alignment.LEADING, false)
 						.addComponent(panel_71, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 						.addComponent(panel_68, GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
 					.addGap(1)
 					.addGroup(gl_userProfile.createParallelGroup(Alignment.LEADING, false)
 						.addComponent(panel_72, 0, 0, Short.MAX_VALUE)
 						.addComponent(panel_75, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
 					.addGap(1)
 					.addGroup(gl_userProfile.createParallelGroup(Alignment.LEADING, false)
 						.addComponent(panel_76, 0, 0, Short.MAX_VALUE)
 						.addComponent(panel_79, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
 					.addGap(1)
 					.addComponent(panel_63, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
 					.addGap(1)
 					.addComponent(panel_64, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
 					.addGap(1)
 					.addComponent(panel_65, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
 					.addGap(1))
 		);
 		userProfile.setLayout(gl_userProfile);
 		
 		JPanel manageAcc = new JPanel();
 		manageAcc.setBackground(Color.decode("#1b252e"));
 		layeredPane.add(manageAcc, "name_64547508311534");
 		
 		JPanel panel_73 = new JPanel();
 		
 		JLabel label_36 = new JLabel("Search:");
 		label_36.setForeground(Color.WHITE);
 		
 		textField_1 = new JTextField(){
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
 		textField_1.addKeyListener(new KeyAdapter() {
 			@Override
 			public void keyReleased(KeyEvent arg0) {
 				DefaultTableModel tm1 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.querySearchEmployee(textField_1.getText(), textField_1.getText()));
 				tm1.addColumn("#");
 				table_1.setModel(tm1);
 				table_1.moveColumn(4,0);
 				theader();
				  
 			}
 		});
 		
 		textField_1.setColumns(10);
 		
 		JLabel label_34 = new JLabel("  NLRC - ACCOUNT MANAGEMENT");
 		label_34.setForeground(Color.WHITE);
 		label_34.setFont(new Font("Arial", Font.BOLD, 15));
 		
 		JPanel panel_60 = new JPanel(){
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
			  
			    
			    setBorder(new RoundTextField(21));
			  }
		};
 		panel_60.setForeground(Color.WHITE);
 		panel_60.setBackground(Color.decode("#5cb85c"));
		panel_60.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent arg0) {
 				editAcc = 0;
 				textField_3.setText("");
 				textField_4.setText("");
 				textField_5.setText("");
 				textField_6.setText("");
 				
 				CardLayout cl = (CardLayout) layeredPane.getLayout();
				cl.show(layeredPane, "name_712085930183766"); 
 				
 			}
 	 			@Override
 	 			public void mouseEntered(MouseEvent arg0) {
 	 				panel_60.setBackground(Color.decode("#449d44"));
 	 			}
 	 			@Override
 	 			public void mouseExited(MouseEvent arg0) {
 	 				panel_60.setBackground(Color.decode("#5cb85c"));
 	 			}
 	 		
 		});
 		GroupLayout gl_manageAcc = new GroupLayout(manageAcc);
 		gl_manageAcc.setHorizontalGroup(
 			gl_manageAcc.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_manageAcc.createSequentialGroup()
 					.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
 					.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
 					.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
 					.addPreferredGap(ComponentPlacement.RELATED)
 					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
 					.addContainerGap())
 				.addGroup(gl_manageAcc.createSequentialGroup()
 					.addComponent(panel_73, GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
 					.addGap(2))
 				.addGroup(gl_manageAcc.createSequentialGroup()
 					.addGap(300)
 					.addComponent(panel_60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 					.addGap(300))
 		);
 		gl_manageAcc.setVerticalGroup(
 			gl_manageAcc.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_manageAcc.createSequentialGroup()
 					.addGroup(gl_manageAcc.createParallelGroup(Alignment.BASELINE, false)
 						.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
 						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
 						.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
 					.addGap(1)
 					.addComponent(panel_73, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
 					.addGap(1)
 					.addComponent(panel_60, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
 		);
 		
 		JLabel lblAddAccount = new JLabel("ADD ACCOUNT");
 		lblAddAccount.setForeground(Color.WHITE);
 		
 		lblAddAccount.setHorizontalAlignment(SwingConstants.CENTER);
 		GroupLayout gl_panel_60 = new GroupLayout(panel_60);
 		gl_panel_60.setHorizontalGroup(
 			gl_panel_60.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_60.createSequentialGroup()
 					.addComponent(lblAddAccount, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
 					.addGap(1))
 		);
 		gl_panel_60.setVerticalGroup(
 			gl_panel_60.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_60.createSequentialGroup()
 					.addGap(1)
 					.addComponent(lblAddAccount, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
 		);
 		panel_60.setLayout(gl_panel_60);
 		
 		JScrollPane scrollPane_1 = new JScrollPane();
 		GroupLayout gl_panel_73 = new GroupLayout(panel_73);
 		gl_panel_73.setHorizontalGroup(
 			gl_panel_73.createParallelGroup(Alignment.LEADING)
 				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
 		);
 		gl_panel_73.setVerticalGroup(
 			gl_panel_73.createParallelGroup(Alignment.LEADING)
 				.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
 		);
 		
 		table_1 = new JTable(){
			    @Override
			    public boolean isCellEditable(int row, int column) {
			        // This is how we disable editing:
			        return false;
			    }
			   public boolean getScrollableTracksViewportWidth()
	            {
	                return getPreferredSize().width < getParent().getWidth();
	            }
			   public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
		        Component returnComp = super.prepareRenderer(renderer, row, column);
		        Color alternateColor = Color.decode("#112335");
		        Color whiteColor = Color.decode("#32455c");;
		        if (!returnComp.getBackground().equals(getSelectionBackground())){
		            Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
		            returnComp .setBackground(bg);
		            returnComp.setForeground(Color.white);
		            bg = null;
		        }else if(isRowSelected(row)) {
		        	returnComp.setBackground(Color.decode("#314c70"));
		        	returnComp.setForeground(Color.white);
		        }
		        return returnComp;
		    }
			   
			   

};
 		table_1.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent arg0) {
 				 jTable1MouseClicked2(arg0);
 			}
 		});
		table_1.setFocusable(false);
 		scrollPane_1.setViewportView(table_1);
 		scrollPane_1.getViewport().setBackground(Color.decode("#1b252e"));
 		scrollPane_1.getVerticalScrollBar().setBackground(Color.black);
 		scrollPane_1.getHorizontalScrollBar().setBackground(Color.black);
 		panel_73.setLayout(gl_panel_73);
 		manageAcc.setLayout(gl_manageAcc);
			
		
 		
 		JPanel loginH = new JPanel();
 		loginH.setBackground(Color.decode("#1b252e"));
 		layeredPane.add(loginH, "name_64551533014936");
 		
 		JScrollPane scrollPane_2 = new JScrollPane();
 		
 		JLabel label_35 = new JLabel("  NLRC - LOGIN HISTORY");
 		label_35.setForeground(Color.WHITE);
 		label_35.setFont(new Font("Arial", Font.BOLD, 15));
 		
 		JLabel label_37 = new JLabel("Search:");
 		label_37.setForeground(Color.WHITE);
 		
 		textField_2 = new JTextField(){
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
 		textField_2.setColumns(10);
 		textField_2.addKeyListener(new KeyAdapter() {
 			@Override
 			public void keyReleased(KeyEvent arg0) {
 				 {
						if(textField.getText().equals("")) {
							timer.setDelay(10000);
							timer.start();
						}else {
							timer.stop();
						}

						DefaultTableModel tm65 = (DefaultTableModel) DbUtils.resultSetToTableModel((DBQuery.loginSearch(textField_2.getText(), textField_2.getText(), textField_2.getText())));
		 				
		 				table_2.setModel(tm65);
		 			
		 				theader();
					  
				}
 				
 				
 				
 			}
 		});
 		GroupLayout gl_loginH = new GroupLayout(loginH);
 		gl_loginH.setHorizontalGroup(
 			gl_loginH.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_loginH.createSequentialGroup()
 					.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
 					.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
 					.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
 					.addGap(4)
 					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
 					.addGap(10))
 				.addGroup(gl_loginH.createSequentialGroup()
 					.addGap(1)
 					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
 		);
 		gl_loginH.setVerticalGroup(
 			gl_loginH.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_loginH.createSequentialGroup()
 					.addGroup(gl_loginH.createParallelGroup(Alignment.LEADING)
 						.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
 						.addGroup(gl_loginH.createSequentialGroup()
 							.addGap(7)
 							.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
 						.addGroup(gl_loginH.createSequentialGroup()
 							.addGap(8)
 							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
 					.addGap(2)
 					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
 					.addGap(1))
 		);
 		
 		table_2 = new JTable() {
				    @Override
				    public boolean isCellEditable(int row, int column) {
				        // This is how we disable editing:
				        return false;
				    }
				   public boolean getScrollableTracksViewportWidth()
		            {
		                return getPreferredSize().width < getParent().getWidth();
		            }
				   public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
			        Component returnComp = super.prepareRenderer(renderer, row, column);
			        Color alternateColor = Color.decode("#112335");
			        Color whiteColor = Color.decode("#32455c");;
			        if (!returnComp.getBackground().equals(getSelectionBackground())){
			            Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
			            returnComp .setBackground(bg);
			            returnComp.setForeground(Color.white);
			            bg = null;
			        }else if(isRowSelected(row)) {
			        	returnComp.setBackground(Color.decode("#314c70"));
			        	returnComp.setForeground(Color.white);
			        }
			        return returnComp;
			    }
				   

	};
	

	
	
			table_1.setFocusable(false);
			DefaultTableModel tm1 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.getEmployed());
			tm1.addColumn("#");
			table_1.setModel(tm1);
			table_1.moveColumn(4,0);
			theader();
 		
 		scrollPane_2.setViewportView(table_2);
 		scrollPane_2.getViewport().setBackground(Color.decode("#1b252e"));
 		scrollPane_2.getVerticalScrollBar().setBackground(Color.black);
 		scrollPane_2.getHorizontalScrollBar().setBackground(Color.black);
 		loginH.setLayout(gl_loginH);
 		
 		JPanel viewCase = new JPanel();
 		viewCase.setBackground(Color.BLACK);
 		layeredPane.add(viewCase, "name_89873841572306");
 		
 		JPanel panel = new JPanel();
 		panel.setBackground(new Color(27,37,46));
 		
 		JPanel panel_5 = new JPanel();
 		panel_5.setBackground(new Color(27,37,46));
 		
 		JPanel panel_6 = new JPanel(){
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
			  
			    
			    setBorder(new RoundTextField(34));
			  }
		};
 		panel_6.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent e) {
 				CardLayout cl = (CardLayout) layeredPane.getLayout();
				cl.show(layeredPane, "name_64533364253644"); 				
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				panel_6.setBackground(Color.decode("#286090"));
 			}
 			@Override
 			public void mouseExited(MouseEvent e) {
 				panel_6.setBackground(Color.decode("#337ab7"));
 			}
 		});
 		panel_6.setBackground(Color.decode("#337ab7"));
 		
 		
 		JPanel panel_8 = new JPanel(){
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
			  
			    
			    setBorder(new RoundTextField(34));
			  }
		};
 		panel_8.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent arg0) {
 				int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this case?\nCase No.:"+caseNum+"\nCase Title:"+caseViewT,"Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
 				if(input == 0) {
 					DBQuery.deleteCase(caseView);
 					DefaultTableModel tm = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryCaseTitle());
 	 				tm.addColumn("#");
 	 				dataTable.setModel(tm);
 	 				dataTable.moveColumn(5,0);
 	 				theader();
 	 				CardLayout cl = (CardLayout) layeredPane.getLayout();
 					cl.show(layeredPane, "name_64533364253644");
 					
 				}
 			}
 			@Override
 			public void mouseEntered(MouseEvent arg0) {
 				panel_8.setBackground(Color.decode("#c9302c"));
 			}
 			@Override
 			public void mouseExited(MouseEvent arg0) {
 				panel_8.setBackground(Color.decode("#d9534f"));
 			}
 		});
 		panel_8.setForeground(Color.WHITE);
 		panel_8.setBackground(Color.decode("#d9534f"));
 		
 		JPanel panel_7 = new JPanel(){
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
			  
			    
			    setBorder(new RoundTextField(34));
			  }
		};
 		panel_7.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent e) {
 				edit = 1;
 				String nlrc;
 				int nMonth = 0,nDay = 0, nYear = 0,this_yearIndex=0;
 				int this_year_now = Calendar.getInstance().get(Calendar.YEAR);
 				Calendar cal1 = Calendar.getInstance();
 				Calendar cal2 = Calendar.getInstance();
 				Calendar cal3 = Calendar.getInstance();
 				Calendar cal4 = Calendar.getInstance();
 				Calendar cal5 = Calendar.getInstance();
 				Calendar cal6 = Calendar.getInstance();
 				Calendar cal7 = Calendar.getInstance();
 				Calendar cal8 = Calendar.getInstance();
 				Calendar cal9 = Calendar.getInstance();
 				Calendar cal10 = Calendar.getInstance();
 				Calendar cal11 = Calendar.getInstance();
 				Calendar cal12 = Calendar.getInstance();
 				Calendar cal13 = Calendar.getInstance();
 				Calendar cal14 = Calendar.getInstance();
 				Calendar cal15 = Calendar.getInstance();
 				Calendar cal16 = Calendar.getInstance();
 				Calendar cal17 = Calendar.getInstance();
 				Calendar cal18 = Calendar.getInstance();
 				Calendar cal19 = Calendar.getInstance();
 				//for edit set value
 				ResultSet rs = DBQuery.getCase(caseView);
 				 try {
 					while(rs.next()) {

 						tfCnum.setText(rs.getString("cnum"));
 						decisionMR2.setText(rs.getString("decision_on_mr2"));
 						mrFiled2.setText(rs.getString("mr_filed_by2"));
 						decisionMR1.setText(rs.getString("decision_on_mr1"));
 						mrFiled1.setText(rs.getString("mr_filed_by1"));
 						taDecisiononApp.setText(rs.getString("decision_on_appeal"));
 						tfPonente.setText(rs.getString("ponente"));
 						titleTF.setText(rs.getString("complainant"));
 						respon.setText(rs.getString("respondent"));
 						other.setText(rs.getString("other"));
 						appealOr.setText(rs.getString("appeal_or"));
 						BondAmount.setText(rs.getString("bond_amount"));
 						textField_11.setText(rs.getString("surety"));
 						textField_12.setText(rs.getString("bnd_num_new"));
 						
 						
 						//dateNLRC.setText();
 						//nlrcMonth.setText(rs.getString("Date_app_nlrc"));
 						
 						String daP = rs.getString("date_prom");
 						try {
 							java.sql.Date daPDAT = java.sql.Date.valueOf(daP);
 	 						cal15.setTime(daPDAT);
 	 						int daPDATM = cal15.get(Calendar.MONTH);
 	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
 	 				 			if(daPDATM == month){
 	 				 				dProM.setSelectedIndex(month+1);
 	 				 			}
 	 				 		}
 	 						int daPDATMD = cal15.get(Calendar.DAY_OF_MONTH);
 	 						for(int day = 1 ; day <= 31 ; day++ ) {
 	 				 			if(day == daPDATMD) {
 	 				 				dPromD.setSelectedIndex(day);
 	 				 			}	
 	 				 		}
 	 						int daPDATMDY = cal15.get(Calendar.YEAR);
 	 						this_yearIndex = 0;
 	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
 	 				 			if(year == daPDATMDY) {
 	 				 				dPromY.setSelectedIndex(this_yearIndex+1);
 	 				 			}
 	 				 			this_yearIndex++;
 	 				 		}
 						}catch(Exception x) {
 							
 	 							dProM.setSelectedIndex(0);
 	 							dPromD.setSelectedIndex(0);
 	 							dPromY.setSelectedIndex(0);
 	 						
 						}
 						
 						
 						
 						String nlrc_Month = rs.getString("Date_app_nlrc");
 						java.sql.Date nlrcMonthDat = java.sql.Date.valueOf(nlrc_Month);
 						cal5.setTime(nlrcMonthDat);
 						int nlrcMonth = cal5.get(Calendar.MONTH);
 				 		for(int month = 0 ; month <= 11 ; month++ ) {
 				 			if(nlrcMonth == month){
 				 				nlrcM.setSelectedIndex(month);
 				 			}
 				 		}
 						int nlrcday = cal5.get(Calendar.DAY_OF_MONTH);
 						for(int day = 1 ; day <= 31 ; day++ ) {
 				 			if(day == nlrcday) {
 				 				nlrcD.setSelectedIndex(day-1);
 				 			}	
 				 		}
 						int nlrcYear = cal5.get(Calendar.YEAR);
 						this_yearIndex = 0;
 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
 				 			if(year == nlrcYear) {
 				 				nlrcY.setSelectedIndex(this_yearIndex);
 				 			}
 				 			this_yearIndex++;
 				 		}
 				 		//
 				 		
 				 		String appealfeeM1 = rs.getString("ap_date");
 				 		try {
	 						java.sql.Date appealfeeMDAT = java.sql.Date.valueOf(appealfeeM1);
	 						cal16.setTime(appealfeeMDAT);
	 						int appealfeeMM = cal16.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(appealfeeMM == month){
	 				 				appealfeeM.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int appealfeeMD = cal16.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == appealfeeMD) {
	 				 				appealfeeD.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int appealfeeMY = cal16.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == appealfeeMY) {
	 				 				appealfeeY.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 				 		}catch(Exception x) {
 				 			
 	 				 			dMailM.setSelectedIndex(0);
 	 							dMailD .setSelectedIndex(0);
 	 							dMailY .setSelectedIndex(0);
 	 				 		}
 				 		//
 				 		String bondDM1 = rs.getString("date_bnd_new");
 				 		try{
	 						java.sql.Date bondDM1DAT = java.sql.Date.valueOf(bondDM1);
	 						cal17.setTime(bondDM1DAT);
	 						int bondDMM = cal17.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(bondDMM == month){
	 				 				bondDM.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int bondDDD = cal17.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == bondDDD) {
	 				 				bondDD.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int bondDYY = cal17.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == bondDYY) {
	 				 				bondDY.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 				 		}catch(Exception x) {
 				 			
 	 				 			bondDD .setSelectedIndex(0);
 	 				 			bondDM .setSelectedIndex(0);
 	 				 			bondDY .setSelectedIndex(0);
 	 				 		}
 				 		//
 				 		String bndm1 = rs.getString("bndm_new");
 				 		try {
	 						java.sql.Date bndmddat = java.sql.Date.valueOf(bndm1);
	 						cal18.setTime(bndmddat);
	 						int bndmddatm = cal18.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(bndmddatm == month){
	 				 				bndm.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int bndmddatd = cal18.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == bndmddatd) {
	 				 				bndd.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int bndmddaty = cal18.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == bndmddaty) {
	 				 				bndy.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 				 		}catch(Exception x) {
 				 		
 	 				 			bndd .setSelectedIndex(0);
 	 				 			bndm .setSelectedIndex(0);
 	 				 			bndy .setSelectedIndex(0);
 	 				 		}
 				 		
 				 		String bndm2 = rs.getString("date_mr_filed2");
 				 		try {
	 						java.sql.Date bndmddat2 = java.sql.Date.valueOf(bndm2);
	 						cal19.setTime(bndmddat2);
	 						int bndmddatm2 = cal19.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(bndmddatm2 == month){
	 				 				dateMRM2.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int bndmddatd2 = cal19.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == bndmddatd2) {
	 				 				dateMRD2.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int bndmddaty2 = cal19.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == bndmddaty2) {
	 				 				dateMRY2.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 				 		}catch(Exception x) {
 				 			if(bndm2.equals("-----0---")) {
 	 				 			dateMRM2 .setSelectedIndex(0);
 	 				 			dateMRD2 .setSelectedIndex(0);
 	 				 			dateMRY2 .setSelectedIndex(0);
 	 				 		}
 						
 						

 						//dateAppMonth.setText(rs.getString("Date_app_prom"));
 				 		
 				 		String dateProm_Month = rs.getString("Date_app_prom");
 				 		try {
	 						java.sql.Date dPromMonthDat = java.sql.Date.valueOf(dateProm_Month);
	 						cal6.setTime(dPromMonthDat);
	 						int datePrMonth = cal6.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(datePrMonth == month){
	 				 				dateAppPonenteM.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int dateProday = cal6.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == dateProday) {
	 				 				dateAppPoneneteD.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int dateProYear = cal6.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == dateProYear) {
	 				 				dateAppPoneneteY .setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 				 		}catch(Exception c) {
 				 			
 	 				 			dateAppPonenteM.setSelectedIndex(0);
 	 				 			dateAppPoneneteD .setSelectedIndex(0);
 	 				 			dateAppPoneneteY .setSelectedIndex(0);
 	 				 		}
 				 		
 				 		
 						//dateMRMonth.setText(rs.getString("Date_mr_filed"));
 						String dateMRFILE1_Month = rs.getString("Date_mr_filed");
 						try {
	 						java.sql.Date dateMRFILE1_MonthDAT = java.sql.Date.valueOf(dateMRFILE1_Month);
	 						cal8.setTime(dateMRFILE1_MonthDAT);
	 						int dateMRFILE1 = cal8.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(dateMRFILE1 == month){
	 				 				dateMRM1 .setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int dateMRFILE1D = cal8.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == dateMRFILE1D) {
	 				 				dateMRD1 .setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int dateMRFILE1DY = cal8.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == dateMRFILE1DY) {
	 				 				dateMRY1.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 						}catch(Exception aas) {
 						
 	 							dateMRM1.setSelectedIndex(0);
 	 							dateMRD1 .setSelectedIndex(0);
 	 							dateMRY1 .setSelectedIndex(0);
 	 						
 						}
 				 		
 						
 						induCode.setText(rs.getString("ind_code"));
 						natureOfC.setText(rs.getString("nature_case"));
 						natureofA.setText(rs.getString("nature_award"));
 						ammOfAward.setText(rs.getString("amm_award"));
 						//if(rs.getString("gender").contains("Male")) {
 							textField_8.setText(rs.getString("male"));
 						//}else {
 							textField_7.setText(rs.getString("female"));
 						//}
 							textField_9.setText(rs.getString("nlrc_case_num"));
 						appealFee.setText(rs.getString("appeal_fee"));
 						bondFee.setText(rs.getString("bond"));
 						
 						//entryJudgement.setText(rs.getString("entry_judgment"));
 						String ej_Month = rs.getString("entry_judgment");
 						try {
	 						java.sql.Date ej_MonthDAT = java.sql.Date.valueOf(ej_Month);
	 						cal9.setTime(ej_MonthDAT);
	 						int ejMonth = cal9.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(ejMonth == month){
	 				 				entryJM .setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int ejDay = cal9.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == ejDay) {
	 				 				entryJD .setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int ejYear = cal9.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == ejYear) {
	 				 				entryJY.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 						}catch(Exception a){
 							
 	 							entryJM.setSelectedIndex(0);
 	 							entryJD .setSelectedIndex(0);
 	 							entryJY .setSelectedIndex(0);
 						}
 						
 						reamarkTf.setText(rs.getString("remarks"));
 						//OECCMonth.setText(rs.getString("Date_rec_oecc"));
 						String OECC_Month = rs.getString("Date_rec_oecc");
 						java.sql.Date OECCMonthDat = java.sql.Date.valueOf(OECC_Month);
 						cal4.setTime(OECCMonthDat);
 						int oeccMonth = cal4.get(Calendar.MONTH);
 				 		for(int month = 0 ; month <= 11 ; month++ ) {
 				 			if(oeccMonth == month){
 				 				OECCMonth.setSelectedIndex(month);
 				 			}
 				 		}
 						int oeccDay = cal4.get(Calendar.DAY_OF_MONTH);
 						for(int day = 1 ; day <= 31 ; day++ ) {
 				 			if(day == oeccDay) {
 				 				OECCDay.setSelectedIndex(day-1);
 				 			}	
 				 		}
 						int oeccYear = cal4.get(Calendar.YEAR);
 						this_yearIndex = 0;
 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
 				 			if(year == oeccYear) {
 				 				OECCYear.setSelectedIndex(this_yearIndex);
 				 			}
 				 			this_yearIndex++;
 				 		}
 						//dateCommMonth.setText(rs.getString("Date_rec_com"));
 						String ponenteMonth = rs.getString("Date_rec_com");
 						try {	
	 						java.sql.Date ponenteMonthDat = java.sql.Date.valueOf(ponenteMonth);
	 						cal7.setTime(ponenteMonthDat);
	 						int ponenteMMonth = cal7.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(ponenteMMonth == month){
	 				 				ponenteDM.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int ponenteDay = cal7.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == ponenteDay) {
	 				 				ponenteDD .setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int ponenteYear = cal7.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == ponenteYear) {
	 				 				ponenteDY.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 						}catch(Exception z) {
 							
 	 							ponenteDM.setSelectedIndex(0);
 	 							ponenteDD .setSelectedIndex(0);
 	 							ponenteDY .setSelectedIndex(0);
 	 						
 						}
 				 		
 						//dateMRproMonth.setText(rs.getString("date_mr_prom"));
 						String rabDesM = rs.getString("date_mr_prom");
 						try {
	 						java.sql.Date rabDesMDAT = java.sql.Date.valueOf(rabDesM);
	 						cal12.setTime(rabDesMDAT);
	 						int rabDesMDATM = cal12.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(rabDesMDATM == month){
	 				 				rabDM.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int rabDesMDATD = cal12.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == rabDesMDATD) {
	 				 				rabDD.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int rabDesMDATY = cal12.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == rabDesMDATY) {
	 				 				rabDY .setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 						}catch(Exception a) {
 							
 	 							rabDM.setSelectedIndex(0);
 	 							rabDD .setSelectedIndex(0);
 	 							rabDD .setSelectedIndex(0);
 	 						
 						}
 				 		
 						//dateMailedMonth.setText(rs.getString("date_mailed"));
 						String dateR  = rs.getString("date_mailed");
 						try {
	 						java.sql.Date dateRDAT = java.sql.Date.valueOf(dateR);
	 						cal11.setTime(dateRDAT);
	 						int dateRDATM = cal11.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(dateRDATM == month){
	 				 				dateRemandedM .setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int dateRDATD = cal11.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == dateRDATD) {
	 				 				dateRemandedD.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int dateRDATDY = cal11.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == dateRDATDY) {
	 				 				dateRemandedY .setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 						}catch(Exception a) {
 							
 	 							dateRemandedM.setSelectedIndex(0);
 	 							dateRemandedD .setSelectedIndex(0);
 	 							dateRemandedY .setSelectedIndex(0);
 	 						
 						}
 				 		
 						//dateForwardMonth.setText(rs.getString("date_forwarded"));
 						String dateMaileDDD  = rs.getString("date_forwarded");
 						try {
	 						java.sql.Date dateMaileDDDAT = java.sql.Date.valueOf(dateMaileDDD);
	 						cal14.setTime(dateMaileDDDAT);
	 						int dateMaileDDDATM = cal14.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(dateMaileDDDATM == month){
	 				 				dMailM.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int dateMaileDDDATMD = cal14.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == dateMaileDDDATMD) {
	 				 				dMailD.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int dateMaileDDDATMY  = cal14.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == dateMaileDDDATMY) {
	 				 				dMailY.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 						}catch(Exception as) {
 							
 	 							dMailM.setSelectedIndex(0);
 	 							dMailD .setSelectedIndex(0);
 	 							dMailY .setSelectedIndex(0);
 	 						
 						}
	 				 		
 						courierAir.setText(rs.getString("courier_airbill_no"));
 						//COM.setText(rs.getString("com"));
 						LA.setText(rs.getString("la"));
 						//AppeaDate.setText(rs.getString("app_date_or"));
 						String appealMM = rs.getString("app_date_or");
 						try {
	 						java.sql.Date appealMMDat = java.sql.Date.valueOf(appealMM);
	 						cal13.setTime(appealMMDat);
	 						int appealMMDatM = cal13.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(appealMMDatM == month){
	 				 				dAppealRM.setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int appealMMDatD = cal13.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == appealMMDatD) {
	 				 				dAppealRD.setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int appealMMDatY = cal13.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == appealMMDatY) {
	 				 				dAppealRY.setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 						}catch(Exception c) {
 							
 	 							dAppealRM.setSelectedIndex(0);
 	 							dAppealRD .setSelectedIndex(0);
 	 							dAppealRY .setSelectedIndex(0);
 	 						
 						}
 						
 						bondDate.setText(rs.getString("bond_date_or"));
 						
 						//dateEntryMonth.setText(rs.getString("date_entry_judg_issued"));
 						String EJIMonth = rs.getString("date_entry_judg_issued");
 						try {
	 						java.sql.Date EJIMonthDAT = java.sql.Date.valueOf(EJIMonth);
	 						cal10.setTime(EJIMonthDAT);
	 						int EJIMonthDATM = cal10.get(Calendar.MONTH);
	 				 		for(int month = 0 ; month <= 11 ; month++ ) {
	 				 			if(EJIMonthDATM == month){
	 				 				dEntryJIM .setSelectedIndex(month+1);
	 				 			}
	 				 		}
	 						int EJIMonthDATD = cal10.get(Calendar.DAY_OF_MONTH);
	 						for(int day = 1 ; day <= 31 ; day++ ) {
	 				 			if(day == EJIMonthDATD) {
	 				 				dEntryJID .setSelectedIndex(day);
	 				 			}	
	 				 		}
	 						int ponentEJIMonthDATY = cal10.get(Calendar.YEAR);
	 						this_yearIndex = 0;
	 				 		for(int year = 1978 ; year <= this_year_now  ; year++ ) {
	 				 			if(year == ponentEJIMonthDATY) {
	 				 				dEntryJIY .setSelectedIndex(this_yearIndex+1);
	 				 			}
	 				 			this_yearIndex++;
	 				 		}
 						}catch(Exception a) {
 							
 	 							dEntryJIM.setSelectedIndex(0);
 	 							dEntryJID .setSelectedIndex(0);
 	 							dEntryJIY .setSelectedIndex(0);
 	 						
 						}
 						
 						if(rs.getString("case_type").equals("MAC No.")) {
 							comboBox.setSelectedIndex(0);
 						}else if(rs.getString("case_type").equals("MER No.")) {
 							comboBox.setSelectedIndex(1);
 						}else if(rs.getString("case_type").equals("CC No.")) {
 							comboBox.setSelectedIndex(2);
 						}
 						 caseView = rs.getString("id");
 						 caseNum =  rs.getString("cnum");
 						 caseViewT = rs.getString("title");
 						 
 					  }
 					}
 			      	} catch (SQLException e1) {
 					// TODO Auto-generated catch block
 					e1.printStackTrace();
 			      	}
 				javax.swing.SwingUtilities.invokeLater(new Runnable(){
 		 			public void run() {
 		 				scrollPane_3.getVerticalScrollBar().setValue(0);	 			}
 		 		});
 				CardLayout cl = (CardLayout) layeredPane.getLayout();
				cl.show(layeredPane, "name_532941681539733"); 
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				panel_7.setBackground(Color.decode("#449d44"));
 			}
 			@Override
 			public void mouseExited(MouseEvent e) {
 				panel_7.setBackground(Color.decode("#5cb85c"));
 			}
 		});
 		panel_7.setBackground(Color.decode("#5cb85c"));
 		
 		JLabel lblEdit = new JLabel("EDIT");
 		lblEdit.setForeground(Color.WHITE);
 		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
 		
 		JPanel panel_1 = new JPanel(){
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
			  
			    
			    setBorder(new RoundTextField(34));
			  }
		};
 		panel_1.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseEntered(MouseEvent arg0) {
 				panel_1.setBackground(Color.decode("#286090"));
 			}
 			@Override
 			public void mouseExited(MouseEvent arg0) {
 				panel_1.setBackground(Color.decode("#337ab7"));
 			}
 			@Override
 			public void mouseClicked(MouseEvent arg0) {
 				getSelectedCase(caseView,"black",textPane_1,"white","6px");
 				MessageFormat header = new MessageFormat("National Labor Relations Commission 8th Division");
				MessageFormat footer = new MessageFormat(" ");
 				try {
 					
 					
 					
 					
 					textPane_1.print(header, footer);
				} catch (PrinterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 			}
 		});
 		panel_1.setBackground(Color.decode("#337ab7"));
 		
 		JLabel label_8 = new JLabel("PRINT");
 		label_8.setBackground(Color.WHITE);
 		label_8.setHorizontalAlignment(SwingConstants.CENTER);
 		label_8.setForeground(Color.WHITE);
 		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
 		gl_panel_5.setHorizontalGroup(
 			gl_panel_5.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_5.createSequentialGroup()
 					.addGap(1)
 					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 					.addPreferredGap(ComponentPlacement.RELATED)
 					.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
 					.addPreferredGap(ComponentPlacement.RELATED)
 					.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
 					.addPreferredGap(ComponentPlacement.RELATED)
 					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
 					.addGap(1))
 		);
 		gl_panel_5.setVerticalGroup(
 			gl_panel_5.createParallelGroup(Alignment.LEADING)
 				.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
 				.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
 				.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
 				.addGroup(gl_panel_5.createSequentialGroup()
 					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
 					.addGap(1))
 		);
 		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
 		gl_panel_7.setHorizontalGroup(
 			gl_panel_7.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblEdit, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
 		);
 		gl_panel_7.setVerticalGroup(
 			gl_panel_7.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_7.createSequentialGroup()
 					.addComponent(lblEdit, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
 					.addGap(1))
 		);
 		panel_7.setLayout(gl_panel_7);
 		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
 		gl_panel_1.setHorizontalGroup(
 			gl_panel_1.createParallelGroup(Alignment.LEADING)
 				.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
 		);
 		gl_panel_1.setVerticalGroup(
 			gl_panel_1.createParallelGroup(Alignment.LEADING)
 				.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
 		);
 		panel_1.setLayout(gl_panel_1);
 		
 		JLabel lblDelete = new JLabel("Delete");
 		lblDelete.setForeground(Color.WHITE);
 		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
 		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
 		gl_panel_8.setHorizontalGroup(
 			gl_panel_8.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblDelete, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
 		);
 		gl_panel_8.setVerticalGroup(
 			gl_panel_8.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_8.createSequentialGroup()
 					.addComponent(lblDelete, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
 					.addGap(1))
 		);
 		panel_8.setLayout(gl_panel_8);
 		
 		JLabel lblBack = new JLabel("BACK");
 		lblBack.setForeground(Color.WHITE);
 		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
 		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
 		gl_panel_6.setHorizontalGroup(
 			gl_panel_6.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblBack, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
 		);
 		gl_panel_6.setVerticalGroup(
 			gl_panel_6.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblBack, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
 		);
 		panel_6.setLayout(gl_panel_6);
 		panel_5.setLayout(gl_panel_5);
 		
 		JLabel lblNlrcS = new JLabel("NLRC RECORD - VIEW CASE");
 		lblNlrcS.setHorizontalAlignment(SwingConstants.CENTER);
 		lblNlrcS.setForeground(Color.WHITE);
 		lblNlrcS.setFont(new Font("Arial", Font.BOLD,20));
 		GroupLayout gl_panel = new GroupLayout(panel);
 		gl_panel.setHorizontalGroup(
 			gl_panel.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblNlrcS, GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
 		);
 		gl_panel.setVerticalGroup(
 			gl_panel.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel.createSequentialGroup()
 					.addGap(1)
 					.addComponent(lblNlrcS, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
 		);
 		panel.setLayout(gl_panel);
 		JScrollPane scrollPane_4 = new JScrollPane();
 		
 		JScrollPane scrollPane_5 = new JScrollPane();
 		
 		GroupLayout gl_viewCase = new GroupLayout(viewCase);
 		gl_viewCase.setHorizontalGroup(
 			gl_viewCase.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_viewCase.createSequentialGroup()
 					.addGroup(gl_viewCase.createParallelGroup(Alignment.LEADING)
 						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
 						.addComponent(panel_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
 						.addGroup(gl_viewCase.createSequentialGroup()
 							.addGap(1)
 							.addComponent(scrollPane_5, GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
 							.addGap(1)))
 					.addGap(1))
 		);
 		gl_viewCase.setVerticalGroup(
 			gl_viewCase.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_viewCase.createSequentialGroup()
 					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 					.addGap(1)
 					.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
 					.addGap(1)
 					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
 		);
 		
 		textPane = new JTextPane();
 		textPane.setBackground(new Color(27, 37, 46));
 		textPane.setForeground(Color.WHITE);
 		scrollPane_5.setViewportView(textPane);
 		
 		viewCase.setLayout(gl_viewCase);
 		
 		JPanel addCase = new JPanel();
 		addCase.setBackground(new Color(27, 37, 46));
 		layeredPane.add(addCase, "name_532941681539733");
 		
 		JPanel panel_70 = new JPanel();
 		panel_70.setBackground(new Color(27, 37, 46));
 		
 		JPanel panel_62 = new JPanel(){
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
 		panel_62.setBackground(new Color(92, 184, 92));
 		panel_62.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent e) {
 				String msgValidate = "Please Check this field! \n";
 				if("".equals(tfCnum.getText())) {
 					msgValidate = msgValidate + "*CASE NUMBER IS REQURED\n";
 				}if("".equals(titleTF.getText())) {
 					msgValidate = msgValidate + "*TITLE IS REQURED\n";
 				}if(jValidateButton(rabDD,rabDM,rabDY)) {
 					msgValidate = msgValidate + "*INVALID RAB DECISION DATE FORMAT\n";
 				}if(jValidateButton(dProM,dPromD,dPromY)) {
 					msgValidate = msgValidate + "*INVALID DATE PROMULGATED FORMAT\n";
 				}if(jValidateButton(dMailM,dMailD,dMailY)) {
 					msgValidate = msgValidate + "*INVALID DATE MAILED FORMAT\n";
 				}if(jValidateButton(dAppealRM,dAppealRD,dAppealRY)) {
 					msgValidate = msgValidate + "*INVALID DATE APPEAL RECEIVED FORMAT\n";
 				}if(jValidateButton(appealfeeM,appealfeeD,appealfeeY)) {
 					msgValidate = msgValidate + "*INVALID DATE APPEAL PAYMENT FORMAT\n";
 				}if(jValidateButton(bondDM,bondDD,bondDY)) {
 					msgValidate = msgValidate + "*INVALID BOND PAYMENT DATE  FORMAT\n";
 				}if(jValidateButton(bondDM,bondDD,bondDY)) {
 					msgValidate = msgValidate + "*INVALID BOND PAYMENT DATE  FORMAT\n";
 				}if(jValidateButton(bndm,bndd,bndy)) {
 					msgValidate = msgValidate + "*INVALID BOND No. DATE  FORMAT\n";
 				}if(jValidateButton(ponenteDM,ponenteDD,ponenteDY)) {
 					msgValidate = msgValidate + "*INVALID DATE RECEIVED BY PONENTE  FORMAT\n";
 				}if(jValidateButton(dateAppPonenteM,dateAppPoneneteD,dateAppPoneneteY)) {
 					msgValidate = msgValidate + "*INVALID DATE APPEAL PROMULGATED  FORMAT\n";
 				}if(jValidateButton(dateMRM1,dateMRD1,dateMRY1)) {
 					msgValidate = msgValidate + "*INVALID DATE MR FILED  FORMAT\n";
 				}if(jValidateButton(dateMRM2,dateMRD2,dateMRY2)) {
 					msgValidate = msgValidate + "*INVALID DATE MR FILED  FORMAT\n";
 				}if(jValidateButton(entryJM,entryJD,entryJY)) {
 					msgValidate = msgValidate + "*INVALID DATE ENTRY JUDGMENT FORMAT\n";
 				}if(jValidateButton(dEntryJIM,dEntryJID,dEntryJIY)) {
 					msgValidate = msgValidate + "*INVALID DATE ENTRY JUDGMENT ISSUED FORMAT\n";
 				}if(jValidateButton(dateRemandedM,dateRemandedD,dateRemandedY)) {
 					msgValidate = msgValidate + "*INVALID DATE REMANDED TO RAB/SRAB FORMAT\n";
 				}
 				
 				if(!"".equals(tfCnum.getText())&&!"".equals(titleTF.getText()) && (!jValidateButton(rabDD,rabDM,rabDY)) && (!jValidateButton(dProM,dPromD,dPromY)) && 
 						(!jValidateButton(dMailM,dMailD,dMailY)) && (!jValidateButton(dAppealRM,dAppealRD,dAppealRY)) && (!jValidateButton(appealfeeM,appealfeeD,appealfeeY)) && 
 						(!jValidateButton(bondDM,bondDD,bondDY)) && (!jValidateButton(bondDM,bondDD,bondDY)) && (!jValidateButton(bndm,bndd,bndy)) && 
 						(!jValidateButton(ponenteDM,ponenteDD,ponenteDY)) && (!jValidateButton(dateAppPonenteM,dateAppPoneneteD,dateAppPoneneteY)) && 
 						(!jValidateButton(dateMRM1,dateMRD1,dateMRY1)) && (!jValidateButton(dateMRM2,dateMRD2,dateMRY2)) && (!jValidateButton(entryJM,entryJD,entryJY)) &&
 						(!jValidateButton(dEntryJIM,dEntryJID,dEntryJIY)) && (!jValidateButton(dateRemandedM,dateRemandedD,dateRemandedY)) ) {
		 				if(edit == 0) {
		 					String c_type = comboBox.getSelectedItem().toString();
		 					String dateNLRC =nlrcY.getSelectedItem().toString()+"-"+(nlrcM.getSelectedIndex()+1) + "-" + nlrcD.getSelectedItem().toString();
		 					String dateApp = dateAppPoneneteY .getSelectedItem().toString()+"-"+dateAppPonenteM.getSelectedIndex() + "-" + dateAppPoneneteD .getSelectedItem().toString();
		 			
		 					String dateMR = dateMRY1  .getSelectedItem().toString()+"-"+dateMRM1.getSelectedIndex() + "-" + dateMRD1  .getSelectedItem().toString();
				 			
		 					String dateOECC = OECCYear.getSelectedItem().toString()+"-"+(OECCMonth.getSelectedIndex()+1)+ "-" + OECCDay.getSelectedItem().toString();
		 					String ej = entryJY .getSelectedItem().toString()+"-"+entryJM.getSelectedIndex() + "-" + entryJD .getSelectedItem().toString();
		 					
		 					String dateComm = ponenteDY.getSelectedItem().toString()+"-"+ponenteDM.getSelectedIndex() + "-" + ponenteDD.getSelectedItem().toString();
		 					String dateMRpro =rabDY  .getSelectedItem().toString()+"-"+rabDM.getSelectedIndex() + "-" + rabDD .getSelectedItem().toString();
		 					
		 					String dateMailed = dateRemandedY  .getSelectedItem().toString()+"-"+dateRemandedM.getSelectedIndex() + "-" + dateRemandedD .getSelectedItem().toString();
		 					
		 					String dateForward = dMailY   .getSelectedItem().toString()+"-"+dMailM .getSelectedIndex() + "-" + dMailD  .getSelectedItem().toString();
		 					
		 					
		 					String dateEntry = dEntryJIY  .getSelectedItem().toString()+"-"+dEntryJIM .getSelectedIndex() + "-" + dEntryJID  .getSelectedItem().toString();
		 					String AppeaDate = dAppealRY   .getSelectedItem().toString()+"-"+dAppealRM .getSelectedIndex() + "-" + dAppealRD  .getSelectedItem().toString();
		 					String date_prom = dPromY.getSelectedItem().toString()+"-"+dProM.getSelectedIndex() + "-" + dPromD  .getSelectedItem().toString();
		 					String appp_date = appealfeeY.getSelectedItem().toString()+"-"+appealfeeM.getSelectedIndex() + "-" + appealfeeD  .getSelectedItem().toString();
		 					String bndDM = bondDY.getSelectedItem().toString()+"-"+bondDM.getSelectedIndex() + "-" + bondDD  .getSelectedItem().toString();
		 					
		 					String bndm_new = bndy.getSelectedItem().toString()+"-"+bndm.getSelectedIndex() + "-" + bndd  .getSelectedItem().toString();
		 					String dtmR2 = dateMRY2.getSelectedItem().toString()+"-"+dateMRM2.getSelectedIndex() + "-" + dateMRD2  .getSelectedItem().toString();
		 				
		 					
		 					if(ofw.getSelectedItem().toString().equals("--")) {
		 						ofw_type = " ";
		 					}else {
		 						ofw_type="-"+ofw.getSelectedItem().toString();
		 					}
		 					String full_cnum = comboBox.getSelectedItem().toString()+" "+textField_9.getText()+ofw_type;
		 					String full_rab = rab_num.getSelectedItem().toString()+" "+tfCnum.getText();
		 					
		 					
		 					int input = JOptionPane.showConfirmDialog(null, "Save Case?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		 					if(input==0) {
			 				DBQuery.insertCase(tfCnum.getText(),titleTF.getText()+" vs "+respon.getText() ,dateNLRC,dateOECC, dateComm, dateApp,dateMR,dateMRpro 
			 						,induCode.getText(),natureOfC.getText(),natureofA.getText(),ammOfAward.getText(),comboBox_5.getSelectedItem().toString(),
			 						LA.getText(),dateMailed,appealFee.getText(),AppeaDate,bondFee.getText(), bondDate.getText(),ej, dateEntry, dateForward, 
			 						courierAir.getText(),reamarkTf.getText(),c_type,textField_8.getText(),textField_7.getText(),textField_9.getText(),
			 						ofw.getSelectedItem().toString(),titleTF.getText(),respon.getText(),rab_num.getSelectedItem().toString(),
			 						appelant.getSelectedItem().toString(),date_prom,other.getText(),appealOr.getText(),appp_date,full_cnum,full_rab,
			 						BondAmount.getText(),bndDM,textField_11.getText(),textField_12.getText(),bndm_new,comboBox_6.getSelectedItem().toString(),
			 						ammCurrency.getSelectedItem().toString(),tfPonente.getText(),taDecisiononApp.getText(),mrFiled1.getText(),
			 						decisionMR1.getText(),dtmR2,mrFiled2.getText(),decisionMR2.getText(),comboBox_4.getSelectedItem().toString());
			 				JOptionPane.showMessageDialog(null,"Case Recorded!");




DefaultTableModel tm = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryCaseTitle());
	     				tm.addColumn("#");
	     				dataTable.setModel(tm);
	     				dataTable.moveColumn(5,0);
	     				theader();
		 			
		 				CardLayout cl = (CardLayout) layeredPane.getLayout();
						cl.show(layeredPane, "name_64533364253644"); 
						tfCnum.setText("");
						decisionMR2.setText("");
						mrFiled2.setText("");
						decisionMR1.setText("");
						mrFiled1.setText("");
						taDecisiononApp.setText("");
						tfPonente.setText("");
						textField_12.setText("");
						BondAmount.setText("");
						other.setText("");
						textField_11.setText("");
						//nlrcMonth.setText("");
						//dateAppMonth.setText("");
						//dateMRMonth.setText("");
						induCode.setText("");
						natureOfC.setText("");
						natureofA.setText("");
						ammOfAward.setText("");
						textField_8.setText("");
						textField_7.setText("");
						textField_9.setText("");
						appealFee.setText("");
						bondFee.setText("");
						//entryJudgement.setText("");
						reamarkTf.setText("");
						titleTF.setText("");
						respon.setText("");
						//OECCMonth.setText("");
						//dateCommMonth.setText("");
						//dateMRproMonth.setText("");
						//dateMailedMonth.setText("");
						//dateForwardMonth.setText("");
						courierAir.setText("");
						//COM.setText("");
						LA.setText("");
						//AppeaDate.setText("");
						bondDate.setText("");
						//dateEntryMonth.setText("");
		 					}else {CardLayout cl = (CardLayout) layeredPane.getLayout();
		 				    cl.show(layeredPane, "name_532941681539733");}
			 				
		 				}else {
		 					String c_type = comboBox.getSelectedItem().toString();
		 					String dateNLRC = nlrcY.getSelectedItem().toString()+"-"+(nlrcM.getSelectedIndex()+1)+ "-" + nlrcD.getSelectedItem().toString();
		 					String dateApp = dateAppPoneneteY .getSelectedItem().toString()+"-"+dateAppPonenteM.getSelectedIndex() + "-" + dateAppPoneneteD .getSelectedItem().toString();
				 			String dateMR = dateMRY1  .getSelectedItem().toString()+"-"+dateMRM1.getSelectedIndex() + "-" + dateMRD1  .getSelectedItem().toString();
				 			
		 					String dateOECC = OECCYear.getSelectedItem().toString()+"-"+(OECCMonth.getSelectedIndex()+1)+ "-" + OECCDay.getSelectedItem().toString();
		 					String dateComm = ponenteDY .getSelectedItem().toString()+"-"+ponenteDM .getSelectedIndex() + "-" + ponenteDD .getSelectedItem().toString();
		 					String ej = entryJY .getSelectedItem().toString()+"-"+entryJM .getSelectedIndex() + "-" + entryJD .getSelectedItem().toString();
		 					String dateMRpro = rabDY.getSelectedItem().toString()+"-"+rabDM.getSelectedIndex() + "-" + rabDD.getSelectedItem().toString();
		 					
		 					String dateMailed = dateRemandedY   .getSelectedItem().toString()+"-"+dateRemandedM.getSelectedIndex() + "-" + dateRemandedD   .getSelectedItem().toString();
		 					String AppeaDate = dAppealRY   .getSelectedItem().toString()+"-"+dAppealRM.getSelectedIndex() + "-" + dAppealRD  .getSelectedItem().toString();
		 					
		 					String dateForward = dMailY  .getSelectedItem().toString()+"-"+dMailM .getSelectedIndex() + "-" + dMailD  .getSelectedItem().toString();
		 					
		 					String dateEntry = dEntryJIY  .getSelectedItem().toString()+"-"+dEntryJIM .getSelectedIndex() + "-" + dEntryJID  .getSelectedItem().toString();
		 					String date_prom = dPromY.getSelectedItem().toString()+"-"+dProM.getSelectedIndex() + "-" + dPromD  .getSelectedItem().toString();
		 					String appp_date = appealfeeY.getSelectedItem().toString()+"-"+appealfeeM.getSelectedIndex() + "-" + appealfeeD  .getSelectedItem().toString();
		 					String bndDM = bondDY.getSelectedItem().toString()+"-"+bondDM.getSelectedIndex() + "-" + bondDD  .getSelectedItem().toString();
		 					
		 					if(ofw.getSelectedItem().toString().equals("--")) {
		 						ofw_type = " ";
		 					}else {
		 						ofw_type="-"+ofw.getSelectedItem().toString();
		 					}
		 					String full_cnum = comboBox.getSelectedItem().toString()+" "+textField_9.getText()+ofw_type;
		 					String full_rab = rab_num.getSelectedItem().toString()+" "+tfCnum.getText();
		 					String bndm_new = bndy.getSelectedItem().toString()+"-"+bndm.getSelectedIndex() + "-" + bndd  .getSelectedItem().toString();
		 					String dtmR2 = dateMRY2.getSelectedItem().toString()+"-"+dateMRM2.getSelectedIndex() + "-" + dateMRD2  .getSelectedItem().toString();
		 					
		 					
		 					int input = JOptionPane.showConfirmDialog(null, "Save Changes?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		 					 if(input==0) {
		 						 DBQuery.updateCase(tfCnum.getText(),titleTF.getText()+" vs "+respon.getText() ,dateNLRC,dateOECC,
		 								 dateComm, dateApp,dateMR,dateMRpro ,induCode.getText(),natureOfC.getText(),natureofA.getText(),
		 								 ammOfAward.getText(),comboBox_5.getSelectedItem().toString(),LA.getText(),dateMailed,appealFee.getText(),
		 								 AppeaDate,bondFee.getText(), bondDate.getText(),ej, dateEntry, dateForward, courierAir.getText(),
		 								 reamarkTf.getText(),caseView,c_type,textField_8.getText(),textField_7.getText(),textField_9.getText(),
		 								 ofw.getSelectedItem().toString(),titleTF.getText(),respon.getText(),rab_num.getSelectedItem().toString(),
		 								 appelant.getSelectedItem().toString(),date_prom,other.getText(),appealOr.getText(),appp_date,full_cnum,full_rab,
		 								 BondAmount.getText(),bndDM,textField_11.getText(),textField_12.getText(),bndm_new,
		 								 comboBox_6.getSelectedItem().toString(),ammCurrency.getSelectedItem().toString(),tfPonente.getText(),
		 								 taDecisiononApp.getText(),mrFiled1.getText(),decisionMR1.getText(),dtmR2,mrFiled2.getText(),decisionMR2.getText(),comboBox_4.getSelectedItem().toString());
		 						 JOptionPane.showMessageDialog(null,"Case Updated!");




DefaultTableModel tm = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryCaseTitle());
	     				tm.addColumn("#");
	     				dataTable.setModel(tm);
	     				dataTable.moveColumn(5,0);
	     				theader();
		 			
		 				CardLayout cl = (CardLayout) layeredPane.getLayout();
						cl.show(layeredPane, "name_64533364253644"); 
						tfCnum.setText("");
						decisionMR2.setText("");
						mrFiled2.setText("");
						decisionMR1.setText("");
						mrFiled1.setText("");
						taDecisiononApp.setText("");
						tfPonente.setText("");
						BondAmount.setText("");
						other.setText("");
						appealOr.setText("");
						textField_11.setText("");
						textField_12.setText("");
						//nlrcMonth.setText("");
						//dateAppMonth.setText("");
						//dateMRMonth.setText("");
						induCode.setText("");
						natureOfC.setText("");
						natureofA.setText("");
						ammOfAward.setText("");
						textField_8.setText("");
						textField_7.setText("");
						textField_9.setText("");
						appealFee.setText("");
						bondFee.setText("");
						//entryJudgement.setText("");
						reamarkTf.setText("");
						titleTF.setText("");
						respon.setText("");
						//OECCMonth.setText("");
						//dateCommMonth.setText("");
						//dateMRproMonth.setText("");
						//dateMailedMonth.setText("");
						//dateForwardMonth.setText("");
						courierAir.setText("");
						//COM.setText("");
						LA.setText("");
						//AppeaDate.setText("");
						bondDate.setText("");
						//dateEntryMonth.setText("");
		 				}else {
		 					CardLayout cl = (CardLayout) layeredPane.getLayout();
		 				    cl.show(layeredPane, "name_532941681539733");
		 				}




		 				}
		 				
 				}else {
 					JOptionPane.showMessageDialog(null, msgValidate);
 				}
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				panel_62.setBackground(Color.decode("#449d44"));
 			}
 			@Override
 			public void mouseExited(MouseEvent e) {
 				panel_62.setBackground(Color.decode("#5cb85c"));
 			}
 		});
 		
 		JLabel label_4 = new JLabel("SAVE");
 		label_4.setHorizontalAlignment(SwingConstants.CENTER);
 		label_4.setForeground(Color.WHITE);
 		GroupLayout gl_panel_62 = new GroupLayout(panel_62);
 		gl_panel_62.setHorizontalGroup(
 			gl_panel_62.createParallelGroup(Alignment.TRAILING)
 				.addGroup(gl_panel_62.createSequentialGroup()
 					.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
 					.addGap(1))
 		);
 		gl_panel_62.setVerticalGroup(
 			gl_panel_62.createParallelGroup(Alignment.LEADING)
 				.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
 		);
 		panel_62.setLayout(gl_panel_62);
 		
 		JPanel panel_69 = new JPanel() {
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
 		panel_69.setBackground(new Color(51, 122, 183));
 		
 		JLabel label_26 = new JLabel("BACK");
 		panel_69.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseClicked(MouseEvent e) {
 				if(edit == 0) {
	 				CardLayout cl = (CardLayout) layeredPane.getLayout();
					cl.show(layeredPane, "name_64533364253644"); 	
 				}else {
 					CardLayout cl = (CardLayout) layeredPane.getLayout();
					cl.show(layeredPane, "name_89873841572306"); 	
 					
 				}
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				panel_69.setBackground(Color.decode("#286090"));
 			}
 			@Override
 			public void mouseExited(MouseEvent e) {
 				panel_69.setBackground(Color.decode("#337ab7"));
 			}
 		});
 		label_26.setHorizontalAlignment(SwingConstants.CENTER);
 		label_26.setForeground(Color.WHITE);
 		GroupLayout gl_panel_69 = new GroupLayout(panel_69);
 		gl_panel_69.setHorizontalGroup(
 			gl_panel_69.createParallelGroup(Alignment.LEADING)
 				.addComponent(label_26, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
 		);
 		gl_panel_69.setVerticalGroup(
 			gl_panel_69.createParallelGroup(Alignment.LEADING)
 				.addComponent(label_26, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
 		);
 		panel_69.setLayout(gl_panel_69);
 		GroupLayout gl_panel_70 = new GroupLayout(panel_70);
 		gl_panel_70.setHorizontalGroup(
 			gl_panel_70.createParallelGroup(Alignment.LEADING)
 				.addGroup(gl_panel_70.createSequentialGroup()
 					.addComponent(panel_62, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
 					.addGap(1)
 					.addComponent(panel_69, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
 		);
 		gl_panel_70.setVerticalGroup(
 			gl_panel_70.createParallelGroup(Alignment.TRAILING)
 				.addComponent(panel_62, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
 				.addComponent(panel_69, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
 		);
 		panel_70.setLayout(gl_panel_70);
 		for(int month = 1 ; month <= 12 ; month++ ) {
 		}
 		int month_now = Calendar.getInstance().get(Calendar.MONTH);
 		int day_now = Calendar.getInstance().get(Calendar.DATE);
 		for(int day = 1 ; day <= 31 ; day++ ) {
 			if(day == day_now) {
 			}
 			
 			
 		}
 		int year_now = Calendar.getInstance().get(Calendar.YEAR);
 		int yearIndex = 0;
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			if(year == year_now) {
 			}
 			yearIndex++;
 		}
 		for(int month = 1 ; month <= 12 ; month++ ) {
 			
 		}
 		for(int day = 1 ; day <= 31 ; day++ ) {
 			
 			if(day == day_now) {
 				
 			}
 			
 			
 		}
 		yearIndex = 0;
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			
 			if(year == year_now) {
 				
 			}
 			yearIndex++;
 		}
 		for(int month = 1 ; month <= 12 ; month++ ) {
 		}

 		for(int day = 1 ; day <= 31 ; day++ ) {
 			if(day == day_now) {
 			}	
 		}
 		yearIndex = 0;
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			
 			if(year == year_now) {
 
 			}
 			yearIndex++;
 		}
 		for(int month = 1 ; month <= 12 ; month++ ) {
 			
 		}
 		for(int day = 1 ; day <= 31 ; day++ ) {
 			
 			if(day == day_now) {
 			
 			}
 		}
 		yearIndex = 0;
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			
 			if(year == year_now) {
 				
 			}
 			yearIndex++;
 		}
 		for(int month = 1 ; month <= 12 ; month++ ) {
 			
 		}
 		for(int day = 1 ; day <= 31 ; day++ ) {
 			
 			if(day == day_now) {
 				
 			}	
 		}
 		yearIndex = 0;
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			
 			if(year == year_now) {
 			}
 			yearIndex++;
 		}
 		for(int month = 1 ; month <= 12 ; month++ ) {
 			
 		}

 		for(int day = 1 ; day <= 31 ; day++ ) {
 			
 			if(day == day_now) {
 				
 			}	
 		}

 		yearIndex = 0;
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			
 			if(year == year_now) {
 			
 			}
 			yearIndex++;
 		}

 		for(int month = 1 ; month <= 12 ; month++ ) {
 			
 		}

 		for(int day = 1 ; day <= 31 ; day++ ) {
 			
 			if(day == day_now) {
 				
 			}	
 		}
 		yearIndex = 0;
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			
 			if(year == year_now) {
 				
 			}
 			yearIndex++;
 		}
 		for(int month = 1 ; month <= 12 ; month++ ) {
 			
 		}
 		for(int day = 1 ; day <= 31 ; day++ ) {
 			
 			if(day == day_now) {
 				
 			}	
 		}
 		yearIndex = 0;
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			
 			if(year == year_now) {
 			
 			}
 			yearIndex++;
 		}
	 		
	 		scrollPane_3 = new JScrollPane();
	 		
	 		JPanel panel_21 = new JPanel();
	 		panel_21.setBackground(new Color(27,37,46));
	 		scrollPane_3.setViewportView(panel_21);
	 		
	 	
	 		
	 		comboBox = new JComboBox();
	 		comboBox.addItem("MAC No.");
	 		comboBox.addItem("MER No.");
	 		comboBox.addItem("CC No.");
	 		
	 		tfCnum = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		
	 		tfCnum.setColumns(10);
	 		
	 		JLabel label_20 = new JLabel("Case Title:");
	 		label_20.setForeground(Color.WHITE);
	 		label_20.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		textField_9 = new JTextField(){
			@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		textField_9.setColumns(10);
	 		
	 		titleTF = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		titleTF.setColumns(10);
	 		
	 		rab_num = new JComboBox();
	 		rab_num.addItem("RAB");
	 		rab_num.addItem("SRAB");
	 		
	 		OECCMonth = new JComboBox();
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			OECCMonth.addItem(monthList[month]);
	 		}
	 		OECCMonth.setSelectedIndex(month_now);
	 		
	 		
	 		OECCDay = new JComboBox();
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			OECCDay.addItem(String.valueOf(day));
	 			if(day == day_now) {
	 				OECCDay.setSelectedIndex(day-1);
	 			}
	 		}
	 		
	 		OECCYear = new JComboBox();
	 		yearIndex = 0;
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			OECCYear.addItem(String.valueOf(year));
	 			if(year == year_now) {
	 				OECCYear.setSelectedIndex(yearIndex);
	 			}
	 			yearIndex++;
	 		}
	 		
	 		induCode = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		induCode.setColumns(10);
	 		
	 		natureOfC = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		natureOfC.setColumns(10);
	 		
	 		natureofA = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		natureofA.setColumns(10);
	 		
	 		ammCurrency = new JComboBox();
	 		ammCurrency.addItem("--");
	 		for(int x = 0;x<currency.length;x++) {
	 			ammCurrency.addItem(currency[x]);
	 		}
	 		
	 		
	 		ammOfAward = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		ammOfAward.setColumns(10);
	 		
	 		textField_8 = new JTextField() {
			@Override protected void paintComponent(Graphics g) {
			    if (!isOpaque() && getBorder() instanceof RoundTextField) {
			      Graphics2D g2 = (Graphics2D) g.create();
			      g2.setPaint(getBackground());
			      g2.fill(((RoundTextField) getBorder()).getBorderShape(
			          0, 0, getWidth() - 1, getHeight() - 1,15));
			      
			      g2.dispose();
			    }
			    super.paintComponent(g);
			  }
			  @Override public void updateUI() {
			    super.updateUI();
			    setOpaque(false);
			  
			    
			    setBorder(new RoundTextField(15));
			  }
		};
	 		textField_8.setColumns(10);
	 		
	 		LA = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		LA.setColumns(10);
	 		
	 		comboBox_6 = new JComboBox();
	 		comboBox_6.addItem("--");
	 		for(int x = 0;x<currency.length;x++) {
	 			comboBox_6.addItem(currency[x]);
	 		}
	 		
	 		appealFee = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		appealFee.setColumns(10);
	 		
	 		bondFee = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		bondFee.setColumns(10);
	 		//origina
	 		bondDate = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		bondDate.setColumns(10);
	 		
	 		courierAir = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
					    if (!isOpaque() && getBorder() instanceof RoundTextField) {
					      Graphics2D g2 = (Graphics2D) g.create();
					      g2.setPaint(getBackground());
					      g2.fill(((RoundTextField) getBorder()).getBorderShape(
					          0, 0, getWidth() - 1, getHeight() - 1,15));
					      
					      g2.dispose();
					    }
					    super.paintComponent(g);
					  }
					  @Override public void updateUI() {
					    super.updateUI();
					    setOpaque(false);
					  
					    
					    setBorder(new RoundTextField(15));
					  }
				};
	 		courierAir.setColumns(10);
	 		
	 		ofw = new JComboBox();
	 		ofw.addItem("--");
	 		ofw.addItem("OFW (L)");
	 		ofw.addItem("OFW");
	 		
	 		respon = new JTextField()  {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		respon.setColumns(10);
	 		
	 		JLabel label_61 = new JLabel("VS");
	 		label_61.setForeground(Color.WHITE);
	 		label_61.setFont(new Font("Arial", Font.BOLD, 15));
	 		
	 		appelant = new JComboBox();
	 		appelant.addItem("------");
	 		appelant.addItem("Complainant");
	 		appelant.addItem("Respondent");
	 		appelant.addItem("Both");
	 		appelant.addItem("Petitioner");
	 		
	 		nlrcM = new JComboBox();
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			nlrcM.addItem(monthList[month]);
	 		}
	 		
	 		nlrcD = new JComboBox();
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			nlrcD.addItem(String.valueOf(day));
	 		}
	 		
	 		nlrcY = new JComboBox();
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			nlrcY.addItem(String.valueOf(year));
	 			yearIndex++;
	 		}
	 		
	 		JLabel label_21 = new JLabel("(Complainant)");
	 		label_21.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_21.setForeground(Color.WHITE);
	 		label_21.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_19 = new JLabel("Date Appealed to NLRC:");
	 		label_19.setForeground(Color.WHITE);
	 		label_19.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_22 = new JLabel("(Respondent)");
	 		label_22.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_22.setForeground(Color.WHITE);
	 		label_22.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_31 = new JLabel("Appellant:");
	 		label_31.setForeground(Color.WHITE);
	 		label_31.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_27 = new JLabel("Industry Code:");
	 		label_27.setForeground(Color.WHITE);
	 		label_27.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_29 = new JLabel("Nature of Case:");
	 		label_29.setForeground(Color.WHITE);
	 		label_29.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_33 = new JLabel("Nature of Award:");
	 		label_33.setForeground(Color.WHITE);
	 		label_33.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_18 = new JLabel("Amount of Award:");
	 		label_18.setForeground(Color.WHITE);
	 		label_18.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_24 = new JLabel("RAB Decision Date:");
	 		label_24.setForeground(Color.WHITE);
	 		label_24.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		rabDM = new JComboBox();
	 		rabDM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			rabDM.addItem(monthList[month]);
	 		}
	 		rabDM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(rabDM.getSelectedItem().toString().equals("--")) {
	 					rabDD.setSelectedIndex(0);
	 					rabDY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		rabDD = new JComboBox();
	 		rabDD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			rabDD.addItem(String.valueOf(day));
	 		}
	 		rabDD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(rabDD.getSelectedItem().toString().equals("--")) {
	 					rabDM.setSelectedIndex(0);
	 					rabDY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		rabDY = new JComboBox();
	 		rabDY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			rabDY.addItem(String.valueOf(year));

	 		}
	 		rabDY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(rabDY.getSelectedItem().toString().equals("----")) {
	 					rabDM.setSelectedIndex(0);
	 					rabDD.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		dPromY = new JComboBox();
	 		dPromY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			dPromY.addItem(String.valueOf(year));

	 		}
	 		dPromY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dPromY.getSelectedItem().toString().equals("----")) {
	 					dProM.setSelectedIndex(0);
	 					dPromD.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		dPromD = new JComboBox();
	 		dPromD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			dPromD.addItem(String.valueOf(day));
	 		}
	 		dPromD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dPromD.getSelectedItem().toString().equals("--")) {
	 					dProM.setSelectedIndex(0);
	 					dPromY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		dProM = new JComboBox();
	 		dProM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			dProM.addItem(monthList[month]);
	 		}
	 		dProM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dProM.getSelectedItem().toString().equals("--")) {
	 					dPromD.setSelectedIndex(0);
	 					dPromY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel lblDatePromulgated = new JLabel("Date Promulgated:");
	 		lblDatePromulgated.setForeground(Color.WHITE);
	 		lblDatePromulgated.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		textField_7 = new JTextField()  {
			@Override protected void paintComponent(Graphics g) {
			    if (!isOpaque() && getBorder() instanceof RoundTextField) {
			      Graphics2D g2 = (Graphics2D) g.create();
			      g2.setPaint(getBackground());
			      g2.fill(((RoundTextField) getBorder()).getBorderShape(
			          0, 0, getWidth() - 1, getHeight() - 1,15));
			      
			      g2.dispose();
			    }
			    super.paintComponent(g);
			  }
			  @Override public void updateUI() {
			    super.updateUI();
			    setOpaque(false);
			  
			    
			    setBorder(new RoundTextField(15));
			  }
		};
	 		textField_7.setColumns(10);
	 		
	 		dMailM = new JComboBox();
	 		dMailM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			dMailM.addItem(monthList[month]);
	 		}
	 		dMailM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dMailM.getSelectedItem().toString().equals("--")) {
	 					dMailD.setSelectedIndex(0);
	 					dMailY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		dMailD = new JComboBox();
	 		dMailD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			dMailD.addItem(String.valueOf(day));
	 		}
	 		dMailD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dMailD.getSelectedItem().toString().equals("--")) {
	 					dMailM.setSelectedIndex(0);
	 					dMailY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		
	 		dMailY = new JComboBox();
	 		dMailY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			dMailY.addItem(String.valueOf(year));

	 		}
	 		dMailY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dMailY.getSelectedItem().toString().equals("----")) {
	 					dMailM.setSelectedIndex(0);
	 					dMailD.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_53 = new JLabel("Date Mailed:");
	 		label_53.setForeground(Color.WHITE);
	 		label_53.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		dAppealRM = new JComboBox();
	 		dAppealRM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			dAppealRM.addItem(monthList[month]);
	 		}
	 		dAppealRM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dAppealRM.getSelectedItem().toString().equals("--")) {
	 					dAppealRD.setSelectedIndex(0);
	 					dAppealRY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 		dAppealRD = new JComboBox();
	 		dAppealRD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			dAppealRD.addItem(String.valueOf(day));
	 		}
	 		dAppealRD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dAppealRD.getSelectedItem().toString().equals("--")) {
	 					dAppealRM.setSelectedIndex(0);
	 					dAppealRY.setSelectedIndex(0);
	 				}
	 			}
	 		});


	 		
	 		dAppealRY = new JComboBox();
	 		dAppealRY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			dAppealRY.addItem(String.valueOf(year));

	 		}
	 		dAppealRY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dAppealRY.getSelectedItem().toString().equals("----")) {
	 					dAppealRM.setSelectedIndex(0);
	 					dAppealRD.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_58 = new JLabel("Date Appeal Received:");
	 		label_58.setForeground(Color.WHITE);
	 		label_58.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		comboBox_5 = new JComboBox();
	 		comboBox_5.addItem("--");
	 		comboBox_5.addItem("ELA");
	 		comboBox_5.addItem("LA");
	 		
	 		JLabel label_59 = new JLabel("Female:");
	 		label_59.setForeground(Color.WHITE);
	 		label_59.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_60 = new JLabel("  Male:");
	 		label_60.setForeground(Color.WHITE);
	 		label_60.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_64 = new JLabel("APPEAL:");
	 		label_64.setForeground(Color.WHITE);
	 		label_64.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		appealOr = new JTextField() {
	 					@Override protected void paintComponent(Graphics g) {
	 						    if (!isOpaque() && getBorder() instanceof RoundTextField) {
	 						      Graphics2D g2 = (Graphics2D) g.create();
	 						      g2.setPaint(getBackground());
	 						      g2.fill(((RoundTextField) getBorder()).getBorderShape(
	 						          0, 0, getWidth() - 1, getHeight() - 1,15));
	 						      
	 						      g2.dispose();
	 						    }
	 						    super.paintComponent(g);
	 						  }
	 						  @Override public void updateUI() {
	 						    super.updateUI();
	 						    setOpaque(false);
	 						  
	 						    
	 						    setBorder(new RoundTextField(15));
	 						  }
	 					};
	 		appealOr.setColumns(10);
	 		
	 		appealfeeM = new JComboBox();
	 		appealfeeM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			appealfeeM.addItem(monthList[month]);
	 		}
	 		appealfeeM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(appealfeeM.getSelectedItem().toString().equals("--")) {
	 					appealfeeD.setSelectedIndex(0);
	 					appealfeeY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		appealfeeD = new JComboBox();
	 		appealfeeD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			appealfeeD.addItem(String.valueOf(day));
	 		}
	 		appealfeeD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(appealfeeY.getSelectedItem().toString().equals("--")) {
	 					appealfeeD.setSelectedIndex(0);
	 					appealfeeM.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		appealfeeY = new JComboBox();
	 		appealfeeY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			appealfeeY.addItem(String.valueOf(year));

	 		}
	 		appealfeeY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(appealfeeY.getSelectedItem().toString().equals("----")) {
	 					appealfeeD.setSelectedIndex(0);
	 					appealfeeM.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_71 = new JLabel("BOND:");
	 		label_71.setForeground(Color.WHITE);
	 		label_71.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		BondAmount = new JTextField() {
	 					@Override protected void paintComponent(Graphics g) {
	 						    if (!isOpaque() && getBorder() instanceof RoundTextField) {
	 						      Graphics2D g2 = (Graphics2D) g.create();
	 						      g2.setPaint(getBackground());
	 						      g2.fill(((RoundTextField) getBorder()).getBorderShape(
	 						          0, 0, getWidth() - 1, getHeight() - 1,15));
	 						      
	 						      g2.dispose();
	 						    }
	 						    super.paintComponent(g);
	 						  }
	 						  @Override public void updateUI() {
	 						    super.updateUI();
	 						    setOpaque(false);
	 						  
	 						    
	 						    setBorder(new RoundTextField(15));
	 						  }
	 					};
	 		BondAmount.setColumns(10);
	 		
	 		
	 		bondDate.setColumns(10);
	 		
	 		bondDD = new JComboBox();
	 		bondDD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			bondDD.addItem(String.valueOf(day));
	 		}
	 		bondDD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(bondDD.getSelectedItem().toString().equals("--")) {
	 					bondDM.setSelectedIndex(0);
	 					bondDY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		bondDM = new JComboBox();
	 		bondDM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			bondDM.addItem(monthList[month]);
	 		}
	 		bondDM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(bondDM.getSelectedItem().toString().equals("--")) {
	 					bondDD.setSelectedIndex(0);
	 					bondDY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 		bondDY = new JComboBox();
	 		bondDY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			bondDY.addItem(String.valueOf(year));

	 		}
	 		bondDY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(bondDY.getSelectedItem().toString().equals("----")) {
	 					bondDD.setSelectedIndex(0);
	 					bondDM.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		textField_11 = new JTextField(){
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		textField_11.setColumns(10);
	 		
	 		textField_12 = new JTextField(){
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		textField_12.setColumns(10);
	 		
	 		bndm = new JComboBox();
	 		bndm.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			bndm.addItem(monthList[month]);
	 		}
	 		bndm.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(bndm.getSelectedItem().toString().equals("--")) {
	 					bndd.setSelectedIndex(0);
	 					bndy.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		bndd = new JComboBox();
	 		bndd.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			bndd.addItem(String.valueOf(day));
	 		}
	 		bndd.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(bndd.getSelectedItem().toString().equals("--")) {
	 					bndm.setSelectedIndex(0);
	 					bndy.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		bndy = new JComboBox();
	 		bndy.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			bndy.addItem(String.valueOf(year));

	 		}
	 		bndy.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(bndy.getSelectedItem().toString().equals("----")) {
	 					bndm.setSelectedIndex(0);
	 					bndd.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_83 = new JLabel("Date Received by OECC:");
	 		label_83.setForeground(Color.WHITE);
	 		label_83.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_88 = new JLabel("Ponente:");
	 		label_88.setForeground(Color.WHITE);
	 		label_88.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		tfPonente = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		
	 		JLabel label_89 = new JLabel("Date Received by Ponente:");
	 		label_89.setForeground(Color.WHITE);
	 		label_89.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		ponenteDM = new JComboBox();
	 		ponenteDM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			ponenteDM.addItem(monthList[month]);
	 		}
	 		ponenteDM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(ponenteDM.getSelectedItem().toString().equals("--")) {
	 					ponenteDD.setSelectedIndex(0);
	 					ponenteDY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		ponenteDD = new JComboBox();
	 		ponenteDD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			ponenteDD.addItem(String.valueOf(day));
	 		}
	 		ponenteDD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(ponenteDD.getSelectedItem().toString().equals("--")) {
	 					ponenteDM.setSelectedIndex(0);
	 					ponenteDY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 		JComboBox comboBox_12 = new JComboBox();
	 		comboBox_12.setBounds(656, 321, 99, 20);
	 		
	 		JLabel label_23 = new JLabel("Date Appeal Promulgated:");
	 		label_23.setForeground(Color.WHITE);
	 		label_23.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		dateAppPonenteM = new JComboBox();
	 		dateAppPonenteM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			dateAppPonenteM.addItem(monthList[month]);
	 		}
	 		dateAppPonenteM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateAppPonenteM.getSelectedItem().toString().equals("--")) {
	 					dateAppPoneneteD.setSelectedIndex(0);
	 					dateAppPoneneteY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		dateAppPoneneteD = new JComboBox();
	 		dateAppPoneneteD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			dateAppPoneneteD.addItem(String.valueOf(day));
	 		}
	 		dateAppPoneneteD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateAppPoneneteD.getSelectedItem().toString().equals("--")) {
	 					dateAppPonenteM.setSelectedIndex(0);
	 					dateAppPoneneteY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		dateAppPoneneteY = new JComboBox();
	 		dateAppPoneneteY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			dateAppPoneneteY.addItem(String.valueOf(year));

	 		}
	 		dateAppPoneneteY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateAppPoneneteY.getSelectedItem().toString().equals("----")) {
	 					dateAppPonenteM.setSelectedIndex(0);
	 					dateAppPoneneteD.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_95 = new JLabel("Decision on Appeal:");
	 		label_95.setForeground(Color.WHITE);
	 		label_95.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_96 = new JLabel("Date MR Filed:");
	 		label_96.setForeground(Color.WHITE);
	 		label_96.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		dateMRM1 = new JComboBox();
	 		dateMRM1.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			dateMRM1.addItem(monthList[month]);
	 		}
	 		dateMRM1.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateMRM1.getSelectedItem().toString().equals("--")) {
	 					dateMRD1.setSelectedIndex(0);
	 					dateMRY1.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 		dateMRD1 = new JComboBox();
	 		dateMRD1.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			dateMRD1.addItem(String.valueOf(day));
	 		}
	 		dateMRD1.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateMRD1.getSelectedItem().toString().equals("--")) {
	 					dateMRY1.setSelectedIndex(0);
	 					dateMRM1.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		dateMRY1 = new JComboBox();
	 		dateMRY1.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			dateMRY1.addItem(String.valueOf(year));

	 		}
	 		dateMRY1.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateMRY1.getSelectedItem().toString().equals("----")) {
	 					dateMRD1.setSelectedIndex(0);
	 					dateMRM1.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		ponenteDY = new JComboBox();
	 		ponenteDY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			ponenteDY.addItem(String.valueOf(year));
	 		}
	 		ponenteDY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(ponenteDY.getSelectedItem().toString().equals("----")) {
	 					ponenteDM.setSelectedIndex(0);
	 					ponenteDD.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_25 = new JLabel("MR Filed by:");
	 		label_25.setForeground(Color.WHITE);
	 		label_25.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		mrFiled1 = new JTextField()  {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		
	 		JLabel label_62 = new JLabel("Decision on MR:");
	 		label_62.setForeground(Color.WHITE);
	 		label_62.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_63 = new JLabel("Date MR Filed:");
	 		label_63.setForeground(Color.WHITE);
	 		label_63.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		dateMRM2 = new JComboBox();
	 		dateMRM2.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			dateMRM2.addItem(monthList[month]);
	 		}
	 		dateMRM2.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateMRM2.getSelectedItem().toString().equals("--")) {
	 					dateMRD2.setSelectedIndex(0);
	 					dateMRY2.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 		dateMRD2 = new JComboBox();
	 		dateMRD2.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			dateMRD2.addItem(String.valueOf(day));
	 		}
	 		dateMRD2.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateMRD2.getSelectedItem().toString().equals("--")) {
	 					dateMRM2.setSelectedIndex(0);
	 					dateMRY2.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		dateMRY2 = new JComboBox();
	 		dateMRY2.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			dateMRY2.addItem(String.valueOf(year));
	 		}
	 		dateMRY2.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateMRY2.getSelectedItem().toString().equals("----")) {
	 					dateMRD2.setSelectedIndex(0);
	 					dateMRM2.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		mrFiled2 = new JTextField() {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		JLabel label_65 = new JLabel("Decision on MR:");
	 		label_65.setForeground(Color.WHITE);
	 		label_65.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_84 = new JLabel("MR Filed by:");
	 		label_84.setForeground(Color.WHITE);
	 		label_84.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_86 = new JLabel("Entry of Judgment:");
	 		label_86.setForeground(Color.WHITE);
	 		label_86.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		entryJM = new JComboBox();
	 		entryJM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			entryJM.addItem(monthList[month]);
	 		}
	 		entryJM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(entryJM.getSelectedItem().toString().equals("--")) {
	 					entryJD.setSelectedIndex(0);
	 					entryJY.setSelectedIndex(0);
	 				}
	 			}
	 		});


	 		
	 		entryJD = new JComboBox();
	 		entryJD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			entryJD.addItem(String.valueOf(day));
	 		}
	 		entryJD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(entryJD.getSelectedItem().toString().equals("--")) {
	 					entryJM.setSelectedIndex(0);
	 					entryJY.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		entryJY = new JComboBox();
	 		entryJY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			entryJY.addItem(String.valueOf(year));

	 		}
	 		entryJY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(entryJY.getSelectedItem().toString().equals("----")) {
	 					entryJM.setSelectedIndex(0);
	 					entryJD.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_87 = new JLabel("Date Entry of Judgment Issued:");
	 		label_87.setForeground(Color.WHITE);
	 		label_87.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		dEntryJID = new JComboBox();
	 		dEntryJID.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			dEntryJID.addItem(String.valueOf(day));
	 		}
	 		dEntryJID.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dEntryJID.getSelectedItem().toString().equals("--")) {
	 					dEntryJIM.setSelectedIndex(0);
	 					dEntryJIY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 	 	dEntryJIM = new JComboBox();
	 	 	dEntryJIM.addItem("--");
	 	 	for(int month = 0 ; month <= 11 ; month++ ) {
	 	 		dEntryJIM.addItem(monthList[month]);
	 	 	}
	 	 	dEntryJIM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dEntryJIM.getSelectedItem().toString().equals("--")) {
	 					dEntryJID.setSelectedIndex(0);
	 					dEntryJIY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 		dEntryJIY = new JComboBox();
	 		dEntryJIY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			dEntryJIY.addItem(String.valueOf(year));

	 		}
	 		dEntryJIY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dEntryJIY.getSelectedItem().toString().equals("----")) {
	 					dEntryJID.setSelectedIndex(0);
	 					dEntryJIM.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_90 = new JLabel("Date Remanded  to RAB/SRAB:");
	 		label_90.setForeground(Color.WHITE);
	 		label_90.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		dateRemandedM = new JComboBox();
	 		dateRemandedM.addItem("--");
	 		for(int month = 0 ; month <= 11 ; month++ ) {
	 			dateRemandedM.addItem(monthList[month]);
	 	 	}
	 		dateRemandedM.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateRemandedM.getSelectedItem().toString().equals("--")) {
	 					dateRemandedD.setSelectedIndex(0);
	 					dateRemandedY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 		dateRemandedD = new JComboBox();
	 		dateRemandedD.addItem("--");
	 		for(int day = 1 ; day <= 31 ; day++ ) {
	 			dateRemandedD.addItem(String.valueOf(day));
	 		}
	 		dateRemandedD.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateRemandedD.getSelectedItem().toString().equals("--")) {
	 					dateRemandedM.setSelectedIndex(0);
	 					dateRemandedY.setSelectedIndex(0);
	 				}
	 			}
	 		});

	 		
	 		dateRemandedY = new JComboBox();
	 		dateRemandedY.addItem("----");
	 		for(int year = 1978 ; year <= year_now  ; year++ ) {
	 			dateRemandedY.addItem(String.valueOf(year));

	 		}
	 		dateRemandedY.addActionListener(new ActionListener() {
	 			public void actionPerformed(ActionEvent arg0) {
	 				if(dateRemandedY.getSelectedItem().toString().equals("--")) {
	 					dateRemandedM.setSelectedIndex(0);
	 					dateRemandedD.setSelectedIndex(0);
	 				}
	 			}
	 		});
	 		
	 		JLabel label_91 = new JLabel("Courier Airbill No.");
	 		label_91.setForeground(Color.WHITE);
	 		label_91.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_92 = new JLabel("Remarks:");
	 		label_92.setForeground(Color.WHITE);
	 		label_92.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_28 = new JLabel("Fee:");
	 		label_28.setForeground(Color.WHITE);
	 		label_28.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_30 = new JLabel("OR No.:");
	 		label_30.setForeground(Color.WHITE);
	 		label_30.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_32 = new JLabel("Date:");
	 		label_32.setForeground(Color.WHITE);
	 		label_32.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_38 = new JLabel("Cash:");
	 		label_38.setForeground(Color.WHITE);
	 		label_38.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_41 = new JLabel("Amount:");
	 		label_41.setForeground(Color.WHITE);
	 		label_41.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_43 = new JLabel("OR No.:");
	 		label_43.setForeground(Color.WHITE);
	 		label_43.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_49 = new JLabel("Date:");
	 		label_49.setForeground(Color.WHITE);
	 		label_49.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_51 = new JLabel("Surety:");
	 		label_51.setForeground(Color.WHITE);
	 		label_51.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_52 = new JLabel("Bond No.:");
	 		label_52.setForeground(Color.WHITE);
	 		label_52.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JLabel label_55 = new JLabel("Date:");
	 		label_55.setForeground(Color.WHITE);
	 		label_55.setFont(new Font("Arial", Font.BOLD, 12));
	 		
	 		JPanel panel_23 = new JPanel();
	 		panel_23.setBackground(new Color(27,37,46));
	 		
	 		JScrollPane scrollPane_8 = new JScrollPane();
	 		scrollPane_8.setBorder(BorderFactory.createEmptyBorder());
	 		scrollPane_8.getViewport().setBackground(new Color(27,37,46));
	 		
	 		other = new JTextArea() {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		scrollPane_8.setViewportView(other);
	 		
	 		JScrollPane scrollPane_9 = new JScrollPane();
	 		scrollPane_9.setBorder(BorderFactory.createEmptyBorder());
	 		scrollPane_9.getViewport().setBackground(new Color(27,37,46));
	 		
	 		taDecisiononApp = new JTextArea() {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		scrollPane_9.setViewportView(taDecisiononApp);
	 		scrollPane_9.setBackground(new Color(27,37,46));
	 		
	 		JScrollPane scrollPane_10 = new JScrollPane();
	 		scrollPane_10.setBorder(BorderFactory.createEmptyBorder());
	 		scrollPane_10.getViewport().setBackground(new Color(27,37,46));
	 		decisionMR1 = new JTextArea() {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		scrollPane_10.setViewportView(decisionMR1);
	 		
	 		JScrollPane scrollPane_11 = new JScrollPane();
	 		scrollPane_11.setBorder(BorderFactory.createEmptyBorder());
	 		scrollPane_11.getViewport().setBackground(new Color(27,37,46));
	 		
	 		decisionMR2 = new JTextArea() {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		scrollPane_11.setViewportView(decisionMR2);
	 		
	 		JScrollPane scrollPane_12 = new JScrollPane();
	 		scrollPane_12.setBorder(BorderFactory.createEmptyBorder());
	 		scrollPane_12.getViewport().setBackground(new Color(27,37,46));
	 		
	 		
	 		reamarkTf = new JTextArea() {
				@Override protected void paintComponent(Graphics g) {
				    if (!isOpaque() && getBorder() instanceof RoundTextField) {
				      Graphics2D g2 = (Graphics2D) g.create();
				      g2.setPaint(getBackground());
				      g2.fill(((RoundTextField) getBorder()).getBorderShape(
				          0, 0, getWidth() - 1, getHeight() - 1,15));
				      
				      g2.dispose();
				    }
				    super.paintComponent(g);
				  }
				  @Override public void updateUI() {
				    super.updateUI();
				    setOpaque(false);
				  
				    
				    setBorder(new RoundTextField(15));
				  }
			};
	 		scrollPane_12.setViewportView(reamarkTf);
	 		
	 		JLabel label_56 = new JLabel("(MM-DD-YYYY)");
	 		label_56.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_56.setForeground(Color.WHITE);
	 		label_56.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_57 = new JLabel("(MM-DD-YYYY)");
	 		label_57.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_57.setForeground(Color.WHITE);
	 		label_57.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_67 = new JLabel("(MM-DD-YYYY)");
	 		label_67.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_67.setForeground(Color.WHITE);
	 		label_67.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_66 = new JLabel("(MM-DD-YYYY)");
	 		label_66.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_66.setForeground(Color.WHITE);
	 		label_66.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_68 = new JLabel("(MM-DD-YYYY)");
	 		label_68.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_68.setForeground(Color.WHITE);
	 		label_68.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_69 = new JLabel("(MM-DD-YYYY)");
	 		label_69.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_69.setForeground(Color.WHITE);
	 		label_69.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_70 = new JLabel("(MM-DD-YYYY)");
	 		label_70.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_70.setForeground(Color.WHITE);
	 		label_70.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_72 = new JLabel("(MM-DD-YYYY)");
	 		label_72.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_72.setForeground(Color.WHITE);
	 		label_72.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_73 = new JLabel("(MM-DD-YYYY)");
	 		label_73.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_73.setForeground(Color.WHITE);
	 		label_73.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_74 = new JLabel("(MM-DD-YYYY)");
	 		label_74.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_74.setForeground(Color.WHITE);
	 		label_74.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_75 = new JLabel("(MM-DD-YYYY)");
	 		label_75.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_75.setForeground(Color.WHITE);
	 		label_75.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_76 = new JLabel("(MM-DD-YYYY)");
	 		label_76.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_76.setForeground(Color.WHITE);
	 		label_76.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_77 = new JLabel("(MM-DD-YYYY)");
	 		label_77.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_77.setForeground(Color.WHITE);
	 		label_77.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_78 = new JLabel("(MM-DD-YYYY)");
	 		label_78.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_78.setForeground(Color.WHITE);
	 		label_78.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		JLabel label_79 = new JLabel("(MM-DD-YYYY)");
	 		label_79.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_79.setForeground(Color.WHITE);
	 		label_79.setFont(new Font("Arial", Font.ITALIC, 10));
	 		
	 		comboBox_4 = new JComboBox();
	 		comboBox_4.addItem("--");
	 		for(int x = 0;x<currency.length;x++) {
	 			comboBox_4.addItem(currency[x]);
	 		}
	 		GroupLayout gl_panel_21 = new GroupLayout(panel_21);
	 		gl_panel_21.setHorizontalGroup(
	 			gl_panel_21.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(21)
	 					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 					.addGap(1)
	 					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
	 					.addGap(1)
	 					.addComponent(ofw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 					.addGap(38)
	 					.addComponent(rab_num, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
	 					.addGap(1)
	 					.addComponent(tfCnum, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(31)
	 					.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(21)
	 					.addComponent(titleTF, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)
	 					.addGap(9)
	 					.addComponent(label_61)
	 					.addGap(10)
	 					.addComponent(respon, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(21)
	 					.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
	 					.addGap(38)
	 					.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(32)
	 					.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 					.addGap(423)
	 					.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addComponent(appelant, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
	 					.addGap(315)
	 					.addComponent(nlrcM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(11)
	 					.addComponent(nlrcD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(nlrcY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(label_72, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(32)
	 					.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 					.addGap(423)
	 					.addComponent(label_83, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addComponent(induCode, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
	 					.addGap(315)
	 					.addComponent(OECCMonth, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(OECCDay, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(OECCYear, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(10)
	 							.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(natureOfC, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
	 					.addGap(315)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(21)
	 							.addComponent(label_88, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(tfPonente, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(32)
	 					.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
	 					.addGap(408)
	 					.addComponent(label_89, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addComponent(natureofA, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
	 					.addGap(142)
	 					.addComponent(ponenteDM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(ponenteDD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(ponenteDY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(label_73, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(32)
	 					.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
	 					.addGap(382)
	 					.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addComponent(ammCurrency, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
	 					.addGap(1)
	 					.addComponent(ammOfAward, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
	 					.addGap(262)
	 					.addComponent(dateAppPonenteM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(11)
	 					.addComponent(dateAppPoneneteD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(dateAppPoneneteY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	 					.addGap(16)
	 					.addComponent(label_74, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
	 					.addGap(368)
	 					.addComponent(label_95, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(rabDM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(rabDD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(rabDY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(10)
	 							.addComponent(lblDatePromulgated, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(4)
	 					.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 					.addGap(161)
	 					.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addComponent(dProM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(dPromD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(dPromY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	 					.addGap(4)
	 					.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 					.addGap(169)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(21)
	 							.addComponent(label_96, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(dateMRM1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(dateMRD1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(dateMRY1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(10)
	 					.addComponent(label_75, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(31)
	 					.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
	 					.addGap(369)
	 					.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addComponent(dMailM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(dMailD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(dMailY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	 					.addGap(4)
	 					.addComponent(label_66, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 					.addGap(169)
	 					.addComponent(mrFiled1, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(22)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(10)
	 							.addComponent(label_58, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(dAppealRM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(dAppealRD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(dAppealRY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	 							.addGap(4)
	 							.addComponent(label_67, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(248)
	 							.addComponent(label_59, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(label_60, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(9)
	 							.addComponent(LA, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
	 					.addGap(130)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(29)
	 							.addComponent(label_62, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(scrollPane_10, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(31)
	 							.addComponent(label_63, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(10)
	 							.addComponent(dateMRM2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(dateMRD2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(dateMRY2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(label_76, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(31)
	 							.addComponent(label_84, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(10)
	 							.addComponent(mrFiled2, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(31)
	 							.addComponent(label_65, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(32)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(10)
	 							.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	 							.addGap(15)
	 							.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
	 							.addGap(6)
	 							.addComponent(appealFee, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(10)
	 							.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	 							.addGap(15)
	 							.addComponent(appealOr, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(10)
	 							.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	 							.addGap(15)
	 							.addComponent(appealfeeM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(appealfeeD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(9)
	 							.addComponent(appealfeeY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(10)
	 					.addComponent(label_68, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 					.addGap(83)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addComponent(scrollPane_11, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addGroup(gl_panel_21.createSequentialGroup()
	 									.addGap(21)
	 									.addComponent(label_86, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 								.addGroup(gl_panel_21.createSequentialGroup()
	 									.addComponent(entryJM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 									.addGap(10)
	 									.addComponent(entryJD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 									.addGap(10)
	 									.addComponent(entryJY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
	 							.addGap(10)
	 							.addComponent(label_77, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(31)
	 					.addComponent(label_71, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
	 					.addGap(409)
	 					.addComponent(label_87))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(42)
	 					.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	 					.addGap(15)
	 					.addComponent(bondFee, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
	 					.addGap(175)
	 					.addComponent(dEntryJIM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(dEntryJID, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(dEntryJIY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	 					.addGap(10)
	 					.addComponent(label_78, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(42)
	 					.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
	 					.addGap(12)
	 					.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
	 					.addGap(6)
	 					.addComponent(BondAmount, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
	 					.addGap(175)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(21)
	 							.addComponent(label_90, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(dateRemandedM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(dateRemandedD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(dateRemandedY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(10)
	 					.addComponent(label_79, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(42)
	 					.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	 					.addGap(15)
	 					.addComponent(bondDate, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(42)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_49, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_51, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
	 					.addGap(14)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addComponent(bondDM, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(bondDD, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(9)
	 							.addComponent(bondDY, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
	 					.addGap(10)
	 					.addComponent(label_69, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 					.addGap(83)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(20)
	 							.addComponent(label_91, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(courierAir, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(42)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_52, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
	 					.addGap(1)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(bndm, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addComponent(bndd, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
	 							.addGap(9)
	 							.addComponent(bndy, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(10)
	 					.addComponent(label_70, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	 					.addGap(83)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(23)
	 							.addComponent(label_92, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(scrollPane_12, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)))
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(516)
	 					.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 		);
	 		gl_panel_21.setVerticalGroup(
	 			gl_panel_21.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_21.createSequentialGroup()
	 					.addGap(11)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(ofw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(rab_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(tfCnum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 					.addGap(7)
	 					.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 					.addGap(1)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addComponent(titleTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(label_61, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addComponent(respon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGap(21)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(3)
	 							.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(1)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(appelant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(nlrcM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(nlrcD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(nlrcY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_72, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGap(11)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(3)
	 							.addComponent(label_83, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(1)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(induCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(OECCMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(OECCDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(OECCYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 					.addGap(8)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(19)
	 							.addComponent(natureOfC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(label_88, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(19)
	 							.addComponent(tfPonente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(11)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_89, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(natureofA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(ponenteDM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(ponenteDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(ponenteDY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_73, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGap(13)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(ammCurrency, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(ammOfAward, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(dateAppPonenteM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(dateAppPoneneteD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(dateAppPoneneteY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_74, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGap(7)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_95, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGap(3)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(rabDM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(rabDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(rabDY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 							.addGap(22)
	 							.addComponent(lblDatePromulgated, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
	 					.addGap(6)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addComponent(dProM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addComponent(dPromD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addComponent(dPromY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(label_96, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(dateMRM1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(dateMRD1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(dateMRY1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(20)
	 							.addComponent(label_75, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(8)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGap(1)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(dMailM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(dMailD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(dMailY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_66, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(mrFiled1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 					.addGap(12)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(11)
	 							.addComponent(label_58, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGap(3)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(dAppealRM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(dAppealRD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(dAppealRY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(label_67, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 							.addGap(27)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(label_59, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(label_60, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(LA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 							.addGap(11)
	 							.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(label_62, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addComponent(scrollPane_10, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
	 							.addGap(17)
	 							.addComponent(label_63, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(dateMRM2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(dateMRD2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(dateMRY2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(label_76, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 							.addGap(11)
	 							.addComponent(label_84, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGap(1)
	 							.addComponent(mrFiled2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 							.addGap(1)
	 							.addComponent(label_65, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(2)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(2)
	 							.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addGroup(gl_panel_21.createSequentialGroup()
	 									.addGap(3)
	 									.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 								.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(appealFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 							.addGap(8)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addGroup(gl_panel_21.createSequentialGroup()
	 									.addGap(3)
	 									.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 								.addComponent(appealOr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 							.addGap(8)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addGroup(gl_panel_21.createSequentialGroup()
	 									.addGap(3)
	 									.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 								.addComponent(appealfeeM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(appealfeeD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(appealfeeY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(84)
	 							.addComponent(label_68, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(scrollPane_11, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
	 							.addGap(10)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addGroup(gl_panel_21.createSequentialGroup()
	 									.addComponent(label_86, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 									.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 										.addComponent(entryJM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 										.addComponent(entryJD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 										.addComponent(entryJY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 								.addGroup(gl_panel_21.createSequentialGroup()
	 									.addGap(19)
	 									.addComponent(label_77, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))))
	 					.addGap(13)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_71, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_87, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(11)
	 							.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(11)
	 							.addComponent(bondFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(dEntryJIM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(dEntryJID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(dEntryJIY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(label_78, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(11)
	 							.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(12)
	 							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(11)
	 							.addComponent(BondAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(label_90, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(dateRemandedM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(dateRemandedD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(dateRemandedY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(20)
	 							.addComponent(label_79, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(2)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(bondDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 					.addGap(6)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(4)
	 							.addComponent(label_49, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGap(8)
	 							.addComponent(label_51, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(1)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(bondDM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(bondDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(bondDY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 							.addGap(11)
	 							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 						.addComponent(label_69, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(label_91, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGap(1)
	 							.addComponent(courierAir, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(2)
	 					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(9)
	 							.addComponent(label_52, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	 							.addGap(7)
	 							.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(9)
	 							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 							.addGap(8)
	 							.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
	 								.addComponent(bndm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(bndd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	 								.addComponent(bndy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addGap(36)
	 							.addComponent(label_70, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	 						.addGroup(gl_panel_21.createSequentialGroup()
	 							.addComponent(label_92)
	 							.addGap(2)
	 							.addComponent(scrollPane_12, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
	 					.addGap(6)
	 					.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	 		);
	 		panel_21.setLayout(gl_panel_21);
	 		GroupLayout gl_addCase = new GroupLayout(addCase);
	 		gl_addCase.setHorizontalGroup(
	 			gl_addCase.createParallelGroup(Alignment.LEADING)
	 				.addComponent(panel_70, GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
	 				.addGroup(gl_addCase.createSequentialGroup()
	 					.addGap(1)
	 					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
	 		);
	 		gl_addCase.setVerticalGroup(
	 			gl_addCase.createParallelGroup(Alignment.TRAILING)
	 				.addGroup(gl_addCase.createSequentialGroup()
	 					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
	 					.addPreferredGap(ComponentPlacement.RELATED)
	 					.addComponent(panel_70, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
	 		);
	 		addCase.setLayout(gl_addCase);
	 		
	 		JPanel panel_61 = new JPanel();
	 		layeredPane.add(panel_61, "name_712085930183766");
	 		panel_61.setBackground(Color.BLACK);
	 		
	 		JPanel panel_74 = new JPanel();
	 		panel_74.setBackground(new Color(27, 37, 46));
	 		GroupLayout gl_panel_74 = new GroupLayout(panel_74);
	 		gl_panel_74.setHorizontalGroup(
	 			gl_panel_74.createParallelGroup(Alignment.LEADING)
	 				.addGap(0, 727, Short.MAX_VALUE)
	 				.addGap(0, 727, Short.MAX_VALUE)
	 				.addGap(0, 727, Short.MAX_VALUE)
	 		);
	 		gl_panel_74.setVerticalGroup(
	 			gl_panel_74.createParallelGroup(Alignment.LEADING)
	 				.addGap(0, 29, Short.MAX_VALUE)
	 				.addGap(0, 29, Short.MAX_VALUE)
	 				.addGap(0, 29, Short.MAX_VALUE)
	 		);
	 		panel_74.setLayout(gl_panel_74);
	 		
	 		JPanel panel_77 = new JPanel();
	 		panel_77.setBackground(new Color(27, 37, 46));
	 		
	 		JPanel panel_67 = new JPanel(){
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
				  
				    
				    setBorder(new RoundTextField(30));
				  }
			};
	 		panel_67.addMouseListener(new MouseAdapter() {
	 			@Override
	 			public void mouseClicked(MouseEvent arg0) {
	 			 
					if(editAcc==0) {
						DBQuery.insertAccount(textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText(), "Editor");
		 				JOptionPane.showMessageDialog(null,"Account Succesfull Registered!");
		 				textField_4.setText(""); textField_5.setText(""); textField_6.setText("");
		 				DefaultTableModel tm1 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.getEmployed());
		 				tm1.addColumn("#");
		 				table_1.setModel(tm1);
		 				table_1.moveColumn(4,0);
		 				theader();
		 				CardLayout cl = (CardLayout) layeredPane.getLayout();
						cl.show(layeredPane, "name_64547508311534");
						
					}else {
						DBQuery.updateEmployee(textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText(), Login.getAccountID());
						JOptionPane.showMessageDialog(null,"Profile Updated!");
		 				textField_4.setText(""); textField_5.setText(""); textField_6.setText("");
		 				DefaultTableModel tm1 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.getEmployed());
		 				tm1.addColumn("#");
		 				table_1.setModel(tm1);
		 				table_1.moveColumn(4,0);
		 				theader();
		 				CardLayout cl = (CardLayout) layeredPane.getLayout();
						cl.show(layeredPane, "name_453519779875562");
					}
	 			}
	 			@Override
	 			public void mouseEntered(MouseEvent arg0) {
	 				panel_67.setBackground(Color.decode("#449d44"));
	 			}
	 			@Override
	 			public void mouseExited(MouseEvent arg0) {
	 				panel_67.setBackground(Color.decode("#5cb85c"));
	 			}
	 		});
	 		panel_67.setBackground(Color.decode("#5cb85c"));
	 		
	 		JLabel lblSave = new JLabel("SAVE");
	 		lblSave.setHorizontalAlignment(SwingConstants.CENTER);
	 		lblSave.setForeground(Color.WHITE);
	 		GroupLayout gl_panel_67 = new GroupLayout(panel_67);
	 		gl_panel_67.setHorizontalGroup(
	 			gl_panel_67.createParallelGroup(Alignment.LEADING)
	 				.addGroup(Alignment.TRAILING, gl_panel_67.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(lblSave, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
	 					.addContainerGap())
	 		);
	 		gl_panel_67.setVerticalGroup(
	 			gl_panel_67.createParallelGroup(Alignment.LEADING)
	 				.addComponent(lblSave, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
	 		);
	 		panel_67.setLayout(gl_panel_67);
	 		
	 		JPanel panel_141 = new JPanel(){
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
	 					  
	 					    
	 					    setBorder(new RoundTextField(30));
	 					  }
	 				};
	 		panel_141.setBackground(Color.decode("#337ab7"));
	 		panel_141.addMouseListener(new MouseAdapter() {
	 			@Override
	 			public void mouseClicked(MouseEvent e) {
	 				if(manage == 1) {
	 					CardLayout cl = (CardLayout) layeredPane.getLayout();
						cl.show(layeredPane, "name_64547508311534"); 
	 				}else {
	 					
	 					CardLayout cl = (CardLayout) layeredPane.getLayout();
						cl.show(layeredPane, "name_453519779875562"); 
	 				}
	 			}
	 			@Override
	 			public void mouseEntered(MouseEvent e) {
	 				panel_141.setBackground(Color.decode("#286090"));
	 			}
	 			@Override
	 			public void mouseExited(MouseEvent e) {
	 				panel_141.setBackground(Color.decode("#337ab7"));
	 			}
	 		});
	 		
	 		JLabel label_47 = new JLabel("BACK");
	 		label_47.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_47.setForeground(Color.WHITE);
	 		
	 		GroupLayout gl_panel_141 = new GroupLayout(panel_141);
	 		gl_panel_141.setHorizontalGroup(
	 			gl_panel_141.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_141.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(label_47, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
	 					.addContainerGap())
	 		);
	 		gl_panel_141.setVerticalGroup(
	 			gl_panel_141.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_141.createSequentialGroup()
	 					.addComponent(label_47, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
	 					.addGap(0))
	 		);
	 		panel_141.setLayout(gl_panel_141);
	 		GroupLayout gl_panel_77 = new GroupLayout(panel_77);
	 		gl_panel_77.setHorizontalGroup(
	 			gl_panel_77.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_77.createSequentialGroup()
	 					.addGap(200)
	 					.addComponent(panel_67, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
	 					.addPreferredGap(ComponentPlacement.RELATED)
	 					.addComponent(panel_141, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
	 					.addGap(200))
	 		);
	 		gl_panel_77.setVerticalGroup(
	 			gl_panel_77.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_77.createSequentialGroup()
	 					.addContainerGap()
	 					.addGroup(gl_panel_77.createParallelGroup(Alignment.LEADING)
	 						.addComponent(panel_141, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(panel_67, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
	 					.addContainerGap(303, Short.MAX_VALUE))
	 		);
	 		panel_77.setLayout(gl_panel_77);
	 		
	 		JPanel panel_133 = new JPanel();
	 		panel_133.setBackground(new Color(27, 37, 46));
	 		
	 		JLabel label_39 = new JLabel("Name:");
	 		label_39.setHorizontalAlignment(SwingConstants.LEFT);
	 		label_39.setForeground(Color.WHITE);
	 		label_39.setFont(new Font("Arial", Font.BOLD, 15));
	 		GroupLayout gl_panel_133 = new GroupLayout(panel_133);
	 		gl_panel_133.setHorizontalGroup(
	 			gl_panel_133.createParallelGroup(Alignment.LEADING)
	 				.addGroup(Alignment.TRAILING, gl_panel_133.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(label_39, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
	 		);
	 		gl_panel_133.setVerticalGroup(
	 			gl_panel_133.createParallelGroup(Alignment.TRAILING)
	 				.addGroup(Alignment.LEADING, gl_panel_133.createSequentialGroup()
	 					.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
	 					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	 		);
	 		panel_133.setLayout(gl_panel_133);
	 		
	 		JPanel panel_134 = new JPanel();
	 		panel_134.setBackground(new Color(27, 37, 46));
	 		
	 		JPanel panel_135 = new JPanel();
	 		panel_135.setBackground(new Color(27, 37, 46));
	 		
	 		JLabel label_45 = new JLabel("Surname");
	 		label_45.setHorizontalAlignment(SwingConstants.LEFT);
	 		label_45.setForeground(Color.WHITE);
	 		label_45.setFont(new Font("Arial", Font.BOLD, 15));
	 		GroupLayout gl_panel_135 = new GroupLayout(panel_135);
	 		gl_panel_135.setHorizontalGroup(
	 			gl_panel_135.createParallelGroup(Alignment.LEADING)
	 				.addGroup(Alignment.TRAILING, gl_panel_135.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(label_45, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
	 					.addContainerGap())
	 		);
	 		gl_panel_135.setVerticalGroup(
	 			gl_panel_135.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_135.createSequentialGroup()
	 					.addComponent(label_45, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
	 					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	 		);
	 		panel_135.setLayout(gl_panel_135);
	 		
	 		JPanel panel_136 = new JPanel();
	 		panel_136.setBackground(new Color(27, 37, 46));
	 		
	 		JPanel panel_137 = new JPanel();
	 		panel_137.setBackground(new Color(27, 37, 46));
	 		
	 		JLabel label_50 = new JLabel("Username");
	 		label_50.setHorizontalAlignment(SwingConstants.LEFT);
	 		label_50.setForeground(Color.WHITE);
	 		label_50.setFont(new Font("Arial", Font.BOLD, 13));
	 		GroupLayout gl_panel_137 = new GroupLayout(panel_137);
	 		gl_panel_137.setHorizontalGroup(
	 			gl_panel_137.createParallelGroup(Alignment.LEADING)
	 				.addGroup(Alignment.TRAILING, gl_panel_137.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(label_50, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
	 		);
	 		gl_panel_137.setVerticalGroup(
	 			gl_panel_137.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_137.createSequentialGroup()
	 					.addComponent(label_50, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
	 					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	 		);
	 		panel_137.setLayout(gl_panel_137);
	 		
	 		JPanel panel_138 = new JPanel();
	 		panel_138.setBackground(new Color(27, 37, 46));
	 		
	 		JPanel panel_139 = new JPanel();
	 		panel_139.setBackground(new Color(27, 37, 46));
	 		
	 		JLabel label_54 = new JLabel("NLRC RECORD - ADD ACCOUNT");
	 		label_54.setHorizontalAlignment(SwingConstants.CENTER);
	 		label_54.setForeground(Color.WHITE);
	 		label_54.setFont(new Font("Arial", Font.BOLD, 20));
	 		GroupLayout gl_panel_139 = new GroupLayout(panel_139);
	 		gl_panel_139.setHorizontalGroup(
	 			gl_panel_139.createParallelGroup(Alignment.LEADING)
	 				.addGap(0, 727, Short.MAX_VALUE)
	 				.addGap(0, 727, Short.MAX_VALUE)
	 				.addGroup(gl_panel_139.createSequentialGroup()
	 					.addComponent(label_54, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
	 					.addGap(62))
	 		);
	 		gl_panel_139.setVerticalGroup(
	 			gl_panel_139.createParallelGroup(Alignment.LEADING)
	 				.addGap(0, 34, Short.MAX_VALUE)
	 				.addGap(0, 34, Short.MAX_VALUE)
	 				.addGroup(gl_panel_139.createSequentialGroup()
	 					.addGap(1)
	 					.addComponent(label_54, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	 					.addGap(0, 0, Short.MAX_VALUE))
	 		);
	 		panel_139.setLayout(gl_panel_139);
	 		
	 		JPanel panel_140 = new JPanel();
	 		panel_140.setBackground(new Color(27, 37, 46));
	 		
	 		JLabel label_42 = new JLabel("Password");
	 		label_42.setHorizontalAlignment(SwingConstants.LEFT);
	 		label_42.setForeground(Color.WHITE);
	 		label_42.setFont(new Font("Arial", Font.BOLD, 13));
	 		GroupLayout gl_panel_140 = new GroupLayout(panel_140);
	 		gl_panel_140.setHorizontalGroup(
	 			gl_panel_140.createParallelGroup(Alignment.TRAILING)
	 				.addGroup(gl_panel_140.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(label_42, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
	 					.addContainerGap())
	 		);
	 		gl_panel_140.setVerticalGroup(
	 			gl_panel_140.createParallelGroup(Alignment.TRAILING)
	 				.addGroup(Alignment.LEADING, gl_panel_140.createSequentialGroup()
	 					.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
	 					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	 		);
	 		panel_140.setLayout(gl_panel_140);
	 		
	 		JPanel panel_142 = new JPanel();
	 		panel_142.setBackground(new Color(27, 37, 46));
	 		GroupLayout gl_panel_61 = new GroupLayout(panel_61);
	 		gl_panel_61.setHorizontalGroup(
	 			gl_panel_61.createParallelGroup(Alignment.TRAILING)
	 				.addGroup(gl_panel_61.createSequentialGroup()
	 					.addGroup(gl_panel_61.createParallelGroup(Alignment.LEADING)
	 						.addComponent(panel_77, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	 						.addComponent(panel_74, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	 						.addComponent(panel_139, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	 						.addGroup(gl_panel_61.createSequentialGroup()
	 							.addGap(1)
	 							.addGroup(gl_panel_61.createParallelGroup(Alignment.LEADING)
	 								.addComponent(panel_137, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
	 								.addComponent(panel_135, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
	 								.addComponent(panel_133, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
	 								.addComponent(panel_140, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
	 							.addGap(1)
	 							.addGroup(gl_panel_61.createParallelGroup(Alignment.LEADING)
	 								.addComponent(panel_138, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	 								.addComponent(panel_136, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	 								.addComponent(panel_134, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	 								.addComponent(panel_142, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	 					.addGap(1))
	 		);
	 		gl_panel_61.setVerticalGroup(
	 			gl_panel_61.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_61.createSequentialGroup()
	 					.addComponent(panel_139, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	 					.addGap(1)
	 					.addComponent(panel_74, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
	 					.addGap(1)
	 					.addGroup(gl_panel_61.createParallelGroup(Alignment.LEADING)
	 						.addComponent(panel_133, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(panel_134, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
	 					.addGap(1)
	 					.addGroup(gl_panel_61.createParallelGroup(Alignment.LEADING, false)
	 						.addComponent(panel_135, 0, 0, Short.MAX_VALUE)
	 						.addComponent(panel_136, GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
	 					.addGap(1)
	 					.addGroup(gl_panel_61.createParallelGroup(Alignment.LEADING, false)
	 						.addComponent(panel_137, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
	 						.addComponent(panel_138, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
	 					.addGap(1)
	 					.addGroup(gl_panel_61.createParallelGroup(Alignment.TRAILING)
	 						.addComponent(panel_142, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	 						.addComponent(panel_140, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
	 					.addGap(1)
	 					.addComponent(panel_77, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
	 					.addGap(1))
	 		);
	 		
	 		textField_6 = new JTextField(){
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
	 		textField_6.setColumns(10);
	 		GroupLayout gl_panel_142 = new GroupLayout(panel_142);
	 		gl_panel_142.setHorizontalGroup(
	 			gl_panel_142.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_142.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
	 					.addGap(324))
	 		);
	 		gl_panel_142.setVerticalGroup(
	 			gl_panel_142.createParallelGroup(Alignment.LEADING)
	 				.addComponent(textField_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
	 		);
	 		panel_142.setLayout(gl_panel_142);
	 		
	 		textField_5 = new JTextField(){
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
	 		textField_5.setColumns(10);
	 		GroupLayout gl_panel_138 = new GroupLayout(panel_138);
	 		gl_panel_138.setHorizontalGroup(
	 			gl_panel_138.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_138.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
	 					.addGap(324))
	 		);
	 		gl_panel_138.setVerticalGroup(
	 			gl_panel_138.createParallelGroup(Alignment.LEADING)
	 				.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
	 		);
	 		panel_138.setLayout(gl_panel_138);
	 		
	 		textField_4 = new JTextField(){
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
	 		textField_4.setColumns(10);
	 		GroupLayout gl_panel_136 = new GroupLayout(panel_136);
	 		gl_panel_136.setHorizontalGroup(
	 			gl_panel_136.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_136.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
	 					.addGap(324))
	 		);
	 		gl_panel_136.setVerticalGroup(
	 			gl_panel_136.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_136.createSequentialGroup()
	 					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
	 					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	 		);
	 		panel_136.setLayout(gl_panel_136);
	 		
	 		textField_3 = new JTextField() {
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
	 		textField_3.setColumns(10);
	 		GroupLayout gl_panel_134 = new GroupLayout(panel_134);
	 		gl_panel_134.setHorizontalGroup(
	 			gl_panel_134.createParallelGroup(Alignment.LEADING)
	 				.addGroup(gl_panel_134.createSequentialGroup()
	 					.addContainerGap()
	 					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
	 					.addGap(324))
	 		);
	 		gl_panel_134.setVerticalGroup(
	 			gl_panel_134.createParallelGroup(Alignment.LEADING)
	 				.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
	 		);
	 		panel_134.setLayout(gl_panel_134);
	 		panel_61.setLayout(gl_panel_61);
			
			 theader();
			 
			 
			 

			  
			  
		  
	
		 
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logoXL.png")).getImage();
		Image imgIc = new ImageIcon(this.getClass().getResource("/logoS.png")).getImage();
		setIconImage(imgIc);
		
		label.setIcon(new ImageIcon(img));

		JLabel lblNationalLaborRelation = new JLabel("National Labor Relations Commission 8th Division");
		lblNationalLaborRelation.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNationalLaborRelation.setForeground(Color.WHITE);

		JLabel lblRepublicOfThe = new JLabel("Republic of the Philippines");
		lblRepublicOfThe.setForeground(Color.WHITE);
		
		JLabel lblDepartmentOfLabor = new JLabel("Department of Labor and Employment");
		lblDepartmentOfLabor.setForeground(Color.WHITE);
		
		JLabel lblpambansang = new JLabel("(Pambansang Komisyon sa Ugnayang Paggawa) ");
		lblpambansang.setForeground(Color.WHITE);
		
		JPanel panel_143 = new JPanel();
		panel_143.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		GroupLayout gl_companyLabel = new GroupLayout(companyLabel);
		gl_companyLabel.setHorizontalGroup(
			gl_companyLabel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_companyLabel.createSequentialGroup()
					.addGap(32)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_companyLabel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRepublicOfThe, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDepartmentOfLabor, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNationalLaborRelation, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblpambansang, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
					.addComponent(panel_143, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		gl_companyLabel.setVerticalGroup(
			gl_companyLabel.createParallelGroup(Alignment.LEADING)
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_companyLabel.createSequentialGroup()
					.addGroup(gl_companyLabel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRepublicOfThe, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_companyLabel.createSequentialGroup()
							.addGap(24)
							.addComponent(lblDepartmentOfLabor, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addGap(1)
					.addComponent(lblNationalLaborRelation, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(lblpambansang))
				.addComponent(panel_143, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);
		companyLabel.setLayout(gl_companyLabel);
		Image addIcon = new ImageIcon(this.getClass().getResource("/addCaseS.png")).getImage();

		JPanel button1 = new JPanel() {
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
			  
			    
			    setBorder(new RoundTextField(49));
			  }
		};

		button1.setBackground(Color.decode("#374b5e"));
		

		btnManage = new JPanel();
		btnManage.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#4b6175")));
		btnManage.setBackground(new Color(55, 75, 94));

		buttonlogo1 = new JPanel();
		buttonlogo1.setLayout(null);
		buttonlogo1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.decode("#4b6175")));
		buttonlogo1.setBackground(new Color(55, 75, 94));
		btnManage.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				manage=1;
				CardLayout cl = (CardLayout) layeredPane.getLayout();
				cl.show(layeredPane, "name_64547508311534");
				
				activeHome = 0;
				activeUser = 0;
				activeManage = 1;
				activeLogin = 0;
				activeSettings = 0;
				
				btnHome.setBackground(Color.decode("#374b5e"));
				panel_3.setBackground(new Color(55, 75, 94));
				
				btnUser.setBackground(Color.decode("#374b5e"));
				panel_2.setBackground(new Color(55, 75, 94));
				
				btnLogin.setBackground(Color.decode("#374b5e"));
				buttonlogo2.setBackground(new Color(55, 75, 94));
				
				

			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnManage.setBackground(Color.decode("#3e5468"));
				buttonlogo1.setBackground(Color.decode("#428bca"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				if(activeManage == 1) {
					btnManage.setBackground(Color.decode("#3e5468"));
					buttonlogo1.setBackground(Color.decode("#428bca"));
				}else {
					btnManage.setBackground(Color.decode("#374b5e"));
					buttonlogo1.setBackground(new Color(55, 75, 94));
				}
			}
		});

		JLabel buttonlogo1_1 = new JLabel("");
		buttonlogo1_1.setBackground(Color.LIGHT_GRAY);
		buttonlogo1_1.setBounds(10, 0, 30, 48);
		buttonlogo1.add(buttonlogo1_1);
		Image accManage = new ImageIcon(this.getClass().getResource("/accountManage.png")).getImage();
		buttonlogo1_1.setIcon(new ImageIcon(accManage));

		JLabel lblManage = new JLabel("Manage Account");
		lblManage.setForeground(Color.WHITE);
		GroupLayout gl_btnManage = new GroupLayout(btnManage);
		gl_btnManage.setHorizontalGroup(
			gl_btnManage.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnManage.createSequentialGroup()
					.addComponent(buttonlogo1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblManage, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_btnManage.setVerticalGroup(
			gl_btnManage.createParallelGroup(Alignment.LEADING)
				.addComponent(buttonlogo1, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
				.addComponent(lblManage, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
		);
		btnManage.setLayout(gl_btnManage);

		btnLogin = new JPanel();
		btnLogin.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#4b6175")));
		btnLogin.setBackground(new Color(55, 75, 94));

		buttonlogo2 = new JPanel();
		buttonlogo2.setLayout(null);
		buttonlogo2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.decode("#4b6175")));
		buttonlogo2.setBackground(new Color(55, 75, 94));
		btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				
				CardLayout cl = (CardLayout) layeredPane.getLayout();
				cl.show(layeredPane, "name_64551533014936");
				
				activeHome = 0;
				activeUser = 0;
				activeManage = 0;
				activeLogin = 1;
				activeSettings = 0;
				
				btnHome.setBackground(Color.decode("#374b5e"));
				panel_3.setBackground(new Color(55, 75, 94));
				
				btnUser.setBackground(Color.decode("#374b5e"));
				panel_2.setBackground(new Color(55, 75, 94));
				
				btnManage.setBackground(Color.decode("#374b5e"));
				buttonlogo1.setBackground(new Color(55, 75, 94));
				
				
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnLogin.setBackground(Color.decode("#3e5468"));
				buttonlogo2.setBackground(Color.decode("#3949ab"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				if(activeLogin == 1) {
					btnLogin.setBackground(Color.decode("#3e5468"));
					buttonlogo2.setBackground(Color.decode("#3949ab"));
				}else {
					btnLogin.setBackground(Color.decode("#374b5e"));
					buttonlogo2.setBackground(new Color(55, 75, 94));
				}
			}
		});

		JLabel label_2 = new JLabel("");
		label_2.setBackground(Color.LIGHT_GRAY);
		label_2.setBounds(10, 0, 30, 48);
		Image loginHis = new ImageIcon(this.getClass().getResource("/loginHis.png")).getImage();
		label_2.setIcon(new ImageIcon(loginHis));
		buttonlogo2.add(label_2);

		JLabel lbllogin = new JLabel("Login History");
		lbllogin.setForeground(Color.WHITE);
		GroupLayout gl_btnLogin = new GroupLayout(btnLogin);
		gl_btnLogin.setHorizontalGroup(
			gl_btnLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnLogin.createSequentialGroup()
					.addComponent(buttonlogo2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lbllogin, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_btnLogin.setVerticalGroup(
			gl_btnLogin.createParallelGroup(Alignment.LEADING)
				.addComponent(buttonlogo2, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
				.addComponent(lbllogin, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
		);
		btnLogin.setLayout(gl_btnLogin);
		Image settingIcon = new ImageIcon(this.getClass().getResource("/settingsIcon.png")).getImage();

		JPanel button0 = new JPanel();
		button0.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#4b6175")));
		button0.setBackground(new Color(55, 75, 94));

		JPanel buttonlogo0 = new JPanel();
		buttonlogo0.setLayout(null);
		buttonlogo0.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.decode("#4b6175")));
		buttonlogo0.setBackground(new Color(55, 75, 94));

		button0.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				 int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				 if(input==0) {
						SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' h:mm a");
						Date date = new Date(System.currentTimeMillis());
						DBQuery.insertLogout(DBQuery.getLoginLastID(), formatter.format(date).toString());

						System.exit(0);

						System.out.close();

				 }
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				button0.setBackground(Color.decode("#3e5468"));
				buttonlogo0.setBackground(Color.decode("#c62828"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				button0.setBackground(Color.decode("#374b5e"));
				buttonlogo0.setBackground(new Color(55, 75, 94));
			}
		});

		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(10, 0, 30, 50);
		Image logoutIcon = new ImageIcon(this.getClass().getResource("/logoutIcon.png")).getImage();
		label_1.setIcon(new ImageIcon(logoutIcon));
		buttonlogo0.add(label_1);

		JLabel lbllogout = new JLabel("Logout");
		lbllogout.setForeground(Color.WHITE);
		GroupLayout gl_button0 = new GroupLayout(button0);
		gl_button0.setHorizontalGroup(gl_button0.createParallelGroup(Alignment.LEADING).addGap(0, 195, Short.MAX_VALUE)
				.addGroup(gl_button0.createSequentialGroup()
						.addComponent(buttonlogo0, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lbllogout, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
						.addContainerGap()));
		gl_button0.setVerticalGroup(gl_button0.createParallelGroup(Alignment.LEADING).addGap(0, 50, Short.MAX_VALUE)
				.addComponent(buttonlogo0, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
				.addGroup(gl_button0.createSequentialGroup().addGap(11)
						.addComponent(lbllogout, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE).addGap(11)));
		button0.setLayout(gl_button0);
		
		btnUser = new JPanel();
		btnUser.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#4b6175")));
		btnUser.setBackground(new Color(55, 75, 94));
		
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.decode("#4b6175")));
		panel_2.setBackground(new Color(55, 75, 94));
		
		JLabel label_3 = new JLabel("");
		label_3.setBackground(Color.LIGHT_GRAY);
		label_3.setBounds(10, 0, 30, 50);
		panel_2.add(label_3);
		Image userProf = new ImageIcon(this.getClass().getResource("/userProfileIcon.png")).getImage();
		label_3.setIcon(new ImageIcon(userProf));
		btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				manage = 0;
				CardLayout cl = (CardLayout) layeredPane.getLayout();
				cl.show(layeredPane, "name_453519779875562");
				activeHome = 0;
				activeUser = 1;
				activeManage = 0;
				activeLogin = 0;
				activeSettings = 0;
				btnHome.setBackground(Color.decode("#374b5e"));
				panel_3.setBackground(new Color(55, 75, 94));
				
				btnManage.setBackground(Color.decode("#374b5e"));
				buttonlogo1.setBackground(new Color(55, 75, 94));
				
				btnLogin.setBackground(Color.decode("#374b5e"));
				buttonlogo2.setBackground(new Color(55, 75, 94));
				
				ResultSet rs = DBQuery.getEmployee(Login.getAccountID());
				try {
					while(rs.next()) {
						lblEname.setText(rs.getString("Name"));
						lblEsurname.setText(rs.getString("Surename"));
						lblEtype.setText(rs.getString("userType"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnUser.setBackground(Color.decode("#3e5468"));
				panel_2.setBackground(Color.decode("#2e7d32"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				if(activeUser == 1) {
					btnUser.setBackground(Color.decode("#3e5468"));
					panel_2.setBackground(Color.decode("#2e7d32"));
				}else {
					btnUser.setBackground(Color.decode("#374b5e"));
					panel_2.setBackground(new Color(55, 75, 94));
				}
			}
		});
		
		JLabel label_5 = new JLabel("User Profile");
		label_5.setForeground(Color.WHITE);
		GroupLayout gl_btnUser = new GroupLayout(btnUser);
		gl_btnUser.setHorizontalGroup(
			gl_btnUser.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnUser.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_5, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_btnUser.setVerticalGroup(
			gl_btnUser.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
				.addComponent(label_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
		);
		btnUser.setLayout(gl_btnUser);
		
		btnHome = new JPanel();
		btnHome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#4b6175")));
		
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.decode("#4b6175")));
		
		btnHome.setBackground(Color.decode("#3e5468"));
		panel_3.setBackground(Color.decode("#006064"));
		
		btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				CardLayout cl = (CardLayout) layeredPane.getLayout();
				cl.show(layeredPane, "name_64533364253644");
				activeHome = 1;
				activeUser = 0;
				activeManage = 0;
				activeLogin = 0;
				activeSettings = 0;
				
				btnUser.setBackground(Color.decode("#374b5e"));
				panel_2.setBackground(new Color(55, 75, 94));
				
				btnManage.setBackground(Color.decode("#374b5e"));
				buttonlogo1.setBackground(new Color(55, 75, 94));
				
				btnLogin.setBackground(Color.decode("#374b5e"));
				buttonlogo2.setBackground(new Color(55, 75, 94));
			
				
				
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnHome.setBackground(Color.decode("#3e5468"));
				panel_3.setBackground(Color.decode("#006064"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				if(activeHome == 1) {
					btnHome.setBackground(Color.decode("#3e5468"));
					panel_3.setBackground(Color.decode("#006064"));
					
				}else {
					btnHome.setBackground(Color.decode("#374b5e"));
					panel_3.setBackground(new Color(55, 75, 94));
				}
			}
		});
		
		
		JLabel label_6 = new JLabel("");
		label_6.setBackground(Color.LIGHT_GRAY);
		label_6.setBounds(10, 0, 30, 48);
		panel_3.add(label_6);
		Image hme = new ImageIcon(this.getClass().getResource("/69524.png")).getImage();
		label_6.setIcon(new ImageIcon(hme));
		
		JLabel label_7 = new JLabel("Home");
		label_7.setForeground(Color.WHITE);
		GroupLayout gl_btnHome = new GroupLayout(btnHome);
		gl_btnHome.setHorizontalGroup(
			gl_btnHome.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnHome.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_7, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_btnHome.setVerticalGroup(
			gl_btnHome.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
				.addComponent(label_7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
		);
		btnHome.setLayout(gl_btnHome);
		GroupLayout gl_sidePanel = new GroupLayout(sidePanel);
		gl_sidePanel.setHorizontalGroup(
			gl_sidePanel.createParallelGroup(Alignment.TRAILING)
				.addComponent(button0, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
				.addGroup(gl_sidePanel.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnManage, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
						.addComponent(btnUser, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
						.addComponent(btnHome, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
						.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
				.addGroup(gl_sidePanel.createSequentialGroup()
					.addContainerGap(40, Short.MAX_VALUE)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		gl_sidePanel.setVerticalGroup(
			gl_sidePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_sidePanel.createSequentialGroup()
					.addGap(25)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(btnUser, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(btnManage, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
					.addComponent(button0, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
		);
		button1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				rabDM.setSelectedIndex(0);
				rabDD.setSelectedIndex(0);
				rabDY.setSelectedIndex(0);
				dProM.setSelectedIndex(0);
				dPromD.setSelectedIndex(0);
				dPromY.setSelectedIndex(0);
				dMailM.setSelectedIndex(0);
				dMailD.setSelectedIndex(0);
				dMailY.setSelectedIndex(0);
				dAppealRM.setSelectedIndex(0);
				dAppealRD.setSelectedIndex(0);
				dAppealRY.setSelectedIndex(0);
				appealfeeM.setSelectedIndex(0);
				appealfeeD.setSelectedIndex(0);
				appealfeeY.setSelectedIndex(0);
				bondDM.setSelectedIndex(0);
				bondDD.setSelectedIndex(0);
				bondDY.setSelectedIndex(0);
				bndm.setSelectedIndex(0);
				bndd.setSelectedIndex(0);
				bndy.setSelectedIndex(0);
				ponenteDM.setSelectedIndex(0);
				ponenteDD.setSelectedIndex(0);
				ponenteDY.setSelectedIndex(0);
				dateAppPonenteM.setSelectedIndex(0);
				dateAppPoneneteD.setSelectedIndex(0);
				dateAppPoneneteY.setSelectedIndex(0);
				dateMRM1.setSelectedIndex(0);
				dateMRD1.setSelectedIndex(0);
				dateMRY1.setSelectedIndex(0);
				dateMRM2.setSelectedIndex(0);
				dateMRD2.setSelectedIndex(0);
				dateMRY2.setSelectedIndex(0);
				entryJM.setSelectedIndex(0);
				entryJD.setSelectedIndex(0);
				entryJY.setSelectedIndex(0);
				dEntryJIY.setSelectedIndex(0);
				dEntryJID.setSelectedIndex(0);
				dEntryJIM.setSelectedIndex(0);
				dateRemandedM.setSelectedIndex(0);
				dateRemandedD.setSelectedIndex(0);
				dateRemandedY.setSelectedIndex(0);
				edit = 0;
				tfCnum.setText("");
				decisionMR2.setText("");
				mrFiled2.setText("");
				decisionMR1.setText("");
				mrFiled1.setText("");
				taDecisiononApp.setText("");
				tfPonente.setText("");
				textField_12.setText("");
				other.setText("");
				appealOr.setText("");
				BondAmount.setText("");
				textField_11.setText("");
				//nlrcMonth.setText("");
				//dateAppMonth.setText("");
				//dateMRMonth.setText("");
				induCode.setText("");
				natureOfC.setText("");
				natureofA.setText("");
				ammOfAward.setText("");
				textField_8.setText("");
				textField_7.setText("");
				textField_9.setText("");
				appealFee.setText("");
				bondFee.setText("");
				//entryJudgement.setText("");
				reamarkTf.setText("");
				titleTF.setText("");
				respon.setText("");
				//OECCMonth.setText("");
				//dateCommMonth.setText("");
				//dateMRproMonth.setText("");
				//dateMailedMonth.setText("");
				//dateForwardMonth.setText("");
				courierAir.setText("");
				//COM.setText("");
				LA.setText("");
				//AppeaDate.setText("");
				bondDate.setText("");
				//dateEntryMonth.setText("");
				javax.swing.SwingUtilities.invokeLater(new Runnable(){
 		 			public void run() {
 		 				scrollPane_3.getVerticalScrollBar().setValue(0);	 			}
 		 		});
				CardLayout cl = (CardLayout) layeredPane.getLayout();
			       cl.show(layeredPane, "name_532941681539733");
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				button1.setBackground(Color.decode("#3e5468"));
				
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				button1.setBackground(Color.decode("#374b5e"));
				
			}
		});
		JLabel lblAddCase = new JLabel("New Case");
		lblAddCase.setForeground(Color.WHITE);
		
				JLabel addCaseIcon = new JLabel("");
				addCaseIcon.setBackground(Color.LIGHT_GRAY);
				addCaseIcon.setIcon(new ImageIcon(addIcon));
		GroupLayout gl_button1 = new GroupLayout(button1);
		gl_button1.setHorizontalGroup(
			gl_button1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_button1.createSequentialGroup()
					.addGap(21)
					.addComponent(addCaseIcon)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAddCase, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_button1.setVerticalGroup(
			gl_button1.createParallelGroup(Alignment.LEADING)
				.addComponent(addCaseIcon, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
				.addComponent(lblAddCase, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
		);
		Image addCaseIco = new ImageIcon(this.getClass().getResource("/addCaseM.png")).getImage();
		button1.setLayout(gl_button1);
		sidePanel.setLayout(gl_sidePanel);
		getContentPane().setLayout(groupLayout);
		
		DefaultTableModel tm65 = (DefaultTableModel) DbUtils.resultSetToTableModel((DBQuery.getLoggedIN()));
			
		table_2.setModel(tm65);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.BLACK);
		layeredPane.add(panel_9, "name_407759250831688");
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(27, 37, 46));
		
		JLabel label_9 = new JLabel("NLRC RECORD - VIEW CASE");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Arial", Font.BOLD, 20));
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGap(0, 743, Short.MAX_VALUE)
				.addComponent(label_9, GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGap(0, 44, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(1)
					.addComponent(label_9, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
		);
		panel_10.setLayout(gl_panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(27, 37, 46));
		
		JPanel panel_12 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
			public void updateUI() {
			}
		};
		panel_12.setBackground(new Color(51, 122, 183));
		
		JLabel label_10 = new JLabel("PRINT");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.WHITE);
		label_10.setBackground(Color.WHITE);
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGap(0, 207, Short.MAX_VALUE)
				.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGap(0, 34, Short.MAX_VALUE)
				.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
		);
		panel_12.setLayout(gl_panel_12);
		
		JPanel panel_13 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
			public void updateUI() {
			}
		};
		panel_13.setBackground(new Color(92, 184, 92));
		
		JLabel label_11 = new JLabel("EDIT");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.WHITE);
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGap(0, 208, Short.MAX_VALUE)
				.addComponent(label_11, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addComponent(label_11, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGap(1))
		);
		panel_13.setLayout(gl_panel_13);
		
		JPanel panel_14 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
			public void updateUI() {
			}
		};
		panel_14.setBackground(new Color(51, 122, 183));
		
		JLabel label_12 = new JLabel("BACK");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.WHITE);
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGap(0, 208, Short.MAX_VALUE)
				.addComponent(label_12, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addComponent(label_12, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		panel_14.setLayout(gl_panel_14);
		
		JPanel panel_15 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
			public void updateUI() {
			}
		};
		panel_15.setForeground(Color.WHITE);
		panel_15.setBackground(new Color(217, 83, 79));
		
		JLabel label_13 = new JLabel("Delete");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.WHITE);
		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
				.addComponent(label_13, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addComponent(label_13, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGap(1))
		);
		panel_15.setLayout(gl_panel_15);
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGap(0, 743, Short.MAX_VALUE)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(1)
					.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_13, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_14, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(1))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGap(0, 35, Short.MAX_VALUE)
				.addComponent(panel_13, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
				.addComponent(panel_14, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
				.addComponent(panel_15, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGap(1))
		);
		panel_11.setLayout(gl_panel_11);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_10, GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
						.addComponent(panel_11, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(1)
							.addComponent(scrollPane_6, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
					.addGap(1))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGap(0, 569, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(scrollPane_6, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
					.addGap(1)
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		textPane_1 = new JTextPane();
		scrollPane_6.setViewportView(textPane_1);
		panel_9.setLayout(gl_panel_9);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(27, 37, 46));
		layeredPane.add(panel_20, "name_494275942197838");
		
		JLabel label_17 = new JLabel("  NLRC RECORD - PRINT");
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Arial", Font.BOLD, 15));
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.getViewport().setBackground(Color.decode("#1b252e"));
		
		
		comboBox_1 = new JComboBox();
		comboBox_1.addItem("MM");
		for(int month = 0 ; month <= 11 ; month++ ) {
			comboBox_1.addItem(monthList[month]);
 		}
		
	
		
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox_1.getSelectedItem().equals("MM") && comboBox_2.getSelectedItem().equals("YYYY") && comboBox_3.getSelectedItem().equals("DD") ) {
						DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryDCaseTitle());
						tm6.addColumn("#");
						table_3.setModel(tm6);
						table_3.moveColumn(4,0);
						for(int x=0;x<table_3.getRowCount();x++) {
							table_3.setValueAt(x+1, x, 0);
						}
						table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
						table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
						table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
						table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
				}else if(comboBox_3.getSelectedItem().equals("DD")) {
					DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.querySort(comboBox_1.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString()));
					tm6.addColumn("#");
					table_3.setModel(tm6);
					table_3.moveColumn(4,0);
					for(int x=0;x<table_3.getRowCount();x++) {
						table_3.setValueAt(x+1, x, 0);
					}
					table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
					table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
					table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
					table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
				}else {
					DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryDSort(comboBox_1.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString(),comboBox_3.getSelectedItem().toString()));
					tm6.addColumn("#");
					table_3.setModel(tm6);
					table_3.moveColumn(4,0);
					for(int x=0;x<table_3.getRowCount();x++) {
						table_3.setValueAt(x+1, x, 0);
					}
					table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
					table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
					table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
					table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
				}
			}
		});
	
 		
 		comboBox_2 = new JComboBox();
 		comboBox_2.addItem("YYYY");
 		for(int year = 1978 ; year <= year_now  ; year++ ) {
 			comboBox_2.addItem(String.valueOf(year));
 		}
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox_1.getSelectedItem().equals("MM") && comboBox_2.getSelectedItem().equals("YYYY") && comboBox_3.getSelectedItem().equals("DD")) {
					DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryDCaseTitle());
					tm6.addColumn("#");
					table_3.setModel(tm6);
					table_3.moveColumn(4,0);
					for(int x=0;x<table_3.getRowCount();x++) {
						table_3.setValueAt(x+1, x, 0);
					}
					table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
					table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
					table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
					table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
			}else if(comboBox_3.getSelectedItem().equals("DD")){
				DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.querySort(comboBox_1.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString()));
				tm6.addColumn("#");
				table_3.setModel(tm6);
				table_3.moveColumn(4,0);
				for(int x=0;x<table_3.getRowCount();x++) {
					table_3.setValueAt(x+1, x, 0);
				}
				table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
				table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
				table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
				table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
			}else {
				DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryDSort(comboBox_1.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString(),comboBox_3.getSelectedItem().toString()));
				tm6.addColumn("#");
				table_3.setModel(tm6);
				table_3.moveColumn(4,0);
				for(int x=0;x<table_3.getRowCount();x++) {
					table_3.setValueAt(x+1, x, 0);
				}
				table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
				table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
				table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
				table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
			}
			}
		});
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!(comboBox_1.getSelectedItem().toString().equals("MM")||comboBox_2.getSelectedItem().toString().equals("YYYY")) && comboBox_3.getSelectedItem().equals("DD")) {
					String this_print="";
					DefaultTableModel model = (DefaultTableModel)table_3.getModel();
					for(int row = 0;row<table_3.getRowCount();row++) {
						this_print = this_print+"NLRC CASE No:\n   "+ model.getValueAt(row, 0).toString()+"\n   "+model.getValueAt(row, 1).toString()+"\nTITLE:\n   "+model.getValueAt(row, 2).toString()+"\n\n";
					}
				    printTMonth.setText(this_print);
				    printTMonth.setForeground(Color.black);
				    printTMonth.setFont(new Font("Dialog", Font.PLAIN, 15));
				    MessageFormat header = new MessageFormat("Case Report of "+monthList[Integer.parseInt(comboBox_1.getSelectedItem().toString())-1]+" "+comboBox_2.getSelectedItem().toString());
					MessageFormat footer = new MessageFormat(" ");
				    try {
						printTMonth.print(header,footer);
					} catch (PrinterException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(!(comboBox_1.getSelectedItem().toString().equals("MM")||comboBox_2.getSelectedItem().toString().equals("YYYY") ||comboBox_3.getSelectedItem().toString().equals("DD"))){
					String this_print="";
					DefaultTableModel model = (DefaultTableModel)table_3.getModel();
					for(int row = 0;row<table_3.getRowCount();row++) {
						this_print = this_print+"NLRC CASE No:\n   "+ model.getValueAt(row, 0).toString()+"\n   "+model.getValueAt(row, 1).toString()+"\nTITLE:\n   "+model.getValueAt(row, 2).toString()+"\n\n";
					}
				    printTMonth.setText(this_print);
				    printTMonth.setForeground(Color.black);
				    printTMonth.setFont(new Font("Dialog", Font.PLAIN, 15));
				    MessageFormat header = new MessageFormat("Case Report of "+monthList[Integer.parseInt(comboBox_1.getSelectedItem().toString())-1]+" "+comboBox_3.getSelectedItem().toString()+", "+comboBox_2.getSelectedItem().toString());
					MessageFormat footer = new MessageFormat(" ");
				    try {
						printTMonth.print(header,footer);
					} catch (PrinterException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					String this_print="";
					DefaultTableModel model = (DefaultTableModel)table_3.getModel();
					for(int row = 0;row<table_3.getRowCount();row++) {
						this_print = this_print+"NLRC CASE No:\n   "+ model.getValueAt(row, 0).toString()+"\n   "+model.getValueAt(row, 1).toString()+"\nTITLE:\n   "+model.getValueAt(row, 2).toString()+"\n\n";
					}
				    printTMonth.setText(this_print);
				    printTMonth.setForeground(Color.black);
				    printTMonth.setFont(new Font("Dialog", Font.PLAIN, 15));
				    MessageFormat header = new MessageFormat("Case Report");
					MessageFormat footer = new MessageFormat(" ");
				    try {
						printTMonth.print(header,footer);
					} catch (PrinterException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		comboBox_3 = new JComboBox();
		comboBox_3.addItem("DD");
		for(int day = 1 ; day <= 31 ; day++ ) {
			comboBox_3.addItem(String.valueOf(day));
 		}
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox_1.getSelectedItem().equals("MM") && comboBox_2.getSelectedItem().equals("YYYY") && comboBox_3.getSelectedItem().equals("DD")) {
					DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryDCaseTitle());
					tm6.addColumn("#");
					table_3.setModel(tm6);
					table_3.moveColumn(4,0);
					for(int x=0;x<table_3.getRowCount();x++) {
						table_3.setValueAt(x+1, x, 0);
					}
					table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
					table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
					table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
					table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
			}else if(comboBox_3.getSelectedItem().equals("DD")){
				DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.querySort(comboBox_1.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString()));
				tm6.addColumn("#");
				table_3.setModel(tm6);
				table_3.moveColumn(4,0);
				for(int x=0;x<table_3.getRowCount();x++) {
					table_3.setValueAt(x+1, x, 0);
				}
				table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
				table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
				table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
				table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
			}else {
				DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryDSort(comboBox_1.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString(),comboBox_3.getSelectedItem().toString()));
				tm6.addColumn("#");
				table_3.setModel(tm6);
				table_3.moveColumn(4,0);
				for(int x=0;x<table_3.getRowCount();x++) {
					table_3.setValueAt(x+1, x, 0);
				}
				table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
				table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
				table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
				table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
			}
				
				
			}
		});
		
		GroupLayout gl_panel_20 = new GroupLayout(panel_20);
		gl_panel_20.setHorizontalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPrint)
					.addContainerGap())
				.addGroup(gl_panel_20.createSequentialGroup()
					.addGap(1)
					.addComponent(scrollPane_7, GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE))
		);
		gl_panel_20.setVerticalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addGroup(gl_panel_20.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_20.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_panel_20.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPrint)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_20.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_7, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
		);
		
		table_3 = new JTable() {
		    @Override
		    public boolean isCellEditable(int row, int column) {
		        // This is how we disable editing:
		        return false;
		    }
		   public boolean getScrollableTracksViewportWidth()
            {
                return getPreferredSize().width < getParent().getWidth();
            }
		   public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
	        Component returnComp = super.prepareRenderer(renderer, row, column);
	        Color alternateColor = Color.decode("#112335");
	        Color whiteColor = Color.decode("#32455c");;
	        if (!returnComp.getBackground().equals(getSelectionBackground())){
	            Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
	            returnComp .setBackground(bg);
	            returnComp.setForeground(Color.white);
	            bg = null;
	        }else if(isRowSelected(row)) {
	        	returnComp.setBackground(Color.decode("#314c70"));
	        	returnComp.setForeground(Color.white);
	        }
	        return returnComp;
	    }
		   
		   

};		
JTableHeader thead3 = table_3.getTableHeader();
thead3.setBackground(Color.decode("#17293f"));
thead3.setForeground(Color.decode("#ffffff"));
thead3.setReorderingAllowed(false);
thead3.setFont(new Font("Dialog", Font.BOLD, 15));
table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
table_2.setSelectionBackground(Color.black);

table_3.setFocusable(false);
		scrollPane_7.setViewportView(table_3);
		DefaultTableModel tm6 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryDCaseTitle());
		tm6.addColumn("#");
		table_3.setModel(tm6);
		table_3.moveColumn(4,0);
		for(int x=0;x<table_3.getRowCount();x++) {
			table_3.setValueAt(x+1, x, 0);
		}
		table_3.getColumnModel().getColumn(0).setPreferredWidth(10);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(80);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(80);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(250);
		table_3.setRowHeight(30);
		panel_20.setLayout(gl_panel_20);
		
		JPanel panel_22 = new JPanel();
		dataPanel.add(panel_22, "name_612406244008977");
		
		printTMonth = new JTextPane();
		panel_22.add(printTMonth);
			


		theader();
		    timer = new Timer(0, new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        			DefaultTableModel tm = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.queryCaseTitle());
     				tm.addColumn("#");
     				dataTable.setModel(tm);
     				dataTable.moveColumn(5,0);
     				DefaultTableModel tm65 = (DefaultTableModel) DbUtils.resultSetToTableModel((DBQuery.getLoggedIN()));
     				table_2.setModel(tm65);
     				
 
     				theader();
     				
        	 }
        	 
         });
         timer.setDelay(10000);
         timer.start();
		
		
	}
	public void theader() {
		
		int alterColor = 0;
		JTableHeader thead = dataTable.getTableHeader();
		thead.setBackground(Color.decode("#17293f"));
		thead.setForeground(Color.decode("#ffffff"));
		thead.setReorderingAllowed(false);
		thead.setFont(new Font("Dialog", Font.BOLD, 15));
		dataTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		dataTable.setSelectionBackground(Color.black);
		
		JTableHeader thead2 = table_1.getTableHeader();
		thead2.setBackground(Color.decode("#17293f"));
		thead2.setForeground(Color.decode("#ffffff"));
		thead2.setReorderingAllowed(false);
		thead2.setFont(new Font("Dialog", Font.BOLD, 15));
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.setSelectionBackground(Color.black);
		
		JTableHeader thead3 = table_2.getTableHeader();
		thead3.setBackground(Color.decode("#17293f"));
		thead3.setForeground(Color.decode("#ffffff"));
		thead3.setReorderingAllowed(false);
		thead3.setFont(new Font("Dialog", Font.BOLD, 15));
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_2.setSelectionBackground(Color.black);
		
		
		
		 
		
		//dataTable.setDefaultRenderer(String.class,new TableColorRender());
		
		table_1.setRowHeight(30);
		dataTable.getColumnModel().getColumn(4).setMinWidth(0);
		dataTable.getColumnModel().getColumn(4).setMaxWidth(0);
		dataTable.getColumnModel().getColumn(4).setWidth(0);
		dataTable.getColumnModel().getColumn(5).setMinWidth(0);
		dataTable.getColumnModel().getColumn(5).setMaxWidth(0);
		dataTable.getColumnModel().getColumn(5).setWidth(0);
		table_1.getColumnModel().getColumn(1).setMinWidth(0);
		table_1.getColumnModel().getColumn(1).setMaxWidth(0);
		table_1.getColumnModel().getColumn(1).setWidth(0);
		dataTable.setRowHeight(30);
		table_2.setRowHeight(30);
		dataTable.getColumnModel().getColumn(0).setPreferredWidth(5);
		dataTable.getColumnModel().getColumn(1).setPreferredWidth(250);
		dataTable.getColumnModel().getColumn(2).setPreferredWidth(250);
		dataTable.getColumnModel().getColumn(3).setPreferredWidth(500);
		
		table_1.getColumnModel().getColumn(0).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(300);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(300);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(300);
		

		
	
		
		for(int x=0;x<dataTable.getRowCount();x++) {
			dataTable.setValueAt(x+1, x, 0);
		}
		for(int x=0;x<table_1.getRowCount();x++) {
			table_1.setValueAt(x+1, x, 0);
		}
		
		
			

	}
	 private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
	        
		 
	       DefaultTableModel model = (DefaultTableModel)dataTable.getModel();

	        
	       int selectedRowIndex = dataTable.getSelectedRow();
	       
	        // set the selected row data into jtextfields
	       
//	       
	       
	      getSelectedCase((model.getValueAt(selectedRowIndex, 4).toString()),"white",textPane,"black","10px");
//	      vc.main(null);
	      if (evt.getClickCount() == 2) {
	          dataTable = (JTable)evt.getSource();
	          int row = dataTable.getSelectedRow();
	          CardLayout cl = (CardLayout) layeredPane.getLayout();
		       cl.show(layeredPane, "name_89873841572306");
	       }
	       
	    
	    

      
    
	     
	    
        
	
	 }
	 private void jTable1MouseClicked2(java.awt.event.MouseEvent evt) { 
		 DefaultTableModel model = (DefaultTableModel)table_1.getModel();

	      int selectedRowIndex = table_1.getSelectedRow();
	       
		 
		
		 if (evt.getClickCount() == 3) {
		
			 int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Account?\nAccount Name: "+model.getValueAt(selectedRowIndex, 1).toString()+"\nAccount Surname: "+model.getValueAt(selectedRowIndex, 2).toString(),"Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			 if(input==0) {
			 DBQuery.deleteEmployee(model.getValueAt(selectedRowIndex, 0).toString());
			
				 
			 }
				DefaultTableModel tm55 = (DefaultTableModel) DbUtils.resultSetToTableModel(DBQuery.getEmployed());
				tm55.addColumn("#");
				table_1.setModel(tm55);
				table_1.moveColumn(4,0);
				theader();
		 }
	 }
	 private void getSelectedCase(String id,String customColor,JTextPane txtPane,String tdColor,String size) {
		 ResultSet rs = DBQuery.getCase(id);
	      try {
	    	  
			while(rs.next()) {
				//
					
					//
				
				
					
					
					String date2 = rs.getString("Date_rec_oecc");
					Calendar cal2 = Calendar.getInstance();
					java.sql.Date dateDat2 = java.sql.Date.valueOf(date2);
					cal2.setTime(dateDat2);
					
					int oecc_Month = cal2.get(Calendar.MONTH);
					int oecc_Day = cal2.get(Calendar.DAY_OF_MONTH);
					int oecc_year = cal2.get(Calendar.YEAR);
					
					String date1 = rs.getString("date_prom");
					System.out.print(date1);
					Calendar cal1 = Calendar.getInstance();
					try {
						java.sql.Date dateDat1 = java.sql.Date.valueOf(date1);
						cal1.setTime(dateDat1);
						int date_prmM = cal1.get(Calendar.MONTH);
						int date_prmD = cal1.get(Calendar.DAY_OF_MONTH);
						int date_prmY = cal1.get(Calendar.YEAR);
						dapDate = monthList[date_prmM]+" "+date_prmD+", "+date_prmY;
					}catch(Exception e){
						dapDate = " ";
					}
					
					String rabDesM = rs.getString("date_mr_prom");
					String mrabDesM="";
					Calendar cal3 = Calendar.getInstance();
					try {
						java.sql.Date dateDat3 = java.sql.Date.valueOf(rabDesM);
						cal3.setTime(dateDat3);
						int date_pM = cal3.get(Calendar.MONTH);
						int date_pD = cal3.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal3.get(Calendar.YEAR);
						mrabDesM=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e){
						mrabDesM = " ";
					}
					
					String date4 = rs.getString("date_forwarded");
					String date_4="";
					Calendar cal4 = Calendar.getInstance();
					try {
						java.sql.Date dateDat4 = java.sql.Date.valueOf(date4);
						cal4.setTime(dateDat4);
						int date_pM = cal4.get(Calendar.MONTH);
						int date_pD = cal4.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal4.get(Calendar.YEAR);
						date_4=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_4 = " ";
					}
					String date5 = rs.getString("app_date_or");
					String date_5="";
					Calendar cal5 = Calendar.getInstance();
					try {
						java.sql.Date dateDat5 = java.sql.Date.valueOf(date5);
						cal5.setTime(dateDat5);
						int date_pM = cal5.get(Calendar.MONTH);
						int date_pD = cal5.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal5.get(Calendar.YEAR);
						date_5=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_5 = " ";
					}
					String date6 = rs.getString("ap_date");
					String date_6="";
					Calendar cal6 = Calendar.getInstance();
					try {
						java.sql.Date dateDat6 = java.sql.Date.valueOf(date6);
						cal6.setTime(dateDat6);
						int date_pM = cal6.get(Calendar.MONTH);
						int date_pD = cal6.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal6.get(Calendar.YEAR);
						date_6=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_6 = " ";
					}
					String date7 = rs.getString("date_bnd_new");
					String date_7="";
					Calendar cal7 = Calendar.getInstance();
					try {
						java.sql.Date dateDat7 = java.sql.Date.valueOf(date7);
						cal7.setTime(dateDat7);
						int date_pM = cal7.get(Calendar.MONTH);
						int date_pD = cal7.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal7.get(Calendar.YEAR);
						date_7=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_7 = " ";
					}
					
					String date8 = rs.getString("bndm_new");
					String date_8="";
					Calendar cal8 = Calendar.getInstance();
					try {
						java.sql.Date dateDat8 = java.sql.Date.valueOf(date8);
						cal8.setTime(dateDat8);
						int date_pM = cal8.get(Calendar.MONTH);
						int date_pD = cal8.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal8.get(Calendar.YEAR);
						date_8=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_8 = " ";
					}
					String date9 = rs.getString("Date_rec_com");
					String date_9="";
					Calendar cal9 = Calendar.getInstance();
					try {
						java.sql.Date dateDat9 = java.sql.Date.valueOf(date9);
						cal9.setTime(dateDat9);
						int date_pM = cal9.get(Calendar.MONTH);
						int date_pD = cal9.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal9.get(Calendar.YEAR);
						date_9=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_9 = " ";
					}
					
					String date10 = rs.getString("Date_app_prom");
					String date_10="";
					Calendar cal10 = Calendar.getInstance();
					try {
						java.sql.Date dateDat10 = java.sql.Date.valueOf(date10);
						cal10.setTime(dateDat10);
						int date_pM = cal10.get(Calendar.MONTH);
						int date_pD = cal10.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal10.get(Calendar.YEAR);
						date_10=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_10="";
					}
					String date11 = rs.getString("Date_mr_filed");
					String date_11="";
					Calendar cal11 = Calendar.getInstance();
					try {
						java.sql.Date dateDat11 = java.sql.Date.valueOf(date11);
						cal11.setTime(dateDat11);
						int date_pM = cal11.get(Calendar.MONTH);
						int date_pD = cal11.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal11.get(Calendar.YEAR);
						date_11=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_11="";
					}
					String date12 = rs.getString("Date_mr_filed2");
					String date_12="";
					Calendar cal12 = Calendar.getInstance();
					try {
						java.sql.Date dateDat12 = java.sql.Date.valueOf(date12);
						cal12.setTime(dateDat12);
						int date_pM = cal12.get(Calendar.MONTH);
						int date_pD = cal12.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal12.get(Calendar.YEAR);
						date_12=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_12="";
					}
					String date13 = rs.getString("entry_judgment");
					String date_13="";
					Calendar cal13 = Calendar.getInstance();
					try {
						java.sql.Date dateDat13 = java.sql.Date.valueOf(date13);
						cal13.setTime(dateDat13);
						int date_pM = cal13.get(Calendar.MONTH);
						int date_pD = cal13.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal13.get(Calendar.YEAR);
						date_13=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_13="";
					}
					//
					String date14 = rs.getString("date_entry_judg_issued");
					String date_14="";
					Calendar cal14 = Calendar.getInstance();
					try {
						java.sql.Date dateDat14 = java.sql.Date.valueOf(date14);
						cal14.setTime(dateDat14);
						int date_pM = cal14.get(Calendar.MONTH);
						int date_pD = cal14.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal14.get(Calendar.YEAR);
						date_14=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_14="";
					}
					
					String date15 = rs.getString("date_mailed");
					String date_15="";
					Calendar cal15 = Calendar.getInstance();
					try {
						java.sql.Date dateDat15 = java.sql.Date.valueOf(date15);
						cal15.setTime(dateDat15);
						int date_pM = cal15.get(Calendar.MONTH);
						int date_pD = cal15.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal15.get(Calendar.YEAR);
						date_15=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_15="";
					}
					
					
					//Date_app_nlrc
					String date16 = rs.getString("Date_app_nlrc");
					String date_16="";
					Calendar cal16 = Calendar.getInstance();
					try {
						java.sql.Date dateDat16 = java.sql.Date.valueOf(date16);
						cal16.setTime(dateDat16);
						int date_pM = cal16.get(Calendar.MONTH);
						int date_pD = cal16.get(Calendar.DAY_OF_MONTH);
						int date_pY = cal16.get(Calendar.YEAR);
						date_16=monthList[date_pM]+" "+date_pD+", "+date_pY;
					}catch(Exception e) {
						date_16="";
					}
//					String date3 = rs.getString("Date_rec_com");
//					Calendar cal3 = Calendar.getInstance();
//					java.sql.Date dateDat3 = java.sql.Date.valueOf(date3);
//					cal3.setTime(dateDat3);
//					
//					int comm_Month = cal3.get(Calendar.MONTH);
//					int comm_Day = cal3.get(Calendar.DAY_OF_MONTH);
//					int comm_year = cal3.get(Calendar.YEAR);
					
//					String date4 = rs.getString("Date_app_prom");
//					Calendar cal4 = Calendar.getInstance();
//					java.sql.Date dateDat4 = java.sql.Date.valueOf(date4);
//					cal4.setTime(dateDat4);
//					
//					int ap_Month = cal4.get(Calendar.MONTH);
//					int ap_Day = cal4.get(Calendar.DAY_OF_MONTH);
//					int ap_year = cal4.get(Calendar.YEAR);
					
//					String date5 = rs.getString("Date_mr_filed");
//					Calendar cal5 = Calendar.getInstance();
//					java.sql.Date dateDat5 = java.sql.Date.valueOf(date5);
//					cal5.setTime(dateDat5);
//					
//					int mr_Month = cal5.get(Calendar.MONTH);
//					int mr_Day = cal5.get(Calendar.DAY_OF_MONTH);
//					int mr_year = cal5.get(Calendar.YEAR);
					
//					String date6 = rs.getString("date_mr_prom");
//					Calendar cal6 = Calendar.getInstance();
//					java.sql.Date dateDat6 = java.sql.Date.valueOf(date6);
//					cal6.setTime(dateDat6);
//					
//					int mrp_Month = cal6.get(Calendar.MONTH);
//					int mrp_Day = cal6.get(Calendar.DAY_OF_MONTH);
//					int mrp_year = cal6.get(Calendar.YEAR);
					
//					String date7 = rs.getString("date_mailed");
//					Calendar cal7 = Calendar.getInstance();
//					java.sql.Date dateDat7 = java.sql.Date.valueOf(date7);
//					cal7.setTime(dateDat7);
//					
//					int m_Month = cal7.get(Calendar.MONTH);
//					int m_Day = cal7.get(Calendar.DAY_OF_MONTH);
//					int m_year = cal7.get(Calendar.YEAR);
					
//					String date8 = rs.getString("date_entry_judg_issued");
//					Calendar cal8 = Calendar.getInstance();
//					java.sql.Date dateDat8 = java.sql.Date.valueOf(date8);
//					cal8.setTime(dateDat8);
//					
//					int e_Month = cal8.get(Calendar.MONTH);
//					int e_Day = cal8.get(Calendar.DAY_OF_MONTH);
//					int e_year = cal8.get(Calendar.YEAR);
					
//					String date9 = rs.getString("date_forwarded");
//					Calendar cal9 = Calendar.getInstance();
//					java.sql.Date dateDat9 = java.sql.Date.valueOf(date9);
//					cal9.setTime(dateDat9);
//					
//					int f_Month = cal9.get(Calendar.MONTH);
//					int f_Day = cal9.get(Calendar.DAY_OF_MONTH);
//					int f_year = cal9.get(Calendar.YEAR);
					
					
				txtPane.setContentType("text/html");
				txtPane.setEditable(false);
				txtPane.setText("<html><head>"
						+ "<style>table td{color: "+customColor+";font-size:"+size+";}</style>"
						+ "</head><body style='text-align:center;'>"
				 		+ "<table style=' width:100%;'>"
				 		+ "<tr>"
				 		+ "<td colspan='5'style='text-align:center;background-color:black;color:white;'><b>CASE NUMBER</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ ""
				 		+ "<td colspan='5'>"+rs.getString("full_cnum")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td  colspan='5'>"+rs.getString("full_rab")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5'style='text-align:center;background-color:black;color:white;'><b>TITLE</b></td>"
				 		+ "</tr><tr>"
				 		+ "<td colspan='5' >"+rs.getString("title")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE APPEALED TO NLRC</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE RECEIVED BY OECC</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+date_16+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+monthList[oecc_Month]+" "+oecc_Day+", "+oecc_year+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>APPELLANT</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>INDUSTRY CODE</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+rs.getString("appellant")+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2' >"+rs.getString("ind_code")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>NATURE OF CASE</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>AMOUNT OF AWARD</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' >"+rs.getString("nature_case")+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+rs.getString("amm_curr")+rs.getString("amm_award")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5' style='text-align:center;background-color:black;color:white;'><b>NATURE OF AWARD</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5'>"+rs.getString("nature_award")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>RAB DECISION DATE</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE PROMULGATED</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+mrabDesM+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+dapDate+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE MAILED</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE APPEAL RECEIVED</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+date_4+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+date_5+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='3' style='text-align:center;background-color:black;color:white;'><b></b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'><b>FEMALE</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'><b>MALE</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='3'>"+rs.getString("com")+"-"+rs.getString("la")+"</td>"
				 		+ "<td>"+rs.getString("female")+"</td>"
				 		+ "<td>"+rs.getString("male")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5'>"+rs.getString("other")+"</td>"
				 		+ "<tr>"
				 		+ "<td colspan='5' style='text-align:center;background-color:black;color:white;'><b>APPEAL</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td style='text-align:center;background-color:#0a0a0a;color:white;'><b>FEE</b></td>"
				 		+ "<td  style='text-align:center;background-color:#0a0a0a;color:white;'> </td>"
				 		+ "<td style='text-align:center;background-color:#0a0a0a;color:white;'><b>OR No.</b></td>"
				 		+ "<td  style='text-align:center;background-color:#0a0a0a;color:white;'> </td>"
				 		+ "<td style='text-align:center;background-color:#0a0a0a;color:white;'><b>DATE</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td>"+rs.getString("app_curr")+rs.getString("appeal_fee")+"</td>"
				 		+ "<td> </td>"
				 		+"<td>"+rs.getString("appeal_or")+"</td>"
				 		+ "<td> </td>"
				 		+"<td>"+date_6+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5' style='text-align:center;background-color:black;color:white;'><b>BOND</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td style='text-align:center;background-color:#0a0a0a;color:white;'><b>CASH</b></td>"
				 		+ "<td style='text-align:center;background-color:#0a0a0a;color:white;'><b>AMOUNT</b></td>"
				 		+ "<td style='text-align:center;background-color:#0a0a0a;color:white;'><b>OR No.</b></td>"
				 		+ "<td style='text-align:center;background-color:#0a0a0a;color:white;'><b>DATE</b></td>"
				 		+ "<td style='text-align:center;background-color:#0a0a0a;color:white;'><b>SURETY</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td>"+rs.getString("bond")+"</td>"
				 		+ "<td>"+rs.getString("curr")+rs.getString("bond_amount")+"</td>"
				 		+ "<td>"+rs.getString("bond_date_or")+"</td>"
				 		+ "<td>"+date_7+"</td>"
				 		+ "<td>"+rs.getString("surety")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>BOND NUMBER</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+rs.getString("bnd_num_new")+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+date_8+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>PONENTE</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE RECEIVED BY PONENTE</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+rs.getString("ponente")+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+date_9+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE APPEAL PROMULGATED</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DECISION ON APPEAL</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+date_10+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+rs.getString("decision_on_appeal")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE MR FILED</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>MR FILED BY</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+date_11+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+rs.getString("mr_filed_by1")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5' style='text-align:center;background-color:black;color:white;'><b>DECISION ON MR</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5'>"+rs.getString("decision_on_mr1")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE MR FILED</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>MR FILED BY</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2'>"+date_12+"</td>"
				 		+ "<td> </td>"
				 		+ "<td colspan='2'>"+rs.getString("mr_filed_by2")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5' style='text-align:center;background-color:black;color:white;'><b>DECISION ON MR</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5'>"+rs.getString("decision_on_mr2")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>ENTRY OF JUDGMENT</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE ENTRY OF JUDGMENT ISSUED</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
						+ "<td  colspan='2'>"+date_13+"</td>"
						+ "<td> </td>"
						+ "<td colspan='2'>"+date_14+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td  colspan='2' style='text-align:center;background-color:black;color:white;'><b>DATE REMANDED TO RAB/SRAB</b></td>"
				 		+ "<td  style='text-align:center;background-color:black;color:white;'> </td>"
				 		+ "<td  colspan='2' style='text-align:center;background-color:black;color:white;'><b>COURIER AIRBILL NUMBER</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
						+ "<td colspan='2'>"+date_15+"</td>"
						+ "<td > </td>"
						+ "<td colspan='2'>"+rs.getString("courier_airbill_no")+"</td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5' style='text-align:center;background-color:black;color:white;'><b>REMARKS</b></td>"
				 		+ "</tr>"
				 		+ "<tr>"
				 		+ "<td colspan='5'>"+rs.getString("remarks")+"</td>"
				 		+ "</tr>"
				 		+ "</table>"
				 		+ "</body></html>");
				textPane.setCaretPosition(0);
				
//				 lblDatea.setText();
//				
//		
//				 lblAfee.setText();
//				 lblBond.setText();
//				 lblEjudge.setText();
//				 lblRem.setText);
//			
//				 lblDatemrs.setText();
//				 lblDatefrq.setText();
//				 lblCan.setText();
//				 lblCom.setText();
//				 lblLa.setText);
//				 lblDon.setText();
//				 lblDon_1.setText(rs.getString("bond_date_or"));
//				 lblCno.setText();
				 
				 caseView = rs.getString("id");
				 caseViewT = rs.getString("title");
				 caseNum = rs.getString("cnum");
				 
				 
			  }
	      	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	      	}
	 }
	 public boolean jValidateButton(JComboBox cb1, JComboBox cb2 , JComboBox cb3) {
		 if(cb1.getSelectedIndex() == 0 && cb2.getSelectedIndex() == 0 && cb3.getSelectedIndex() == 0) {
			 return false;
		 }else if(cb1.getSelectedIndex() > 0 && cb2.getSelectedIndex() > 0 && cb3.getSelectedIndex() > 0) {
			 return false;
		 }else {
			 return true;
		 }
		 
	 }
	 
	 
	 public void resizeColumnWidth(JTable table) {
		    final TableColumnModel columnModel = table.getColumnModel();
		    for (int column = 0; column < table.getColumnCount(); column++) {
		        int width = 15; // Min width
		        for (int row = 0; row < table.getRowCount(); row++) {
		            TableCellRenderer renderer = table.getCellRenderer(row, column);
		            Component comp = table.prepareRenderer(renderer, row, column);
		            width = Math.max(comp.getPreferredSize().width +1 , width);
		        }
		        if(width > 300)
		            width=300;
		        columnModel.getColumn(column).setPreferredWidth(width);
		    }
		}
}
