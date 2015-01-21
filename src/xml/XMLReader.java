package xml;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.jdom2.JDOMException;

public interface XMLReader<O extends Serializable> {
	void open();

	List<Etudiant> read() throws JDOMException, IOException;

	void close();
}
