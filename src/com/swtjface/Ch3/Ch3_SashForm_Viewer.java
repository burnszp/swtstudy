package com.swtjface.Ch3;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Ch3_SashForm_Viewer extends ApplicationWindow{

	public Ch3_SashForm_Viewer() {
		super(null);
	}

	/**
	 * @param args
	 */
	protected Control createContents(Composite parent){
		Ch3_SashForm cs = new Ch3_SashForm(parent);
		return parent;
	}
	public static void main(String[] args) {
		Ch3_SashForm_Viewer csv = new Ch3_SashForm_Viewer();
		csv.setBlockOnOpen(true);
		csv.open();
		Display.getCurrent().dispose();
	}

}
