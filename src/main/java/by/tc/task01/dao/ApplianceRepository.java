package by.tc.task01.dao;

import by.tc.task01.dao.parser.ApplianceXmlParser;
import by.tc.task01.entity.Appliance;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class ApplianceRepository {
	private static final ApplianceRepository instance = new ApplianceRepository();

	private List<Appliance> data;
	
	private ApplianceRepository() {
		ApplianceXmlParser parser = new ApplianceXmlParser();
		try {
			data = parser.parse();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Appliance> getData(){
		return data;
	}
	
	public static ApplianceRepository getInstance() {
		return instance;
	}
}
