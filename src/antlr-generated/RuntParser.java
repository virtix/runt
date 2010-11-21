// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/billy/projects/runt/src/Runt.g 2010-11-21 10:09:59




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class RuntParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "QUOTE", "COMMENT", "WS", "ESC_SEQ", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'='", "';'"
    };
    public static final int QUOTE=6;
    public static final int ESC_SEQ=9;
    public static final int WS=8;
    public static final int T__15=15;
    public static final int T__14=14;
    public static final int UNICODE_ESC=12;
    public static final int OCTAL_ESC=13;
    public static final int CHAR=10;
    public static final int HEX_DIGIT=11;
    public static final int INT=5;
    public static final int COMMENT=7;
    public static final int ID=4;
    public static final int EOF=-1;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "script", "synpred1_Runt", "synpred2_Runt"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public RuntParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public RuntParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[3+1];
             
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public RuntParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
        this.state.ruleMemo = new HashMap[3+1];
         
         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return RuntParser.tokenNames; }
    public String getGrammarFileName() { return "/home/billy/projects/runt/src/Runt.g"; }


    HashMap symtab = new HashMap();


    public static class script_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /home/billy/projects/runt/src/Runt.g:31:1: script : ID '=' ( INT | ID ) ';' ( script )* ;
    public final RuntParser.script_return script() throws RecognitionException {
        RuntParser.script_return retval = new RuntParser.script_return();
        retval.start = input.LT(1);
        int script_StartIndex = input.index();
        Object root_0 = null;

        Token ID1=null;
        Token char_literal2=null;
        Token set3=null;
        Token char_literal4=null;
        RuntParser.script_return script5 = null;


        Object ID1_tree=null;
        Object char_literal2_tree=null;
        Object set3_tree=null;
        Object char_literal4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "script");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/billy/projects/runt/src/Runt.g:32:2: ( ID '=' ( INT | ID ) ';' ( script )* )
            dbg.enterAlt(1);

            // /home/billy/projects/runt/src/Runt.g:32:4: ID '=' ( INT | ID ) ';' ( script )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(32,4);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_script75); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID1_tree = (Object)adaptor.create(ID1);
            adaptor.addChild(root_0, ID1_tree);
            }
            dbg.location(32,10);
            char_literal2=(Token)match(input,14,FOLLOW_14_in_script77); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal2_tree = (Object)adaptor.create(char_literal2);
            root_0 = (Object)adaptor.becomeRoot(char_literal2_tree, root_0);
            }
            dbg.location(32,13);
            set3=(Token)input.LT(1);
            if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set3));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(32,26);
            char_literal4=(Token)match(input,15,FOLLOW_15_in_script88); if (state.failed) return retval;
            dbg.location(32,29);
            // /home/billy/projects/runt/src/Runt.g:32:29: ( script )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (synpred2_Runt()) ) {
                        alt1=1;
                    }


                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/billy/projects/runt/src/Runt.g:0:0: script
            	    {
            	    dbg.location(32,29);
            	    pushFollow(FOLLOW_script_in_script92);
            	    script5=script();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, script5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException re){
                    throw re;
                    //new Throwable(e);
              }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, script_StartIndex); }
        }
        dbg.location(33, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "script");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "script"

    // $ANTLR start synpred2_Runt
    public final void synpred2_Runt_fragment() throws RecognitionException {   
        // /home/billy/projects/runt/src/Runt.g:32:29: ( script )
        dbg.enterAlt(1);

        // /home/billy/projects/runt/src/Runt.g:32:29: script
        {
        dbg.location(32,29);
        pushFollow(FOLLOW_script_in_synpred2_Runt92);
        script();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Runt

    // Delegated rules

    public final boolean synpred2_Runt() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Runt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ID_in_script75 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_script77 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_script81 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_script88 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_script_in_script92 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_script_in_synpred2_Runt92 = new BitSet(new long[]{0x0000000000000002L});

}