package view.java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import controller.java.RufflesController;

public class Title extends JPanel
{
	
	JButton Start;
	JLabel title;
	private SpringLayout baseLayout;
	RufflesController baseController;

	public Title(RufflesController rufflesController) 
	{
		Start = new JButton("Begin new adventure");
		title = new JLabel("The\n"
				+ "Adventures\n"
				+ "Of\n"
				+ "Eagle\n"
				+ "And\n"
				+ "Ruffles");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.WEST, title, 50, SpringLayout.WEST, this);
		
		
		this.baseController = rufflesController;
		
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	
	public void setupPanel()
	{
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(600,600);
		this.setLayout(baseLayout);//make the layout what you coded in the base layout
		this.add(Start);
		this.add(title);
		
	}
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, Start, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, Start, 150, SpringLayout.WEST, this);
	}
	public void setupListeners()
	{
		Start.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//new CutScene(null);
				new TheAofEandRFrame(baseController);
			}
		});
	}

}
