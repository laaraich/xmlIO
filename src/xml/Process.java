package xml;

import java.io.IOException;
import java.util.List;

import org.jdom2.JDOMException;

public class Process {
	private XMLReader<Etudiant> reader;
	private XMLWriter<Etudiant> writer;
	

	public Process(XMLReader<Etudiant> reader, XMLWriter<Etudiant> writer) {
		super();
		this.reader = reader;
		this.writer = writer;
	}


	void createEtudiants(List<Etudiant> etudiants) throws IOException {
		writer.open();
		writer.write(etudiants);
		writer.close();
	}


	public List<Etudiant> read() throws JDOMException, IOException {
		return reader.read();
	}

}
