package Calculadora_;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SobreCalculadora extends JFrame implements ActionListener {
	
	private JLabel autor,creditos;
	private ImageIcon calculadora;
	private JButton ok;
	private JLabel img;
	public SobreCalculadora (){
	setSize(300,300);	
	setVisible (true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocation(250,250);
	adicionarComponentes();
	
	}
	public void adicionarComponentes(){
		setLayout(null);
		autor = new JLabel ("Victor Igor");
		creditos = new JLabel ("Desenvolvida: 09/07/2014");
		calculadora = new ImageIcon("image//calculadora.png");
		img = new JLabel (calculadora);
		ok = new JButton ("Ok");
		autor.setBounds(120,10,100,20);
		img.setBounds(0,20,100,100);
		creditos.setBounds(80,30,200,20);
		ok.setBounds(95,200,90,25); ok.setBackground(Color.white); ok.setForeground(Color.blue);
		add(autor);
		add(creditos);
		add(img);
		add(ok);
		ok.addActionListener(this);
	}
	public void actionPerformed (ActionEvent e){
		if (e.getSource() == ok){
			System.exit(0);
		}
	}
	
	
	/*
	 * Ela foi feita de de acordo com muitas coisas que aprendi no curso, Criei um frame, e apartir dele criei 
	 * um painel, a qual nele está os componentes da aplicação e seus eventos. Coloquei figuras nos botões,
	 * troquei a cor e utilizei duas Caixas de textos (JTextField) para que tenha a visualização logo em cima dos números clicados. 
	 * Seus eventos foi feito a partir de uma lógica que consegui, não é a maneira mais eficiente de fazer, 
	 * mas foi a que consegui pensar, pois sei que tenho muito a aprender. 
	 * 
	 *  Algumas informações:
	 *  Lados POSITIVOS
	 *  	De acordo com numeros lidos ela é capaz de diminuir seus números para que caibam na janela, foi feita
	 *  com o uso do setFont para setar a font e mudar - la.
	 *  
	 *  	Ela é capaz de ao mesmo tempo que vai somando os números, já vai mostrando o resultado na tela sem
	 *  mesmo precisar apertar no igual, além do mais capaz de calcular sua equação utilizando somente  soma e 
	 *  subtração.
	 *  		
	 *  
	 *  Lados NEGATIVOS E BUGS
	 *      NÂO é capaz de desenvolver equações que misturem multiplicação e divisão ao mesmo tempo, e sim apenas
	 *      com 2 números distintos para saber seu resultado.
	 *      A utilização da virgula não está pegando, sujeito a um bug.
	 *      
	 *        
	 *      LÓGICA usada:
	 *     De acordo com o que o usuário for clicando no número, ele é salvo numa variável que concatenando os dígitos
	 * e usando o setText modificando seu TextField e ao clicar em qualquer sinal, ele passa o que tava escrito
	 * na caixa de texto para a segunda caixa e fica logo em cima, e em seguida com uma variável aucmuladora 
	 * recebendo zero no inicial, ele pega esse valor e faz o cálculo, e utilizei alguns métodos de String para
	 * manipular a caixa de texto. 
	 */	
		
		
	
}
