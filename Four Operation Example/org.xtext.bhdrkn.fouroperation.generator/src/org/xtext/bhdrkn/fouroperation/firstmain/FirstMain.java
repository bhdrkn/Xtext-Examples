package org.xtext.bhdrkn.fouroperation.firstmain;

import org.xtext.bhdrkn.fouroperation.Expression;
import org.xtext.bhdrkn.fouroperation.Operation;
import org.xtext.bhdrkn.fouroperation.Statement;
import org.xtext.bhdrkn.fouroperation.factory.OperationFactory;

public class FirstMain {

	public static void main(String[] args) {
		String fileName = "bhdrkn.op";
		Operation operation = OperationFactory.getOperation(fileName);
		for (Statement st : operation.getStatements()) {
			Expression exp = st.getExpression();
			System.out.println(exp);
			
		}
	}

}
