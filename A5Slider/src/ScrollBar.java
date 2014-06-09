import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ScrollBar extends JFrame implements AdjustmentListener {
	JPanel panel = new JPanel();
	JLabel jlblRed = new JLabel("RED");
	public ScrollBar() {
		
		JScrollBar jscbRed = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 300);
		jscbRed.addAdjustmentListener(this);
		panel.add(jlblRed);
		panel.add(jscbRed);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
	}

	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
	   
	           jlblRed.setText("    New Value is " + e.getValue() + "      ");
	           repaint();
	}
}
