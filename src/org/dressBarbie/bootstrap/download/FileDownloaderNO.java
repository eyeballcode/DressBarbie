package org.dressBarbie.bootstrap.download;

import java.util.Date;

public class FileDownloaderNO {
	public static void run(Exception e) {
		String [] args = {"offline","no-download"};
		System.out.println("[WARNING] "+new Date()+": Are you online?");
		System.out.println("[EXCEPTION ERROR] "+new Date()+": Exception"+e.getMessage()+"occured!");
		System.out.println("[ERROR] "+new Date()+": Could not download or save file!");
		System.out.println("[INFO] "+new Date()+": Please check internet connection!");
		System.out.println("[INFO] "+new Date()+": If not, please file a bug report!");
		System.out.println("[INFO] "+new Date()+": Below are the details:");
		e.printStackTrace();
		System.out.println("[INFO] "+new Date()+": Not downloading files!");
		System.out.println("[INFO] "+new Date()+": Starting launcher in offline mode...");
		System.out.println("[INFO] "+new Date()+": File manager exiting due to org.dressBarbie.bootstrap.exception.NoInternetException");
		System.out.println("[INFO] "+new Date()+": Exited!");
		System.out.println("[INFO] "+new Date()+": Starting Launcher...");
		org.dressBarbie.bootstrap.launcherFrame.MainFrame.main(args);
		e = null;
        System.gc();

	}
	public static void runRetry(Exception e) {
		System.out.println("[WARNING] "+new Date()+": Are you online?");
		System.out.println("[EXCEPTION ERROR] "+new Date()+": Exception"+e.getMessage()+"occured!");
		System.out.println("[ERROR] "+new Date()+": Could not download or save file!");
		System.out.println("[INFO] "+new Date()+": Please check internet connection!");
		System.out.println("[INFO] "+new Date()+": If not, please file a bug report!");
		System.out.println("[INFO] "+new Date()+": Below are the details:");
		e.printStackTrace();
		System.out.println("[INFO] "+new Date()+": Not downloading files!");
        System.gc();

	}

}
