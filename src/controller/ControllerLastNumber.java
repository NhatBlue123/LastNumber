package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ViewLastNumber;

public class ControllerLastNumber implements ActionListener{
    private ViewLastNumber view;
    public ControllerLastNumber(ViewLastNumber view) {
    	this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
    	String src = e.getActionCommand();
    	if(src.equals("1"))
    	{
    		view.displayResults(src);
    	}else if(src.equals("2"))
    	{
    		view.displayResults(src);
    	}
    	else if(src.equals("3"))
    	{
    		view.displayResults(src);
    	}
    	else if(src.equals("4"))
    	{
    		view.displayResults(src);
    	}
	}

}
