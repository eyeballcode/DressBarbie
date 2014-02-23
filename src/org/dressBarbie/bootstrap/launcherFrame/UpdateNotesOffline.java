package org.dressBarbie.bootstrap.launcherFrame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import org.dressBarbie.bootstrap.exception.NoInternetException;
import org.dressBarbie.bootstrap.util.Utils;

public class UpdateNotesOffline {
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
 	} catch (Exception localException) {
 		localException.printStackTrace();
 	}
	 }
		 }
	 };
	public static JPanel getUpdate() {
		try {
			update = new JEditorPane();
			updateNote = new JPanel();
			//dC = new JPanel();
		update.setEditable(false);
		update.setMargin(null);
		update.setBackground(Color.DARK_GRAY);
		update.setContentType("text/html");
		update.setText("<html><body><font color=\"#808080\"><br><br><br><br><br><br><br><center><h1>No internet! Could not load page</h1>"+new NoInternetException()+"</center></font></body></html>");
		update.addHyperlinkListener(EXTERNAL_HYPERLINK_LISTENER);
		update.setPreferredSize(new Dimension(600, 500));
		} catch (Exception e) {
			update.setText("<html><body><font color=\"#808080\"><br><br><br><br><br><br><br><center><h1>Failed to update news</h1><br>" + e.toString() + "</center></font></body></html>");
	}
		  JScrollPane jsp = new JScrollPane(update);
		 jsp.setBorder(null);

		 jsp.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
		 updateNote.add(update);
			System.gc();
		 return updateNote;
	}
}
