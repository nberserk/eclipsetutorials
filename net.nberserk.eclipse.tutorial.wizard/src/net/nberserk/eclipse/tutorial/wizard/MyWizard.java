package net.nberserk.eclipse.tutorial.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

public class MyWizard extends Wizard implements IImportWizard {

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Wizard Tutorial");
	}	

	@Override
	public void addPages() {
		MainPage main = new MainPage();
		addPage(main);		
	}

	@Override
	public boolean performFinish() {
		return true;
	}

}
