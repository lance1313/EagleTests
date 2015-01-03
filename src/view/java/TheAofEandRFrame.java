

package view.java;
//
import javax.swing.JFrame;

import controller.java.RufflesController;
//import javax.swing.*;
//import controller.java.RufflesController;
///**
// * This is what the user sees and can interact with.
// * @author eagle1421
// *
// */
public class TheAofEandRFrame extends JFrame {
	
	private KidPanel basePanel;
	private KidView field;
	private BattleScene battle;
	private RufflesController controller;
	private String Scene;
	
	public TheAofEandRFrame(RufflesController rufflesController)
	{
		basePanel = new KidPanel(rufflesController);
		Scene = "TitleScene";
		setupFrame();
	}
	
	

	public void setupFrame()
	{
		if(Scene.equals("TitleScene"))
		{
		this.setContentPane(basePanel);//this means i can do all the parent class can do to .
		}
		else
		{
		
		}
		this.setSize(400,400);
		this.setResizable(true);
		setVisible(true);
		
	}
	
	private void Screen()
	{
		
	}

	
}
