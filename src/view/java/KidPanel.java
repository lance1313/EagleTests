

package view.java;
import javax.swing.JPanel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.java.RufflesController;
/**
 * This is the setup for the generic scene out of battle changes will be made here to the
 * @author eagle1421
 *
 */
public class KidPanel extends JPanel 
{

	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private RufflesController baseController;
	private BattleScene battle;
	private KidView View;
	
	
	/**
	 * 
	 * @param rufflesController 
	 * @param baseController Combines the controller.
	 */
	public KidPanel(RufflesController rufflesController) {
		
	this.baseController = rufflesController;
	this.View = new KidView(baseController);
	this.battle = new BattleScene();
	firstButton = new JButton("");
	//firstTextField = new JTextField(25);
	baseLayout = new SpringLayout();
	chatArea = new JTextArea(5,20);
	chatPane = new JScrollPane(chatArea);
	
	ShowScreen();
		
		
//		else
//		{
//			this.baseController = new RufflesController(null);
//			this.battle = new BattleScene();
//			setupPanel2();
//			setupLayout2();
//			setupListeners2();
//			setupPane2();
//		}
//	
//	}
//	
//	private void setupPane2() {
//		
//		
//	}
//
//	private void setupListeners2() {
//		
//		
//	}
//
//	private void setupLayout2() {
//		
//		
//	}
//
//	private void setupPanel2() {
//		
//		
}
	public void ShowScreen()
	{
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		//isBattle();
	}

	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	
	public void setupPanel()
	{
		
		this.setBackground(Color.WHITE);
		this.setSize(400,400);
		this.setLayout(baseLayout);//make the layout what you coded in the base layout
//		this.add(firstButton);
//		this.add(firstTextField);
//		this.add(chatPane);
		
		
			
		
	}
	
	private void setupLayout()//dumping ground
	{
		
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 92, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, firstTextField);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 400, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 100, SpringLayout.WEST, this);
		
		
		

	}
	
	
	private void setupListeners()//this is what buttons do.
	{
//		firstButton.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent click)
//			{
//				battle.battleEnter = true;
//			}
//		});
	}
	
	private void isBattle()
	{
		
	}
	

}
