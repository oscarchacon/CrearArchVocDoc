package principal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Archivos {
	
	public void LeerArchivoEntrada(File ArchivoIn)
	{
		String linea;
		try {
			//int i = 0;
			BufferedReader br = new BufferedReader(new FileReader(ArchivoIn));
			while((linea = br.readLine()) != null)
			{
				
				String[] arrLinea = linea.trim().split("\\s+");
				List<String> lista = Arrays.asList(arrLinea).subList(1, arrLinea.length);
				Collections.sort(lista);
				this.CrearArchivoIndiceDoc(arrLinea[0].trim(), lista);
				/*if(i >= 100)
				{
					break;
				}
				i++;*/
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CrearArchivoIndiceDoc(String NomDoc, List<String> vocdoc)
	{
		//String ruta = "/Users/marcusfenix/Documents/Corpus/corpus pan10/Vocabularios/VocDoc"+docId+".txt"; //RUTA MAC
		String ruta = "/home/marcusfenix/Escritorio/corpus/VocabulariosPS/VocDocPS"+NomDoc+".txt"; //RUTA LINUX
		//String ruta = "C:/Users/Oscar/corpus pan10/Vocabularios/VocDoc"+docId+".txt"; //RUTA Windows
		//String ruta = "C:/Users/oschacon/pan-plagiarism-corpus-2010/Vocabularios/VocDoc"+docId+".txt"; //RUTA Windows trabajo
		File ArchivoOut = new File(ruta);
		if(ArchivoOut.exists())
		{
			ArchivoOut.delete();
		}
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ArchivoOut)));
			//for(String term : vocdoc)
			for(int i = 0; i<vocdoc.size(); i++)
			{
				//bw.write(term.trim());
				bw.write(vocdoc.get(i).trim());
				if(i < vocdoc.size()-1)
				{
					bw.newLine();
				}
			}
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
