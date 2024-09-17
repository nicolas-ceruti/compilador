package controller;

import java.util.HashMap;
import java.util.Map;

public interface Constants extends ScannerConstants
{
    int EPSILON  = 0;
    int DOLLAR   = 1;

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
            "dolar",       // Para DOLLAR (1)
            "identificadora", // Para t_identificadora (2)
            "qualquer",    // Para t_qualquer (3)
            "decimal",     // Para t_decimal (4)
            "palavraaspas", // Para t_palavraaspas (5)
            "palavraa",   // Para t_palavraa (6)
            "main",        // Para t_main (7)
            "end",         // Para t_end (8)
            "if",          // Para t_if (9)
            "elif",        // Para t_elif (10)
            "else",        // Para t_else (11)
            "false",       // Para t_false (12)
            "true",        // Para t_true (13)
            "read",        // Para t_read (14)
            "write",       // Para t_write (15)
            "writeln",     // Para t_writeln (16)
            "repeat",      // Para t_repeat (17)
            "until",       // Para t_until (18)
            "while",       // Para t_while (19)
            "&&",          // Para t_TOKEN_20 (20)
            "||",          // Para t_TOKEN_21 (21)
            "!",           // Para t_TOKEN_22 (22)
            "==",          // Para t_TOKEN_23 (23)
            "!=",          // Para t_TOKEN_24 (24)
            "<",           // Para t_TOKEN_25 (25)
            ">",           // Para t_TOKEN_26 (26)
            "+",           // Para t_TOKEN_27 (27)
            "-",           // Para t_TOKEN_28 (28)
            "*",           // Para t_TOKEN_29 (29)
            "/",           // Para t_TOKEN_30 (30)
            ",",           // Para t_TOKEN_31 (31)
            ";",           // Para t_TOKEN_32 (32)
            "=",           // Para t_TOKEN_33 (33)
            "(",           // Para t_TOKEN_34 (34)
            ")"            // Para t_TOKEN_35 (35)
    };

}


