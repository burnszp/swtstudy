package com.swtjface.Ch3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Ch3_Toggle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);

		Button pushR = new Button(shell, SWT.ARROW | SWT.RIGHT);
		pushR.setText("RIGHT");
		Button pushL = new Button(shell, SWT.ARROW | SWT.LEFT);
		pushL.setText("Left");
		Button pushU = new Button(shell, SWT.ARROW | SWT.UP);
		pushU.setText("Up");
		Button pushD = new Button(shell, SWT.ARROW | SWT.DOWN);
		pushD.setText("Down");

		pushR.pack();
		pushL.pack();
		pushU.pack();
		pushD.pack();
		shell.pack();
		shell.open();
		System.out.println(display.getCurrent());
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		// System.out.println(display.getCurrent());
		display.dispose();

	}

}
