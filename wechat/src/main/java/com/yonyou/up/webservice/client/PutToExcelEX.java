
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
 *         &lt;element name="nBCName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldLists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nStartPos" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fieldList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valueList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="condiIndentList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SQLCondi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SQLCondiType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SQLFix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalResourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GridVCName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MergerFieldIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleTextLists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nbcName",
    "fieldLists",
    "nStartPos",
    "fieldList",
    "valueList",
    "condiIndentList",
    "sqlCondi",
    "sqlCondiType",
    "sqlFix",
    "localResourcePath",
    "gridVCName",
    "mergerFieldIndex",
    "titleTextLists"
})
@XmlRootElement(name = "PutToExcelEX")
public class PutToExcelEX {

    @XmlElement(name = "nBCName")
    protected String nbcName;
    @XmlElement(name = "FieldLists")
    protected String fieldLists;
    protected long nStartPos;
    protected String fieldList;
    protected String valueList;
    protected String condiIndentList;
    @XmlElement(name = "SQLCondi")
    protected String sqlCondi;
    @XmlElement(name = "SQLCondiType")
    protected int sqlCondiType;
    @XmlElement(name = "SQLFix")
    protected String sqlFix;
    @XmlElement(name = "LocalResourcePath")
    protected String localResourcePath;
    @XmlElement(name = "GridVCName")
    protected String gridVCName;
    @XmlElement(name = "MergerFieldIndex")
    protected String mergerFieldIndex;
    @XmlElement(name = "TitleTextLists")
    protected String titleTextLists;

    /**
     * ��ȡnbcName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBCName() {
        return nbcName;
    }

    /**
     * ����nbcName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBCName(String value) {
        this.nbcName = value;
    }

    /**
     * ��ȡfieldLists���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldLists() {
        return fieldLists;
    }

    /**
     * ����fieldLists���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldLists(String value) {
        this.fieldLists = value;
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

    /**
     * ��ȡlocalResourcePath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalResourcePath() {
        return localResourcePath;
    }

    /**
     * ����localResourcePath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalResourcePath(String value) {
        this.localResourcePath = value;
    }

    /**
     * ��ȡgridVCName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridVCName() {
        return gridVCName;
    }

    /**
     * ����gridVCName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridVCName(String value) {
        this.gridVCName = value;
    }

    /**
     * ��ȡmergerFieldIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergerFieldIndex() {
        return mergerFieldIndex;
    }

    /**
     * ����mergerFieldIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergerFieldIndex(String value) {
        this.mergerFieldIndex = value;
    }

    /**
     * ��ȡtitleTextLists���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleTextLists() {
        return titleTextLists;
    }

    /**
     * ����titleTextLists���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleTextLists(String value) {
        this.titleTextLists = value;
    }

}
