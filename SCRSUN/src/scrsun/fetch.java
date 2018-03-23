package scrsun;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toshiba pc
 */
class fetch extends JFrame implements ActionListener {
    
     JLabel l1,l2,l3,l4,l5,l6,l18;
	JButton btn1,btn2,btn3,btn4;
        JTextField t1,t2, t3,t4, t5;
         DefaultTableModel model, model_product;
         JTable tabl, tabl_product;
         firstmain f2;
        public static int xsize,ysize;
        char s;
	//db_conn db;
	JFrame f;
        String n=null;
	String y=null;
	String c=null;
	String t=null;
	String p=null;
        ImageIcon ic;
	fetch()
	{
             Toolkit tk=Toolkit.getDefaultToolkit();
      
             xsize=(int) tk.getScreenSize().getWidth();
        ysize =(int) tk.getScreenSize().getHeight();
       
		setLayout(null);
                setTitle("Search component");
		
		f = new JFrame("Component Retrieval");

		t1=new JTextField("");
		t1.setBounds(170,70,120,25);
		add(t1);
		
		
              
		
		btn1=new JButton("SEARCH");
		btn1.setBounds(100,105,90,25);
		add(btn1);
                btn2=new JButton("ADVANCED SEARCH");
		btn2.setBounds(600,105,160,25);
		add(btn2);
                btn3=new JButton("NEW SEARCH");
		btn3.setBounds(300,105,160,25);
		add(btn3);
                
		
		l1=new JLabel("Enter Keyword");
		l1.setBounds(40,70,120,30);
		add(l1);
		
		
                l3=new JLabel();
                l3.setBounds(0,135,800, 500);
		
		add(l3);
                
                Object colname[] = {"ID", "Name", "Model", "Type", "File Location"};
                  model = new DefaultTableModel(colname, 1);
                tabl = new JTable(model);
                   JScrollPane sp = new JScrollPane(tabl);

        sp.setBounds(120, 100, 500, 550);
       // tabl.setPreferredSize(new Dimension(1000, 500));
      
        
        tabl.getColumn(colname[0]).setPreferredWidth(50);
tabl.getColumn(colname[1]).setPreferredWidth(140);
tabl.getColumn(colname[2]).setPreferredWidth(140);
tabl.getColumn(colname[3]).setPreferredWidth(140);
tabl.getColumn(colname[4]).setPreferredWidth(300);

        
     
        l3.add(sp);
        btn4=new JButton("Home");
		btn4.setBounds(900,105,160,25);
		add(btn4);
        
         /////////////////////   table to show all products detail
        model_product = new DefaultTableModel(colname, 1);

        tabl_product = new JTable(model_product);
        JScrollPane sp1 = new JScrollPane(tabl_product);

        sp1.setBounds(1250, 100, 400, 550);
        l3.add(sp1);
        
          l18=new JLabel();
	l18.setBounds(810,50,600,140);
	add(l18);
              
                
                ic=new ImageIcon("pics/cbd2.jpg");
	l6=new JLabel(ic);
	l6.setBounds(550,0,800,800);
	add(l6);
               
		
		
		btn1.addActionListener(this);
                btn2.addActionListener(this);
                btn3.addActionListener(this);
              btn4.addActionListener(this);
               
		
		setVisible(true);
		setSize(xsize, ysize);

}

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btn1)		// TODO Auto-generated method stub
           {
        	 String a=t1.getText();
       		
       		
       		scrsun.db_conn db = new db_conn();
       		
       		Connection c1;
       		try {
       			c1 = db.db_Connections1();
       		java.sql.Statement stmt = c1.createStatement();
       		ResultSet rs = stmt.executeQuery("SELECT * FROM addcomp  WHERE compname like '%"+ a + "' or compid like  '%"+ a + "'  or compmodel like  '%"+ a + "'  or comptype like  '%"+ a + "'  "  );
       			//System.out.print("o");
       			while (rs.next()) {
       				 n = rs.getString("compname");
       				 y = rs.getString("compid");
                                 // int id = Integer.parseInt(y);
       				 c = rs.getString("compmodel");
       				 p = rs.getString("comptype"); 
                                  t = rs.getString("upload"); 
                                //  stmt.executeUpdate("Insert into secondcomp values('"+id+"','"+n+"','"+c+"','"+p+"','"+t+"')");  
       	model.addRow(new Object[]{y,n,c,p,t});
        t1.setText(a);
        
       
        
        /*  FileReader fr=new FileReader(t);  
        int i;  
        while((i=fr.read())!=-1)  
             s = (char)i;
           l18.setText(""+s);  
  
        fr.close();  */
        	   
           }
                     /*   else
                        {
                            JOptionPane.showMessageDialog(null,"No related component ");
                        }*/
                        
       			
       		}
				
       			catch (ClassNotFoundException e1) {
       				// TODO Auto-generated catch block
       				e1.printStackTrace();
       			} catch (Exception e1) {
       				// TODO Auto-generated catch block
       				e1.printStackTrace();
       			}

	}
        //String
       
       
         int rowCount;
rowCount = tabl.getRowCount();  
        System.err.println(rowCount);
        if(e.getSource()==btn1 && rowCount==1){
                                        JOptionPane.showMessageDialog(null,"No related component ");
                                        t1.setText("");

            System.err.println("hello");
            
            
        }
       else
       
        if(e.getSource()==btn2)
        {
            System.out.println("hello");
        
        // tablefetch obj=new tablefetch();
         String a=t1.getText();
       		
       		
       		scrsun.db_conn db = new db_conn();
       		
       		Connection c1;
       		try {
       			c1 = db.db_Connections1();
       		java.sql.Statement stmt = c1.createStatement();
       		ResultSet rs = stmt.executeQuery("SELECT * FROM secondcomp  WHERE name like '%"+ a + "%' or id like  '%"+ a + "%'  or model like  '%"+ a + "%'  or type like  '%"+ a + "%'  "  );
       			//System.out.print("o");
       			while (rs.next()) {
       				 n = rs.getString("name");
       				 y = rs.getString("id");
                                 int id = Integer.parseInt(y);
       				 c = rs.getString("model");
       				 p = rs.getString("type"); 
                                  t = rs.getString("upload"); 
                                  
                                 // stmt.executeUpdate("Insert into secondcomp values('"+id+"','"+n+"','"+c+"','"+p+"','"+t+"')");
                                 
       	model.addRow(new Object[]{y,n,c,p,t});
        t1.setText(a);
        
        
        /*  FileReader fr=new FileReader(t);  
        int i;  
        while((i=fr.read())!=-1)  
             s = (char)i;
           l18.setText(""+s);  
  
        fr.close();  */
        	   
           }
                        
       			
       		}
				
       			catch (ClassNotFoundException e1) {
       				// TODO Auto-generated catch block
       				e1.printStackTrace();
       			} catch (Exception e1) {
       				// TODO Auto-generated catch block
       				e1.printStackTrace();
       			}
        


        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }else
        if(e.getSource()==btn3)
        {
            fetch obj=new fetch();
            setVisible(false);
        }
        if(e.getSource()==btn4)
        {
            firstmain obj=new firstmain();
            setVisible(false);
        }
        
    
}}
