package org.xtext.bhdrkn.fouroperation.secondmain;

import org.xtext.bhdrkn.fouroperation.Operation;
import org.xtext.bhdrkn.fouroperation.Statement;
import org.xtext.bhdrkn.fouroperation.factory.OperationFactory;
import org.xtext.bhdrkn.interpreter.OperationInterpreter;

public class SecondMain {
	public static void main(String[] args) {
		String fileName = "bhdrkn.op";
		OperationInterpreter interpreter = new OperationInterpreter();
		Operation operation = OperationFactory.getOperation(fileName);
		
		for(Statement statement : operation.getStatements()){
			System.out.println("Result: " + interpreter.calcluate(statement));
		}
	}

}
