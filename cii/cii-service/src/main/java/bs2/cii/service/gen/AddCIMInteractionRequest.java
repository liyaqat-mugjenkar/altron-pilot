//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.19 at 11:34:10 AM CAT 
//


package bs2.cii.service.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="InteractionRequest" type="{http://localhost/ci/interface}InteractionRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "interactionRequest"
})
@XmlRootElement(name = "addCIMInteractionRequest")
public class AddCIMInteractionRequest {

    @XmlElement(name = "InteractionRequest", required = true)
    protected InteractionRequest interactionRequest;

    /**
     * Gets the value of the interactionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionRequest }
     *     
     */
    public InteractionRequest getInteractionRequest() {
        return interactionRequest;
    }

    /**
     * Sets the value of the interactionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionRequest }
     *     
     */
    public void setInteractionRequest(InteractionRequest value) {
        this.interactionRequest = value;
    }

}
