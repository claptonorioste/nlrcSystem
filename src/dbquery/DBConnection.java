package dbquery;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DBConnection {
	
	Connection conn = null;
	public static Connection dbConnector()
	{	
		String ip="";
		File file = new File("ip.dat");
		try {
			
			Scanner input = new Scanner(file);
				ip = input.nextLine();
			
		}catch(Exception e) {
			PrintWriter outPutStream = null;
			try {
				outPutStream = new PrintWriter(new FileOutputStream("ip.dat"));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			outPutStream.print("localhost");
			outPutStream.close();
		}
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ip+":3306/nlrc?useUnicode=true&characterEncoding=utf-8","root","");
			//JOptionPane.showMessageDialog(null, "Connection Successfully Established!");
			return conn;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Server Offline!");
			return null;
		}
	}
}
