package dbquery;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DBQuery {
	
	private static int loginLastID = 0;
	
	public static ResultSet queryDCaseTitle() {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		//String query="select Cnum as 'Case No.',Title,Date_app_nlrc as 'Date Appealed to NLRC',Date_rec_oecc as 'Date Receive by OECC',Date_rec_com as 'Date Receive by Com.',Date_app_prom as 'Date Appeal Promulgated',Date_mr_filed as 'Date MR Filed',date_mr_prom as 'Date MR Promulgated', ind_code as 'Industry Code',nature_case as 'Nature of Case',nature_award as 'Nature of Award',amm_award as 'Ammount of Award (LA)',com as 'COM',gender as 'Gender',la as 'LA',date_mailed as 'RAB/SRAB mailed Date',appeal_fee as 'Appeal Fee',app_date_or as 'Appeal Fee Date/OR No.',bond as 'Bond',bond_date_or as 'Bond Date/OR No.',entry_judgment as 'Entry of Judgement',date_entry_judg_issued as 'Date Entry Judgement Issued',date_forwarded as 'Date Forwarded to RAB/QC',courier_airbill_no as 'Courrier Airbill No.',remarks as 'Remarks' from nlrc_data";
		
		String query="select full_cnum as 'MAC/MER/CC No.',full_rab as 'SRAB/RAB No.',Title,Date_rec_oecc as 'Date Received by OECC' from nlrc_data ORDER BY Date_rec_oecc DESC";
		try {
			PreparedStatement pst=connection.prepareStatement(query); 
			ResultSet rs=pst.executeQuery();
			return rs;
		}catch(Exception e) {
			
		}
		return null;
		
	}
	
	public static ResultSet queryCaseTitle() {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		//String query="select Cnum as 'Case No.',Title,Date_app_nlrc as 'Date Appealed to NLRC',Date_rec_oecc as 'Date Receive by OECC',Date_rec_com as 'Date Receive by Com.',Date_app_prom as 'Date Appeal Promulgated',Date_mr_filed as 'Date MR Filed',date_mr_prom as 'Date MR Promulgated', ind_code as 'Industry Code',nature_case as 'Nature of Case',nature_award as 'Nature of Award',amm_award as 'Ammount of Award (LA)',com as 'COM',gender as 'Gender',la as 'LA',date_mailed as 'RAB/SRAB mailed Date',appeal_fee as 'Appeal Fee',app_date_or as 'Appeal Fee Date/OR No.',bond as 'Bond',bond_date_or as 'Bond Date/OR No.',entry_judgment as 'Entry of Judgement',date_entry_judg_issued as 'Date Entry Judgement Issued',date_forwarded as 'Date Forwarded to RAB/QC',courier_airbill_no as 'Courrier Airbill No.',remarks as 'Remarks' from nlrc_data";
		
		String query="select full_cnum as 'MAC/MER/CC No.',full_rab as 'SRAB/RAB No.',Title,case_type,id from nlrc_data ORDER BY Date_rec_oecc DESC";
		try {
			PreparedStatement pst=connection.prepareStatement(query); 
			ResultSet rs=pst.executeQuery();
			return rs;
		}catch(Exception e) {
			
		}
		return null;
		
	}
	public static ResultSet querySort(String month, String year) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select full_cnum as 'MAC/MER/CC No.',full_rab as 'SRAB/RAB No.',Title,Date_rec_oecc as 'Date Received by OECC' from nlrc_data where month(Date_rec_oecc) like '"+month+"' AND year(Date_rec_oecc) like '"+year+"'ORDER BY Date_rec_oecc DESC  ";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static ResultSet queryDSort(String month, String year, String day) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select full_cnum as 'MAC/MER/CC No.',full_rab as 'SRAB/RAB No.',Title,Date_rec_oecc as 'Date Received by OECC' from nlrc_data where month(Date_rec_oecc) like '"+month+"' AND year(Date_rec_oecc) like '"+year+"' AND day(Date_rec_oecc) like '"+day+"'ORDER BY Date_rec_oecc DESC  ";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	
	public static ResultSet querySearch(String cnum, String title,String rab) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select full_cnum as 'MAC/MER/CC No.',full_rab as 'SRAB/RAB No.',Title,case_type,id from nlrc_data where full_rab like '%"+rab+"%' OR full_cnum like '%"+cnum+"%' OR Title like '%"+title+"%'ORDER BY Date_rec_oecc DESC  ";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static ResultSet getCase(String cnum) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select * from nlrc_data where id = '"+cnum+"'";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static void deleteCase(String cnum) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="delete from nlrc_data where id = ?";
		 
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				pst.setString(1,cnum);
				pst.executeUpdate();
			}catch(Exception e) {}
	}
	public static void insertCase(String CNum,String Title ,String Date_app_nlrc,String Date_rec_oecc,String Date_rec_com,String Date_app_prom,String Date_mr_filed,
			String date_mr_prom ,String ind_code,String nature_case,String nature_award,String amm_award,String com,String la,
			String date_mailed,String appeal_fee,String app_date_or,String bond,String bond_date_or,String entry_judgment,
			String date_entry_judg_issued,String date_forwarded,String courier_airbill_no,String remarks,String case_type,
			String male,String female,String nlrc_case,String ofw,String compla,String respo,String rab_type,String app,
			String date_prom,String other,String appeal_or,String ap_date,String full_cnum,String full_rab,String bond_amount,
			String date_bnd_new,String surety,String bnd_num_new,String bndm_new,String app_curr,String amm_curr,
			String ponente,String decision_on_appeal,String mr_filed_by1,String decision_on_mr1,String date_mr_filed2,
			String mr_filed_by2,String decision_on_mr2) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		String query="insert into nlrc_data (CNum, Title, Date_app_nlrc, Date_rec_oecc, Date_rec_com, Date_app_prom, Date_mr_filed, "
				+ "date_mr_prom, ind_code, nature_case, nature_award, amm_award, com, la, "
				+ "date_mailed,appeal_fee, app_date_or, bond, bond_date_or, entry_judgment, date_entry_judg_issued, date_forwarded, courier_airbill_no,"
				+ "remarks,case_type,male,female,nlrc_case_num,ofw_type,complainant,respondent,"
				+ "rab_type,appellant,date_prom,other,appeal_or,ap_date,full_cnum,full_rab,bond_amount,"
				+ "date_bnd_new,surety,bnd_num_new,bndm_new,app_curr,amm_curr,ponente,decision_on_appeal,mr_filed_by1,"
				+ "decision_on_mr1,date_mr_filed2,mr_filed_by2,decision_on_mr2) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			
			PreparedStatement pst=connection.prepareStatement(query);
			pst.setString(1,CNum);
			pst.setString(2, Title);
			pst.setString(3, Date_app_nlrc);
			pst.setString(4, Date_rec_oecc);
			pst.setString(5, Date_rec_com);
			pst.setString(6, Date_app_prom);
			pst.setString(7, Date_mr_filed);
			pst.setString(8, date_mr_prom);
			pst.setString(9, ind_code);
			pst.setString(10, nature_case);
			pst.setString(11, nature_award);
			pst.setString(12, amm_award);
			pst.setString(13, com);
			pst.setString(14, la);
			pst.setString(15, date_mailed);
			pst.setString(16, appeal_fee);
			pst.setString(17, app_date_or);
			pst.setString(18, bond);
			pst.setString(19, bond_date_or);
			pst.setString(20, entry_judgment);
			pst.setString(21, date_entry_judg_issued);
			pst.setString(22, date_forwarded);
			pst.setString(23, courier_airbill_no);
			pst.setString(24, remarks);
			pst.setString(25, case_type);
			pst.setString(26, male);
			pst.setString(27, female);
			pst.setString(28, nlrc_case);
			pst.setString(29, ofw);
			pst.setString(30, compla);
			pst.setString(31,respo);
			pst.setString(32,rab_type);
			pst.setString(33,app);
			pst.setString(34,date_prom);
			pst.setString(35,other);
			pst.setString(36,appeal_or);
			pst.setString(37,ap_date);
			pst.setString(38,full_cnum);
			pst.setString(39,full_rab);
			pst.setString(40,bond_amount);
			pst.setString(41,date_bnd_new);
			pst.setString(42,surety);
			pst.setString(43,bnd_num_new);
			pst.setString(44,bndm_new);
			pst.setString(45,app_curr);
			pst.setString(46,amm_curr);
			pst.setString(47,ponente);
			pst.setString(48,decision_on_appeal);
			pst.setString(49,mr_filed_by1);
			pst.setString(50,decision_on_mr1);
			pst.setString(51,date_mr_filed2);
			pst.setString(52,mr_filed_by2);
			pst.setString(53,decision_on_mr2);
			
			
			
			
			
			
			
			
			
			
		
			
			
			pst.execute();
			
			pst.close();
			
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	public static void updateCase(String CNum,String Title ,String Date_app_nlrc,String Date_rec_oecc,String Date_rec_com,
			String Date_app_prom,String Date_mr_filed,String date_mr_prom ,String ind_code,String nature_case,
			String nature_award,String amm_award,String com,String la,String date_mailed,String appeal_fee,String app_date_or,
			String bond,String bond_date_or,String entry_judgment,String date_entry_judg_issued,String date_forwarded,
			String courier_airbill_no,String remarks,String id,String caseType,String male,String female,String n,String ofw,String compla,
			String respo,String rab_type,String app,String date_prom,String other,String appeal_or,String ap_date,String full_cnum,
			String full_rab,String bond_amount,String date_bnd_new,String surety,String bnd_num_new,String bndm_new,
			String app_curr,String amm_curr,String ponente,String decision_on_appeal,String mr_filed_by1,String decision_on_mr1,
			String date_mr_filed2,String mr_filed_by2,String decision_on_mr2) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		String query="update nlrc_data set CNum = ?, Title = ?, Date_app_nlrc = ?, Date_rec_oecc = ?, Date_rec_com = ?, Date_app_prom = ?, Date_mr_filed = ?, "
				+ "date_mr_prom = ?, ind_code = ?, nature_case = ?, nature_award = ?, amm_award = ?, com = ?, la = ?, "
				+ "date_mailed = ?,appeal_fee = ?, app_date_or = ?, bond = ?, bond_date_or = ?, entry_judgment = ?, date_entry_judg_issued = ?, date_forwarded = ?, courier_airbill_no = ?,"
				+ "remarks = ?,case_type = ?,male = ?,female = ?,nlrc_case_num = ?,ofw_type=?,complainant=?,respondent=?,"
				+ "rab_type=?,appellant=?,date_prom=?,other=?,appeal_or=?,ap_date=?,full_cnum=?,full_rab=?,bond_amount=?,date_bnd_new=?,surety=?,bnd_num_new=?,"
				+ "bndm_new=?,app_curr=?,amm_curr=?,ponente=?,decision_on_appeal=?,mr_filed_by1=?,decision_on_mr1=?,date_mr_filed2=?,"
				+ "mr_filed_by2=?,decision_on_mr2=? where id = ?";
		try {
			
			PreparedStatement pst=connection.prepareStatement(query);
			pst.setString(1,CNum);
			pst.setString(2, Title);
			pst.setString(3, Date_app_nlrc);
			pst.setString(4, Date_rec_oecc);
			pst.setString(5, Date_rec_com);
			pst.setString(6, Date_app_prom);
			pst.setString(7, Date_mr_filed);
			pst.setString(8, date_mr_prom);
			pst.setString(9, ind_code);
			pst.setString(10, nature_case);
			pst.setString(11, nature_award);
			pst.setString(12, amm_award);
			pst.setString(13, com);
			pst.setString(14, la);
			pst.setString(15, date_mailed);
			pst.setString(16, appeal_fee);
			pst.setString(17, app_date_or);
			pst.setString(18, bond);
			pst.setString(19, bond_date_or);
			pst.setString(20, entry_judgment);
			pst.setString(21, date_entry_judg_issued);
			pst.setString(22, date_forwarded);
			pst.setString(23, courier_airbill_no);
			pst.setString(24, remarks);
			pst.setString(25, caseType);
			pst.setString(26, male);
			pst.setString(27, female);
			pst.setString(28, n);
			pst.setString(29, ofw);
			pst.setString(30, compla);
			pst.setString(31, respo);
			pst.setString(32, rab_type);
			pst.setString(33, app);
			pst.setString(34, date_prom);
			pst.setString(35, other);
			pst.setString(36, appeal_or);
			pst.setString(37, ap_date);
			pst.setString(38, full_cnum);
			pst.setString(39, full_rab);
			pst.setString(40, bond_amount);
			pst.setString(41, date_bnd_new);
			pst.setString(42, surety);
			pst.setString(43, bnd_num_new);
			pst.setString(44, bndm_new);
			pst.setString(45, app_curr);
			pst.setString(46, amm_curr);
			pst.setString(47, ponente);
			pst.setString(48, decision_on_appeal);
			pst.setString(49, mr_filed_by1);
			pst.setString(50, decision_on_mr1);
			pst.setString(51, date_mr_filed2);
			pst.setString(52, mr_filed_by2);
			pst.setString(53, decision_on_mr2);
			 
			pst.setString(54, id);
			
			
			
			
			
			pst.executeUpdate();
		
			pst.close();
			
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	public static void insertAccount(String name,String surename ,String username,String password,String userType) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		String query="insert into employee_info (name, surename, username, password, userType) values (?,?,?,?,?)";
		try {
			
			PreparedStatement pst=connection.prepareStatement(query);
			pst.setString(1,name);
			pst.setString(2, surename);
			pst.setString(3, username);
			pst.setString(4, password);
			pst.setString(5, userType);
			
			pst.execute();
			
			pst.close();
			
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	public static ResultSet getEmployee(String id) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select * from employee_info where EID = '"+id+"'";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static void updateEmployee(String name,String surname ,String username,String password,String id) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		String query="update employee_info set name = ?, surename = ?, username = ?, password = ? where EID = ?" ;
		try {
			
			PreparedStatement pst=connection.prepareStatement(query);
			pst.setString(1,name);
			pst.setString(2, surname);
			pst.setString(3, username);
			pst.setString(4, password);
			pst.setString(5, id);
			
			pst.executeUpdate();
		
			pst.close();
			
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	public static ResultSet getLogin(String user,String pass) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select * from employee_info where username = '"+user+"' AND password = '"+pass+"'";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static ResultSet getEmployed() {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select EID as 'Account ID',Name,Surename as 'Lastname',userType as 'Account Type' from employee_info where userType != 'admin'" ;
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static ResultSet querySearchEmployee(String name, String lastname) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select EID as 'Account ID',Name,Surename as 'Lastname',userType as 'Account Type' from employee_info where Name like '%"+name+"%'AND userType != 'admin' OR Surename like '%"+lastname+"%' AND userType != 'admin'";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static void deleteEmployee(String id) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="delete from employee_info where EID = ?";
		 
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				pst.setString(1,id);
				pst.executeUpdate();
			}catch(Exception e) {}
	}
	public static ResultSet getLoggedIN() {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select account_name as 'Account Name',login as 'Login Date Time',logout as 'Logout Date Time' from loginhistory ORDER BY id DESC" ;
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static ResultSet loginSearch(String account_name, String login,String logout) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select account_name as 'Account Name',login as 'Login Date Time',logout as 'Logout Date Time' from loginhistory where account_name like '%"+account_name+"%' OR login like '%"+login+"%' OR logout like '"+logout+"%'  ORDER BY id DESC";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs;
			}catch(Exception e) {
				
			}
			return null;
			 
	}
	public static void insertLoggin(String date,String name) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		String query="insert into loginhistory (account_name,login) values (?,?)";
		try {
			
			PreparedStatement pst=connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			pst.setString(1,name);
			pst.setString(2,date);
	
			int rowAffected = pst.executeUpdate();
			if(rowAffected == 1)
            {
				ResultSet rs=pst.getGeneratedKeys();
                // get candidate id
                rs = pst.getGeneratedKeys();
                if(rs.next())
                	loginLastID = rs.getInt(1);
 
            }
			
			
			
			pst.close();
			
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	public static void insertLogout(int id,String date ) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		String query="update loginhistory set logout = ? where id = ?" ;
		try {
			
			PreparedStatement pst=connection.prepareStatement(query);
			pst.setString(1,date);
			pst.setInt(2, id);
			
			pst.executeUpdate();
		
			pst.close();
			
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	public static int getLoginLastID() {
		return loginLastID;
	}
	public static void setLoginLastID(int loginLastID) {
		DBQuery.loginLastID = loginLastID;
	}
	public static String getCaseType(String cnum) {
		Connection connection = null;
		connection = DBConnection.dbConnector();
		 String query="select case_type from nlrc_data where id = '"+cnum+"'";
		 try {
				PreparedStatement pst=connection.prepareStatement(query); 
				ResultSet rs=pst.executeQuery();
				return rs.getString("case_type");
			}catch(Exception e) {
				
			}
			return null;
	}

}
