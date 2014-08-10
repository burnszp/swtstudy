package com.swtjface.Ch3;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class Ch3_Group extends Composite {
	public Ch3_Group(Composite parent){
		super(parent,SWT.NONE);
		Group group = new Group(this,SWT.SHADOW_ETCHED_IN);
		group.setText("Gruop Lable");
		Label label = new Label(group, SWT.NONE);
		label.setText("Two Button");
		label.setLocation(20, 20);
		label.pack();
		Button button1 = new Button(group,SWT.PUSH);
		button1.setText("Push button");
		button1.setLocation(20,45);
		button1.pack();
		Button button2 = new Button(group, SWT.CHECK);
		button2.setText("Check button");
		button2.setBounds(20, 75, 90, 30);
		group.pack();
	}
}
