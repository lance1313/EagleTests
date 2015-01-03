package view.java;
//
import controller.java.RufflesController;
/**
 * This tells when to change scenes and which scene to goto to the controller.
 * @author eagle1421
 *
 *this gets the pictures from the src file resources!
 */
public class KidView 
	{
	private TheAofEandRFrame frame;
	
	private RufflesController Controller;
	private KidPanel Panel;
	private BattleScene battleView;
	
	
	public KidView(RufflesController rufflesController)
	{
		this.Controller = Controller;
	}
	//this is were the screen displayed is determined.
	public void Screen()
	{
		Panel.ShowScreen();
		
	}
	
	//this determins what the background is
	public void BackGround()
	{
		
	}
	//this is were the enemy you are fighting is told to the screen.
	public void Enemy()
	{
		
	}
	//this is whitch character you are is told to the srceen to display.
	public void MainCharacter()
	{
		
	}
	//this is what items you have.
	public void Bag()
	{
		
	}

	
}
