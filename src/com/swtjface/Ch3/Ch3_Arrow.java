package com.swtjface.Ch3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Ch3_Arrow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		Button push = new Button(shell, SWT.PUSH);
		push.setText("PUSH");
		// push.setAlignment(0);
		Button push1 = new Button(shell, SWT.PUSH);
		push.setText("PUSH1");
		push1.pack();
		push.pack();

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
