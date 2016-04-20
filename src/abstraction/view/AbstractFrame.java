package abstraction.view;

import javax.swing.*;
import abstraction.controller.*;

public class AbstractFrame extends JFrame
{
	private BasketballController baseController;
	private AbstractPanel basePanel;
	
	public AbstractFrame(BasketballController baseController)
	{
		this.baseController = baseController;
		basePanel = new AbstractPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 
		this.setSize(800,400); 			
		this.setTitle("Abstracts and Interfaces");
		this.setResizable(false);       
		this.setVisible(true);		    
	} 
	
	public BasketballController getBaseController()
	{
		return baseController;
	}
}
