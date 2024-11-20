package controller;

import java.util.ArrayList;
import java.util.Stack;

public class Semantico implements Constants
{

    private String operador_relacional;
    public static String codigo_objeto = "";

    private Stack<String> pilha_tipos = new Stack<>();
    private Stack<String> pilha_rotulos = new Stack<>();
    private ArrayList<Token> lista_identificadores = new ArrayList<>();
    private ArrayList<Simbolo> lista_simbolos = new ArrayList<>();

    public void executeAction(int action, Token token)	throws SemanticError
    {
        switch (action) {
            case 100:
                acao100();
                break;
            case 101:
                acao101();
                break;
            case 108:
                acao108();
                break;
            case 123:
                acao123();
                break;
            case 128:
                acao128(token);
                break;
            case 129:
                acao129(token);
                break;
        }
    }

    public void acao100() {
        codigo_objeto += ".assembly extern mscorlib {}\n" +
                ".assembly _exemplo{}\n" +
                ".module _exemplo.exe\n" +
                ".class public _exemplo{\n" +
                ".method static public void _principal(){\n" +
                ".entrypoint\n";
    }

    public void acao101() {
        codigo_objeto += "ret\n" +
                "}\n" +
                "}\n";
    }


    public void acao108() {
        String tipo = pilha_tipos.pop();
        if (tipo.equals("int64")) {
            codigo_objeto += "conv.i8\n";
        }
        this.print(tipo);
    }


    public void acao123() {
        tabelaTipos();
        codigo_objeto += "add\n";
    }

    public void acao128(Token token) {
        adicionaInt64(token.getLexeme());
    }

    public void acao129(Token token) {
        adicionaFloat64(token.getLexeme());
    }

    public void tabelaTipos() {
        String operador2 = pilha_tipos.pop();
        String operador1 = pilha_tipos.pop();


        if (operador1.equals("float64") || operador2.equals("float64")) {
            pilha_tipos.push("float64");
            return;
        }
        pilha_tipos.push("int64");
        return;
    }
    public void print(String tipo) {
        codigo_objeto += "call void [mscorlib]System.Console::Write(" + tipo + ")\n";
    }


    public void adicionaConstantePilha(Simbolo simbolo) {
        switch (simbolo.getTipo()) {
            case "int64":
                adicionaInt64(simbolo.getValor());
                break;
            case "float64":
                adicionaFloat64(simbolo.getValor());
                break;
            case "string":
                adicionaString(simbolo.getValor());
                break;
            case "bool":
                adicionaBool(simbolo.getValor());
                break;
        }
    }

    public void adicionaInt64(String valor) {
        codigo_objeto += "ldc.i8 " + valor + "\n" +
                "conv.r8\n";
        pilha_tipos.push("int64");
    }

    public void adicionaFloat64(String valor) {
        codigo_objeto += "ldc.r8 " + valor + "\n";
        pilha_tipos.push("float64");
    }

    public void adicionaString(String valor) {
        codigo_objeto += "ldstr " + valor + "\n";
        pilha_tipos.push("string");
    }

    public void adicionaBool(String valor) {
        codigo_objeto += "ldc.i4." + valor + "\n";
        pilha_tipos.push("bool");
    }

    public void adicionaVariavelPilha(Token token, Simbolo simbolo) {
        codigo_objeto += "ldloc " + token.getLexeme() + "\n";
        if (simbolo.getTipo().equals("int64")) {
            codigo_objeto += "conv.r8\n";
        }
        pilha_tipos.push(simbolo.getTipo());
    }


}
