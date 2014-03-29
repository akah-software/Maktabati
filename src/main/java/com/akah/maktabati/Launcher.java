package com.akah.maktabati;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.log4j.Logger;

import com.akah.maktabati.controller.Controller;
import com.akah.maktabati.model.Model;
import com.akah.maktabati.view.MainView;

/**
 * Launch the application.
 *
 */
public class Launcher {
	
	private static Logger log = Logger.getLogger("logging");
	
    public static void main( String[] args )
    {
    	log.debug("Entering main("+args+")");
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Model model = new Model();
					Controller controller = new Controller(model);
					setLookAndFeel();
					MainView mainView = new MainView(controller);
					model.addObserver(mainView);
					mainView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    	log.debug("Leaving main()");  
    }
    
    private static void setLookAndFeel() {
    	try {
            // Set system Look and feel based on OS
    		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	    	log.error(e, e);
	    }
	    catch (ClassNotFoundException e) {
	    	log.error(e, e);
	    }
	    catch (InstantiationException e) {
	    	log.error(e, e);
	    }
	    catch (IllegalAccessException e) {
	    	log.error(e, e);
	    }
    }
}
