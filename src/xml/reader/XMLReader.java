package xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import xml.model.Coche;

public class XMLReader {

	
	public List<Coche> cargarArchivoDatos(String path) throws SAXException, IOException{
		List<Coche>  coches = new ArrayList<>();
		File archivo = new File(path);
		if(archivo.exists()) {
			try {
				//Se crea la clase Document Builder Factory y en java 1.8 tengo que usar el .newInstance;
				
				DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
				DocumentBuilder builder= factory.newDocumentBuilder();
				Document documento= builder.parse(archivo);
				
				documento.getDocumentElement().normalize();
				
				NodeList listaNodos = documento.getElementsByTagName("coche");
				
				for(int i =0; i<listaNodos.getLength();i++) {
					Element elemento = (Element)listaNodos.item(i);
					System.out.println(elemento.getAttribute("id"));
					System.out.println(elemento.getElementsByTagName("marca").item(0).getTextContent());
					System.out.println(elemento.getElementsByTagName("modelo").item(0).getTextContent());
					System.out.println(elemento.getElementsByTagName("motor").item(0).getTextContent());
					
					((Element)elemento.getElementsByTagName("ruedas").item(0)).getElementsByTagName("rueda").item(3).getTextContent();
					System.out.println(((Element)elemento.getElementsByTagName("ruedas").item(0)).getElementsByTagName("rueda").item(3).getTextContent());
					
					int id = Integer.valueOf(elemento.getAttribute("id"));
					String marca= elemento.getElementsByTagName("marca").item(0).getTextContent();
					String modelo= elemento.getElementsByTagName("modelo").item(0).getTextContent();
					String motor= elemento.getElementsByTagName("motor").item(0).getTextContent();
					
					Coche coche = new Coche(id, modelo, marca, motor);
					
					coches.add(coche);
				}
				
				
				System.out.println(documento.getDocumentElement().getNodeName());
				
				
			}catch(ParserConfigurationException ex){ //se añaden excepciones las mas adecuadas son el parse el IO y el SAX
				ex.printStackTrace();
			}
			
			
		}
		
		
		return coches;
	}
		
}
