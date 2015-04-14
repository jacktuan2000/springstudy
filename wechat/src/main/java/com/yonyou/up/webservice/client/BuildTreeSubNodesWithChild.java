
package com.yonyou.up.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BCName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VCName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentOID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaptionField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bcName",
    "vcName",
    "parentFieldName",
    "parentOID",
    "captionField"
})
@XmlRootElement(name = "buildTreeSubNodesWithChild")
public class BuildTreeSubNodesWithChild {

    @XmlElement(name = "BCName")
    protected String bcName;
    @XmlElement(name = "VCName")
    protected String vcName;
    protected String parentFieldName;
    protected String parentOID;
    @XmlElement(name = "CaptionField")
    protected String captionField;

    /**
     * ��ȡbcName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCName() {
        return bcName;
    }

    /**
     * ����bcName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCName(String value) {
        this.bcName = value;
    }

    /**
     * ��ȡvcName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCName() {
        return vcName;
    }

    /**
     * ����vcName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCName(String value) {
        this.vcName = value;
    }

    /**
     * ��ȡparentFieldName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFieldName() {
        return parentFieldName;
    }

    /**
     * ����parentFieldName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFieldName(String value) {
        this.parentFieldName = value;
    }

    /**
     * ��ȡparentOID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOID() {
        return parentOID;
    }

    /**
     * ����parentOID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOID(String value) {
        this.parentOID = value;
    }

    /**
     * ��ȡcaptionField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionField() {
        return captionField;
    }

    /**
     * ����captionField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionField(String value) {
        this.captionField = value;
    }

}
