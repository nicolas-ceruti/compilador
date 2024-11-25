package controller;

public interface ParserConstants
{
    int START_SYMBOL = 36;

    int FIRST_NON_TERMINAL    = 36;
    int FIRST_SEMANTIC_ACTION = 75;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  1, -1, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1,  1,  1,  1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  2, -1, -1, -1, -1, -1,  3,  2, -1, -1, -1, -1,  2,  2,  2,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  4, -1, -1, -1, -1, -1, -1,  5, -1, -1, -1, -1,  5,  5,  5,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 70, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  6,  8,  7, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, 10, 11, 11, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 16, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 20, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, 18 },
        { -1, 23, 23, 23, 23, -1, -1, -1, -1, -1, -1, 23, 23, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, 23, 23, -1, -1, -1, -1, -1, 23, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, 25 },
        { -1, 28, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, 27, 27, 27, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 29, -1, -1, -1, -1, -1, 30, 29, 30, 30, -1, -1, 29, 29, 29, 29, 30, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 32, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, 31, 31, 31, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 34, -1, 33, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, 40, 40, -1, -1, -1, -1, -1, 40, -1 },
        { -1, 41, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, 41, 41, 41, 41, -1, -1, 42, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, 41, -1, -1, 41 },
        { -1, 44, 44, 44, 44, -1, -1, -1, -1, -1, -1, 46, 45, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, 44, -1 },
        { -1, 48, 48, 48, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, 48, -1, -1, -1, -1, -1, 48, -1 },
        { -1, 49, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, 49, 49, 49, 49, -1, -1, 49, 49, -1, 50, 50, 50, 50, -1, -1, -1, -1, 49, 49, -1, -1, 49 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51, 52, 53, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 55, 55, 55, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, 55, -1, -1, -1, -1, -1, 55, -1 },
        { -1, 56, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, 56, 56, 56, 56, -1, -1, 56, 56, -1, 56, 56, 56, 56, 57, 58, -1, -1, 56, 56, -1, -1, 56 },
        { -1, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, 59, -1 },
        { -1, 60, -1, -1, -1, -1, -1, -1, 60, -1, -1, -1, -1, 60, 60, 60, 60, -1, -1, 60, 60, -1, 60, 60, 60, 60, 60, 60, 61, 62, 60, 60, -1, -1, 60 },
        { -1, 63, 64, 65, 66, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 69, -1, -1, -1, -1, -1, 67, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, 72, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 175,   7,  37,   8, 176 },
        {  39,  32,  38 },
        {  37 },
        {   0 },
        {   2, 179,  44 },
        {  45 },
        {  42 },
        {  33,  62, 178 },
        { 177 },
        {  31,   2, 179,  44 },
        {  47 },
        {  48 },
        {  49 },
        {  50 },
        {  41,  33,  62, 178 },
        {  14,  34,  52,  35 },
        {  53,   2, 180,  54 },
        {  31,  53,   2, 180,  54 },
        {   0 },
        {   5, 181,  31 },
        {   0 },
        {  15,  34,  55,  35 },
        {  16,  34,  55,  35, 182 },
        {  62, 183,  56 },
        {  31,  62, 183,  56 },
        {   0 },
        {   9,  62, 184,  57,  60, 185,  61, 186,   8 },
        {  45,  32,  58 },
        {  46,  32,  58 },
        {  59 },
        {   0 },
        {  45,  32,  58 },
        {  46,  32,  58 },
        { 185,  10,  62, 187,  57,  60 },
        {   0 },
        {  11,  57 },
        {   0 },
        { 188,  17,  57,  51 },
        {  19,  62, 189 },
        {  18,  62, 190 },
        {  64,  63 },
        {   0 },
        {  20,  64, 191,  63 },
        {  21,  64, 192,  63 },
        {  65 },
        {  13, 193 },
        {  12, 194 },
        {  22,  64, 195 },
        {  68,  66 },
        {   0 },
        {  67, 196,  68, 197 },
        {  23 },
        {  24 },
        {  25 },
        {  26 },
        {  70,  69 },
        {   0 },
        {  27,  70, 198,  69 },
        {  28,  70, 199,  69 },
        {  72,  71 },
        {   0 },
        {  29,  72, 200,  71 },
        {  30,  72, 201,  71 },
        {   2, 202 },
        {   3, 203 },
        {   4, 204 },
        {   5, 205 },
        {  34,  62,  35 },
        {  27,  72 },
        {  28,  72, 206 },
        {   2, 179,  74 },
        {  31,  41 },
        {   0 }
    };

    String[] PARSER_ERROR = {
            "", // ""
            "Erro na linha %d - encontrado %s esperado EOF", // "Era esperado fim de programa"
            "Erro na linha %d - encontrado %s esperado identificadora", // "Era esperado identificadora"
            "Erro na linha %d - encontrado %s esperado constante_int", // "Era esperado qualquer"
            "Erro na linha %d - encontrado %s esperado constante_float", // "Era esperado decimal"
            "Erro na linha %d - encontrado %s esperado constante_string", // "Era esperado palavraaspas"
            "Erro na linha %d - encontrado %s esperado palavraa", // "Era esperado palavraa"
            "Erro na linha %d - encontrado %s esperado main", // "Era esperado main"
            "Erro na linha %d - encontrado %s esperado end", // "Era esperado end"
            "Erro na linha %d - encontrado %s esperado if", // "Era esperado if"
            "Erro na linha %d - encontrado %s esperado elif", // "Era esperado elif"
            "Erro na linha %d - encontrado %s esperado else", // "Era esperado else"
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado false"
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado true"
            "Erro na linha %d - encontrado %s esperado read", // "Era esperado read"
            "Erro na linha %d - encontrado %s esperado write", // "Era esperado write"
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado writeln"
            "Erro na linha %d - encontrado %s esperado repeat", // "Era esperado repeat"
            "Erro na linha %d - encontrado %s esperado until", // "Era esperado until"
            "Erro na linha %d - encontrado %s esperado while", // "Era esperado while"
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"&&\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"||\""
            "Erro na linha %d - encontrado %s esperado !", // "Era esperado \"!\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"==\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"!=\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"<\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \">\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"+\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"-\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"*\""
            "Erro na linha %d - encontrado %s esperado expressao", // "Era esperado \"/\""
            "Erro na linha %d - encontrado %s esperado , ", // "Era esperado \",\""
            "Erro na linha %d - encontrado %s esperado ;", // "Era esperado \";\""
            "Erro na linha %d - encontrado %s esperado =", // "Era esperado \"=\""
            "Erro na linha %d - encontrado %s esperado (", // "Era esperado \"(\""
            "Erro na linha %d - encontrado %s esperado )", // "Era esperado \")\""
            "Erro na linha %d - encontrado %s esperado main", // "<programa> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat", // "<lista_de_instrucoes> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora end if read write writeln repeat", // "<lista_de_instrucoes1> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat", // "<instrucao> inválido"
            "Erro na linha %d - encontrado %s esperado", // "<declaracao_de_variaveis> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora", // "<lista_de_identificadores> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora , ", // "<identificadores_opcional> inválido"
            "Erro na linha %d - encontrado %s esperado", // "<lista_de_identificadores_restante> inválido"
            "Erro na linha %d - encontrado %s esperado ,  ; =", // "<identificadores_seletor> inválido"
            "Erro na linha %d - encontrado %s esperado if read write writeln repeat", // "<comando> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora", // "<comando_atribuicao> inválido"
            "Erro na linha %d - encontrado %s esperado read ", // "<entrada_de_dados> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora write writeln", // "<saida_de_dados> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora if", // "<comando_selecao> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora repeat", // "<comando_repeticao> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora until while", // "<comando_repeticao_opcional> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_string", // "<lista_de_entrada> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_string", // "<constante_string_opcional> inválido"
            "Erro na linha %d - encontrado %s esperado ,  )", // "<identificadora_opcional> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_int constante_float constante_string ! expressao (", // "<lista_de_expressoes> inválido"
            "Erro na linha %d - encontrado %s esperado ,  )", // "<expressao_opcional> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat", // "<lista_de_comandos> inválido"
            "Erro na linha %d - encontrado %s esperado end if elif else read write writeln repeat until while", // "<lista_de_comandos_opcional> inválido"
            "Erro na linha %d - encontrado %s esperado if read write writeln repeat", // "<lista_de_comandos1> inválido"
            "Erro na linha %d - encontrado %s esperado end elif else", // "<comando_elif> inválido"
            "Erro na linha %d - encontrado %s esperado end else", // "<comando_else> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_int constante_float constante_string expressao (", // "<expressao> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat expressao ,  ; )", // "<expressao1> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_int constante_float constante_string expressao (", // "<elemento> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_int constante_float constante_string expressao(", // "<relacional> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat expressao ,  ; )", // "<relacional1> inválido"
            "Erro na linha %d - encontrado %s esperado", // "<operador_relacional> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_int constante_float constante_string expressao (", // "<aritmetica> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat expressao ,  ; )", // "<aritmetica1> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_int constante_float constante_string expressao (", // "<termo> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat expressao ,  ; )", // "<termo1> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora constante_int constante_float constante_string expressao (", // "<fator> inválido"
            "Erro na linha %d - encontrado %s esperado identificadora", // "<atribuicao_opcional> inválido"
            "Erro na linha %d - encontrado %s esperado ; expressao ", // "<lista1> inválido"
    };
}
