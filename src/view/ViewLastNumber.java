package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ControllerLastNumber;
import model.ModelNumbers;

public class ViewLastNumber extends JFrame{
	private ModelNumbers mn;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private ActionListener ac;
	private JLabel j_result;
	private JPanel panel_result;
	public ViewLastNumber() {
		mn = new ModelNumbers(0);
		this.init();
		this.setVisible(true);
	}
	public void init()
	{
		//Create GUI
		this.setTitle("LastNumber");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Events
		ac = new ControllerLastNumber(this);
		
		//Font
		Font font_Number = new Font("Georgia", Font.PLAIN, 20);
		
		//JLanel Text
		JLabel j_text = new JLabel("Last Number",JLabel.CENTER);
		j_text.setFont(font_Number);
		
		//JPanel Text
		JPanel panel_text = new JPanel(new BorderLayout());
		panel_text.add(j_text);
		
		
		//JPanel Number
		JPanel panel_number = new JPanel(new GridLayout(2,2));
		mn.setValue_1();
		panel_number.add(button_1 = new JButton(mn.getValue()+""));
		button_1.setFont(font_Number);
		button_1.addActionListener(ac);
		mn.setValue_2();
		panel_number.add(button_2 = new JButton(mn.getValue()+""));
		button_2.setFont(font_Number);
		button_2.addActionListener(ac);
		mn.setValue_3();
		panel_number.add(button_3 = new JButton(mn.getValue()+""));
		button_3.setFont(font_Number);
		button_3.addActionListener(ac);
        mn.setValue_4();
		panel_number.add(button_4 = new JButton(mn.getValue()+""));
		button_4.setFont(font_Number);
		button_4.addActionListener(ac);
        
		
		//JLabel result
		j_result = new JLabel("Click at a number!",JLabel.CENTER);
		j_result.setFont(font_Number);
	    panel_result = new JPanel(new BorderLayout());
		panel_result.add(j_result);
	    
		
		//Put panel in GUI
		this.add(panel_text,BorderLayout.NORTH);
		this.add(panel_number,BorderLayout.CENTER);
		this.add(panel_result,BorderLayout.SOUTH);
		//Processing events
	}
	public void displayResults(String number)
	{
		j_result.setText("You just pressed number " + number);
	}

}
