package controller.java;


import model.java.Enemies;
import model.java.MainCharacters_Bosses;
import view.java.BattleScene;
import view.java.KidPanel;
import view.java.KidView;
import view.java.TheAofEandRFrame;
/**
 * 
 * @author eagle1421
 *
 */
public class RufflesController 
{
	private TheAofEandRFrame appFrame;
	private KidView appView;
	private BattleScene Battle;
	private KidPanel KPanel;
	private Enemies enemy;
	private MainCharacters_Bosses MC_B;
	public int battle;
	public boolean isBattle;
	
	public RufflesController()
	{
		appView = new KidView(this);
		//KPanel = new KidPanel(this);
		isBattle = false;
		appFrame = new TheAofEandRFrame(this);
		
	}
	//hi
	
	


	public  void start() 
	{
		
		//KidPanel panel = (KidPanel) appFrame.getContentPane();
		
		appFrame.setupFrame();
	
	}
	
	public void Scene()
	{

	}

}
