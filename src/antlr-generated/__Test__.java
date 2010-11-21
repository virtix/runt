import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        RuntLexer lex = new RuntLexer(new ANTLRFileStream("/home/billy/projects/runt/src/antlr-generated/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        RuntParser g = new RuntParser(tokens, 49100, null);
        try {
            g.script();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}