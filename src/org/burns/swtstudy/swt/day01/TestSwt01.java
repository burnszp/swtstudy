package org.burns.swtstudy.swt.day01;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TestSwt01 {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		Text text1 = new Text(shell, SWT.CENTER);
		text1.setText("helloworld");
		text1.pack();
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
