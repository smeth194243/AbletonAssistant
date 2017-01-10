package assistant.view;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import assistant.controller.AssistantController;
import java.awt.Dimension;

public class AssistantPanel extends JPanel  
{
	//JTable- hold buttons
	//when button clicked, edit button text
	//make a "perform" button, that, when pressed, disables text editing and when the buttons are pressed, turns them green. when "perform" pressed again, it resets the color of all buttons back to gray and enables text editing again
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	
	public AssistantPanel(AssistantController baseController)
	{
		super();
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
