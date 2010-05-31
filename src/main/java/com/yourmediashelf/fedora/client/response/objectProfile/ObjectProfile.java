//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.31 at 08:02:00 AM CEST 
//


package com.yourmediashelf.fedora.client.response.objectProfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fedora.info/definitions/1/0/access/}objLabel"/>
 *         &lt;element ref="{http://www.fedora.info/definitions/1/0/access/}objOwnerId"/>
 *         &lt;element ref="{http://www.fedora.info/definitions/1/0/access/}objModels"/>
 *         &lt;element ref="{http://www.fedora.info/definitions/1/0/access/}objCreateDate"/>
 *         &lt;element ref="{http://www.fedora.info/definitions/1/0/access/}objLastModDate"/>
 *         &lt;element ref="{http://www.fedora.info/definitions/1/0/access/}objDissIndexViewURL"/>
 *         &lt;element ref="{http://www.fedora.info/definitions/1/0/access/}objItemIndexViewURL"/>
 *         &lt;element ref="{http://www.fedora.info/definitions/1/0/access/}objState"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pid" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objLabel",
    "objOwnerId",
    "objModels",
    "objCreateDate",
    "objLastModDate",
    "objDissIndexViewURL",
    "objItemIndexViewURL",
    "objState"
})
@XmlRootElement(name = "objectProfile")
public class ObjectProfile {

    @XmlElement(required = true)
    protected String objLabel;
    @XmlElement(required = true)
    protected String objOwnerId;
    @XmlElement(required = true)
    protected ObjModels objModels;
    @XmlElement(required = true)
    protected XMLGregorianCalendar objCreateDate;
    @XmlElement(required = true)
    protected XMLGregorianCalendar objLastModDate;
    @XmlElement(required = true)
    protected String objDissIndexViewURL;
    @XmlElement(required = true)
    protected String objItemIndexViewURL;
    @XmlElement(required = true)
    protected String objState;
    @XmlAttribute(required = true)
    protected String pid;

    /**
     * Gets the value of the objLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjLabel() {
        return objLabel;
    }

    /**
     * Sets the value of the objLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjLabel(String value) {
        this.objLabel = value;
    }

    /**
     * Gets the value of the objOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjOwnerId() {
        return objOwnerId;
    }

    /**
     * Sets the value of the objOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjOwnerId(String value) {
        this.objOwnerId = value;
    }

    /**
     * Gets the value of the objModels property.
     * 
     * @return
     *     possible object is
     *     {@link ObjModels }
     *     
     */
    public ObjModels getObjModels() {
        return objModels;
    }

    /**
     * Sets the value of the objModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjModels }
     *     
     */
    public void setObjModels(ObjModels value) {
        this.objModels = value;
    }

    /**
     * Gets the value of the objCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjCreateDate() {
        return objCreateDate;
    }

    /**
     * Sets the value of the objCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjCreateDate(XMLGregorianCalendar value) {
        this.objCreateDate = value;
    }

    /**
     * Gets the value of the objLastModDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjLastModDate() {
        return objLastModDate;
    }

    /**
     * Sets the value of the objLastModDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjLastModDate(XMLGregorianCalendar value) {
        this.objLastModDate = value;
    }

    /**
     * Gets the value of the objDissIndexViewURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjDissIndexViewURL() {
        return objDissIndexViewURL;
    }

    /**
     * Sets the value of the objDissIndexViewURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjDissIndexViewURL(String value) {
        this.objDissIndexViewURL = value;
    }

    /**
     * Gets the value of the objItemIndexViewURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjItemIndexViewURL() {
        return objItemIndexViewURL;
    }

    /**
     * Sets the value of the objItemIndexViewURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjItemIndexViewURL(String value) {
        this.objItemIndexViewURL = value;
    }

    /**
     * Gets the value of the objState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjState() {
        return objState;
    }

    /**
     * Sets the value of the objState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjState(String value) {
        this.objState = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

}