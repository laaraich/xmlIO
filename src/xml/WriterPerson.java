package xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class WriterPerson implements XMLWriter<Etudiant> {
	public WriterPerson(String fileName) {
		super();
		this.fileName = fileName;
	}

	private Document doc;
	private String fileName;

	@Override
	public void open() {
		Element rootElement = new Element("personnes");
		doc = new Document(rootElement);
	}

	@Override
	public void close() {
		doc.clone();
	}

	@Override
	public void write(List<Etudiant> persons) throws IOException {
		XMLOutputter xml = new XMLOutputter();
		OutputStream out = new FileOutputStream(new File(fileName));
		List<Content> c = new ArrayList<Content>();
		for (Etudiant etudiant : persons) {
			c.add(new Element("etudiant").addContent(new Element("name")
					.addContent(etudiant.getNom())));
		}
		doc.getRootElement().addContent(c);
		xml.output(doc, out);

	}

}
