package controller;

public interface ParserConstants {
    int START_SYMBOL = 36;

    int FIRST_NON_TERMINAL = 36;
    int FIRST_SEMANTIC_ACTION = 75;

    int[][] PARSER_TABLE =
            {
                    {-1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 2, -1, -1, -1, -1, -1, 3, 2, -1, -1, -1, -1, 2, 2, 2, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 4, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, 5, 5, 5, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 69, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 9, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 6, 7, 8, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, 10, 11, 11, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 16, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 20, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, 18},
                    {-1, 23, 23, 23, 23, -1, -1, -1, -1, -1, -1, 23, 23, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, 23, 23, -1, -1, -1, -1, -1, 23, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, 25},
                    {-1, 28, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, 27, 27, 27, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, 30, 29, 30, 30, -1, -1, 29, 29, 29, 29, 30, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, 31, 31, 31, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, 33, -1, 32, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 39, 39, 39, 39, -1, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, 39, -1},
                    {-1, 40, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, 40, 40, 40, 40, -1, -1, 41, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, 40, -1, -1, 40},
                    {-1, 43, 43, 43, 43, -1, -1, -1, -1, -1, -1, 45, 44, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, 43, -1},
                    {-1, 47, 47, 47, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 47, -1, -1, -1, -1, -1, 47, -1},
                    {-1, 48, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, 48, 48, 48, 48, -1, -1, 48, 48, -1, 49, 49, 49, 49, -1, -1, -1, -1, 48, 48, -1, -1, 48},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 51, 52, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 54, 54, 54, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, 54, -1, -1, -1, -1, -1, 54, -1},
                    {-1, 55, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, 55, 55, 55, 55, -1, -1, 55, 55, -1, 55, 55, 55, 55, 56, 57, -1, -1, 55, 55, -1, -1, 55},
                    {-1, 58, 58, 58, 58, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, 58, -1, -1, -1, -1, -1, 58, -1},
                    {-1, 59, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, 59, 59, 59, 59, -1, -1, 59, 59, -1, 59, 59, 59, 59, 59, 59, 60, 61, 59, 59, -1, -1, 59},
                    {-1, 62, 63, 64, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, 68, -1, -1, -1, -1, -1, 66, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, -1, 71, -1, -1}
            };

    int[][] PRODUCTIONS =
            {
                    {7, 37, 8},
                    {39, 32, 38},
                    {37},
                    {0},
                    {2, 44},
                    {45},
                    {42},
                    {0},
                    {33, 62},
                    {31, 2, 44},
                    {47},
                    {48},
                    {49},
                    {50},
                    {41, 33, 62},
                    {14, 34, 52, 35},
                    {53, 2, 54},
                    {31, 53, 2, 54},
                    {0},
                    {5, 31},
                    {0},
                    {15, 34, 55, 35},
                    {16, 34, 55, 35},
                    {62, 56},
                    {31, 62, 56},
                    {0},
                    {9, 62, 57, 60, 61, 8},
                    {45, 32, 58},
                    {46, 32, 58},
                    {59},
                    {0},
                    {45, 32, 58},
                    {10, 62, 57, 60},
                    {0},
                    {11, 57},
                    {0},
                    {17, 57, 51},
                    {19, 62},
                    {18, 62},
                    {64, 63},
                    {0},
                    {20, 64, 63},
                    {21, 64, 63},
                    {65},
                    {13},
                    {12},
                    {22, 64},
                    {68, 66},
                    {0},
                    {67, 68},
                    {23},
                    {24},
                    {25},
                    {26},
                    {70, 69},
                    {0},
                    {27, 70, 69},
                    {28, 70, 69},
                    {72, 71},
                    {0},
                    {29, 72, 71},
                    {30, 72, 71},
                    {2},
                    {3},
                    {4},
                    {5},
                    {34, 62, 35},
                    {27, 72},
                    {28, 72},
                    {2, 74},
                    {31, 41},
                    {0}
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

