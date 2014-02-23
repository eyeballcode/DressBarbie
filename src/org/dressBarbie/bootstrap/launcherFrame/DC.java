package org.dressBarbie.bootstrap.launcherFrame;

import java.util.Date;

import javax.swing.JTextArea;

public class DC {
	private static String newLine = "\n";
	private static JTextArea ta = new JTextArea();
	public static JTextArea getTA() {
		ta = new JTextArea();
		ta.append("[INFO] "+new Date()+": Dress the Barbie Launcher 1.0.0 (through bootrap 1.0.0) started on "+System.getProperty("os.name").toLowerCase()+"..."+newLine);
		ta.append("[INFO] "+new Date()+": Refershing remote version list..."+newLine);
		ta.append("[INFO] "+new Date()+": System.getProperty(\'os.name\') == \'"+System.getProperty("os.name")+"\'"+newLine);
		ta.append("[INFO] "+new Date()+": System.getProperty(\'os.arch\') == \'"+System.getProperty("os.arch")+"\'"+newLine);
		ta.append("[INFO] "+new Date()+": System.getProperty(\'os.version\') == \'"+System.getProperty("os.version")+"\'"+newLine);
		ta.append("[INFO] "+new Date()+": System.getProperty(\'java.version\') == \'"+System.getProperty("java.version")+"\'"+newLine);
		ta.append("[INFO] "+new Date()+": System.getProperty(\'java.vendor\') == \'"+System.getProperty("java.vendor")+"\'"+newLine);
		ta.append("[INFO] "+new Date()+": System.getProperty(\'sun.arch.data.model\') == \'"+System.getProperty("sun.arch.data.model")+"\'"+newLine);
		ta.append("[INFO] "+new Date()+": Refreshing completed! "+newLine);
		System.gc();
		return ta;
		
	}
	public static void append(String s) {
		ta.append(s);
		System.gc();
	}

}
