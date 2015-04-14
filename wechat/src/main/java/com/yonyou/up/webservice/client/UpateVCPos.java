
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
 *         &lt;element name="strPane" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="n32PaneSR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strPrmVCName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "strPane",
    "n32PaneSR",
    "strPrmVCName",
    "pageID",
    "typeID"
})
@XmlRootElement(name = "UpateVCPos")
public class UpateVCPos {

    protected String strPane;
    protected int n32PaneSR;
    protected String strPrmVCName;
    @XmlElement(name = "PageID")
    protected String pageID;
    @XmlElement(name = "TypeID")
    protected String typeID;

    /**
     * ��ȡstrPane���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPane() {
        return strPane;
    }

    /**
     * ����strPane���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPane(String value) {
        this.strPane = value;
    }

    /**
     * ��ȡn32PaneSR���Ե�ֵ��
     * 
     */
    public int getN32PaneSR() {
        return n32PaneSR;
    }

    /**
     * ����n32PaneSR���Ե�ֵ��
     * 
     */
    public void setN32PaneSR(int value) {
        this.n32PaneSR = value;
    }

    /**
     * ��ȡstrPrmVCName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPrmVCName() {
        return strPrmVCName;
    }

    /**
     * ����strPrmVCName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPrmVCName(String value) {
        this.strPrmVCName = value;
    }

    /**
     * ��ȡpageID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageID() {
        return pageID;
    }

    /**
     * ����pageID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageID(String value) {
        this.pageID = value;
    }

    /**
     * ��ȡtypeID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * ����typeID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

}
