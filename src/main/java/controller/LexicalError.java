package controller;

public class LexicalError extends AnalysisError {
    public LexicalError(String msg, int position, String lexeme) {
        super(msg, position, lexeme);
    }

    public LexicalError(String msg)
    {
        super(msg);
    }

    public LexicalError(String msg, int position)
    {
        super(msg, position);
    }
}
