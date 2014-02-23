package org.dressBarbie.bootstrap.download;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Date;

public class FileDownloader {
	public FileDownloader() {
		URL website;
		File f;
		String [] args2 = {"online"};
		String [] args = {"offline","no-download"};
		try {
			System.out.println("[INFO] "+new Date()+": Creating Dress the Barbie folder...");
			f = new File(System.getProperty("user.home")+"/.dressbarbie/bin");
			f.mkdirs();
			System.out.println("[INFO] "+new Date()+": Done creating folder");
			System.out.println("[INFO] "+new Date()+": Loading updates...");
			System.out.println("[INFO] "+new Date()+": Downloading files...");
			System.out.println("[INFO] "+new Date()+": Please wait, this may take quite a while depending on your internet connection.");
				website = new URL("https://sites.google.com/site/edwardjavajar/home/dressbarbie/icon.png");
			
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(System.getProperty("user.home")+"/.dressbarbie/icon.png");
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
			System.out.println("[INFO] "+new Date()+": Done downloading files.");
			System.out.println("[INFO] "+new Date()+": Cleaning up....");
			System.out.println("[INFO] "+new Date()+": File manager exiting...");
			System.out.println("[INFO] "+new Date()+": Exited!");
			System.out.println("[INFO] "+new Date()+": Starting Launcher...");
			org.dressBarbie.bootstrap.launcherFrame.MainFrame.main(args2);
			website = null;
			rbc = null;
			fos = null;
	        System.gc();
	        } catch (MalformedURLException e) {
			} catch (IOException e) {
				System.out.println("[WARNING] "+new Date()+": Are you online?");
				System.out.println("[EXCEPTION ERROR] "+new Date()+": Exception java.net.UnknownHostException occured!");
				System.out.println("[ERROR] "+new Date()+": Could not download or save file!");
				System.out.println("[INFO] "+new Date()+": Please check internet connection!");
				System.out.println("[INFO] "+new Date()+": If not, please file a bug report!");
				System.out.println("[INFO] "+new Date()+": Below are the details:");
				e.printStackTrace();
				System.out.println("[INFO] "+new Date()+": Not downloading files!");
				System.out.println("[INFO] "+new Date()+": Starting launcher in offline mode...");
				System.out.println("[INFO] "+new Date()+": File manager exiting due to org.dressBarbie.bootstrap.exception.NoInternetException");
				System.out.println("[INFO] "+new Date()+": Exited!");
				org.dressBarbie.bootstrap.launcherFrame.MainFrame.main(args);
				e = null;
		        System.gc();
			}
	}

}
