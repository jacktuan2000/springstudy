
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
 *         &lt;element name="getCondiBusinessAllData_NewResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getCondiBusinessAllDataNewResult"
})
@XmlRootElement(name = "getCondiBusinessAllData_NewResponse")
public class GetCondiBusinessAllDataNewResponse {

    @XmlElement(name = "getCondiBusinessAllData_NewResult")
    protected String getCondiBusinessAllDataNewResult;

    /**
     * ��ȡgetCondiBusinessAllDataNewResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCondiBusinessAllDataNewResult() {
        return getCondiBusinessAllDataNewResult;
    }

    /**
     * ����getCondiBusinessAllDataNewResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCondiBusinessAllDataNewResult(String value) {
        this.getCondiBusinessAllDataNewResult = value;
    }

}
