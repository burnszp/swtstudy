package com.swtjface.Ch3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Ch3_Button {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		Label shadow_label = new Label(shell, SWT.CENTER);
		shadow_label.setText("SWT.SHADOW_OUT");
		shadow_label.setBounds(30, 60, 110, 15);
		Label shadow_sep = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_IN);
		shadow_sep.setText("SWT.sep");
		shadow_sep.setBounds(30, 85, 110, 5);

		shadow_label.pack();
		shadow_sep.pack();
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
