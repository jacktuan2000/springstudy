
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
 *         &lt;element name="nStartPos" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nRecords" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fieldList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valueList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="condiIndentList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SQLCondi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SQLCondiType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SQLFix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nStartPos",
    "nRecords",
    "fieldList",
    "valueList",
    "condiIndentList",
    "sqlCondi",
    "sqlCondiType",
    "sqlFix"
})
@XmlRootElement(name = "getCondiActorDataBC")
public class GetCondiActorDataBC {

    @XmlElement(name = "BCName")
    protected String bcName;
    protected long nStartPos;
    protected long nRecords;
    protected String fieldList;
    protected String valueList;
    protected String condiIndentList;
    @XmlElement(name = "SQLCondi")
    protected String sqlCondi;
    @XmlElement(name = "SQLCondiType")
    protected int sqlCondiType;
    @XmlElement(name = "SQLFix")
    protected String sqlFix;

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

    /**
     * ��ȡfieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldList() {
        return fieldList;
    }

    /**
     * ����fieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldList(String value) {
        this.fieldList = value;
    }

    /**
     * ��ȡvalueList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueList() {
        return valueList;
    }

    /**
     * ����valueList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueList(String value) {
        this.valueList = value;
    }

    /**
     * ��ȡcondiIndentList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondiIndentList() {
        return condiIndentList;
    }

    /**
     * ����condiIndentList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondiIndentList(String value) {
        this.condiIndentList = value;
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
     * ��ȡsqlCondiType���Ե�ֵ��
     * 
     */
    public int getSQLCondiType() {
        return sqlCondiType;
    }

    /**
     * ����sqlCondiType���Ե�ֵ��
     * 
     */
    public void setSQLCondiType(int value) {
        this.sqlCondiType = value;
    }

    /**
     * ��ȡsqlFix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQLFix() {
        return sqlFix;
    }

    /**
     * ����sqlFix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQLFix(String value) {
        this.sqlFix = value;
    }

}
