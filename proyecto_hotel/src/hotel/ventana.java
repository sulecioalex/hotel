package hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.*;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class ventana extends JFrame {
	
	private JPanel contentPane;
	static ArrayList<String> doc = new ArrayList<String>();
	 static ArrayList<String> doc1 = new ArrayList<String>();
	 static ArrayList<String> doc2 = new ArrayList<String>();
	 static ArrayList<String> doc3 = new ArrayList<String>();
	 static ArrayList hot=new ArrayList();
	 static ArrayList fac=new ArrayList();
	 static ArrayList pic=new ArrayList();
	 static ArrayList<String> ndpi=new ArrayList<String>();
	 
	/**
	 * Launch the application.
	 */
		public static void combertir3() {
			int estado=0;
			int cuarto=0;
			String l1="";
			
			for(int x=0;x<=551;x++){
			StringTokenizer st=new StringTokenizer(doc3.get(x));
		while (st.hasMoreTokens()){ // hacemos linea por linea linea 1
			l1=st.nextToken();	
			estado=Integer.parseInt(l1);
			pic.add(estado);
			}
		}
		
		}
	 
	 
	 
	 
	 public static void cargar (){
			try{
	        // Abrimos el archivo
	        FileInputStream fstream = new FileInputStream("C:\\Users\\alex\\Desktop\\hotel0.txt");
	        // Creamos el objeto de entrada
	        DataInputStream entrada = new DataInputStream(fstream);
	        // Creamos el Buffer de Lectura
	        BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
	        String strLinea;
	        // Leer el archivo linea por linea
	        
	        while ((strLinea = buffer.readLine()) != null)   {
	            // Imprimimos la línea por pantalla
	              doc.add(strLinea);
	        }
	        // Cerramos el archivo
	        entrada.close();
	    }catch (Exception e){ //Catch de excepciones
	        System.err.println("Ocurrio un error: " + e.getMessage());
	    }						
	}
	//nuevo
	
	public static void cargar1 (){
		try{
     // Abrimos el archivo
     FileInputStream fstream = new FileInputStream("C:\\Users\\alex\\Desktop\\nombre1.txt");
     // Creamos el objeto de entrada
     DataInputStream entrada = new DataInputStream(fstream);
     // Creamos el Buffer de Lectura
     BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
     String strLinea;
     // Leer el archivo linea por linea
     
     while ((strLinea = buffer.readLine()) != null)   {
         // Imprimimos la línea por pantalla
           doc1.add(strLinea);
     }
     // Cerramos el archivo
     entrada.close();
 }catch (Exception e){ //Catch de excepciones
     System.err.println("Ocurrio un error: " + e.getMessage());
 }						
}
	public static void combertir2() {
		int estado=0;
		int cuarto=0;
		String l1="";
		
		for(int x=0;x<=551;x++){
		StringTokenizer st=new StringTokenizer(doc2.get(x));
	while (st.hasMoreTokens()){ // hacemos linea por linea linea 1
		l1=st.nextToken();	
		estado=Integer.parseInt(l1);
		fac.add(estado);
		}
	}
	
	}
	
	///// tomar pocicion de cuarto y sumarle la factura
	

	
	
	public static void cargar2 (){
		try{
     // Abrimos el archivo
     FileInputStream fstream = new FileInputStream("C:\\Users\\alex\\Desktop\\factura.txt");
     // Creamos el objeto de entrada
     DataInputStream entrada = new DataInputStream(fstream);
     // Creamos el Buffer de Lectura
     BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
     String strLinea;
     // Leer el archivo linea por linea
     
     while ((strLinea = buffer.readLine()) != null)   {
         // Imprimimos la línea por pantalla
           doc2.add(strLinea);
     }
     // Cerramos el archivo
     entrada.close();
 }catch (Exception e){ //Catch de excepciones
     System.err.println("Ocurrio un error: " + e.getMessage());
 }						
}	
	
	public static void cargar3 (){
		try{
     // Abrimos el archivo
     FileInputStream fstream = new FileInputStream("C:\\Users\\alex\\Desktop\\picina.txt");
     // Creamos el objeto de entrada
     DataInputStream entrada = new DataInputStream(fstream);
     // Creamos el Buffer de Lectura
     BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
     String strLinea;
     // Leer el archivo linea por linea
     
     while ((strLinea = buffer.readLine()) != null)   {
         // Imprimimos la línea por pantalla
           doc3.add(strLinea);
     }
     // Cerramos el archivo
     entrada.close();
 }catch (Exception e){ //Catch de excepciones
     System.err.println("Ocurrio un error: " + e.getMessage());
 }						
}	
	
	
	
	///
	public static void combertir1() {
		int estado=0;
		int cuarto=0;
		String l1="";
		
		for(int x=0;x<=551;x++){
		StringTokenizer st=new StringTokenizer(doc1.get(x));
	while (st.hasMoreTokens()){ // hacemos linea por linea linea 1
		l1=st.nextToken();	
		ndpi.add(l1);
		
	}
	
	}
	
	}
	
	// cargamos el nuevo archivo	
	
	
	
	
	
	public static void guardar(){
		
		try
		{
		//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
		File archivo=new File("C:\\Users\\alex\\Desktop\\hotel0.txt");
		File nom=new File("C:\\Users\\alex\\Desktop\\nombre1.txt");
		File fact=new File("C:\\Users\\alex\\Desktop\\factura.txt");
		File picin=new File("C:\\Users\\alex\\Desktop\\picina.txt");
		//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
		FileWriter escribir=new FileWriter(archivo,false);
		FileWriter dp=new FileWriter(nom,false);
		FileWriter dr=new FileWriter(fact,false);
		FileWriter dw=new FileWriter(picin,false);

		for (int w=0;w<=1103;w++){
			escribir.write(" "+(int) hot.get(w)+" " +hot.get(w+1)+" " );
			escribir.write("\r\n");
			dp.write(" "+ ndpi.get(w)+" " +ndpi.get(w+1)+" " );
			dp.write("\r\n");
			w=w+1;
			//no guarda nombre y dpi
		}
		for (int e=0;e<=551;e++){
			dr.write(" "+ fac.get(e));
			dr.write("\r\n");
			dw.write(" "+ pic.get(e));
			dw.write("\r\n");
			
		}
			

		//Cerramos la conexion
		escribir.close();
		dp.close();
		dr.close();
		dw.close();
		}

		//Si existe un problema al escribir cae aqui
		catch(Exception e)
		{
		System.out.println("Error al escribir");
		}
		}
	
	
	
	public static void combertir() {
		int estado=0;
		int cuarto=0;
		String l1="";
		
		for(int x=0;x<=551;x++){
		StringTokenizer st=new StringTokenizer(doc.get(x));
	while (st.hasMoreTokens()){ // hacemos linea por linea linea 1
		l1=st.nextToken();	
		estado=Integer.parseInt(l1);
		if (cuarto==0){
			
		
		hot.add(estado);
		}
	}
	
	}
	
	}
	
	
	public static void estado(){
		int p,a,j,re;
		
		
		String b= JOptionPane.showInputDialog("Introduzca numero de habitacion","");
		a=Integer.parseInt(b);
		p=(a - 1)*2;
		j=p+1;
		re=(int) hot.get(j);
		if (re==1){
			

			JOptionPane.showMessageDialog(null,"Esta ocupada por "+ndpi.get(p)+"  no dpi  "+ ndpi.get(j) );
			//
			JOptionPane.showMessageDialog(null,"y lleva un monto a facturar de  "+ fac.get(a-1) );
			
		}
		else {
	
			JOptionPane.showMessageDialog(null,"Esta Habitacion esta vacia" );
		}
	} 
	public static void fac(){
		int p,a,j,re;
		
		
		String b= JOptionPane.showInputDialog("Introduzca numero de habitacion","");
		a=Integer.parseInt(b);
		j=a-1;
		re=(int) fac.get(j);
		String c= JOptionPane.showInputDialog("Ingrese el monto de la factura a cargar","");
		int d=Integer.parseInt(c);
			re=re+d;		
		fac.set(j, re);	
			JOptionPane.showMessageDialog(null,"Exito" );
			} 
	
	
	
	
	
	
	
	public static void salida(){
		int p,a,j,re;
		
		
		String b= JOptionPane.showInputDialog("Introduzca numero de habitacion","");
		a=Integer.parseInt(b);
		p=(a - 1)*2;
		j=p+1;
		re=(int) hot.get(j);
		if (re==1){
			

			hot.set(j, 0);
			ndpi.set(j, "------");
			ndpi.set(p, "------");
			pic.set(a-1, 0);
			
			
	
		}
		else {
	
			JOptionPane.showMessageDialog(null,"Esta Habitacion esta vacia" );
		}
	} 
	// error por uno al guardar modificar forma de buscar el cuarto
		public static void reservar(){
			int qe=0,le=0,se=0;
			int temp1=0;
			
			
			String b= JOptionPane.showInputDialog("Introduzca numero de habitacion","");
			qe=Integer.parseInt(b);
			
			
		
			le=(qe-1)*2;
			se=le+1;
			temp1=(int) hot.get(se);
			if (temp1==1){
				System.out.println("ocupado");
				// entrar a filas y colas
			}
			else {
				
				String nombre= JOptionPane.showInputDialog("Introduzca su nombre","");
				String dpi= JOptionPane.showInputDialog("Introduzca numero de dpi","");

				ndpi.set(le, nombre);
				ndpi.set(se, dpi);
				hot.set(se, 1);
			
				String pi= JOptionPane.showInputDialog("Uso a picina 1 si 0 No","");
				int poc=Integer.parseInt(pi);
				if (poc==1){
					int j;
					j=qe -1;
					pic.set(j, 1);	
				}
				if (qe <= 150){
					
					fac.set(qe-1, 150);
				}
				else{
					fac.set(qe-1, 250);
				}
				
			}
			
			guardar();
	}
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		
		cargar();
		cargar1();
		cargar2();
		cargar3();
		combertir();
		combertir1();
		combertir2();
		combertir3();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReservar = new JButton("reservar");
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reservar();
			}
		});
		btnReservar.setBounds(25, 111, 89, 23);
		contentPane.add(btnReservar);
		
		JButton btnEstado = new JButton("Estado");
		btnEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estado();
			}
		});
		btnEstado.setBounds(122, 206, 89, 23);
		contentPane.add(btnEstado);
		
		JButton btnSalid = new JButton("salida y facturacion");
		btnSalid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salida();
				guardar();
			}
		});
		btnSalid.setBounds(234, 206, 125, 23);
		contentPane.add(btnSalid);
		
		JButton btnNewButton = new JButton("Restaurante");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fac();
				guardar();
			}
		});
		btnNewButton.setBounds(304, 25, 101, 23);
		contentPane.add(btnNewButton);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(25, 25, 81, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(25, 77, 81, 20);
		contentPane.add(dateChooser_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alex\\Desktop\\hotel.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
		
	}
}
