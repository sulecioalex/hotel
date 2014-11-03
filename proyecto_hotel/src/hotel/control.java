package hotel;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class control {
	 static ArrayList<String> doc = new ArrayList<String>();
	 static ArrayList<String> doc1 = new ArrayList<String>();
	 static ArrayList hot=new ArrayList();
	 static ArrayList<String> ndpi=new ArrayList<String>();
	 
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
		//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
		FileWriter escribir=new FileWriter(archivo,false);
		FileWriter dp=new FileWriter(nom,false);
		

		for (int w=0;w<=1103;w++){
			escribir.write(" "+(int) hot.get(w)+" " +hot.get(w+1)+" " );
			escribir.write("\r\n");
			dp.write(" "+ ndpi.get(w)+" " +ndpi.get(w+1)+" " );
			dp.write("\r\n");
			w=w+1;
			//no guarda nombre y dpi
		}
		

		//Cerramos la conexion
		escribir.close();
		dp.close();
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
		Scanner leer= new Scanner(System.in);
		System.out.println("ingrese el numero de habitacion");
		a=leer.nextInt();
		p=(a - 1)*2;
		j=p+1;
		re=(int) hot.get(j);
		if (re==1){
			System.out.println("ocupado por:");
			System.out.println("Nombre: "+ndpi.get(p));
			System.out.println("dpi no: "+ndpi.get(j));
			
		}
		else {
			System.out.println("Vacio");
		}
	} 
	// error por uno al guardar modificar forma de buscar el cuarto
		public static void reservar(){
			int qe=0,le=0,se=0;
			int temp1=0;
			String dpi="";
			String nombre="";
			System.out.println("Ingrese el numero de habitacion a reservar");
			Scanner cuar= new Scanner(System.in);
			qe=cuar.nextInt();
			le=(qe-1)*2;
			se=le+1;
			temp1=(int) hot.get(se);
			if (temp1==1){
				System.out.println("ocupado");
				// entrar a filas y colas
			}
			else {
				System.out.println("Vacio");
				System.out.println("ingrese su nombre");
				nombre=cuar.next();
				System.out.println("ingrese su dpi");
				dpi=cuar.next();
				ndpi.set(le, nombre);
				ndpi.set(se, dpi);
				hot.set(se, 1);
				System.out.println("su reservacion a sido exitosa");
			}
			
			
	}
	
	
	

}
