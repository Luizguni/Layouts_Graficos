package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {
        //configuração da janela
        setTitle("Janela Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //cria um botão
        JButton botao = new JButton("Clique");

        //adiciona um ouvinte de evento do botão
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão Clicado");

            }
        });
        //Adiciona o botão à janela
        add(botao);

        //Define o layout como FlowLayout
        setLayout(new FlowLayout());

        //exibe à janela
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities swingUtilities = null;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();

            }
        });
    }
}
