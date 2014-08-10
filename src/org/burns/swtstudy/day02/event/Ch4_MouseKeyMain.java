package org.burns.swtstudy.day02.event;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author burns
 *         <p>
 *         descript
 *         <p>
 *         2014年8月10日
 */
public class Ch4_MouseKeyMain extends ApplicationWindow {

	public Ch4_MouseKeyMain(Shell parentShell) {
		super(parentShell);
	}

	public static void main(String[] args) {
		Ch4_MouseKeyMain main = new Ch4_MouseKeyMain(null);
		main.setBlockOnOpen(true);
		main.open();
		Display.getCurrent().dispose();
	}

	@Override
	protected Control createContents(Composite parent) {
		return new Ch4_MouseKey(parent);
	}
}
