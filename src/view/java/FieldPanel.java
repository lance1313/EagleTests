package view.java;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.*;

import Characthers.MainCharacters_Bosses;
import controller.java.RufflesController;

public class FieldPanel extends JPanel
{
	
	private JButton firstButton;
	private JButton battleButton;
	private JComboBox menu;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private RufflesController baseController;
//	private BattleScene battle;
	private FieldPanel field;
	private CutScene cutScene;
	//private KidView View;
	private MainCharacters_Bosses characters;
	private BattleFrame battle;
	private int panel;
	
	
	public FieldPanel(RufflesController rufflesController) {
		this.baseController = rufflesController;
		//this.View = new KidView(baseController);
		//this.characters = new MainCharacters_Bosses();
		
		firstButton = new JButton("press to battle");
		battleButton = new JButton("battle!!!");
		firstTextField = new JTextField(25);
		menu = new JComboBox();
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(5,20);
		chatPane = new JScrollPane(chatArea);
		JMenuBar menuBar = new JMenuBar();
		
		panel = 1;
		ShowScreen();
	}
	
	
	public void ShowScreen()
	{
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		
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
			//this.add();
			
			
			
		}
		
		private void setupLayout()//dumping ground
		{
			baseLayout.putConstraint(SpringLayout.WEST, chatPane, 100, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, firstTextField);
			baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -6, SpringLayout.NORTH, firstTextField);
			baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 250, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 50, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 300, SpringLayout.NORTH, this);

		}
		
		
		private void setupListeners()//this is what buttons do.
		{
			firstButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					new BattleFrame(baseController);
				}
			});
		}
}
