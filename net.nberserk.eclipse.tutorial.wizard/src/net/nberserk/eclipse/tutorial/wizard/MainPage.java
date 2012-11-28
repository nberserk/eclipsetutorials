package net.nberserk.eclipse.tutorial.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MainPage extends WizardPage {
	private static String PASSWORD = "lucky";
	private static String MSG = "input the right password(" + PASSWORD + ")";
	Text fText;
	public MainPage() {
		super("main");
	}

	@Override
	public void createControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout( new GridLayout(1, true));
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("Password :");		
		fText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		fText.addModifyListener(new ModifyListener() {			
			@Override
			public void modifyText(ModifyEvent e) {
				updatePageComplete();
			}
		});
		
		setControl(composite);
		
		updatePageComplete();
	}

	protected void updatePageComplete() {
		setMessage(null);
		setPageComplete(false);
		
		String pwd = fText.getText();
		
		if (!pwd.equals(PASSWORD)) {
			setMessage(MSG, ERROR);
			return;
		}
		
		setPageComplete(true);
	}
	
	

}
