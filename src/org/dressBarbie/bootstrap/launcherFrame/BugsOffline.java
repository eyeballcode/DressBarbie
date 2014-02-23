package org.dressBarbie.bootstrap.launcherFrame;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BugsOffline {
	public static JPanel getBugPane() {
		JPanel p = new JPanel();
		JButton b = new JButton("Report!");
		b.setEnabled(false);
		b.setToolTipText("<html><body><font size=\"3\" color=\"red\">Reporting bugs not enabled in offline mode</font></body></html>");
		p.add(b, BorderLayout.NORTH);
		p.add(new JLabel("Link: http://dressbarbie.blogspot.sg/2014/01/report-bugs.html#comment-form"), BorderLayout.SOUTH);
		System.gc();
		return p;
	}

}
