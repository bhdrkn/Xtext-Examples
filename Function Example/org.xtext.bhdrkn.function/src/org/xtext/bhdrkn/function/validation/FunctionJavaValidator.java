package org.xtext.bhdrkn.function.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.bhdrkn.function.function.Argument;
import org.xtext.bhdrkn.function.function.Call;
import org.xtext.bhdrkn.function.function.Define;
import org.xtext.bhdrkn.function.function.Function;
import org.xtext.bhdrkn.function.function.FunctionPackage;
 

public class FunctionJavaValidator extends AbstractFunctionJavaValidator {
	
	@Check
	public void checkDefineNames(Define define){
		if(!Character.isUpperCase(define.getName().charAt(0))){
			warning("Name should start with a capital", FunctionPackage.DEFÝNE);
		}
	}
	
	@Check
	public void checkCallArguments(Call call){
		boolean isOk = false;
		Function function = call.getName();
		EList<Argument> args = function.getArgs();
		String keyword = call.getArgs().getKeyword();
		for (Argument argument : args) {
			if(argument.getKeyword().compareTo(keyword)==0){
				isOk = true;
				break;
			}
		}
		if(!isOk){
			error("There is no function, which takes such arguments", FunctionPackage.CALL__ARGS);
		}
	}

}
