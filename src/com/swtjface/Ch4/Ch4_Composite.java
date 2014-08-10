package com.swtjface.Ch4;

import org.burns.swtstudy.day02.event.Ch4_MouseKey;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author burns
 *         <p>
 *         窗口合成器组件
 *         <p>
 *         2014年8月10日
 */
public class Ch4_Composite extends Ch4_MouseKey {
	public Ch4_Composite(Composite parent) {
		super(parent);
		Button launch = new Button(this, SWT.PUSH);
		launch.setText("Launch");
		launch.setLocation(40, 120);
		launch.pack();
		launch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Ch4_Contributions sw = new Ch4_Contributions();
				sw.open();
			}
		});
	}
}
