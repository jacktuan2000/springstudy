
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
 *         &lt;element name="OID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubBC_SQLCondi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "oid",
    "recordXml",
    "subBCSQLCondi"
})
@XmlRootElement(name = "loadChildDataEx")
public class LoadChildDataEx {

    @XmlElement(name = "BCName")
    protected String bcName;
    @XmlElement(name = "OID")
    protected String oid;
    protected String recordXml;
    @XmlElement(name = "SubBC_SQLCondi")
    protected String subBCSQLCondi;

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
     * ��ȡoid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * ����oid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * ��ȡrecordXml���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordXml() {
        return recordXml;
    }

    /**
     * ����recordXml���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordXml(String value) {
        this.recordXml = value;
    }

    /**
     * ��ȡsubBCSQLCondi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBCSQLCondi() {
        return subBCSQLCondi;
    }

    /**
     * ����subBCSQLCondi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBCSQLCondi(String value) {
        this.subBCSQLCondi = value;
    }

}
