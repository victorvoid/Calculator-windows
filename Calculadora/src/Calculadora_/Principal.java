package Calculadora_;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Principal extends JFrame implements ActionListener{
	ImageIcon icone;
	Container contantPane;
	JMenuBar barra;
	JMenu exibir,editar,ajuda;
	JMenuItem sair,sobre;
	public Principal (){
		barra    = new JMenuBar (); 									barra .setBackground(Color.white);
		exibir   = new JMenu ("Exibir");    							exibir.setForeground(Color.blue);
		editar	 = new JMenu ("Editar");								editar.setForeground(Color.blue);
		ajuda    = new JMenu ("Ajuda");							        ajuda .setForeground(Color.blue);
		sobre    = new JMenuItem("Sobre a Calculadora");  		        sobre .setBackground(Color.white);
		sair     = new JMenuItem (new ImageIcon("image//isair.png"));     sair.setBackground(Color.white);
		
		//Adicionando o ícone do programa
		icone = new ImageIcon ("image//calculadora.png");
		setIconImage (icone.getImage());
		exibir.add(sair);
		ajuda .add(sobre);
		barra .add(exibir);
		barra .add(editar);
		barra .add(ajuda);
		
		setJMenuBar (barra);
	contantPane = getContentPane ();
	Plano painel1 = new Plano ();
	contantPane.add(painel1);
	sair.addActionListener (this);
	sobre.addActionListener(this);
	}
	
	public static void menu (){
		Principal menu = new Principal ();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setLocation(600,200);
		menu.setVisible(true);
		menu.setResizable(false);
		menu.setSize(223,346);
		
	}
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource()== sair){
			System.exit(0);
		}
		if (e.getSource() == sobre){
			SobreCalculadora janela = new SobreCalculadora ();
		}
	}

}
