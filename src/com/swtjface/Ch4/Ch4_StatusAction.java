package com.swtjface.Ch4;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @author burns
 *         <p>
 *         生成动作类
 *         <p>
 *         2014年8月10日
 */
public class Ch4_StatusAction extends Action {
	StatusLineManager statman;
	short triggercount = 0;

	public Ch4_StatusAction(StatusLineManager sm) {
		super("&打开@Ctrl+T ", AS_PUSH_BUTTON);
		statman = sm;
		setToolTipText("Trigger the Action");
		setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(),
				"eclipse32.png"));
	}

	@Override
	public void run() {
		triggercount++;
		statman.setMessage("触发了action：" + triggercount + "次");
	}
}
