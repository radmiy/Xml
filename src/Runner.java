

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.ObjectFactory;
import generated.PricedItinerariesType;

public class Runner {
	private static final String PATH = "src/";
	private static final String DOWNLOAD_XML_FILE = "itineraries.xml";
	private static final String UPLOAD_XML_FILE = "marshal.xml";
	private static final String UPLOAD_TEST_XML_FILE = "test.xml";
	
	public static void main(String[] args) {
		ObjectFactory objectFactory = new ObjectFactory();
		PricedItinerariesType pricedItinerariesType = objectFactory.createPricedItinerariesType();
		System.out.println(pricedItinerariesType);
		objectToXML(pricedItinerariesType, UPLOAD_XML_FILE);
		pricedItinerariesType = xmlToObject();
		System.out.println(pricedItinerariesType);
		objectToXML(pricedItinerariesType, UPLOAD_TEST_XML_FILE);
	}
	
	private static void objectToXML(PricedItinerariesType pricedItinerariesType, String fileName) {
		
		try {
			JAXBContext jaxbContext = null;
			Marshaller jaxbMarshaller = null;
			jaxbContext = JAXBContext.newInstance(PricedItinerariesType.class);
			jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(pricedItinerariesType, sw);
			String xmlString = sw.toString();
			try(FileWriter writer = new FileWriter(PATH + fileName, false))
			{
				writer.write(xmlString);
				writer.flush();
			}
			catch(IOException ex){
				System.out.println(ex.getMessage());
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
	private static PricedItinerariesType xmlToObject() {
		PricedItinerariesType pricedItinerariesType = null;
		try {
			JAXBContext jaxbContext = null;
			Unmarshaller jaxbUnmarshaller = null;
			jaxbContext = JAXBContext.newInstance(PricedItinerariesType.class);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			pricedItinerariesType = (PricedItinerariesType)jaxbUnmarshaller.unmarshal(new File(PATH + DOWNLOAD_XML_FILE));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return pricedItinerariesType;
	}

}
