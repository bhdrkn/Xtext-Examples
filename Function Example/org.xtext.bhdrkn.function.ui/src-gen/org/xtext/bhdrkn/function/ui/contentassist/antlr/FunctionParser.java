/*
* generated by Xtext
*/
package org.xtext.bhdrkn.function.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.bhdrkn.function.services.FunctionGrammarAccess;

public class FunctionParser extends AbstractContentAssistParser {
	
	@Inject
	private FunctionGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.bhdrkn.function.ui.contentassist.antlr.internal.InternalFunctionParser createParser() {
		org.xtext.bhdrkn.function.ui.contentassist.antlr.internal.InternalFunctionParser result = new org.xtext.bhdrkn.function.ui.contentassist.antlr.internal.InternalFunctionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFUNCFileAccess().getGroup(), "rule__FUNCFile__Group__0");
					put(grammarAccess.getFunctionsAccess().getGroup(), "rule__Functions__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getCallsAccess().getGroup(), "rule__Calls__Group__0");
					put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
					put(grammarAccess.getFUNCFileAccess().getFunctionsAssignment_0(), "rule__FUNCFile__FunctionsAssignment_0");
					put(grammarAccess.getFUNCFileAccess().getCallsAssignment_1(), "rule__FUNCFile__CallsAssignment_1");
					put(grammarAccess.getFunctionsAccess().getFunctionsAssignment_1(), "rule__Functions__FunctionsAssignment_1");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getCallsAccess().getCallsAssignment_1(), "rule__Calls__CallsAssignment_1");
					put(grammarAccess.getCallAccess().getNameAssignment_1(), "rule__Call__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.bhdrkn.function.ui.contentassist.antlr.internal.InternalFunctionParser typedParser = (org.xtext.bhdrkn.function.ui.contentassist.antlr.internal.InternalFunctionParser) parser;
			typedParser.entryRuleFUNCFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FunctionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FunctionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
