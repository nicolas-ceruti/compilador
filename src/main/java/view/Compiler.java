package view;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Compiler extends JFrame {
    private JLabel labelLinhas;
    private JTextArea editor;
    private JTextArea mensagens;
    private JPanel panelMain;
    private JButton buttonNovo;
    private JButton buttonAbrir;
    private JButton buttonSalvar;
    private JButton buttonCopiar;
    private JButton buttonColar;
    private JButton buttonRecortar;
    private JButton buttonCompilar;
    private JButton buttonEquipe;


    public Compiler() {
        editor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                contarLinhas();
            }
        });

        buttonAbrir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    if (selectedFile.length() > 0) {
                        editor.setText(null);
                        try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                            String line;
                            while ((line = reader.readLine()) != null) {
                                editor.append(line + "\n");
                            }
                            contarLinhas();
                        } catch (IOException er) {
                            throw new RuntimeException(er);
                        }
                    }
                }
            }
        });
    }

    private void contarLinhas() {
        String text = this.editor.getText();
        int qttRows = text.split("\n", -1).length;
        StringBuilder linhas = new StringBuilder();

        for (int i = 1; i <= qttRows; i++) {
            if (i > 1) {
                linhas.append("<br>");
            }
            linhas.append(i);
        }
        this.labelLinhas.setText("<html>" + linhas.toString() + "</html>");
    }

    private void adicionarMensagem(String mensagem) {
        String text = this.mensagens.getText();
        StringBuilder stringMensagens = new StringBuilder();

        stringMensagens.append(text);
        stringMensagens.append("</br>");
        stringMensagens.append(mensagem);

        this.mensagens.setText("<html>" + stringMensagens + "</html>");
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
