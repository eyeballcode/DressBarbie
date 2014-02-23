package org.dressBarbie.bootstrap.launcherFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.dressBarbie.bootstrap.util.Utils;

public class Bugs {
	public static JPanel getBugPane() {
		JPanel p = new JPanel();
		JButton b = new JButton("Report!");
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					Utils.openLink(new URI("http://dressbarbie.blogspot.sg/2014/01/report-bugs.html#comment-form"));
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
			}
			
		});
		p.add(b);
		return p;
	}

}
