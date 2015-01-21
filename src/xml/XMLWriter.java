package xml;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public interface XMLWriter<O extends Serializable> {
	void open();

	void close();

	void write(List<O> persons) throws IOException;
}
