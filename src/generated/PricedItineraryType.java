//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.10 at 06:46:33 PM AST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricedItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{}AirItineraryType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NameValues" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PricedItineraryID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItineraryType", propOrder = {
    "airItinerary"
})
public class PricedItineraryType {

    @XmlElement(name = "AirItinerary", required = true)
    protected AirItineraryType airItinerary;
    @XmlAttribute(name = "NameValues")
    protected String nameValues = "";
    @XmlAttribute(name = "SequenceNumber")
    protected int sequenceNumber;
    @XmlAttribute(name = "OriginDestinationRPH")
    protected int originDestinationRPH;
    @XmlAttribute(name = "PricedItineraryID")
    protected String pricedItineraryID = "";

    /**
     * Gets the value of the airItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the nameValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameValues() {
        return nameValues;
    }

    /**
     * Sets the value of the nameValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameValues(String value) {
        this.nameValues = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the originDestinationRPH property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getOriginDestinationRPH() {
        return originDestinationRPH;
    }

    /**
     * Sets the value of the originDestinationRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setOriginDestinationRPH(int value) {
        this.originDestinationRPH = value;
    }

    /**
     * Gets the value of the pricedItineraryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricedItineraryID() {
        return pricedItineraryID;
    }

    /**
     * Sets the value of the pricedItineraryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricedItineraryID(String value) {
        this.pricedItineraryID = value;
    }

}
