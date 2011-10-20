package org.xtext.bhdrkn.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.bhdrkn.services.FouroperationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFouroperationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'operation'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_NUMBER=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalFouroperationParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g"; }


     
     	private FouroperationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FouroperationGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleOperation
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:61:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:62:1: ( ruleOperation EOF )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:63:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation61);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:70:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:74:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:75:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:75:1: ( ( rule__Operation__Group__0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:76:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:77:1: ( rule__Operation__Group__0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:77:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation94);
            rule__Operation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleStatement
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:89:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:90:1: ( ruleStatement EOF )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:91:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement121);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:98:1: ruleStatement : ( ( rule__Statement__ExpressionAssignment ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:102:2: ( ( ( rule__Statement__ExpressionAssignment ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:103:1: ( ( rule__Statement__ExpressionAssignment ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:103:1: ( ( rule__Statement__ExpressionAssignment ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:104:1: ( rule__Statement__ExpressionAssignment )
            {
             before(grammarAccess.getStatementAccess().getExpressionAssignment()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:105:1: ( rule__Statement__ExpressionAssignment )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:105:2: rule__Statement__ExpressionAssignment
            {
            pushFollow(FOLLOW_rule__Statement__ExpressionAssignment_in_ruleStatement154);
            rule__Statement__ExpressionAssignment();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleExpression
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:117:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:118:1: ( ruleExpression EOF )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:119:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression181);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:126:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:130:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:131:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:131:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:132:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:133:1: ( rule__Expression__Alternatives )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:133:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression214);
            rule__Expression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleAddition
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:145:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:146:1: ( ruleAddition EOF )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:147:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition241);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:154:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:158:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:159:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:159:1: ( ( rule__Addition__Group__0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:160:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:161:1: ( rule__Addition__Group__0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:161:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition274);
            rule__Addition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMinus
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:173:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:174:1: ( ruleMinus EOF )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:175:1: ruleMinus EOF
            {
             before(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_ruleMinus_in_entryRuleMinus301);
            ruleMinus();
            _fsp--;

             after(grammarAccess.getMinusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinus308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMinus


    // $ANTLR start ruleMinus
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:182:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:186:2: ( ( ( rule__Minus__Group__0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:187:1: ( ( rule__Minus__Group__0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:187:1: ( ( rule__Minus__Group__0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:188:1: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:189:1: ( rule__Minus__Group__0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:189:2: rule__Minus__Group__0
            {
            pushFollow(FOLLOW_rule__Minus__Group__0_in_ruleMinus334);
            rule__Minus__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMinus


    // $ANTLR start entryRuleMulti
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:201:1: entryRuleMulti : ruleMulti EOF ;
    public final void entryRuleMulti() throws RecognitionException {
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:202:1: ( ruleMulti EOF )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:203:1: ruleMulti EOF
            {
             before(grammarAccess.getMultiRule()); 
            pushFollow(FOLLOW_ruleMulti_in_entryRuleMulti361);
            ruleMulti();
            _fsp--;

             after(grammarAccess.getMultiRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulti368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMulti


    // $ANTLR start ruleMulti
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:210:1: ruleMulti : ( ( rule__Multi__Group__0 ) ) ;
    public final void ruleMulti() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:214:2: ( ( ( rule__Multi__Group__0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:215:1: ( ( rule__Multi__Group__0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:215:1: ( ( rule__Multi__Group__0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:216:1: ( rule__Multi__Group__0 )
            {
             before(grammarAccess.getMultiAccess().getGroup()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:217:1: ( rule__Multi__Group__0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:217:2: rule__Multi__Group__0
            {
            pushFollow(FOLLOW_rule__Multi__Group__0_in_ruleMulti394);
            rule__Multi__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMultiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMulti


    // $ANTLR start entryRuleDiv
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:229:1: entryRuleDiv : ruleDiv EOF ;
    public final void entryRuleDiv() throws RecognitionException {
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:230:1: ( ruleDiv EOF )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:231:1: ruleDiv EOF
            {
             before(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_ruleDiv_in_entryRuleDiv421);
            ruleDiv();
            _fsp--;

             after(grammarAccess.getDivRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiv428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDiv


    // $ANTLR start ruleDiv
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:238:1: ruleDiv : ( ( rule__Div__Group__0 ) ) ;
    public final void ruleDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:242:2: ( ( ( rule__Div__Group__0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:243:1: ( ( rule__Div__Group__0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:243:1: ( ( rule__Div__Group__0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:244:1: ( rule__Div__Group__0 )
            {
             before(grammarAccess.getDivAccess().getGroup()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:245:1: ( rule__Div__Group__0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:245:2: rule__Div__Group__0
            {
            pushFollow(FOLLOW_rule__Div__Group__0_in_ruleDiv454);
            rule__Div__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDiv


    // $ANTLR start rule__Expression__Alternatives
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:257:1: rule__Expression__Alternatives : ( ( ruleAddition ) | ( ruleMinus ) | ( ruleMulti ) | ( ruleDiv ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:261:1: ( ( ruleAddition ) | ( ruleMinus ) | ( ruleMulti ) | ( ruleDiv ) )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NUMBER) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt1=2;
                    }
                    break;
                case 18:
                    {
                    alt1=4;
                    }
                    break;
                case 17:
                    {
                    alt1=3;
                    }
                    break;
                case 15:
                    {
                    alt1=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("257:1: rule__Expression__Alternatives : ( ( ruleAddition ) | ( ruleMinus ) | ( ruleMulti ) | ( ruleDiv ) );", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("257:1: rule__Expression__Alternatives : ( ( ruleAddition ) | ( ruleMinus ) | ( ruleMulti ) | ( ruleDiv ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:262:1: ( ruleAddition )
                    {
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:262:1: ( ruleAddition )
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:263:1: ruleAddition
                    {
                     before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAddition_in_rule__Expression__Alternatives490);
                    ruleAddition();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:268:6: ( ruleMinus )
                    {
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:268:6: ( ruleMinus )
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:269:1: ruleMinus
                    {
                     before(grammarAccess.getExpressionAccess().getMinusParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMinus_in_rule__Expression__Alternatives507);
                    ruleMinus();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getMinusParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:274:6: ( ruleMulti )
                    {
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:274:6: ( ruleMulti )
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:275:1: ruleMulti
                    {
                     before(grammarAccess.getExpressionAccess().getMultiParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMulti_in_rule__Expression__Alternatives524);
                    ruleMulti();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getMultiParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:280:6: ( ruleDiv )
                    {
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:280:6: ( ruleDiv )
                    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:281:1: ruleDiv
                    {
                     before(grammarAccess.getExpressionAccess().getDivParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDiv_in_rule__Expression__Alternatives541);
                    ruleDiv();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getDivParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__Operation__Group__0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:293:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:297:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:298:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__0571);
            rule__Operation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__0574);
            rule__Operation__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__0


    // $ANTLR start rule__Operation__Group__0__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:305:1: rule__Operation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:309:1: ( ( 'operation' ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:310:1: ( 'operation' )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:310:1: ( 'operation' )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:311:1: 'operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Operation__Group__0__Impl602); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__0__Impl


    // $ANTLR start rule__Operation__Group__1
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:324:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:328:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:329:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__1633);
            rule__Operation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__1636);
            rule__Operation__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__1


    // $ANTLR start rule__Operation__Group__1__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:336:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:340:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:341:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:341:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:342:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:343:1: ( rule__Operation__NameAssignment_1 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:343:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl663);
            rule__Operation__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__1__Impl


    // $ANTLR start rule__Operation__Group__2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:353:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:357:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:358:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__2693);
            rule__Operation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__2696);
            rule__Operation__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__2


    // $ANTLR start rule__Operation__Group__2__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:365:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:369:1: ( ( '{' ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:370:1: ( '{' )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:370:1: ( '{' )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:371:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Operation__Group__2__Impl724); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__2__Impl


    // $ANTLR start rule__Operation__Group__3
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:384:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:388:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:389:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__3755);
            rule__Operation__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__3758);
            rule__Operation__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__3


    // $ANTLR start rule__Operation__Group__3__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:396:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__StatementsAssignment_3 )* ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:400:1: ( ( ( rule__Operation__StatementsAssignment_3 )* ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:401:1: ( ( rule__Operation__StatementsAssignment_3 )* )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:401:1: ( ( rule__Operation__StatementsAssignment_3 )* )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:402:1: ( rule__Operation__StatementsAssignment_3 )*
            {
             before(grammarAccess.getOperationAccess().getStatementsAssignment_3()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:403:1: ( rule__Operation__StatementsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NUMBER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:403:2: rule__Operation__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__StatementsAssignment_3_in_rule__Operation__Group__3__Impl785);
            	    rule__Operation__StatementsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__3__Impl


    // $ANTLR start rule__Operation__Group__4
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:413:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:417:1: ( rule__Operation__Group__4__Impl )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:418:2: rule__Operation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__4816);
            rule__Operation__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__4


    // $ANTLR start rule__Operation__Group__4__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:424:1: rule__Operation__Group__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:428:1: ( ( '}' ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:429:1: ( '}' )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:429:1: ( '}' )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:430:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRGhtCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Operation__Group__4__Impl844); 
             after(grammarAccess.getOperationAccess().getRGhtCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__4__Impl


    // $ANTLR start rule__Addition__Group__0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:453:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:457:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:458:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__0885);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__0888);
            rule__Addition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__0


    // $ANTLR start rule__Addition__Group__0__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:465:1: rule__Addition__Group__0__Impl : ( ( rule__Addition__LeftAssignment_0 ) ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:469:1: ( ( ( rule__Addition__LeftAssignment_0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:470:1: ( ( rule__Addition__LeftAssignment_0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:470:1: ( ( rule__Addition__LeftAssignment_0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:471:1: ( rule__Addition__LeftAssignment_0 )
            {
             before(grammarAccess.getAdditionAccess().getLeftAssignment_0()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:472:1: ( rule__Addition__LeftAssignment_0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:472:2: rule__Addition__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Addition__LeftAssignment_0_in_rule__Addition__Group__0__Impl915);
            rule__Addition__LeftAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__0__Impl


    // $ANTLR start rule__Addition__Group__1
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:482:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:486:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:487:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__1945);
            rule__Addition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__2_in_rule__Addition__Group__1948);
            rule__Addition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__1


    // $ANTLR start rule__Addition__Group__1__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:494:1: rule__Addition__Group__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:498:1: ( ( '+' ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:499:1: ( '+' )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:499:1: ( '+' )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:500:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSGnKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Addition__Group__1__Impl976); 
             after(grammarAccess.getAdditionAccess().getPlusSGnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__1__Impl


    // $ANTLR start rule__Addition__Group__2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:513:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:517:1: ( rule__Addition__Group__2__Impl )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:518:2: rule__Addition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__2__Impl_in_rule__Addition__Group__21007);
            rule__Addition__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__2


    // $ANTLR start rule__Addition__Group__2__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:524:1: rule__Addition__Group__2__Impl : ( ( rule__Addition__RightAssignment_2 ) ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:528:1: ( ( ( rule__Addition__RightAssignment_2 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:529:1: ( ( rule__Addition__RightAssignment_2 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:529:1: ( ( rule__Addition__RightAssignment_2 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:530:1: ( rule__Addition__RightAssignment_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_2()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:531:1: ( rule__Addition__RightAssignment_2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:531:2: rule__Addition__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_2_in_rule__Addition__Group__2__Impl1034);
            rule__Addition__RightAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__2__Impl


    // $ANTLR start rule__Minus__Group__0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:547:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:551:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:552:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_rule__Minus__Group__0__Impl_in_rule__Minus__Group__01070);
            rule__Minus__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Minus__Group__1_in_rule__Minus__Group__01073);
            rule__Minus__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__0


    // $ANTLR start rule__Minus__Group__0__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:559:1: rule__Minus__Group__0__Impl : ( ( rule__Minus__LeftAssignment_0 ) ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:563:1: ( ( ( rule__Minus__LeftAssignment_0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:564:1: ( ( rule__Minus__LeftAssignment_0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:564:1: ( ( rule__Minus__LeftAssignment_0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:565:1: ( rule__Minus__LeftAssignment_0 )
            {
             before(grammarAccess.getMinusAccess().getLeftAssignment_0()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:566:1: ( rule__Minus__LeftAssignment_0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:566:2: rule__Minus__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Minus__LeftAssignment_0_in_rule__Minus__Group__0__Impl1100);
            rule__Minus__LeftAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMinusAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__0__Impl


    // $ANTLR start rule__Minus__Group__1
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:576:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl rule__Minus__Group__2 ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:580:1: ( rule__Minus__Group__1__Impl rule__Minus__Group__2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:581:2: rule__Minus__Group__1__Impl rule__Minus__Group__2
            {
            pushFollow(FOLLOW_rule__Minus__Group__1__Impl_in_rule__Minus__Group__11130);
            rule__Minus__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Minus__Group__2_in_rule__Minus__Group__11133);
            rule__Minus__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__1


    // $ANTLR start rule__Minus__Group__1__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:588:1: rule__Minus__Group__1__Impl : ( '-' ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:592:1: ( ( '-' ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:593:1: ( '-' )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:593:1: ( '-' )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:594:1: '-'
            {
             before(grammarAccess.getMinusAccess().getHyphenMNusKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Minus__Group__1__Impl1161); 
             after(grammarAccess.getMinusAccess().getHyphenMNusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__1__Impl


    // $ANTLR start rule__Minus__Group__2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:607:1: rule__Minus__Group__2 : rule__Minus__Group__2__Impl ;
    public final void rule__Minus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:611:1: ( rule__Minus__Group__2__Impl )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:612:2: rule__Minus__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Minus__Group__2__Impl_in_rule__Minus__Group__21192);
            rule__Minus__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__2


    // $ANTLR start rule__Minus__Group__2__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:618:1: rule__Minus__Group__2__Impl : ( ( rule__Minus__RightAssignment_2 ) ) ;
    public final void rule__Minus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:622:1: ( ( ( rule__Minus__RightAssignment_2 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:623:1: ( ( rule__Minus__RightAssignment_2 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:623:1: ( ( rule__Minus__RightAssignment_2 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:624:1: ( rule__Minus__RightAssignment_2 )
            {
             before(grammarAccess.getMinusAccess().getRightAssignment_2()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:625:1: ( rule__Minus__RightAssignment_2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:625:2: rule__Minus__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Minus__RightAssignment_2_in_rule__Minus__Group__2__Impl1219);
            rule__Minus__RightAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMinusAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__2__Impl


    // $ANTLR start rule__Multi__Group__0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:641:1: rule__Multi__Group__0 : rule__Multi__Group__0__Impl rule__Multi__Group__1 ;
    public final void rule__Multi__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:645:1: ( rule__Multi__Group__0__Impl rule__Multi__Group__1 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:646:2: rule__Multi__Group__0__Impl rule__Multi__Group__1
            {
            pushFollow(FOLLOW_rule__Multi__Group__0__Impl_in_rule__Multi__Group__01255);
            rule__Multi__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multi__Group__1_in_rule__Multi__Group__01258);
            rule__Multi__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multi__Group__0


    // $ANTLR start rule__Multi__Group__0__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:653:1: rule__Multi__Group__0__Impl : ( ( rule__Multi__LeftAssignment_0 ) ) ;
    public final void rule__Multi__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:657:1: ( ( ( rule__Multi__LeftAssignment_0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:658:1: ( ( rule__Multi__LeftAssignment_0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:658:1: ( ( rule__Multi__LeftAssignment_0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:659:1: ( rule__Multi__LeftAssignment_0 )
            {
             before(grammarAccess.getMultiAccess().getLeftAssignment_0()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:660:1: ( rule__Multi__LeftAssignment_0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:660:2: rule__Multi__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Multi__LeftAssignment_0_in_rule__Multi__Group__0__Impl1285);
            rule__Multi__LeftAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMultiAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multi__Group__0__Impl


    // $ANTLR start rule__Multi__Group__1
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:670:1: rule__Multi__Group__1 : rule__Multi__Group__1__Impl rule__Multi__Group__2 ;
    public final void rule__Multi__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:674:1: ( rule__Multi__Group__1__Impl rule__Multi__Group__2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:675:2: rule__Multi__Group__1__Impl rule__Multi__Group__2
            {
            pushFollow(FOLLOW_rule__Multi__Group__1__Impl_in_rule__Multi__Group__11315);
            rule__Multi__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multi__Group__2_in_rule__Multi__Group__11318);
            rule__Multi__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multi__Group__1


    // $ANTLR start rule__Multi__Group__1__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:682:1: rule__Multi__Group__1__Impl : ( '*' ) ;
    public final void rule__Multi__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:686:1: ( ( '*' ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:687:1: ( '*' )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:687:1: ( '*' )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:688:1: '*'
            {
             before(grammarAccess.getMultiAccess().getAsterSkKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Multi__Group__1__Impl1346); 
             after(grammarAccess.getMultiAccess().getAsterSkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multi__Group__1__Impl


    // $ANTLR start rule__Multi__Group__2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:701:1: rule__Multi__Group__2 : rule__Multi__Group__2__Impl ;
    public final void rule__Multi__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:705:1: ( rule__Multi__Group__2__Impl )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:706:2: rule__Multi__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Multi__Group__2__Impl_in_rule__Multi__Group__21377);
            rule__Multi__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multi__Group__2


    // $ANTLR start rule__Multi__Group__2__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:712:1: rule__Multi__Group__2__Impl : ( ( rule__Multi__RightAssignment_2 ) ) ;
    public final void rule__Multi__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:716:1: ( ( ( rule__Multi__RightAssignment_2 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:717:1: ( ( rule__Multi__RightAssignment_2 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:717:1: ( ( rule__Multi__RightAssignment_2 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:718:1: ( rule__Multi__RightAssignment_2 )
            {
             before(grammarAccess.getMultiAccess().getRightAssignment_2()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:719:1: ( rule__Multi__RightAssignment_2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:719:2: rule__Multi__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Multi__RightAssignment_2_in_rule__Multi__Group__2__Impl1404);
            rule__Multi__RightAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMultiAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multi__Group__2__Impl


    // $ANTLR start rule__Div__Group__0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:735:1: rule__Div__Group__0 : rule__Div__Group__0__Impl rule__Div__Group__1 ;
    public final void rule__Div__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:739:1: ( rule__Div__Group__0__Impl rule__Div__Group__1 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:740:2: rule__Div__Group__0__Impl rule__Div__Group__1
            {
            pushFollow(FOLLOW_rule__Div__Group__0__Impl_in_rule__Div__Group__01440);
            rule__Div__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Div__Group__1_in_rule__Div__Group__01443);
            rule__Div__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Div__Group__0


    // $ANTLR start rule__Div__Group__0__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:747:1: rule__Div__Group__0__Impl : ( ( rule__Div__LeftAssignment_0 ) ) ;
    public final void rule__Div__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:751:1: ( ( ( rule__Div__LeftAssignment_0 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:752:1: ( ( rule__Div__LeftAssignment_0 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:752:1: ( ( rule__Div__LeftAssignment_0 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:753:1: ( rule__Div__LeftAssignment_0 )
            {
             before(grammarAccess.getDivAccess().getLeftAssignment_0()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:754:1: ( rule__Div__LeftAssignment_0 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:754:2: rule__Div__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Div__LeftAssignment_0_in_rule__Div__Group__0__Impl1470);
            rule__Div__LeftAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDivAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Div__Group__0__Impl


    // $ANTLR start rule__Div__Group__1
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:764:1: rule__Div__Group__1 : rule__Div__Group__1__Impl rule__Div__Group__2 ;
    public final void rule__Div__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:768:1: ( rule__Div__Group__1__Impl rule__Div__Group__2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:769:2: rule__Div__Group__1__Impl rule__Div__Group__2
            {
            pushFollow(FOLLOW_rule__Div__Group__1__Impl_in_rule__Div__Group__11500);
            rule__Div__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Div__Group__2_in_rule__Div__Group__11503);
            rule__Div__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Div__Group__1


    // $ANTLR start rule__Div__Group__1__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:776:1: rule__Div__Group__1__Impl : ( '/' ) ;
    public final void rule__Div__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:780:1: ( ( '/' ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:781:1: ( '/' )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:781:1: ( '/' )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:782:1: '/'
            {
             before(grammarAccess.getDivAccess().getSolDusKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Div__Group__1__Impl1531); 
             after(grammarAccess.getDivAccess().getSolDusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Div__Group__1__Impl


    // $ANTLR start rule__Div__Group__2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:795:1: rule__Div__Group__2 : rule__Div__Group__2__Impl ;
    public final void rule__Div__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:799:1: ( rule__Div__Group__2__Impl )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:800:2: rule__Div__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Div__Group__2__Impl_in_rule__Div__Group__21562);
            rule__Div__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Div__Group__2


    // $ANTLR start rule__Div__Group__2__Impl
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:806:1: rule__Div__Group__2__Impl : ( ( rule__Div__RightAssignment_2 ) ) ;
    public final void rule__Div__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:810:1: ( ( ( rule__Div__RightAssignment_2 ) ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:811:1: ( ( rule__Div__RightAssignment_2 ) )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:811:1: ( ( rule__Div__RightAssignment_2 ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:812:1: ( rule__Div__RightAssignment_2 )
            {
             before(grammarAccess.getDivAccess().getRightAssignment_2()); 
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:813:1: ( rule__Div__RightAssignment_2 )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:813:2: rule__Div__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Div__RightAssignment_2_in_rule__Div__Group__2__Impl1589);
            rule__Div__RightAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDivAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Div__Group__2__Impl


    // $ANTLR start rule__Operation__NameAssignment_1
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:830:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:834:1: ( ( RULE_ID ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:835:1: ( RULE_ID )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:835:1: ( RULE_ID )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:836:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_11630); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__NameAssignment_1


    // $ANTLR start rule__Operation__StatementsAssignment_3
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:845:1: rule__Operation__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Operation__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:849:1: ( ( ruleStatement ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:850:1: ( ruleStatement )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:850:1: ( ruleStatement )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:851:1: ruleStatement
            {
             before(grammarAccess.getOperationAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Operation__StatementsAssignment_31661);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getOperationAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__StatementsAssignment_3


    // $ANTLR start rule__Statement__ExpressionAssignment
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:860:1: rule__Statement__ExpressionAssignment : ( ruleExpression ) ;
    public final void rule__Statement__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:864:1: ( ( ruleExpression ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:865:1: ( ruleExpression )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:865:1: ( ruleExpression )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:866:1: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Statement__ExpressionAssignment1692);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__ExpressionAssignment


    // $ANTLR start rule__Addition__LeftAssignment_0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:875:1: rule__Addition__LeftAssignment_0 : ( RULE_NUMBER ) ;
    public final void rule__Addition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:879:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:880:1: ( RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:880:1: ( RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:881:1: RULE_NUMBER
            {
             before(grammarAccess.getAdditionAccess().getLeftNUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Addition__LeftAssignment_01723); 
             after(grammarAccess.getAdditionAccess().getLeftNUMBERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__LeftAssignment_0


    // $ANTLR start rule__Addition__RightAssignment_2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:890:1: rule__Addition__RightAssignment_2 : ( RULE_NUMBER ) ;
    public final void rule__Addition__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:894:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:895:1: ( RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:895:1: ( RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:896:1: RULE_NUMBER
            {
             before(grammarAccess.getAdditionAccess().getRightNUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Addition__RightAssignment_21754); 
             after(grammarAccess.getAdditionAccess().getRightNUMBERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__RightAssignment_2


    // $ANTLR start rule__Minus__LeftAssignment_0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:905:1: rule__Minus__LeftAssignment_0 : ( RULE_NUMBER ) ;
    public final void rule__Minus__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:909:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:910:1: ( RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:910:1: ( RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:911:1: RULE_NUMBER
            {
             before(grammarAccess.getMinusAccess().getLeftNUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Minus__LeftAssignment_01785); 
             after(grammarAccess.getMinusAccess().getLeftNUMBERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__LeftAssignment_0


    // $ANTLR start rule__Minus__RightAssignment_2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:920:1: rule__Minus__RightAssignment_2 : ( RULE_NUMBER ) ;
    public final void rule__Minus__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:924:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:925:1: ( RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:925:1: ( RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:926:1: RULE_NUMBER
            {
             before(grammarAccess.getMinusAccess().getRightNUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Minus__RightAssignment_21816); 
             after(grammarAccess.getMinusAccess().getRightNUMBERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__RightAssignment_2


    // $ANTLR start rule__Multi__LeftAssignment_0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:935:1: rule__Multi__LeftAssignment_0 : ( RULE_NUMBER ) ;
    public final void rule__Multi__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:939:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:940:1: ( RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:940:1: ( RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:941:1: RULE_NUMBER
            {
             before(grammarAccess.getMultiAccess().getLeftNUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Multi__LeftAssignment_01847); 
             after(grammarAccess.getMultiAccess().getLeftNUMBERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multi__LeftAssignment_0


    // $ANTLR start rule__Multi__RightAssignment_2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:950:1: rule__Multi__RightAssignment_2 : ( RULE_NUMBER ) ;
    public final void rule__Multi__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:954:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:955:1: ( RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:955:1: ( RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:956:1: RULE_NUMBER
            {
             before(grammarAccess.getMultiAccess().getRightNUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Multi__RightAssignment_21878); 
             after(grammarAccess.getMultiAccess().getRightNUMBERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multi__RightAssignment_2


    // $ANTLR start rule__Div__LeftAssignment_0
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:965:1: rule__Div__LeftAssignment_0 : ( RULE_NUMBER ) ;
    public final void rule__Div__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:969:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:970:1: ( RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:970:1: ( RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:971:1: RULE_NUMBER
            {
             before(grammarAccess.getDivAccess().getLeftNUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Div__LeftAssignment_01909); 
             after(grammarAccess.getDivAccess().getLeftNUMBERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Div__LeftAssignment_0


    // $ANTLR start rule__Div__RightAssignment_2
    // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:980:1: rule__Div__RightAssignment_2 : ( RULE_NUMBER ) ;
    public final void rule__Div__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:984:1: ( ( RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:985:1: ( RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:985:1: ( RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g:986:1: RULE_NUMBER
            {
             before(grammarAccess.getDivAccess().getRightNUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Div__RightAssignment_21940); 
             after(grammarAccess.getDivAccess().getRightNUMBERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Div__RightAssignment_2


 

    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExpressionAssignment_in_ruleStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_entryRuleMinus301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinus308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__Group__0_in_ruleMinus334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulti_in_entryRuleMulti361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulti368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multi__Group__0_in_ruleMulti394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiv_in_entryRuleDiv421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiv428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__0_in_ruleDiv454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Expression__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_rule__Expression__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulti_in_rule__Expression__Alternatives524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiv_in_rule__Expression__Alternatives541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__0571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__0574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Operation__Group__0__Impl602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__1633 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__2693 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Operation__Group__2__Impl724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__3755 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__StatementsAssignment_3_in_rule__Operation__Group__3__Impl785 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Operation__Group__4__Impl844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__0885 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__0888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__LeftAssignment_0_in_rule__Addition__Group__0__Impl915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__1945 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Addition__Group__2_in_rule__Addition__Group__1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Addition__Group__1__Impl976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__2__Impl_in_rule__Addition__Group__21007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_2_in_rule__Addition__Group__2__Impl1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__Group__0__Impl_in_rule__Minus__Group__01070 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Minus__Group__1_in_rule__Minus__Group__01073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__LeftAssignment_0_in_rule__Minus__Group__0__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__Group__1__Impl_in_rule__Minus__Group__11130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Minus__Group__2_in_rule__Minus__Group__11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Minus__Group__1__Impl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__Group__2__Impl_in_rule__Minus__Group__21192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__RightAssignment_2_in_rule__Minus__Group__2__Impl1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multi__Group__0__Impl_in_rule__Multi__Group__01255 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Multi__Group__1_in_rule__Multi__Group__01258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multi__LeftAssignment_0_in_rule__Multi__Group__0__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multi__Group__1__Impl_in_rule__Multi__Group__11315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Multi__Group__2_in_rule__Multi__Group__11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Multi__Group__1__Impl1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multi__Group__2__Impl_in_rule__Multi__Group__21377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multi__RightAssignment_2_in_rule__Multi__Group__2__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__0__Impl_in_rule__Div__Group__01440 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Div__Group__1_in_rule__Div__Group__01443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__LeftAssignment_0_in_rule__Div__Group__0__Impl1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__1__Impl_in_rule__Div__Group__11500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Div__Group__2_in_rule__Div__Group__11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Div__Group__1__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__2__Impl_in_rule__Div__Group__21562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__RightAssignment_2_in_rule__Div__Group__2__Impl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_11630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Operation__StatementsAssignment_31661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Statement__ExpressionAssignment1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Addition__LeftAssignment_01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Addition__RightAssignment_21754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Minus__LeftAssignment_01785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Minus__RightAssignment_21816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Multi__LeftAssignment_01847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Multi__RightAssignment_21878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Div__LeftAssignment_01909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Div__RightAssignment_21940 = new BitSet(new long[]{0x0000000000000002L});

}