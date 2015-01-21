package xml;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.jdom2.JDOMException;

public class Main {
	public static void main(String[] args) {
		List<Etudiant> etudiants = Arrays.asList(new Etudiant("amine"),
				new Etudiant("el amine"), new Etudiant("adil"));
		XMLReader<Etudiant> reader = new ReaderPerson("output.xml");
		XMLWriter<Etudiant> writer = new WriterPerson("output.xml");
		Process process = new Process(reader, writer);
		try {
			System.out.println(process.read());;
		} catch (IOException | JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
