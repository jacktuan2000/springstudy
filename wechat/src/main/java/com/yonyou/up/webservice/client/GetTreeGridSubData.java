
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
 *         &lt;element name="parentFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentOID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SQLCondi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nStartPos" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nRecords" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "parentFieldName",
    "parentOID",
    "sqlCondi",
    "nStartPos",
    "nRecords"
})
@XmlRootElement(name = "getTreeGridSubData")
public class GetTreeGridSubData {

    @XmlElement(name = "BCName")
    protected String bcName;
    protected String parentFieldName;
    protected String parentOID;
    @XmlElement(name = "SQLCondi")
    protected String sqlCondi;
    protected long nStartPos;
    protected long nRecords;

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
     * ��ȡsqlCondi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQLCondi() {
        return sqlCondi;
    }

    /**
     * ����sqlCondi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQLCondi(String value) {
        this.sqlCondi = value;
    }

    /**
     * ��ȡnStartPos���Ե�ֵ��
     * 
     */
    public long getNStartPos() {
        return nStartPos;
    }

    /**
     * ����nStartPos���Ե�ֵ��
     * 
     */
    public void setNStartPos(long value) {
        this.nStartPos = value;
    }

    /**
     * ��ȡnRecords���Ե�ֵ��
     * 
     */
    public long getNRecords() {
        return nRecords;
    }

    /**
     * ����nRecords���Ե�ֵ��
     * 
     */
    public void setNRecords(long value) {
        this.nRecords = value;
    }

}
