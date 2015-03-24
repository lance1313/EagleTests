package view.java;

import javax.swing.*;

import controller.java.RufflesController;

public class BattleFrame extends JFrame
{
	
	private KidPanel basePanel;
	//private KidView view;
	private BattleScene battle;
	private FieldPanel field;
	private CutScene cutscene;
	private RufflesController controller;
	
	public BattleFrame(RufflesController rufflesController)
	{
		basePanel = new KidPanel(rufflesController);
		field = new FieldPanel(rufflesController);
		battle = new BattleScene(rufflesController);
		cutscene = new CutScene(rufflesController);
		setupFrame1();
	}
	
	
	
	public void setupFrame1()
	{
		this.setContentPane(battle);//this means i can do all the parent class can do to 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("TheAofEandRGame");
		this.setSize(400,400);
		this.setResizable(true);
		setVisible(true);
		
		
	}

}
