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
				FileDownloaderNO.run(e);
			}
	}
	public static void retry() {
		URL website;
		File f;
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
        } catch (MalformedURLException e) {
		} catch (IOException e) {
			FileDownloaderNO.runRetry(e);
		}
	}

}
