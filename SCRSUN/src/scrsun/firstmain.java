package scrsun;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class firstmain extends JFrame implements ActionListener{
JButton b1;
JButton b2,b3,b4;
JLabel l1,l2;
ImageIcon ic;
firstmain()
{
	setLayout(null);
	 l1=new JLabel("Developed by Monisha");
	l1.setBounds(1000,650,200,15);
	add(l1);
	
	
	ic=new ImageIcon("img/f-search.jpg");
	l2=new JLabel(ic);
	l2.setBounds(0,90,1350,700);
	add(l2);
	
	b2=new JButton("Software Component Retrieval using Neural");
	b2.setBounds(0,0,500,90);
	add(b2);
	
	b1=new JButton("Software component retrieval using Keyword");
	b1.setBounds(500,0,500,90);
	add(b1);
	
    b3=new JButton("About");
	b3.setBounds(1000,0,400,90);
	add(b3);
	
    b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	 Toolkit tk=Toolkit.getDefaultToolkit();
      int  xsize=(int) tk.getScreenSize().getWidth();
      int  ysize =(int) tk.getScreenSize().getHeight();	
      setVisible(true);
	setSize(xsize,ysize);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        firstmain obj=new firstmain();
	
        obj.setTitle("Software Component Retrieval System Using Neural Networks" );
        
       
   
	
                
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b2)
	{
		
		retrieval obj= new retrieval();
                 setVisible(false);
          	}
      
      else if(e.getSource()==b1){
    	  
    	  fetch obj=new fetch();
    	  setVisible(false);
    	  
      }
	else 
	{
	     about obj=new about();
              setVisible(false);
	}
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
