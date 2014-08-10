package org.burns.swtstudy.day02.event;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author burns
 *         <p>
 *         匿名内部类事件
 *         <p>
 *         2014年8月10日
 */
public class NimingEvent {
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
		button.setText("匿名类事件");

		text = new Text(shell, SWT.RIGHT);
		text.setSize(100, 80);
		text.setLocation(300, 100);
		text.setText("默认文本信息。。。。。");
		button.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				text.setText("双击");

			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				clkdwnEventHandler();

			}

			@Override
			public void mouseUp(MouseEvent arg0) {
				text.setText("鼠标弹起");
			}

		});
		button.pack();
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
