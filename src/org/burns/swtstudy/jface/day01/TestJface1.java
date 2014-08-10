package org.burns.swtstudy.jface.day01;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TestJface1 extends ApplicationWindow {

	public TestJface1() {
		super(null);
	}

	public static void main(String[] args) {
		TestJface1 wwin = new TestJface1();
		wwin.setBlockOnOpen(true);
		wwin.open();
		Display.getCurrent().dispose();

	}

	/**
	 * 重写父类的创建组建方法，使用该方法画界面
	 */
	@Override
	protected Control createContents(Composite parent) {
		Shell shell = getShell();
		shell.setLayout(null);
		Button[] checks = new Button[2];
		checks[0] = new Button(shell, SWT.CHECK);
		checks[0].setText("选项1");
		checks[0].setLocation(0, 5);
		checks[0].pack();

		checks[1] = new Button(shell, SWT.CHECK);
		checks[1].setText("选项2");
		checks[1].setLocation(100, 5);
		checks[1].pack();

		Button[] radios = new Button[3];
		radios[0] = new Button(shell, SWT.RADIO);
		radios[0].setSelection(true);
		radios[0].setText("Choice 1");
		radios[0].setLocation(0, 30);
		radios[0].pack();
		radios[1] = new Button(shell, SWT.RADIO);
		radios[1].setText("Choice 2");
		radios[1].setLocation(100, 30);
		radios[1].pack();
		radios[2] = new Button(shell, SWT.RADIO);
		radios[2].setText("Choice 3");
		radios[2].setLocation(200, 30);
		radios[2].pack();
		for (int i = 0; i < radios.length; i++)
			if (radios[i].getSelection()) {
				System.out.println(i);
			}

		Button[] buttons = new Button[2];
		buttons[0] = new Button(shell, SWT.NULL);
		buttons[0].setText("按钮1");
		buttons[0].setLocation(0, 60);
		buttons[0].pack();

		buttons[1] = new Button(shell, SWT.NULL);
		buttons[1].setText("按钮2");
		buttons[1].setLocation(100, 60);
		buttons[1].pack();

		shell.setText("jface例子");
		parent.setSize(400, 250);
		return parent;

	}

}
