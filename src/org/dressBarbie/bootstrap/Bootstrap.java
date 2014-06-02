package org.dressBarbie.bootstrap;

import java.net.URL;
import java.util.Date;
import java.util.Scanner;

import org.dressBarbie.bootstrap.download.FileDownloader;
import org.dressBarbie.bootstrap.util.Utils;


public class Bootstrap {
	private static String get() {
		Scanner s = null;
		try {
			   URL url = new URL("http://www.puzzlers.org/pub/wordlists/pocket.txt");
			   s = new Scanner(url.openStream());
			   // read from your scanner
			}
			catch(Exception ex) {
			   // there was some connection problem, or the file did not exist on the server,
			   // or your URL was not in the right format.
			   // think about what to do now, and put it here.
			   ex.printStackTrace(); // for now, simply output it.
			} finally {
				s.close();
			}
	System.out.println(s.toString());
	return s.toString();
	}
	public static String verID = get();
	public static Date d = new Date();
	
	public static void main(String[] args) {
		try {
		if(args [0] == "no-mode") {
			System.out.println("[FATAL ERROR] "+new Date()+": No mode specified!");
			System.out.println("[INFO] "+new Date()+": Rebooting system...");
			System.out.println("[INFO] "+new Date()+": SystemSpeeder enabled!");
			System.out.println("[INFO] "+new Date()+": Dress the Barbie Launcher "+verID+" started on "+System.getProperty("os.name")+"...");
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
			System.out.println("[INFO] "+new Date()+": Dress the Barbie Launcher "+verID+" started on "+System.getProperty("os.name")+"...");
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
