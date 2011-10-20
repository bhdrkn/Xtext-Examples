package org.xtext.bhdrkn.interpreter;

import java.math.BigDecimal;

import org.xtext.bhdrkn.fouroperation.Addition;
import org.xtext.bhdrkn.fouroperation.Div;
import org.xtext.bhdrkn.fouroperation.Expression;
import org.xtext.bhdrkn.fouroperation.Minus;
import org.xtext.bhdrkn.fouroperation.Multi;
import org.xtext.bhdrkn.fouroperation.Statement;

public class OperationInterpreter {
//	private PolymorphicDispatcher<BigDecimal> dispatcher = PolymorphicDispatcher
//			.createForSingleTarget("invokeFirst", 2, 2, this);
	
	public BigDecimal calcluate(Statement s){
		return invokeFirst(s.getExpression());
	}
	
	protected BigDecimal invokeFirst(Expression e) {
		
		if(e instanceof Addition){
			return calculate((Addition)e);
		} else if ( e instanceof Minus){
			return calculate((Minus)e);
		} else if ( e instanceof Multi){
			return calculate((Multi)e);
		} else if ( e instanceof Div){
			return calculate((Div)e);
		}
			return null;
	}
	
	protected BigDecimal calculate(Addition a){
		return a.getLeft().add(a.getRight());
	}
	
	protected BigDecimal calculate(Minus m){
		return m.getLeft().subtract(m.getRight());
	}
	
	protected BigDecimal calculate(Multi m){
		return m.getLeft().multiply(m.getRight());
	}
	
	protected BigDecimal calculate(Div d){
		return d.getLeft().divide(d.getRight());
	}

}
