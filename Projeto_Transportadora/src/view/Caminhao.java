package view;

import javax.swing.*;
import java.awt.*;

public class Caminhao extends JFrame {

    public Caminhao(){
        setTitle("Cadastro de Caminhão");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setResizable(false);

        JLabel lblModelo = new JLabel("Modelo", JLabel.CENTER);
        lblModelo.setBounds(25,20,150,30);
        JTextField txtModelo = new JTextField();
        txtModelo.setBounds(25,60,150,30);

        JLabel lblCombustivel = new JLabel("Combustivél", JLabel.CENTER);
        lblCombustivel.setBounds(200,20,150,30);

        JRadioButton jrGasolina = new JRadioButton("Gasolina", false);
        jrGasolina.setBounds(225,60,100,30);
        JRadioButton jrAlcool = new JRadioButton("Alcool", false);
        jrAlcool.setBounds(225,90,100,30);
        JRadioButton jrHibrido = new JRadioButton("Híbrido", false);
        jrHibrido.setBounds(225,120,100,30);

        JLabel lblOpcional = new JLabel("Opcionais", JLabel.CENTER);
        lblOpcional.setBounds(140,160,100,30);
        JCheckBox jcAr = new JCheckBox("Ar Condicionado", false);
        jcAr.setBounds(125,190,150,30);
        JCheckBox jcBanco = new JCheckBox("Banco de Couro", false);
        jcBanco.setBounds(125,220,150,30);
        JCheckBox jcVidro = new JCheckBox("Vidro Fume", false);
        jcVidro.setBounds(125,250,150,30);
        JCheckBox jcMultiMedia = new JCheckBox("Monitor Multi Midia", false);
        jcMultiMedia.setBounds(125,280,150,30);



        add(lblModelo);
        add(txtModelo);
        add(lblCombustivel);
        add(lblOpcional);
        add(jrGasolina);
        add(jrAlcool);
        add(jrHibrido);
        add(jcAr);
        add(jcBanco);
        add(jcVidro);
        add(jcMultiMedia);
    }
}
