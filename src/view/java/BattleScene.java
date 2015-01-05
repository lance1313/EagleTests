package view.java;

import java.awt.Color;

import javax.swing.*;

import controller.java.RufflesController;

import model.java.Enemies;
import model.java.MainCharacters_Bosses;
///**
// * This is the generic scene for battle.
// * @author eagle1421
// *
// */
public class BattleScene extends JPanel
{
	public int Turn = 0;
	public boolean battleEnter = false;
	private JButton battleButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private RufflesController baseController;
	private BattleScene battle;
	private KidView View;
	private int panel;
	
	public BattleScene(RufflesController rufflesController)
	{
		this.baseController = rufflesController;
		this.View = new KidView(baseController);
		battleButton = new JButton("battle!!!");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(5,20);
		chatPane = new JScrollPane(chatArea);
		panel = 1;
	}
	public void ShowScreen()
	{
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void battleEnemy()
	{
		
	}
	
	//BATTLE SCENE
		private void setupPane() 
		{
			
			
		}

		private void setupListeners() 
		{
			
			
		}

		private void setupLayout() 
		{
			
			
		}

		private void setupPanel() 
		{
			this.setBackground(Color.white);
			this.setSize(400,400);
			this.setLayout(baseLayout);//make the layout what you coded in the base layout
			
			
		}
		public void getPanel() 
		{
			
			
		}
}
