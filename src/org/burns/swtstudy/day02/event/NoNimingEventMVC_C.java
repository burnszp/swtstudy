package org.burns.swtstudy.day02.event;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Text;

/**
 * @author burns
 *         <p>
 *         descript
 *         <p>
 *         2014年8月10日
 */
public class NoNimingEventMVC_C implements MouseListener {
	private Text text = null;

	public NoNimingEventMVC_C(Text text) {
		this.text = text;
	}

	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		text.setText("双击");

	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		text.setText("鼠标点下去");
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		text.setText("鼠标弹起");
	}

}
