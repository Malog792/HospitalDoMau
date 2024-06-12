/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filaatendimento;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class NFrame extends JFrame{
 public JLabel label = new JLabel();
    public JPanel painel = new JPanel(); 
    
   

    
    TxtClass Scomum = new TxtClass("SenhasComum.txt");
    TxtClass Sprefe = new TxtClass("SenhasPrefe.txt");//instância arquivo texto
    TxtClass ScomumEm = new TxtClass("SenhasComumEm.txt");
    TxtClass SprefeEm = new TxtClass("SenhasPrefeEm.txt");
    
    
    
public NFrame(){ 
       //define cor
 
    
    
    Color cor = new Color(255,255,255);
   
    Container c = getContentPane();
    
    //localização de aparição
    setLocation(100,50);
    
    //Titulo da tela
    setTitle(" ");
    
    //Tamanho da tela
    setSize(500,500);
    
    //Quando "false" permite aba que repete titulo
    setUndecorated(true);
    
    c.setBackground (cor);
    
    //Cria a aba do título e o home de "minimizar, abrir e fechar" 
    getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    
    //Cor da borda
    getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
     
 

       

    setDefaultCloseOperation(EXIT_ON_CLOSE);



   }
   public static void main(String arg[]){
   new NFrame().show();
}
}

