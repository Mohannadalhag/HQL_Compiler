import java.io.IOException;

public class AST {

    public static void main(String[] args) throws IOException {
        // print(parseJava(readFile(new File("test.txt"))), false);
    }
/*
    private static String readFile(File file) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }

    private static ParserRuleContext parseJava(String code) throws IOException {
        compilerLexer lexer = new compilerLexer(new ANTLRInputStream(code));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        compilerParser parser = new compilerParser(tokens);

        return Objects.requireNonNull(parser.program());
    }

    private static void print(RuleContext ctx, boolean verbose) {
        explore(ctx, verbose, 0);
    }

    private static void explore(RuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1
                && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = compilerParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print(" | ");
            }
            System.out.println(ruleName + " --> " + ctx.getText());
        }
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext)element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }*/
}