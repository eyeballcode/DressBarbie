package org.dressBarbie.bootstrap.launcherFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.dressBarbie.bootstrap.download.FileDownloader;

public class LoginPage {
	static String [] args = {""};
		static ActionListener playListener = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("[INFO] "+new Date()+": Cleaning up...");
					System.out.println("[INFO] "+new Date()+": Closing launcher...");
					org.dressBarbie.bootstrap.launcherFrame.MainFrame.launcherFrame.setVisible(false);
					System.out.println("[INFO] "+new Date()+": Starting game...");
					System.out.println("[NOTE] "+new Date()+": After game closes, launcher will also close.");
					org.dressBarbie.bootstrap.launcherFrame.MainFrame.launcherFrame = null;
				}
		};
		static ActionListener rebootSys = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("[INFO] "+new Date()+": Rebooting...");
				org.dressBarbie.bootstrap.launcherFrame.MainFrame.launcherFrame.setVisible(false);
				org.dressBarbie.bootstrap.launcherFrame.MainFrame.launcherFrame = null;
				org.dressBarbie.bootstrap.Bootstrap.main(args);
				System.gc();
			}
	};
	static ActionListener retryDownloadListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Thread.sleep(5000);
				System.out.println("[INFO] "+new Date()+": 5");
				Thread.sleep(1000);
				System.out.println("[INFO] "+new Date()+": 4");
				Thread.sleep(1000);
				System.out.println("[INFO] "+new Date()+": 3");
				Thread.sleep(1000);
				System.out.println("[INFO] "+new Date()+": 2");
				Thread.sleep(1000);
				System.out.println("[INFO] "+new Date()+": 1");
				System.out.println("[INFO] "+new Date()+": Retrying download...");
				FileDownloader.retry();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
};
		public static JPanel getLoginTab() {
		JPanel loginPage = new JPanel();
		JButton play = new JButton("Play");
		play.setEnabled(false);
		play.setToolTipText("<html><body><font size=\"3\" color=\"red\">Sorry, play mode is currently not avaliable.<p>We apologise for any inconvience caused.</font></body></html");
		JButton rebootSystem = new JButton("Reboot System");
		JButton retryDownloadButton = new JButton("Retry Download");
		retryDownloadButton.addActionListener(retryDownloadListener);
		rebootSystem.addActionListener(rebootSys);
		play.addActionListener(playListener);
		loginPage.add(play);
		loginPage.add(rebootSystem);
		loginPage.add(retryDownloadButton);
		System.gc();
		return loginPage;
	}
}
