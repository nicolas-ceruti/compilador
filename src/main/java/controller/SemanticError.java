package controller;

public class SemanticError extends AnalysisError {
    public SemanticError(String msg, int position, String lexema) {
        super(msg, position, lexema);
    }

    public SemanticError(String msg) {
        super(msg);
    }
}
