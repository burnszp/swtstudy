package com.swtjface.Ch3;



import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class CompViewer extends ApplicationWindow{

	public CompViewer() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	protected Control createContents(Composite parent){
		Ch3_Group cc1 = new Ch3_Group(parent);
		return parent;
	}
	public static void main(String[] args) {
		CompViewer cv = new CompViewer();
		cv.setBlockOnOpen(true);
		cv.open();
		Display.getCurrent().dispose();
	}

}
