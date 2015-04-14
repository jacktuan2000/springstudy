
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
 *         &lt;element name="BPOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VCName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "bpoName",
    "vcName",
    "isUser"
})
@XmlRootElement(name = "LoadQueryCondi")
public class LoadQueryCondi {

    @XmlElement(name = "BPOName")
    protected String bpoName;
    @XmlElement(name = "VCName")
    protected String vcName;
    @XmlElement(name = "IsUser")
    protected boolean isUser;

    /**
     * ��ȡbpoName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPOName() {
        return bpoName;
    }

    /**
     * ����bpoName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPOName(String value) {
        this.bpoName = value;
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
     * ��ȡisUser���Ե�ֵ��
     * 
     */
    public boolean isIsUser() {
        return isUser;
    }

    /**
     * ����isUser���Ե�ֵ��
     * 
     */
    public void setIsUser(boolean value) {
        this.isUser = value;
    }

}
