package org.burns.swtstudy.day02.event;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author burns
 *         <p>
 *         descript
 *         <p>
 *         2014年8月10日
 */
public class NoNimingEventMVC_V {

	static Text text = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setSize(600, 400);
		Button button = new Button(shell, SWT.LEFT);
		button.setSize(100, 80);
		button.setLocation(10, 100);
		button.setText("按钮1");

		Button button2 = new Button(shell, SWT.LEFT);
		button2.setSize(100, 80);
		button2.setLocation(10, 250);
		button2.setText("按钮2");

		text = new Text(shell, SWT.RIGHT);
		text.setSize(100, 80);
		text.setLocation(300, 100);
		text.setText("默认文本信息。。。。。");
		MouseListener listener = new NoNimingEventMVC_C(text);
		button.addMouseListener(listener);
		button2.addMouseListener(listener);

		button.pack();
		button2.pack();
		text.pack();
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}

	public static void clkdwnEventHandler() {
		text.setText("鼠标点下去了");
	}

}
