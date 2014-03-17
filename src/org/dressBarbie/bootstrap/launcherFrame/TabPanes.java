package org.dressBarbie.bootstrap.launcherFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.dressBarbie.bootstrap.Bootstrap;


public class TabPanes {
	private static JTabbedPane tabbedPanes;
	static String d;
	public static JTabbedPane getTabPanesOnline() {
		d = ""+Bootstrap.d;
		tabbedPanes = new JTabbedPane();
		 tabbedPanes.addTab("Update Notes", UpdateNotes.getUpdate());
		JPanel jokes = new JPanel();
		jokes.add(new JLabel("<html><body><center>There will be more next time! I know right? You can log in anywhere, even on the moon!<p>Wait till it comes! Don't scream your head off!<p>P.S. The launcher started at "+d+"</center></center></body></html>"+
				"Note: We are planning to add a feature to automatically download updates!</center></center></body></html>"));
		tabbedPanes.add("Developement Console", jokes);
		tabbedPanes.add("Tools and Options", LoginPage.getLoginTab());
		tabbedPanes.add("Report a bug",Bugs.getBugPane());
		System.gc();
		 return tabbedPanes;
	}
	public static JTabbedPane getTabPanesOffline() {
		d = ""+Bootstrap.d;
		tabbedPanes = new JTabbedPane();
		 tabbedPanes.addTab("Update Notes", UpdateNotesOffline.getUpdate());
		JPanel jokes = new JPanel();
		jokes.add(new JLabel("<html><body><center>There will be more next time! I know right? You can log in anywhere, even on the moon!<p>Wait till it comes! Don't scream your head off!<p>P.S. The launcher started at "+d+"<p>"+
		"Note: We are planning to add a feature to automatically download updates!</center></center></body></html>"));
		tabbedPanes.add("Developement Console", jokes);
		tabbedPanes.add("Tools and Options", LoginPage.getLoginTab());
		tabbedPanes.add("Report a bug",BugsOffline.getBugPane());
		System.gc();
		 return tabbedPanes;
	}
}