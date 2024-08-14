package view;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Compiler extends JFrame{
    private JLabel labelLinhas;
    private JTextArea editor;
    private JTextArea mensagens;
    private JPanel panelMain;
    private JButton button1;


    public Compiler() {
        editor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                contarLinhas();
            }
        });
    }

    private void contarLinhas() {
        String text = this.editor.getText();

        String[] lines = text.split("\n");
        int qttRows = text.split("\n", -1).length;

        System.out.println(text);
        System.out.println(qttRows);
        StringBuilder linhas = new StringBuilder();
        for (int i = 1; i <= qttRows; i++) {
            if (i > 1) {
                linhas.append("<br>"); // Adiciona quebra de linha HTML
            }
            linhas.append(i);
        }

        this.labelLinhas.setText("<html>" + linhas.toString() + "</html>");
    }

    public static void main(String[] args) {
        Compiler frame = new Compiler();
        frame.setContentPane(frame.panelMain);
        frame.setTitle("Compilador");
        frame.setSize(900, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
