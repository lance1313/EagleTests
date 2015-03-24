package view.java;

import javax.swing.JFrame;

import controller.java.RufflesController;

public class TitleFrame extends JFrame
{
	
	private KidPanel basePanel;
	private BattleScene battle;
	private FieldPanel field;
	private CutScene cutscene;
	private RufflesController controller;
	private Title title;
	
	public TitleFrame(RufflesController rufflesController)
	{
		basePanel = new KidPanel(rufflesController);
		field = new FieldPanel(rufflesController);
		battle = new BattleScene(rufflesController);
		cutscene = new CutScene(rufflesController);
		title = new Title(rufflesController);
		

        
        	setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(title);//this means i can do all the parent class can do to 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("TheAofEandRGame");
		this.setSize(400,400);
		this.setResizable(true);
		setVisible(true);
		
		
	}

}
