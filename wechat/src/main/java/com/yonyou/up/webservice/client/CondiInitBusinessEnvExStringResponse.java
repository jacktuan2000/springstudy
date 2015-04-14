
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
 *         &lt;element name="CondiInitBusinessEnvExStringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "condiInitBusinessEnvExStringResult"
})
@XmlRootElement(name = "CondiInitBusinessEnvExStringResponse")
public class CondiInitBusinessEnvExStringResponse {

    @XmlElement(name = "CondiInitBusinessEnvExStringResult")
    protected String condiInitBusinessEnvExStringResult;

    /**
     * ��ȡcondiInitBusinessEnvExStringResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondiInitBusinessEnvExStringResult() {
        return condiInitBusinessEnvExStringResult;
    }

    /**
     * ����condiInitBusinessEnvExStringResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondiInitBusinessEnvExStringResult(String value) {
        this.condiInitBusinessEnvExStringResult = value;
    }

}
