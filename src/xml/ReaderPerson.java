package xml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ReaderPerson implements XMLReader<Etudiant> {
	public ReaderPerson(String fileName) {
		super();
		this.fileName = fileName;
	}

	private Document doc;
	private String fileName;

	@Override
	public List<Etudiant> read() throws JDOMException, IOException {
		SAXBuilder builder = new SAXBuilder();
		doc = builder.build(new FileInputStream(fileName));
		Element root = doc.getRootElement();
		List<Element> childrens = root.getChildren();
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		for (Element currentElement : childrens) {
			etudiants.add(new Etudiant(currentElement.getChildText("name")));
		}
		return etudiants;
	}

	@Override
	public void open() {
		Element rootElement = new Element("personnes");
		doc = new Document(rootElement);
	}

	@Override
	public void close() {
		doc.clone();
	}

}
