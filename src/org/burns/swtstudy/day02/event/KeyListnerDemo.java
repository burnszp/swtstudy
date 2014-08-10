package org.burns.swtstudy.day02.event;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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
public class KeyListnerDemo {
	static Text text = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("按键事件");
		shell.setSize(600, 400);
		Button button = new Button(shell, SWT.LEFT);
		button.setSize(100, 80);
		button.setLocation(10, 100);
		button.setText("匿名类事件");

		text = new Text(shell, SWT.RIGHT);
		text.setSize(100, 80);
		text.setLocation(300, 100);
		text.setText("默认文本信息。。。。。");

		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String string = "";
				if ((e.stateMask & SWT.ALT & SWT.CTRL) != 0) {
					string += "alt-ctrl-";
				}
				if ((e.stateMask & SWT.ALT) != 0)
					string += "ALT-";
				if ((e.stateMask & SWT.CTRL) != 0)
					string += "CTRL-";
				if ((e.stateMask & SWT.COMMAND) != 0)
					string += "COMMAND-";
				if ((e.stateMask & SWT.SHIFT) != 0)
					string += "SHIFT-";
				switch (e.keyCode) {
				case SWT.BS:
					string += "BACKSPACE";
					break;
				case SWT.CR:
					string += "CARRIAGE RETURN";
					break;
				case SWT.DEL:
					string += "DELETE";
					break;
				case SWT.ESC:
					string += "ESCAPE";
					break;
				case SWT.LF:
					string += "LINE FEED";
					break;
				case SWT.TAB:
					string += "TAB";
					break;
				default:
					string += e.character;
					break;
				}
				text.setText(string);
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

}
