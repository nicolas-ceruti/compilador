package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Semantico implements Constants {

    private String operador_relacional;
    public static String codigo_objeto = "";

    private Stack<String> pilha_tipos = new Stack<>();
    private HashMap<String, Simbolo> pilha_rotulos = new HashMap<>();
    private ArrayList<Token> lista_identificadores = new ArrayList<>();
    private ArrayList<Simbolo> lista_simbolos = new ArrayList<>();

    public void executeAction(int action, Token token) throws SemanticError {
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
            case 121:
                acao121(token);
                break;
            case 122:
                acao122();
                break;
            case 123:
                acao123();
                break;
            case 127:
                acao127(token);
                break;
            case 128:
                acao128(token);
                break;
            case 129:
                acao129(token);
                break;
            case 130:
                acao130(token);
                break;
            case 118:
                acao118();
                break;
            case 119:
                acao119();
                break;
            case 131:
                acao131();
                break;
            case 124:
                acao124();
                break;
            case 125:
                acao125();
                break;
            case 126:
                acao126();
                break;
            case 120:
                acao120();
                break;
            case 116:
                acao116();
                break;
            case 117:
                acao117();
                break;
            case 107:
                acao107();
                break;
            case 104:
                acao104(token);
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

    public void acao121(Token token) {
        operador_relacional = token.getLexeme();
    }

    public void acao122() {
        pilha_tipos.pop();
        pilha_tipos.pop();
        pilha_tipos.push("bool");

        switch (this.operador_relacional) {
            case "==":
                codigo_objeto += "ceq\n";
                break;
            case "!=":
                codigo_objeto += "ceq\n" + "ldc.i4.0\n" + "ceq\n";
                break;
            case ">":
                codigo_objeto += "cgt\n";
                break;
            case "<":
                codigo_objeto += "clt\n";
                break;
        }
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

    public void acao130(Token token) {
        adicionaString(token.getLexeme());
    }

    public void acao118() {
        adicionaBool("1");
    }

    public void acao119() {
        adicionaBool("0");
    }

    public void acao131() {
        codigo_objeto += "ldc.i8 -1\n";
        codigo_objeto += "conv.r8\n";
        codigo_objeto += "mul\n";
    }

    public void acao125() {
        tabelaTipos();
        codigo_objeto += "mul\n";
    }

    public void acao126() {
        tabelaTipos();
        codigo_objeto += "div\n";
    }

    public void acao120() {
        codigo_objeto += "ldc.i4.1\nxor\n";
    }

    public void acao116() {
        pilha_tipos.pop();
        pilha_tipos.pop();
        pilha_tipos.push("bool");
        codigo_objeto += "and\n";
    }

    public void acao117() {
        pilha_tipos.pop();
        pilha_tipos.pop();
        pilha_tipos.push("bool");
        codigo_objeto += "or\n";
    }

    public void acao107() {
        codigo_objeto += "\n";
    }

    public void acao104(Token token) {
        lista_identificadores.add(token);
    }


    public void acao127(Token token) throws SemanticError {
        if (this.pilha_rotulos.containsKey(token.getLexeme())) {
            Simbolo simbolo = this.pilha_rotulos.get(token.getLexeme());
            if (!simbolo.isConstante()) {
                this.adicionaVariavelPilha(token, simbolo);
            } else {
                this.adicionaConstantePilha(simbolo);
            }
            return;
        }
        throw new SemanticError(token.getLexeme() + " nao declarado", token.getPosition(), token.getLexeme());
    }

    public void acao124() {
        tabelaTipos();
        codigo_objeto += "sub\n";
    }


    public void tabelaTipos() {
        String operador2 = pilha_tipos.pop();
        String operador1 = pilha_tipos.pop();


        if (operador1.equals("float64") || operador2.equals("float64")) {
            pilha_tipos.push("float64");
            return;
        }
        pilha_tipos.push("int64");
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
        codigo_objeto += "ldc.i8 " + valor + "\n" + "conv.r8\n";
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
