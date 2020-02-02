package nlrcpages;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import dbquery.DBQuery;

public class PageRunner extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					MainPage a = new MainPage();
//					a.setVisible(true);
//					a.setExtendedState(JFrame.MAXIMIZED_BOTH);
					Login logged = new Login();
					
					logged.setLocationRelativeTo(null);
					logged.setResizable(false);
					logged.pack();
					logged.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
