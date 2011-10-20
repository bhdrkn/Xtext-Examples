package org.xtext.bhdrkn.fouroperation.factory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.bhdrkn.FouroperationStandaloneSetup;
import org.xtext.bhdrkn.fouroperation.Operation;

public class OperationFactory {
	
	public static Operation getOperation(String fileName){
		FouroperationStandaloneSetup.doSetup();
		ResourceSet rs = new XtextResourceSet();
		Resource res = rs.getResource(URI.createFileURI(fileName), true);		
		return (Operation)res.getContents().get(0);
	}
}
