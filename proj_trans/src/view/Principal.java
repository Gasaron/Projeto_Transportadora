package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Principal extends JFrame {
    //defina o tamanho da tela
    public Principal(){
        setSize(600,600);
        setTitle("Sistema de Cadastro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.blue);
        setResizable(false);

        JMenuBar barraMenu = new JMenuBar();
        this.setJMenuBar(barraMenu);

        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuConsulta = new JMenu("Consulta");
        JMenu menuExcluir = new JMenu("Excluir");
        JMenu menuSomos = new JMenu("Sobre");

        barraMenu.add(menuCadastro);
        barraMenu.add(menuConsulta);
        barraMenu.add(menuExcluir);
        barraMenu.add(menuSomos);

        menuCadastro.setMnemonic(KeyEvent.VK_Z);
        menuConsulta.setMnemonic(KeyEvent.VK_X);
        menuExcluir.setMnemonic(KeyEvent.VK_C);
        menuSomos.setMnemonic(KeyEvent.VK_V);

        JMenuItem subCarro = new JMenuItem("Carro");
        JMenuItem subCaminhao = new JMenuItem("Caminhão");
        JMenuItem subMoto = new JMenuItem("Moto");
        JMenuItem subVan = new JMenuItem("Van");

        menuCadastro.add(subCarro);
        menuCadastro.add(subCaminhao);
        menuCadastro.add(subMoto);
        menuCadastro.add(subVan);
    }
    }
