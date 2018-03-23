package scrsun;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


 
class about extends JFrame implements ActionListener {
    JTextArea t,t1,t2,t3;
    JFrame f;
    JPanel p;
    ImageIcon ic;
    JLabel l1,l2;
    JButton b1,b2,b3;
   //  Projectcbd f2;
   about()
    {
        
        setLayout(null);
        f=new JFrame("About");
        
        
     setLayout(null);
   	 l1=new JLabel("Developed by Monisha");
   	 l1.setBounds(1000,650,200,15);
   	 add(l1);
   		
       
                 b1=new JButton("Structural   Conformation");
                 b1.setBounds(0,0,450,90);
                 add(b1);
                 
                 b2=new JButton("About   SCRSUN");
                 b2.setBounds(450,0,450,90);
                 add(b2);
                 
                 b3=new JButton("Home");
                 b3.setBounds(900,0,450,90);
                 add(b3);
                
                ic=new ImageIcon("img/about_us1.png");
             	l2=new JLabel(ic);
             	l2.setBounds(90,0,1200,600);
             	add(l2);
        
               
               
                  Toolkit tk=Toolkit.getDefaultToolkit();
      int  xsize=(int) tk.getScreenSize().getWidth();
      int  ysize =(int) tk.getScreenSize().getHeight();
       
   
                
        setVisible(true);
		setSize(xsize,ysize);
                  setTitle("About" );
                  b1.addActionListener(this);
                  b2.addActionListener(this);
                  b3.addActionListener(this);
                  
               
                
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            JOptionPane.showMessageDialog(null, "Processor: Intel ® Pentium® CPU B950 @ 2.10 GHz 2.10GHz \n" + " Installed Memory as RAM: 4 GB \n" + "System Type: 64-bit Operating System, x64-based processor\n"+"Software Implements: Netbeans IDE 8.1, xamp \n"+"Internet Velocity: 50MBps\n","Structure Conformation ", JOptionPane.INFORMATION_MESSAGE);

            about obj=new about();
            setVisible(false);
        }
        
        else if(e.getSource()==b2)
        {
        	JOptionPane.showMessageDialog(null, "The     software     component     retrieval     has     been     very\n"+"important     and     challenging    in    the    area    of    component  \n"+"based    software    engineering    and    software     engineering.\n "+"In this work concept of retrieval of components from repository \n" + " and   reusability   of   the   components   has   been   implemented.  \n" +"The tool in this work is named  as  Software Component Retrieval \n"+"System  Using  Neural  Networks  (SCRSUN)  has been  developed \n" +"that   is   used   for   the   process   of   retrieval   of   the   software \n" + "component  with  the help  of  keyword  based  search  technique  \n" + " and neural network algorithm. ", "About implementation", JOptionPane.INFORMATION_MESSAGE);
            about obj=new about();
            setVisible(false);
            
        }
        
        else
        {
        	firstmain obj=new firstmain();
        	  setVisible(false);
        }
    }
    
  
}  
    
    
    

