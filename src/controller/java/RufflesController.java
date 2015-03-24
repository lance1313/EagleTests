package controller.java;


import Characthers.Enemies;
import Characthers.MainCharacters_Bosses;
import view.java.BattleScene;
import view.java.KidPanel;
//import view.java.KidView;
import view.java.TheAofEandRFrame;
import view.java.TitleFrame;
/**
 * 
 * @author eagle1421
 *
 */
public class RufflesController 
{
	private TheAofEandRFrame appFrame;
	private TitleFrame titleView;
	
	private BattleScene Battle;
	private KidPanel KPanel;
	private Enemies enemy;
	private MainCharacters_Bosses MC_B;
	public int battle;
	
	
	public RufflesController()
	{
		
	    titleView = new TitleFrame(this);
		
		
	}
	//hi
	
	


	public  void start() 
	{
		
		//KidPanel panel = (KidPanel) appFrame.getContentPane();
		
		titleView.setupFrame();
	
	}
	
	

}
