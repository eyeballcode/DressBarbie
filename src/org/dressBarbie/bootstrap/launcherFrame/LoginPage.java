package org.dressBarbie.bootstrap.launcherFrame;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LoginPage {
		static ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("[INFO] "+new Date()+": Cleaning up...");
					System.out.println("[INFO] "+new Date()+": Closing launcher...");
					org.dressBarbie.bootstrap.launcherFrame.MainFrame.launcherFrame.setVisible(false);
					System.out.println("[INFO] "+new Date()+": Starting game...");
					System.out.println("[NOTE] "+new Date()+": After game closes, launcher will also close.");
					org.dressBarbie.bootstrap.launcherFrame.MainFrame.launcherFrame = null;
					@SuppressWarnings("unused")
					org.dressBarbie.play.frames.MainFrame f = new org.dressBarbie.play.frames.MainFrame();
					System.gc();
				}
		};
		public static JPanel getLoginTab() {
			
		JPanel loginPage = new JPanel();
		JButton play = new JButton("Play!");
		play.addActionListener(l);
		loginPage.add(play, BorderLayout.PAGE_END);
		System.gc();
		return loginPage;
	}
}
