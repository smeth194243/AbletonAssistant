package assistant.view;

import javax.swing.JFrame;
import assistant.controller.AssistantController;
import assistant.view.AssistantPanel;

import java.awt.Dimension;

public class AssistantFrame extends JFrame
{
	private AssistantController baseController;
	private AssistantPanel basePanel;
	
	public AssistantFrame(AssistantController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new AssistantPanel(baseController);
		setupFrame();
		
		private void setupFrame()
		{
			this.setContentPane(basePanel);
			this.setTitle("Assistant");
			this.setSize(new Dimension(900,600));
			this.setResizable(false);
			this.setVisible(true);
		}
	}
}


