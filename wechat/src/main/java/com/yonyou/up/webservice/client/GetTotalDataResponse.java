
package com.yonyou.up.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getTotalDataResult" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "getTotalDataResult"
})
@XmlRootElement(name = "getTotalDataResponse")
public class GetTotalDataResponse {

    protected double getTotalDataResult;

    /**
     * ��ȡgetTotalDataResult���Ե�ֵ��
     * 
     */
    public double getGetTotalDataResult() {
        return getTotalDataResult;
    }

    /**
     * ����getTotalDataResult���Ե�ֵ��
     * 
     */
    public void setGetTotalDataResult(double value) {
        this.getTotalDataResult = value;
    }

}
