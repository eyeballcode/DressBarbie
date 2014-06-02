package org.dressBarbie.bootstrap.launcherFrame;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.dressBarbie.bootstrap.Bootstrap;

public class MainFrame {
	static String verID = Bootstrap.verID;
	static JFrame launcherFrame;
    private final static void setDesign() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception e) {   
        }
    	System.gc();
    }
	public static void main(String [] args) {
		try {
		if (args [0] == "offline") {
			setDesign();
			launcherFrame = new JFrame("Dress the Barbie Launcher "+verID+" (offline mode)");
			launcherFrame.add(TabPanes.getTabPanesOffline(), BorderLayout.CENTER);
			launcherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon img = new ImageIcon(System.getProperty("user.home")+"/.dressbarbie/icon.png");
			launcherFrame.setIconImage(img.getImage());
			launcherFrame.pack();
			launcherFrame.setVisible(true);
			UIManager.setLookAndFeel("");
			System.gc();
		} else {
			setDesign();
			launcherFrame = new JFrame("Dress the Barbie Launcher "+verID);
			launcherFrame.add(TabPanes.getTabPanesOnline());
			launcherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon img = new ImageIcon(System.getProperty("user.home")+"/.dressbarbie/icon.png");
			launcherFrame.setIconImage(img.getImage());
			launcherFrame.pack();
			launcherFrame.setVisible(true);
			System.gc();
		}
		} catch(ArrayIndexOutOfBoundsException e) {
			String args2 [] = {"no-mode"};
			org.dressBarbie.bootstrap.Bootstrap.main(args2);
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		} catch (UnsupportedLookAndFeelException e) {
		}
	}
}
