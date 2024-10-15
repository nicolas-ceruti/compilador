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
        { -1, 69, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  6,  7,  8, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, 10, 11, 11, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 16, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 20, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, 18 },
        { -1, 23, 23, 23, 23, -1, -1, -1, -1, -1, -1, 23, 23, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, 23, 23, -1, -1, -1, -1, -1, 23, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, 25 },
        { -1, 28, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, 27, 27, 27, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 30, 29, 30, 30, -1, -1, 29, 29, 29, 29, 30, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, 31, 31, 31, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 33, -1, 32, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 39, 39, 39, 39, -1, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, 39, -1 },
        { -1, 40, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, 40, 40, 40, 40, -1, -1, 41, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, 40, -1, -1, 40 },
        { -1, 43, 43, 43, 43, -1, -1, -1, -1, -1, -1, 45, 44, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, 43, -1 },
        { -1, 47, 47, 47, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 47, -1, -1, -1, -1, -1, 47, -1 },
        { -1, 48, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, 48, 48, 48, 48, -1, -1, 48, 48, -1, 49, 49, 49, 49, -1, -1, -1, -1, 48, 48, -1, -1, 48 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 51, 52, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 54, 54, 54, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, 54, -1, -1, -1, -1, -1, 54, -1 },
        { -1, 55, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, 55, 55, 55, 55, -1, -1, 55, 55, -1, 55, 55, 55, 55, 56, 57, -1, -1, 55, 55, -1, -1, 55 },
        { -1, 58, 58, 58, 58, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, 58, -1, -1, -1, -1, -1, 58, -1 },
        { -1, 59, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, 59, 59, 59, 59, -1, -1, 59, 59, -1, 59, 59, 59, 59, 59, 59, 60, 61, 59, 59, -1, -1, 59 },
        { -1, 62, 63, 64, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, 68, -1, -1, -1, -1, -1, 66, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, 71, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        {  7, 37,  8 },
        { 39, 32, 38 },
        { 37 },
        {  0 },
        {  2, 44 },
        { 45 },
        { 42 },
        {  0 },
        { 33, 62 },
        { 31,  2, 44 },
        { 47 },
        { 48 },
        { 49 },
        { 50 },
        { 41, 33, 62 },
        { 14, 34, 52, 35 },
        { 53,  2, 54 },
        { 31, 53,  2, 54 },
        {  0 },
        {  5, 31 },
        {  0 },
        { 15, 34, 55, 35 },
        { 16, 34, 55, 35 },
        { 62, 56 },
        { 31, 62, 56 },
        {  0 },
        {  9, 62, 57, 60, 61,  8 },
        { 45, 32, 58 },
        { 46, 32, 58 },
        { 59 },
        {  0 },
        { 45, 32, 58 },
        { 10, 62, 57, 60 },
        {  0 },
        { 11, 57 },
        {  0 },
        { 17, 57, 51 },
        { 19, 62 },
        { 18, 62 },
        { 64, 63 },
        {  0 },
        { 20, 64, 63 },
        { 21, 64, 63 },
        { 65 },
        { 13 },
        { 12 },
        { 22, 64 },
        { 68, 66 },
        {  0 },
        { 67, 68 },
        { 23 },
        { 24 },
        { 25 },
        { 26 },
        { 70, 69 },
        {  0 },
        { 27, 70, 69 },
        { 28, 70, 69 },
        { 72, 71 },
        {  0 },
        { 29, 72, 71 },
        { 30, 72, 71 },
        {  2 },
        {  3 },
        {  4 },
        {  5 },
        { 34, 62, 35 },
        { 27, 72 },
        { 28, 72 },
        {  2, 74 },
        { 32, 41 },
        {  0 }
    };


    String[] PARSER_ERROR =
            {
                    "",
                    "encontrado %d esperado fim de programa",
                    "encontrado %d esperado identificadora",
                    "encontrado %d esperado qualquer",
                    "encontrado %d esperado decimal",
                    "encontrado %d esperado palavraaspas",
                    "encontrado %d esperado palavraa",
                    "encontrado %d esperado main",
                    "encontrado %d esperado end",
                    "encontrado %d esperado if",
                    "encontrado %d esperado elif",
                    "encontrado %d esperado else",
                    "encontrado %d esperado false",
                    "encontrado %d esperado true",
                    "encontrado %d esperado read",
                    "encontrado %d esperado write",
                    "encontrado %d esperado writeln",
                    "encontrado %d esperado repeat",
                    "encontrado %d esperado until",
                    "encontrado %d esperado while",
                    "encontrado %d esperado &&",
                    "encontrado %d esperado ||",
                    "encontrado %d esperado !",
                    "encontrado %d esperado ==",
                    "encontrado %d esperado !=",
                    "encontrado %d esperado <",
                    "encontrado %d esperado >",
                    "encontrado %d esperado +",
                    "encontrado %d esperado -",
                    "encontrado %d esperado *",
                    "encontrado %d esperado /",
                    "encontrado %d esperado ,",
                    "encontrado %d esperado ;",
                    "encontrado %d esperado =",
                    "encontrado %d esperado (",
                    "encontrado %d esperado )",
                    "Erro na linha %d - encontrado %s esperado main",
                    "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat",
                    "Erro na linha %d - encontrado %s esperado identificadora end if read write writeln repeat",
                    "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat",
                    "Erro na linha %d - encontrado %s esperado",
                    "Erro na linha %d - encontrado %s esperado identificadora",
                    "Erro na linha %d - encontrado %s esperado identificadora ,",
                    "Erro na linha %d - encontrado %s esperado",
                    "Erro na linha %d - encontrado %s esperado , ; =",
                    "Erro na linha %d - encontrado %s esperado if read write writeln repeat",
                    "Erro na linha %d - encontrado %s esperado identificadora",
                    "Erro na linha %d - encontrado %s esperado read ",
                    "Erro na linha %d - encontrado %s esperado identificadora write writeln",
                    "Erro na linha %d - encontrado %s esperado identificadora if",
                    "Erro na linha %d - encontrado %s esperado identificadora repeat",
                    "Erro na linha %d - encontrado %s esperado identificadora until while",
                    "Erro na linha %d - encontrado %s esperado identificadora palavraaspas",
                    "Erro na linha %d - encontrado %s esperado identificadora palavraaspas",
                    "Erro na linha %d - encontrado %s esperado , )",
                    "Erro na linha %d - encontrado %s esperado identificadora qualquer decimal palavraaspas false true ! + - (",
                    "Erro na linha %d - encontrado %s esperado , )",
                    "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat",
                    "Erro na linha %d - encontrado %s esperado end if elif else read write writeln repeat until while",
                    "Erro na linha %d - encontrado %s esperado if read write writeln repeat",
                    "Erro na linha %d - encontrado %s esperado end elif else",
                    "Erro na linha %d - encontrado %s esperado end else",
                    "Erro na linha %d - encontrado %s esperado identificadora qualquer decimal palavraaspas false true ! + - (",
                    "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat && || , ; )",
                    "Erro na linha %d - encontrado %s esperado identificadora qualquer decimal palavraaspas false true ! + - (",
                    "Erro na linha %d - encontrado %s esperado identificadora qualquer decimal palavraaspas + - (",
                    "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat && || == != < > , ; )",
                    "Erro na linha %d - encontrado %s esperado == != < >",
                    "Erro na linha %d - encontrado %s esperado identificadora qualquer decimal palavraaspas + - (",
                    "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat && || == != < > + - , ; )",
                    "Erro na linha %d - encontrado %s esperado identificadora qualquer decimal palavraaspas + - (",
                    "Erro na linha %d - encontrado %s esperado identificadora if read write writeln repeat && || == != < > + - * / , ; )",
                    "Erro na linha %d - encontrado %s esperado identificadora qualquer decimal palavraaspas + - (",
                    "Erro na linha %d - encontrado %s esperado identificadora",
                    "Erro na linha %d - encontrado %s esperado ; - ",
            };
}
