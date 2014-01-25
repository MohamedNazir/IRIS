//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.20 at 02:21:10 PM IST 
//

package com.temenos.messagingLayer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * In the event of a technical failure to process a service request, error details are returned (in place of the
 * corresponding transaction,
 * enquiry or routine response). The failure details are structured in a SOAP 'fault' style. Note that errors due to
 * actual processing errors
 * are returned in the body of an ofsmlServiceResponse, faults are used only to denote failures to process a request
 * (technical failures).
 * The recoverable attribute is used as a flag to indicate if the body of the original request (the ofsmlServiceRequest
 * content) is re-submittable
 * without amendment.
 * 
 * 
 * <p>
 * Java class for ofsml13Fault complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ofsml13Fault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.temenos.com/T24/OFSML/130}ofsml13FaultGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="recoverable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofsml13Fault", propOrder = { "ofsFaultCode", "ofsFaultMessage", "ofsFaultContext", "ofsFaultDetails" })
public class Ofsml13Fault {

	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected Ofsml13FaultCode ofsFaultCode;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130", nillable = true)
	protected Ofsml13FaultMessage ofsFaultMessage;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected String ofsFaultContext;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected Ofsml13FaultDetails ofsFaultDetails;
	@XmlAttribute(required = true)
	protected boolean recoverable;

	/**
	 * Gets the value of the ofsFaultCode property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13FaultCode }
	 * 
	 */
	public Ofsml13FaultCode getOfsFaultCode() {
		return ofsFaultCode;
	}

	/**
	 * Sets the value of the ofsFaultCode property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13FaultCode }
	 * 
	 */
	public void setOfsFaultCode(Ofsml13FaultCode value) {
		this.ofsFaultCode = value;
	}

	/**
	 * Gets the value of the ofsFaultMessage property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13FaultMessage }
	 * 
	 */
	public Ofsml13FaultMessage getOfsFaultMessage() {
		return ofsFaultMessage;
	}

	/**
	 * Sets the value of the ofsFaultMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13FaultMessage }
	 * 
	 */
	public void setOfsFaultMessage(Ofsml13FaultMessage value) {
		this.ofsFaultMessage = value;
	}

	/**
	 * Gets the value of the ofsFaultContext property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getOfsFaultContext() {
		return ofsFaultContext;
	}

	/**
	 * Sets the value of the ofsFaultContext property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOfsFaultContext(String value) {
		this.ofsFaultContext = value;
	}

	/**
	 * Gets the value of the ofsFaultDetails property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13FaultDetails }
	 * 
	 */
	public Ofsml13FaultDetails getOfsFaultDetails() {
		return ofsFaultDetails;
	}

	/**
	 * Sets the value of the ofsFaultDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13FaultDetails }
	 * 
	 */
	public void setOfsFaultDetails(Ofsml13FaultDetails value) {
		this.ofsFaultDetails = value;
	}

	/**
	 * Gets the value of the recoverable property.
	 * 
	 */
	public boolean isRecoverable() {
		return recoverable;
	}

	/**
	 * Sets the value of the recoverable property.
	 * 
	 */
	public void setRecoverable(boolean value) {
		this.recoverable = value;
	}

}
