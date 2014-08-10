package com.swtjface.Ch3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class Ch3_SashForm extends Composite {

	public Ch3_SashForm(Composite parent) {
		super(parent, SWT.NONE);
		SashForm sf = new SashForm(this, SWT.VERTICAL);
		sf.setSize(120, 80);
		Button button1 = new Button(sf, SWT.ARROW | SWT.UP);
		button1.setSize(120, 40);
		Button button2 = new Button(sf, SWT.ARROW | SWT.DOWN);
		button2.setBounds(0, 40, 120, 40);// setBounds(x,y,width,height);
											// x:组件在容器X轴上的起点 y:组件在容器Y轴上的起点
											// width:组件的长度 height:组件的宽度
	}
}
