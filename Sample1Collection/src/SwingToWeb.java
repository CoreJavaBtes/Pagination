import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class SwingToWeb {
	
	public SwingToWeb() {
		// TODO Auto-generated constructor stub
		
		
		
		
		/*
		JEditorPane jep = new JEditorPane();
		jep.setEditable(false);   
		String URI = //stackoverflow.com/questions/10601676/display-a-webpage-inside-a-swing-application;
		java.awt.Desktop.getDesktop().browse(URI);
		try {
		
		  jep.setPage("http://stackoverflow.com/questions/10601676/display-a-webpage-inside-a-swing-application");
			System.out.println("Hello");
		}catch (IOException e) {
		  jep.setContentType("text/html");
		  jep.setText("<html>Could not load</html>");
		} 

		JScrollPane scrollPane = new JScrollPane(jep);     
		JFrame f = new JFrame("Test HTML");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(scrollPane);
		f.setPreferredSize(new Dimension(800,600));
		f.setVisible(true);*/
		
	}
	
	public static void main(String[] arg) {
		//new SwingToWeb();
		String s = "http://stackoverflow.com/questions/10601676/display-a-webpage-inside-a-swing-application";
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(new URI(s));
			} catch (Exception e) {
			
					
			}
		} else {
			System.out.println("Launch browser failed, please manually visit: " + s);
		}
	}
}


