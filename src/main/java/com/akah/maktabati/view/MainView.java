package com.akah.maktabati.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

import com.akah.maktabati.controller.Controller;
import com.akah.maktabati.model.Model;
import com.akah.maktabati.model.Observer;
import com.akah.maktabati.strings.StringUtil;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainView extends JFrame implements Observer {

	/**
	 * Serial of Frame
	 */
	private static final long serialVersionUID = -5386698792926272327L;
	
	private static Logger log = Logger.getLogger("logging");
	
	private Controller controller;

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem newBookSubMenu;
	private JMenuItem newAuthorSubMenu;
	private JMenuItem newTypeSubMenu;
	private JMenuItem newWorkspaceSubMenu;
	private JMenuItem switchWorkspaceSubMenu;

	
	/**
	 * Create the frame.
	 */
	public MainView(Controller controller) {
		this.controller = controller;
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 470);
		setTitle(StringUtil.get("Title"));
		
		menuBar = new JMenuBar();
		menuBar.setName("menuBar");
		setJMenuBar(menuBar);
		
		fileMenu = new JMenu(StringUtil.get("File"));
		fileMenu.setName("fileMenu");
		menuBar.add(fileMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		newBookSubMenu = new JMenuItem(StringUtil.get("NewBook"));
		newBookSubMenu.setName("newBookSubMenu");
		fileMenu.add(newBookSubMenu);
		
		newAuthorSubMenu = new JMenuItem(StringUtil.get("NewAuthor"));
		newAuthorSubMenu.setName("newAuthorSubMenu");
		fileMenu.add(newAuthorSubMenu);
		
		newTypeSubMenu = new JMenuItem(StringUtil.get("NewType"));
		newTypeSubMenu.setName("newTypeSubMenu");
		fileMenu.add(newTypeSubMenu);
		
		newWorkspaceSubMenu = new JMenuItem(StringUtil.get("NewWorkspace"));
		newWorkspaceSubMenu.setName("newWorkspaceSubMenu");
		fileMenu.add(newWorkspaceSubMenu);
		
		switchWorkspaceSubMenu = new JMenuItem(StringUtil.get("SwitchWorkspace"));
		switchWorkspaceSubMenu.setName("switchWorkspaceSubMenu");
		fileMenu.add(switchWorkspaceSubMenu);
	}

	public void update(Model model) {
		// TODO implement method update of the Main View
		
	}

}
