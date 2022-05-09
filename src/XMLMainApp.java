import java.io.IOException;

import org.xml.sax.SAXException;

import xml.reader.XMLReader;

public class XMLMainApp {

	public static void main(String[] args) throws SAXException, IOException {
		XMLReader reader = new XMLReader();
		reader.cargarArchivoDatos("./archivos/coches.xml");
		
	}

}
