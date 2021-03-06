//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 08:18:42 PM CAT 
//


package bs2.cii.service.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="topicCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interactionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionRequest", propOrder = {
    "msisdn",
    "callId",
    "accountId",
    "source",
    "topicCode",
    "comment",
    "interactionDate"
})
public class InteractionRequest {

    @XmlElement(required = true)
    protected String msisdn;
    protected int callId;
    @XmlElement(required = true)
    protected String accountId;
    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String topicCode;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected String interactionDate;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the callId property.
     * 
     */
    public int getCallId() {
        return callId;
    }

    /**
     * Sets the value of the callId property.
     * 
     */
    public void setCallId(int value) {
        this.callId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the topicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicCode() {
        return topicCode;
    }

    /**
     * Sets the value of the topicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicCode(String value) {
        this.topicCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the interactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionDate() {
        return interactionDate;
    }

    /**
     * Sets the value of the interactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionDate(String value) {
        this.interactionDate = value;
    }

}
