package abstraction.view;

import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;
import abstraction.controller.*;

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
		
	}
	
	public void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayArea.setText("");
			}
		});
	}
}