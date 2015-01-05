

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
	private JButton battleButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private RufflesController baseController;
	private BattleScene battle;
	private FieldPanel field;
	private CutScene cutScene;
	private KidView View;
	private int panel;
	
	
	
	/**
	 * 
	 * @param rufflesController 
	 * @param baseController Combines the controller.
	 */
	public KidPanel(RufflesController rufflesController/*,BattleScene battle,FieldPanel field,CutScene cutScene*/) {
		
	this.baseController = rufflesController;
	this.View = new KidView(baseController);
	firstButton = new JButton("press to battle");
	battleButton = new JButton("battle!!!");
	firstTextField = new JTextField(25);
	baseLayout = new SpringLayout();
	chatArea = new JTextArea(5,20);
	chatPane = new JScrollPane(chatArea);
	panel = 1;
	this.field = field;
	this.battle = battle;
	this.cutScene = cutScene;
	
	ShowScreen();

	}
		

	public void ShowScreen()
	{
		if(panel == 1)
		{
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		}
		else if(panel == 2)
		{
			field.ShowScreen();
		}
		else if(panel == 3)
		{
			battle.ShowScreen();
		}
		else if(panel == 4)
		{
			cutScene.ShowScreen();
		}
//		setupPane();
//		setupPanel();
//		setupLayout();
//		setupListeners();
	}
	
	
	
	//FIELD SCENE
	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}
	
	public void setupPanel()
	{
		
		this.setBackground(Color.black);
		this.setSize(400,400);
		this.setLayout(baseLayout);//make the layout what you coded in the base layout
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
		
		
			
		
	}
	
	private void setupLayout()//dumping ground
	{
		
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 300, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, firstTextField);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -6, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 10, SpringLayout.WEST, this);

		

	}
	
	
	private void setupListeners()//this is what buttons do.
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				panel = 2;
			}
		});
	}
	
		
	
	
		
	
	
	
}
