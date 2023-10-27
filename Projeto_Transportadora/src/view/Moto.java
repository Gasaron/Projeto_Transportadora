package view;

import javax.swing.*;
import java.awt.*;

public class Moto extends JFrame {

    public Moto(){
        setTitle("Cadastro de Moto");
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
        JCheckBox jcMalaLateral = new JCheckBox("Mala Lateral", false);
        jcMalaLateral.setBounds(125,190,150,30);
        JCheckBox jcBanco = new JCheckBox("Banco de Couro", false);
        jcBanco.setBounds(125,220,150,30);
        JCheckBox jcCavalete = new JCheckBox("Cavalete", false);
        jcCavalete.setBounds(125,250,150,30);
        JCheckBox jcAntena = new JCheckBox("Antena Corta Pipa", false);
        jcAntena.setBounds(125,280,150,30);



        add(lblModelo);
        add(txtModelo);
        add(lblCombustivel);
        add(lblOpcional);
        add(jrGasolina);
        add(jrAlcool);
        add(jrHibrido);
        add(jcMalaLateral);
        add(jcBanco);
        add(jcCavalete);
        add(jcAntena);
    }
}
