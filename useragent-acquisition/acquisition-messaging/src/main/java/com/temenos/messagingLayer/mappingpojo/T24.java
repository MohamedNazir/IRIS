//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.29 at 07:48:51 PM IST 
//

package com.temenos.messagingLayer.mappingpojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for T24 element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="T24">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}application"/>
 *           &lt;element ref="{}version"/>
 *           &lt;element ref="{}operation"/>
 *           &lt;element ref="{}step" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "application", "version", "operation", "step" })
@XmlRootElement(name = "T24")
public class T24 {

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String application;
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String version;
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String operation;
	protected List<Step> step;

	/**
	 * Gets the value of the application property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * Sets the value of the application property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApplication(String value) {
		this.application = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

	/**
	 * Gets the value of the operation property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * Sets the value of the operation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperation(String value) {
		this.operation = value;
	}

	/**
	 * Gets the value of the step property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the step property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getStep().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Step }
	 * 
	 * 
	 */
	public List<Step> getStep() {
		if (step == null) {
			step = new ArrayList<Step>();
		}
		return this.step;
	}

}
