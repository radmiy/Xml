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
 * <p>Java class for BookingClassAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingClassAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CabinDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingClassAvailabilityType")
public class BookingClassAvailabilityType {

    @XmlAttribute(name = "ResBookDesigCode")
    protected String resBookDesigCode = "";
    @XmlAttribute(name = "ResBookDesigQuantity")
    protected String resBookDesigQuantity = "";
    @XmlAttribute(name = "CabinCode")
    protected String cabinCode = "";
    @XmlAttribute(name = "CabinDescription")
    protected String cabinDescription = "";

    /**
     * Gets the value of the resBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * Sets the value of the resBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

    /**
     * Gets the value of the resBookDesigQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigQuantity() {
        return resBookDesigQuantity;
    }

    /**
     * Sets the value of the resBookDesigQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigQuantity(String value) {
        this.resBookDesigQuantity = value;
    }

    /**
     * Gets the value of the cabinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCode() {
        return cabinCode;
    }

    /**
     * Sets the value of the cabinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCode(String value) {
        this.cabinCode = value;
    }

    /**
     * Gets the value of the cabinDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinDescription() {
        return cabinDescription;
    }

    /**
     * Sets the value of the cabinDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinDescription(String value) {
        this.cabinDescription = value;
    }

}