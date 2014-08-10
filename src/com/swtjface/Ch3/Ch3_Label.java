package com.swtjface.Ch3;

import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Ch3_Label {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);

		RadioGroupFieldEditor rgfe = new RadioGroupFieldEditor("UserChoice",
				"Choose an option:", 1, new String[][] { { "Choice1", "ch1" },
						{ "Choice2", "ch2" }, { "Choice3", "ch3" } }, shell,
				true);

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
