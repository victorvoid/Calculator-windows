package Calculadora_;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;




public class Plano extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,
					bt19,bt20,bt21,bt22;
	private JTextField area,area2;
    
	public Plano (){
		adicionarComponentes ();
		eventos();
	}
	
	public void adicionarComponentes (){
		setLayout(null);
		
				
		bt1  = new JButton ("1"); bt1.setBackground(Color.white);
		bt2  = new JButton ("2"); bt2.setBackground(Color.white);
		bt3  = new JButton ("3"); bt3.setBackground(Color.white);
		bt4  = new JButton ("4"); bt4.setBackground(Color.white);
		bt5  = new JButton ("5"); bt5.setBackground(Color.white);
		bt6  = new JButton ("6"); bt6.setBackground(Color.white);
		bt7  = new JButton ("7"); bt7.setBackground(Color.white);
		bt8  = new JButton ("8"); bt8.setBackground(Color.white);
		bt9  = new JButton ("9"); bt9.setBackground(Color.white);
		bt0  = new JButton ("0"); bt0.setBackground(Color.white);
		bt10 = new JButton ("-"); bt10.setBackground(Color.white);
		bt11 = new JButton (","); bt11.setBackground(Color.white);
		bt12 = new JButton ("+"); bt12.setBackground(Color.white);
		bt13 = new JButton ("="); bt13.setBackground(Color.white);
		bt14 = new JButton ("*");										bt14.setBackground(Color.white);
		bt15 = new JButton (new ImageIcon("image//barra.gif"));			bt15.setBackground(Color.white);
		bt16 = new JButton (new ImageIcon ("image//porcentagem.png"));	bt16.setBackground(Color.white);
		bt17 = new JButton (new ImageIcon ("image//umporx.png"));		bt17.setBackground(Color.white);
		bt18 = new JButton (new ImageIcon("image//seta.png"));			bt18.setBackground(Color.white);
		bt19 = new JButton (new ImageIcon ("image//ce.png")); 			bt19.setBackground(Color.white);
		bt20 = new JButton (new ImageIcon("image//letrac.jpg"));		bt20.setBackground(Color.white);
		bt21 = new JButton (new ImageIcon ("image//raizquadrada.jpg"));
		bt22 = new JButton (new ImageIcon ("image//maisemenos.png")); 	bt22.setBackground(Color.white);
		area2 = new JTextField ("0"); area2.setBackground(Color.white); area2.setForeground(Color.black);area2.setBorder(new LineBorder(Color.white));
		
		area2.setEditable(false);
		area2.setHorizontalAlignment(JTextField.RIGHT);
		area = new JTextField (""); area.setBackground(Color.white); area.setForeground(Color.black);area.setBorder(new LineBorder(Color.white));
		area.setEditable(false);
		area.setHorizontalAlignment(JTextField.RIGHT);
		
		area2.setFont(new Font("Dialog", Font.BOLD, 29));  
		area.setFont (new Font("Dialog", Font.BOLD, 20));
		
		bt1	.setBounds(2  ,220 ,41 ,34);
		bt2	.setBounds(45 ,220 ,41 ,34);
		bt3	.setBounds(88 ,220 ,41 ,34);
		bt4	.setBounds(2  ,184 ,41 ,34);
		bt5	.setBounds(45 ,184 ,41 ,34);
		bt6	.setBounds(88 ,184 ,41 ,34);
		bt7	.setBounds(2  ,148 ,41 ,34);
		bt8	.setBounds(45 ,148 ,41 ,34);
		bt9	.setBounds(88 ,148 ,41 ,34);
		bt0	.setBounds(2  ,256,84 ,34);
		bt10.setBounds(131,220,41,34);
		bt11.setBounds(88 ,256,41,34);
		bt12.setBounds(131,256,41,34);
		bt13.setBounds(174,220,41,70);
		bt14.setBounds(131,184,41,34);
		bt15.setBounds(131,148,41,34);
		bt16.setBounds(174,148,41,34);
		bt17.setBounds(174,184,41,34);
		bt18.setBounds(2  ,112,41,34);
		bt19.setBounds(45 ,112,41,34);
		bt20.setBounds(88 ,112,41,34);
		bt21.setBounds(174,112,41,34);
		bt22.setBounds(131,112,41,34);
		area.setBounds(2  ,1,213,40); 
		area2.setBounds(2 ,40,213,60);
   		add(bt1);
   		add(bt2);
   		add(bt3);
   		add(bt4);
   		add(bt5);
   		add(bt6);
   		add(bt7);
   		add(bt8);
   		add(bt9);
   		add(bt0);
   		add(bt10);
   		add(bt11);
   		add(bt12);
   		add(bt13);
   		add(bt14);
   		add(bt15);
   		add(bt16);
   		add(bt17);
   		add(bt18);
   		add(bt19);
   		add(bt20);
   		add(bt21);
   		add(bt22);
   		add(area);
   		add(area2);
   
   		
	}
   static String n1 = "";
	
	public void eventos (){
try{
		bt0.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				if (!n1.equals("")){
					n1 += "0";
					area2.setText(n1);
				}
			
			}
		
		});
		bt1.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "1";
				
				area2.setText(n1);
				
			}
		});
		bt2.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "2";

				area2.setText(n1);
				
			}
		});
		bt3.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "3";
				area2.setText(n1);
			}
		});
		bt4.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "4";
				area2.setText(n1);
				
			}
		});
		bt5.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "5";
				area2.setText(n1);
			}
		});
		bt6.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "6";
				area2.setText(n1);
			}
		});
		bt7.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "7";
				area2.setText(n1);
				
			}
		});
		bt8.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "8";
				area2.setText(n1);
			}
		});
		bt9.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += "9";
				area2.setText(n1);
			}
		});
		
		
		bt10.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				
				discar2 (" - ");
				
			}
		});
		
		bt11.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 += ",";
				
				area2.setText(n1);
			}
		});
		bt12.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				
		
				
				discar2 (" + ");
				
				
			}
		});
		
		bt13.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				
				
				area2.setText(""+igual ());
				
			
			}
		});
		bt14.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				
				
				discar2 (" * ");
			
			}
		});
		bt15.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				
				
				discar2 (" / ");
			
			}
		});
		bt16.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				
				area.setText("");
				area2.setText("0");
				resultado = 0;
				n1 = "";
			}
		});
		bt17.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				
				discar2 ("reciproc");
				
			}
		});
		bt18.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				int aux = area2.getText().length();
				String a = area2.getText();
				if (!area2.getText().equals("0"))
				area2.setText(a.substring(0,aux-1));
				resultado =0;
				n1 = ""+area2.getText();
				
			}
		});
		
		bt19.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				n1 = "";
				area2.setText("");
				
			}
		});
		bt20.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				area2.setText("");
				n1 = "";
				resultado = 0;
				area.setText("");
			}
		});
		bt21.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				discar2 ("sqrt ");
			}
		});
		bt22.addActionListener(new ActionListener (){
			public void actionPerformed (ActionEvent e){
				
			}
		});
		
}catch (Exception e){
	JOptionPane.showMessageDialog(null, "Desculpe, Informe um valor numérico e em seguida a operação desejada!","VALOR INVÁLIDO",JOptionPane.ERROR_MESSAGE);
	e.toString();
}
	}

	int num1, a, d = 0, z = 0;
    double resultado = 0;
	boolean menos = false;
	

	public void discar2 (String digito){   // FAZENDO COM QUE FAÇA LOGO AS OPERAÇÕES ANTES DE APERTAR =
try {
	
		area.setText(area.getText()+area2.getText()+digito);
		n1 = "";
		area2.setFont(new Font("Dialog", Font.BOLD, 29));
		//ADICIONANDO UM LIMITE NA CAIXA E DIMINUINDO A FONT
		if(area.getText().length() > 25){   
			area.setFont(new Font("Dialog", Font.BOLD, 10));
			if (area.getText().length() > 45){
				area.setText("");
				n1 = "";
				JOptionPane.showMessageDialog(null, "Valor Máximo");
			}
		} 	
			//ADIÇÃO
		if (digito.equals(" + ")){
				a = 1;
				if (menos){
					num1 = Integer.parseInt(area2.getText());
					resultado -= num1;
					area2.setText(""+resultado);	
					menos = false;
					
				}else
					if (d == 1){
						num1 = Integer.parseInt(area2.getText());
						resultado -= num1;
						area2.setText(""+resultado);
					
						d = 0;
					}else{
			
						num1 = Integer.parseInt(area2.getText());
						resultado += num1;
						area2.setText(""+resultado);
				
					}
			
		}else//SUBTRAÇÃO
			if (digito.equals(" - ")){
		
				menos = true;
					if (a== 1){
						num1 = Integer.parseInt(area2.getText());
						resultado += num1;
						area2.setText(""+resultado);
						a =0; d = 1; z =1;
					
					}else
						if (a == 0 && z == 0)
						{
							num1 = Integer.parseInt(area2.getText());
							resultado =num1 - resultado;
							System.out.println (resultado);
							area2.setText(""+resultado);
							a = 1;
				
				}else
					if (z == 1)
					{
						num1 = Integer.parseInt(area2.getText());
						resultado = resultado - num1;
						area2.setText(""+resultado);
						a = 1;
						z = 0;
					}
		//MULTIPLICAÇÃO
		}else
			if (digito.equals(" * ")){
				
				num1 = Integer.parseInt(area2.getText());
				resultado =1;
				resultado = resultado * num1;
				a = 3;
				
			}else
				if (digito.equals("sqrt ")){
				
					num1 = Integer.parseInt(area2.getText());
					area.setText("");
					n1 = "";
					area2.setText(""+Math.sqrt(num1));
				}else
					if (digito.equals(" / ")){
					
						num1 = Integer.parseInt(area2.getText());
						resultado =1;
						resultado= num1/resultado;
						a = 4;
					
				}else
					if (digito.equals("reciproc")){
						num1 = Integer.parseInt(area2.getText());
						resultado = 1;
						resultado = resultado / num1;
						area.setText("");
						area2.setFont(new Font("Dialog", Font.BOLD, 19)); 
						area.setText("reciproc("+num1+")");
						area2.setText(""+resultado);
					}else
						if (digito.equals(",")){
							//Não consegui.
						}
		
}catch (NumberFormatException e){
	JOptionPane.showMessageDialog(null,"Desculpe, Informe um valor numérico e em seguida a operação desejada!","VALOR INVÁLIDO",JOptionPane.ERROR_MESSAGE);
	System.err.println (e.toString());
	area2.setText("");
	area.setText("");
	resultado = 0;
	
}
		
		
		
	}
	
		public double igual (){
			int n = Integer.parseInt(area2.getText());
		
			area.setText("");
			n1 = "";
			if (a == 1){
			 
			       resultado =resultado + n;
				
			 
			}else
				if (a == 0){
				
					resultado = resultado - n;

				}else
					if (a == 3){
					
					resultado = resultado * n;
					
					}else
						if (a == 4){
					
						resultado = resultado / n;
						
						}
			
			return resultado;
	}
}

	

