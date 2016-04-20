package abstraction.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import abstraction.controller.BasketballController;
import abstraction.model.CoolThing;

public class AbstractPanel extends JPanel 
{
	private BasketballController baseController;
	private JButton sortButton;
	private JTextArea displayArea;
	private SpringLayout baseLayout;
	
	public AbstractPanel(BasketballController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(10, 20);
		sortButton = new JButton("Sort Interfaces");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(displayArea);
		this.add(sortButton);
		displayArea.setEnabled(false);
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 40, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 99, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, 20, SpringLayout.SOUTH, displayArea);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 10, SpringLayout.WEST, this);
	}
	
	public void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				String temp = "The sorted contents are: \n";
				for(CoolThing current : baseController.getCoolThings())
				{
					temp += current.toString() + "\n";
				}
				displayArea.setText(temp);
				displayArea.setText(baseController.showCoolLevels());
			}
		});
	}
}
