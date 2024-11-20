package controller;

public interface Constants extends ScannerConstants, ParserConstants {
    int EPSILON = 0;
    int DOLLAR = 1;

    int t_identificadora = 2;
    int t_qualquer = 3;
    int t_decimal = 4;
    int t_palavraaspas = 5;
    int t_palavraa = 6;
    int t_main = 7;
    int t_end = 8;
    int t_if = 9;
    int t_elif = 10;
    int t_else = 11;
    int t_false = 12;
    int t_true = 13;
    int t_read = 14;
    int t_write = 15;
    int t_writeln = 16;
    int t_repeat = 17;
    int t_until = 18;
    int t_while = 19;
    int t_TOKEN_20 = 20; //"&&"
    int t_TOKEN_21 = 21; //"||"
    int t_TOKEN_22 = 22; //"!"
    int t_TOKEN_23 = 23; //"=="
    int t_TOKEN_24 = 24; //"!="
    int t_TOKEN_25 = 25; //"<"
    int t_TOKEN_26 = 26; //">"
    int t_TOKEN_27 = 27; //"+"
    int t_TOKEN_28 = 28; //"-"
    int t_TOKEN_29 = 29; //"*"
    int t_TOKEN_30 = 30; //"/"
    int t_TOKEN_31 = 31; //","
    int t_TOKEN_32 = 32; //";"
    int t_TOKEN_33 = 33; //"="
    int t_TOKEN_34 = 34; //"("
    int t_TOKEN_35 = 35; //")"

    static final String[] CLASSE_DESCRICAO = {
            "desconhecida", // Para EPSILON (0)
            "EOF",       // Para DOLLAR (1)
            "identificador", // Para t_identificadora (2)
            "constante_int",    // Para t_qualquer (3)
            "constante_float",     // Para t_decimal (4)
            "constante_string", // Para t_palavraaspas (5)
            "constante_string",   // Para t_palavraa (6)
            "palavra reservada",        // Para t_main (7)
            "palavra reservada",         // Para t_end (8)
            "palavra reservada",          // Para t_if (9)
            "palavra reservada",        // Para t_elif (10)
            "palavra reservada",        // Para t_else (11)
            "palavra reservada",       // Para t_false (12)
            "palavra reservada",        // Para t_true (13)
            "palavra reservada",        // Para t_read (14)
            "palavra reservada",       // Para t_write (15)
            "palavra reservada",     // Para t_writeln (16)
            "palavra reservada",      // Para t_repeat (17)
            "palavra reservada",       // Para t_until (18)
            "palavra reservada",       // Para t_while (19)
            "simbolo_especial",          // Para t_TOKEN_20 (20)
            "simbolo_especial",          // Para t_TOKEN_21 (21)
            "simbolo_especial",           // Para t_TOKEN_22 (22)
            "simbolo_especial",          // Para t_TOKEN_23 (23)
            "simbolo_especial",          // Para t_TOKEN_24 (24)
            "simbolo_especial",           // Para t_TOKEN_25 (25)
            "simbolo_especial",           // Para t_TOKEN_26 (26)
            "simbolo_especial",           // Para t_TOKEN_27 (27)
            "simbolo_especial",           // Para t_TOKEN_28 (28)
            "simbolo_especial",           // Para t_TOKEN_29 (29)
            "simbolo_especial",           // Para t_TOKEN_30 (30)
            "simbolo_especial",           // Para t_TOKEN_31 (31)
            "simbolo_especial",           // Para t_TOKEN_32 (32)
            "simbolo_especial",           // Para t_TOKEN_33 (33)
            "simbolo_especial",           // Para t_TOKEN_34 (34)
            "simbolo_especial"            // Para t_TOKEN_35 (35)
    };


}
