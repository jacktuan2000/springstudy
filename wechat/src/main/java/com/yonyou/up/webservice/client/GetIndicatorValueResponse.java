
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
 *         &lt;element name="GetIndicatorValueResult" type="{http://tempuri.org/}ArrayOfDouble" minOccurs="0"/&gt;
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
    "getIndicatorValueResult"
})
@XmlRootElement(name = "GetIndicatorValueResponse")
public class GetIndicatorValueResponse {

    @XmlElement(name = "GetIndicatorValueResult")
    protected ArrayOfDouble getIndicatorValueResult;

    /**
     * ��ȡgetIndicatorValueResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDouble }
     *     
     */
    public ArrayOfDouble getGetIndicatorValueResult() {
        return getIndicatorValueResult;
    }

    /**
     * ����getIndicatorValueResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDouble }
     *     
     */
    public void setGetIndicatorValueResult(ArrayOfDouble value) {
        this.getIndicatorValueResult = value;
    }

}
