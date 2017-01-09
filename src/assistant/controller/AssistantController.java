package assistant.controller;

import java.util.ArrayList;
import assistant.model.*;
import assistant.view.AssistantFrame;

public class AssistantController 
{
	private ArrayList<GridArray> grid; 
	private AssistantFrame baseFrame;
	
	public AssistantController()
	{
		grid = new ArrayList<GridArray>();
		this.buildGrid();
	}
	
	public void start()
	{
		
	}	
	
	private void buildGrid()
	{
		grid.add(new GridArray());
	}
}
