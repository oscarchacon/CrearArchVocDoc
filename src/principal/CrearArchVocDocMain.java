package principal;

import java.io.File;

public class CrearArchVocDocMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio del programa.");
		long totalTiempo;
        long tiempoInicio;
		
        tiempoInicio = System.currentTimeMillis();
        
        //String ruta = "/Users/marcusfenix/Dropbox/detector_icci/WebContent/utilidades/indice/IndiceVocDoc.txt"; //Ruta Mac
        //String ruta = "C:/Users/Oscar/Dropbox/detector_icci/WebContent/utilidades/indice/IndiceVocDoc.txt"; //Ruta Windows
        //String ruta = "C:/Users/oschacon/Dropbox/detector_icci/WebContent/utilidades/indice/IndiceVocDoc.txt"; //Ruta Windows Trabajo
        String ruta = "/home/marcusfenix/Escritorio/corpus/IndiceVocDocPS.txt"; //Ruta Linux
        
        File ArchivoIn = new File(ruta);
        if(ArchivoIn.exists() && ArchivoIn.isFile())
        {
        		Archivos arch = new Archivos();
        		arch.LeerArchivoEntrada(ArchivoIn);
        		//System.out.println("HOLA");
        }
        
        totalTiempo = System.currentTimeMillis() - tiempoInicio;
		
		System.out.println("Tiempo demorado: " + (float) totalTiempo/1000 + " Segundos.");
		
	}

}
