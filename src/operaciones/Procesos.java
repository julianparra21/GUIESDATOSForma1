package operaciones;

import java.util.HashMap;

import javax.swing.*;

import GUI.VentanaOperacion;

public class Procesos {


	  int cantGanan=0, cantpierden=0, cantRecupera=0, cantPierden=0 ,cantEstudiantesValidados=0;
	    String Nota = "";
	    
	  HashMap<String, Double>notasEstudent= new HashMap<String,Double>();

	    public void PedirNotas(double n1, double n2, double n3, String nombre) {
	    		boolean valida=true;
	          
	                if (n1<0 || n1>5) {
	                    JOptionPane.showMessageDialog(null, "La nota 1 debe estar entre 0 y 5");
	                    valida=false;
	                }
	          
	               if (n2<0 || n2>5) {
	                   JOptionPane.showMessageDialog(null, "La nota 2 debe estar entre 0 y 5");
	                   valida=false;
	               }
	      	       
	               if (n3<0 || n3>5) {
	                   JOptionPane.showMessageDialog(null, "La nota 3 debe estar entre 0 y 5");
	                   valida=false;
	               }
	       

	            if(valida) {
	            	 double promedio = (n1+n2+n3)/3;
	 	            
	 	            
	 	            if (promedio>=3.5) {
	 	            Nota ="El estudiante "+nombre+" aprobo con un promedio de "+promedio;
	 	                cantGanan++;
	 	            }else{
	 	            Nota = "El estudiante "+nombre+" reprobo con un promedio de "+promedio;
	 	                cantpierden++;
	 	            }
	 	            if (promedio > 2.0 && promedio < 3.5) {
	 	                cantRecupera++;
	 	            }else if (promedio < 2.0) {
	 	                cantPierden++;
	 	            }
	 	            notasEstudent.put(nombre,promedio);
	 	            cantEstudiantesValidados++;
	 	            VentanaOperacion.Nota(Nota);
	            }
	           
	    }

	    public void Imprimir() {
	    	VentanaOperacion.Datos(cantEstudiantesValidados, cantGanan, cantpierden, cantPierden, cantRecupera);
	    }
    }


