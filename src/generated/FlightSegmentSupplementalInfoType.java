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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightSegmentSupplementalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentSupplementalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DepartureTimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ArrivalTimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DifferentDayOfArrival" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DayChangeIndDeparture" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DayChangeIndArrival" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentSupplementalInfoType")
public class FlightSegmentSupplementalInfoType {

    @XmlAttribute(name = "DepartureTimeZoneOffset")
    protected String departureTimeZoneOffset = "";
    @XmlAttribute(name = "ArrivalTimeZoneOffset")
    protected String arrivalTimeZoneOffset = "";
    @XmlAttribute(name = "DifferentDayOfArrival")
    protected int differentDayOfArrival;
    @XmlAttribute(name = "DayChangeIndDeparture")
    protected int dayChangeIndDeparture;
    @XmlAttribute(name = "DayChangeIndArrival")
    protected int dayChangeIndArrival;

    /**
     * Gets the value of the departureTimeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTimeZoneOffset() {
        return departureTimeZoneOffset;
    }

    /**
     * Sets the value of the departureTimeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTimeZoneOffset(String value) {
        this.departureTimeZoneOffset = value;
    }

    /**
     * Gets the value of the arrivalTimeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTimeZoneOffset() {
        return arrivalTimeZoneOffset;
    }

    /**
     * Sets the value of the arrivalTimeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTimeZoneOffset(String value) {
        this.arrivalTimeZoneOffset = value;
    }

    /**
     * Gets the value of the differentDayOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getDifferentDayOfArrival() {
        return differentDayOfArrival;
    }

    /**
     * Sets the value of the differentDayOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setDifferentDayOfArrival(int value) {
        this.differentDayOfArrival = value;
    }

    /**
     * Gets the value of the dayChangeIndDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getDayChangeIndDeparture() {
        return dayChangeIndDeparture;
    }

    /**
     * Sets the value of the dayChangeIndDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setDayChangeIndDeparture(int value) {
        this.dayChangeIndDeparture = value;
    }

    /**
     * Gets the value of the dayChangeIndArrival property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getDayChangeIndArrival() {
        return dayChangeIndArrival;
    }

    /**
     * Sets the value of the dayChangeIndArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setDayChangeIndArrival(int value) {
        this.dayChangeIndArrival = value;
    }

}
