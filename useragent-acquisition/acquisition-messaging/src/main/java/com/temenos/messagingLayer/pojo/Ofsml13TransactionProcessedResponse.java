//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.20 at 02:21:10 PM IST 
//

package com.temenos.messagingLayer.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Denotes a processed transaction response, where the overall processing status is indicated
 * via the processingStatus attribute. Note that override conditions may exist on a 'processed' transaction, denoted by
 * the existance of override elements in the response.
 * 
 * 
 * <p>
 * Java class for ofsml13TransactionProcessedResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ofsml13TransactionProcessedResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.temenos.com/T24/OFSML/130}ofsml13TransactionResponse">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://www.temenos.com/T24/OFSML/130}ofsml13MVField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="override" type="{http://www.temenos.com/T24/OFSML/130}ofsml13OverrideField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auxField" type="{http://www.temenos.com/T24/OFSML/130}ofsml13MVField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auxOverride" type="{http://www.temenos.com/T24/OFSML/130}ofsml13OverrideField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="auxProcessingStatus" type="{http://www.temenos.com/T24/OFSML/130}ofsml13ProcessingStatus" />
 *       &lt;attribute name="processingStatus" use="required" type="{http://www.temenos.com/T24/OFSML/130}ofsml13ProcessingStatus" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofsml13TransactionProcessedResponse", propOrder = { "field", "override", "auxField", "auxOverride" })
public class Ofsml13TransactionProcessedResponse extends Ofsml13TransactionResponse {

	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected List<Ofsml13MVField> field;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected List<Ofsml13OverrideField> override;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected List<Ofsml13MVField> auxField;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected List<Ofsml13OverrideField> auxOverride;
	@XmlAttribute
	protected Ofsml13ProcessingStatus auxProcessingStatus;
	@XmlAttribute(required = true)
	protected Ofsml13ProcessingStatus processingStatus;

	/**
	 * Gets the value of the field property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the field property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getField().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Ofsml13MVField }
	 * 
	 * 
	 */
	public List<Ofsml13MVField> getField() {
		if (field == null) {
			field = new ArrayList<Ofsml13MVField>();
		}
		return this.field;
	}

	/**
	 * Gets the value of the override property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the override property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOverride().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Ofsml13OverrideField }
	 * 
	 * 
	 */
	public List<Ofsml13OverrideField> getOverride() {
		if (override == null) {
			override = new ArrayList<Ofsml13OverrideField>();
		}
		return this.override;
	}

	/**
	 * Gets the value of the auxField property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the auxField property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAuxField().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Ofsml13MVField }
	 * 
	 * 
	 */
	public List<Ofsml13MVField> getAuxField() {
		if (auxField == null) {
			auxField = new ArrayList<Ofsml13MVField>();
		}
		return this.auxField;
	}

	/**
	 * Gets the value of the auxOverride property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the auxOverride property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAuxOverride().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Ofsml13OverrideField }
	 * 
	 * 
	 */
	public List<Ofsml13OverrideField> getAuxOverride() {
		if (auxOverride == null) {
			auxOverride = new ArrayList<Ofsml13OverrideField>();
		}
		return this.auxOverride;
	}

	/**
	 * Gets the value of the auxProcessingStatus property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13ProcessingStatus }
	 * 
	 */
	public Ofsml13ProcessingStatus getAuxProcessingStatus() {
		return auxProcessingStatus;
	}

	/**
	 * Sets the value of the auxProcessingStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13ProcessingStatus }
	 * 
	 */
	public void setAuxProcessingStatus(Ofsml13ProcessingStatus value) {
		this.auxProcessingStatus = value;
	}

	/**
	 * Gets the value of the processingStatus property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13ProcessingStatus }
	 * 
	 */
	public Ofsml13ProcessingStatus getProcessingStatus() {
		return processingStatus;
	}

	/**
	 * Sets the value of the processingStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13ProcessingStatus }
	 * 
	 */
	public void setProcessingStatus(Ofsml13ProcessingStatus value) {
		this.processingStatus = value;
	}

}
