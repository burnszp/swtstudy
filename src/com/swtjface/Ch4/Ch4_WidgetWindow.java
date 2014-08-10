package com.swtjface.Ch4;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import com.swtjface.Ch3.Ch3_Composite;

/**
 * @author burns
 *         <p>
 *         descript
 *         <p>
 *         2014年8月10日
 */
public class Ch4_WidgetWindow extends ApplicationWindow {
	public Ch4_WidgetWindow() {
		super(null);
	}

	@Override
	protected Control createContents(Composite parent) {
		TabFolder tf = new TabFolder(parent, SWT.NONE);
		TabItem chap3 = new TabItem(tf, SWT.NONE);
		chap3.setText("Chapter 3");
		chap3.setControl(new Ch3_Composite(tf));
		TabItem chap4 = new TabItem(tf, SWT.NONE);
		chap4.setText("Chapter 4");
		chap4.setControl(new Ch4_Composite(tf));
		getShell().setText("Widget Window ");
		return parent;
	}

	public static void main(String[] args) {
		Ch4_WidgetWindow wwin = new Ch4_WidgetWindow();
		wwin.setBlockOnOpen(true);
		wwin.open();
		Display.getCurrent().dispose();
	}
}
