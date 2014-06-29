package org.dressBarbie.bootstrap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Date;

import org.dressBarbie.bootstrap.download.FileDownloader;
import org.dressBarbie.bootstrap.download.FileDownloaderNO;
import org.dressBarbie.bootstrap.util.Utils;


public class Bootstrap {
	private static String get() {
		URL website = null;
		BufferedReader br = null;
		String s = null;
		try {
		website = new URL("https://raw.githubusercontent.com/eyeballcode/DressBarbie/master/verIDcontrol");
		File f = new File(System.getProperty("user.home")+"/.dressbarbie/verID");
		if (f.exists()) { f.delete(); }
		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		FileOutputStream fos;
			fos = new FileOutputStream(System.getProperty("user.home")+"/.dressbarbie/verID");
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
		    br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/.dressbarbie/verID"));
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null) {
		            sb.append(line);
		            sb.append(System.lineSeparator());
		            line = br.readLine();
		        }
		        s = sb.toString();
		} catch (Exception e) {
			FileDownloaderNO.run(e);
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				FileDownloaderNO.run(e);
			}
		}
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
