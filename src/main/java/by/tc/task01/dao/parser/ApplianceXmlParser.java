package by.tc.task01.dao.parser;

import by.tc.task01.entity.Appliance;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceXmlParser {

    private static final String XML_SOURCE_PATH = "src/main/resources/appliances_db.xml";

    public List<Appliance> parse() throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();
        XMLReader reader = parser.getXMLReader();
        ApplianceSaxHandler handler = new ApplianceSaxHandler();

        reader.setContentHandler(handler);
        reader.parse(new InputSource(XML_SOURCE_PATH));

        return ApplianceSaxHandler.getApplianceList();
    }
}
