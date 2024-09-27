package controller;

public class SyntaticError extends AnalysisError {
    public SyntaticError(String msg, int position, String lexeme) {
        super(msg, position, lexeme);
    }

    public SyntaticError(String msg) {
        super(msg);
    }
}
