package view;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.awt.event.*;
import java.time.LocalDateTime;

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
    private JLabel arquivo;


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
                acaoBotaoAbrir();
            }
        });
        buttonNovo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                acaoBotaoNovo();
            }
        });

        buttonEquipe.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                acaoBotaoEquipe();
            }
        });

        buttonCompilar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                acaoBotaoCompilar();
            }
        });


        buttonColar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                acaoBotaoColar();

            }
        });

        buttonRecortar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                acaoBotaoRecortar();
            }
        });

        buttonCopiar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                acaoBotaoCopiar();
            }
        });

        defineTeclasDeAtalho();

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
        String novaMensagem = "\n" + LocalDateTime.now() + "  |  " + mensagem;
        String novaLista = this.mensagens.getText() + novaMensagem;

        this.mensagens.setText(novaLista);
    }

    private void acaoBotaoEquipe() {
        adicionarMensagem("Equipe: Nicolas Andrei Ceruti, Gustavo Henrique Campestrini, Julia Welter");
    }

    private void acaoBotaoCompilar() {
        adicionarMensagem("compilação de programas ainda não foi implementada");
    }
    private void acaoBotaoNovo() {
        clearAll();
    }

    private void clearAll() {
        editor.setText(null);
        contarLinhas();
        mensagens.setText(null);
        arquivo.setText(null);
    }

    private void acaoBotaoAbrir() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile.length() > 0) {
                clearAll();
                editor.setText(null);
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        editor.append(line + "\n");
                    }
                    contarLinhas();
                    arquivo.setText(selectedFile.getPath());
                } catch (IOException er) {
                    throw new RuntimeException(er);
                }
            }
        }
    }

    private void acaoBotaoRecortar() {
        try {
            editor.selectAll();
            editor.cut();
            contarLinhas();
            adicionarMensagem("Texto Recortado");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    private void acaoBotaoColar() {
        try {
            editor.paste();
            contarLinhas();
            adicionarMensagem("Texto Colado");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void acaoBotaoCopiar() {
        try {
            editor.selectAll();
            editor.copy();
            adicionarMensagem("Texto Copiado");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {

        Compiler frame = new Compiler();
        frame.setContentPane(frame.panelMain);
        frame.setTitle("Compilador");
        frame.setSize(900, 700);
        frame.setMinimumSize(new Dimension(900, 700));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void defineTeclasDeAtalho() {
        Action acaoNovo = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBotaoNovo();
            }
        };
        Action acaoAbrir = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBotaoAbrir();
            }
        };
        Action acaoSalvar = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSalvar.doClick();
            }
        };

        Action acaoCopiar = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBotaoCopiar();
            }
        };

        Action acaoColar = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBotaoColar();
            }
        };

        Action acaoRecortar = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBotaoRecortar();
            }
        };

        Action acaoCompilar = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBotaoCompilar();
            }
        };

        Action acaoEquipe = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBotaoEquipe();
            }
        };

        // Configure InputMap e ActionMap para o nível de janela
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = getRootPane().getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK), "novo");
        actionMap.put("novo", acaoNovo);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.META_DOWN_MASK), "novo");
        actionMap.put("novo", acaoNovo);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK), "abrir");
        actionMap.put("abrir", acaoAbrir);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.META_DOWN_MASK), "abrir");
        actionMap.put("abrir", acaoAbrir);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK), "salvar");
        actionMap.put("salvar", acaoSalvar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.META_DOWN_MASK), "salvar");
        actionMap.put("salvar", acaoSalvar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK), "copiar");
        actionMap.put("copiar", acaoCopiar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.META_DOWN_MASK), "copiar");
        actionMap.put("copiar", acaoCopiar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK), "colar");
        actionMap.put("colar", acaoColar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.META_DOWN_MASK), "colar");
        actionMap.put("colar", acaoColar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK), "recortar");
        actionMap.put("recortar", acaoRecortar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.META_DOWN_MASK), "recortar");
        actionMap.put("recortar", acaoRecortar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), "compilar");
        actionMap.put("compilar", acaoCompilar);

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "equipe");
        actionMap.put("equipe", acaoEquipe);

    }


}
