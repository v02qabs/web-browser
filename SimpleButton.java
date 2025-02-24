/*
 * Created on 2004/06/27
 *
 * Author aki@www.xucker.jpn.org
 * License Apache2.0 or Common Public License
 */
package example.button;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class SimpleButton {
	/**
	 * @param shell
	 */
	public SimpleButton(Shell shell) {
		shell.setText("simpleButton");
		shell.setBounds(0,0,200,100);
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		Button button;
		button=new Button(shell,SWT.NONE);
		button.setText("button");
	}

	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		
		
		SimpleButton button=new SimpleButton(shell);
		
		
		shell.open();
		
		while(!shell.isDisposed()){			
			if (!display.readAndDispatch ()){
					display.sleep ();
				  }
		}
		display.dispose();
	}
}
