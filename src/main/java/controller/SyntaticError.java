package controller;

public class SyntaticError extends AnalysisError {
    public SyntaticError(String msg, int position, String id) {
        super(msg, position, id);
    }

    public SyntaticError(String msg) {
        super(msg);
    }
}
