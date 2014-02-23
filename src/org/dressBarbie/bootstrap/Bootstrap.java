package org.dressBarbie.bootstrap;

import java.util.Date;

import org.dressBarbie.bootstrap.download.FileDownloader;
import org.dressBarbie.bootstrap.util.Utils;

public class Bootstrap {
	/**
	 * <html><body><u>A short help guide on version numbers.</u><br>
	 * "1.0.0"<br>
	 * ⬇<br>
	 * 1 ➡ major release version<br>
	 * .0 ➡ minor version<br>
	 * .0 ➡ patch number<br>
	 * Example ➡ 1.2.3 ➡ main version 1, subversion 2, patch update 3.</body></html>
	 */
	public static String verId = "1.5.2";
	public static Date d = new Date();
	
	public static void main(String[] args) {
		try {
		if(args [0] == "no-mode") {
			System.out.println("[FATAL ERROR] "+new Date()+": No mode specified!");
			System.out.println("[INFO] "+new Date()+": Rebooting system...");
			System.out.println("[INFO] "+new Date()+": SystemSpeeder enabled!");
			System.out.println("[INFO] "+new Date()+": Dress the Barbie Launcher "+verId+" started on "+System.getProperty("os.name")+"...");
			System.out.println("[INFO] "+new Date()+": Refershing remote version list...");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.name\") == \""+System.getProperty("os.name")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.arch\") == \""+System.getProperty("os.arch")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.version\") == \""+System.getProperty("os.version")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"java.version\") == \""+System.getProperty("java.version")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"java.vendor\") == \""+System.getProperty("java.vendor")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"sun.arch.data.model\") == \""+System.getProperty("sun.arch.data.model")+"\"");
			System.out.println("[INFO] "+new Date()+": Util.getPID() == \""+Utils.getPID()+"\"");
			System.out.println("[INFO] "+new Date()+": Refreshing completed!");
			System.out.println("[INFO] "+new Date()+": Checking Java version!");
			if(Utils.checkjVersion(6) == true) {
			System.out.println("[INFO] "+new Date()+": Java version good!");
			System.out.println("[INFO] "+new Date()+": Starting file manager...");
			System.out.println("[INFO] "+new Date()+": File manager started!");
			@SuppressWarnings("unused")
			FileDownloader fd = new FileDownloader();
			} else {
				System.out.println("[ERROR] "+new Date()+": Java version too low!");
				System.exit(0);
			}
		} else {
			System.out.println("[INFO] "+new Date()+": SystemSpeeder enabled!");
			System.out.println("[INFO] "+new Date()+": Dress the Barbie Launcher "+verId+" started on "+System.getProperty("os.name")+"...");
			System.out.println("[INFO] "+new Date()+": Refershing remote version list...");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"java.vm.info\") == \""+System.getProperty("java.vm.info")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.name\") == \""+System.getProperty("os.name")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.arch\") == \""+System.getProperty("os.arch")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"os.version\") == \""+System.getProperty("os.version")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"java.version\") == \""+System.getProperty("java.version")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"java.vendor\") == \""+System.getProperty("java.vendor")+"\"");
			System.out.println("[INFO] "+new Date()+": System.getProperty(\"sun.arch.data.model\") == \""+System.getProperty("sun.arch.data.model")+"\"");
			System.out.println("[INFO] "+new Date()+": Utils.getPID() == \""+Utils.getPID()+"\"");
			System.out.println("[INFO] "+new Date()+": Refreshing completed!");
			System.out.println("[INFO] "+new Date()+": Checking Java version!");
			if(Utils.checkjVersion(6) == true) {
			System.out.println("[INFO] "+new Date()+": Java version good!");
			System.out.println("[INFO] "+new Date()+": Starting file manager...");
			System.out.println("[INFO] "+new Date()+": File manager started!");
			@SuppressWarnings("unused")
			FileDownloader fd = new FileDownloader();
			} else {
				System.out.println("[ERROR] "+new Date()+": Java version too low!");
				System.exit(0);
			}
		}
		} catch(ArrayIndexOutOfBoundsException e) {
			String args1[] = {""};
			Bootstrap.main(args1);
		}
		}
}
