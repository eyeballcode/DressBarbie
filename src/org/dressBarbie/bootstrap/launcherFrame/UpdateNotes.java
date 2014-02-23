package org.dressBarbie.bootstrap.launcherFrame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import org.dressBarbie.bootstrap.util.Utils;

public class UpdateNotes {
	private static JPanel updateNote;
	private static JEditorPane update = new JEditorPane();
	 private static final HyperlinkListener EXTERNAL_HYPERLINK_LISTENER = new HyperlinkListener()
	 {
		 public void hyperlinkUpdate(HyperlinkEvent paramAnonymousHyperlinkEvent)
		 {
	 if (paramAnonymousHyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
	 try
 	{
	 Utils.openLink(paramAnonymousHyperlinkEvent.getURL().toURI());
 	}
 	catch (Exception localException)
 	{
	 localException.printStackTrace();
 	}
 	}
 	}
 };
	public static JPanel getUpdate() {
			update = new JEditorPane();
			updateNote = new JPanel();
			//dC = new JPanel();
		update.setEditable(false);
		update.setMargin(null);
		update.setBackground(Color.DARK_GRAY);
		update.setContentType("text/html");
		update.setText("<html><body><font color=\"#808080\"><br><br><br><br><br><br><br><center><h1>Loading update news...</h1></center></font></body></html>");
		update.addHyperlinkListener(EXTERNAL_HYPERLINK_LISTENER);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		String img = "https://ef6ac14b-a-62cb3a1a-s-sites.googlegroups.com/site/edwardjavajar/home/dressbarbie/icon.png";
		update.setText("<html><body><head><center><font size=\"6\" color=\"F000E0\"><img src=\""+img+"\"></img><p><p><a href=\"http://dressbarbie.blogspot.sg/\">Dress the barbie</a></font></center></head></body></html>");
		update.setPreferredSize(new Dimension(600, 500));
		 update.setBackground(Color.BLUE);
		 updateNote.add(update);
			System.gc();
		 return updateNote;
	}
}
