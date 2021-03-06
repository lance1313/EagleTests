

package view.java;
//
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.java.RufflesController;

import javax.swing.*;

import controller.java.RufflesController;
///**
// * This is what the user sees and can interact with.
// * @author eagle1421
// *
// */
public class TheAofEandRFrame extends JFrame /*implements ActionListener*/
{
	
	private KidPanel basePanel;
	
	private BattleScene battle;
	private FieldPanel field;
	private CutScene cutscene;
	private RufflesController controller;
	public int Scene;

	
	public TheAofEandRFrame(RufflesController rufflesController)
	{
		basePanel = new KidPanel(rufflesController);
		field = new FieldPanel(rufflesController);
		battle = new BattleScene(rufflesController);
		cutscene = new CutScene(rufflesController);
		Scene = 1;

        
        	setupFrame();
       
		
	}
	
	

	



	public void setupFrame()
	{
		this.setContentPane(field);//this means i can do all the parent class can do to 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("TheAofEandRGame");
		this.setSize(400,400);
		this.setResizable(true);
		setVisible(true);
		
		
	}
	
	
	
	private void Screen()
	{
		
	}
	

	
}
