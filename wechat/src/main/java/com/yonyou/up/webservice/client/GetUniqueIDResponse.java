
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
 *         &lt;element name="GetUniqueIDResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "getUniqueIDResult"
})
@XmlRootElement(name = "GetUniqueIDResponse")
public class GetUniqueIDResponse {

    @XmlElement(name = "GetUniqueIDResult")
    protected long getUniqueIDResult;

    /**
     * ��ȡgetUniqueIDResult���Ե�ֵ��
     * 
     */
    public long getGetUniqueIDResult() {
        return getUniqueIDResult;
    }

    /**
     * ����getUniqueIDResult���Ե�ֵ��
     * 
     */
    public void setGetUniqueIDResult(long value) {
        this.getUniqueIDResult = value;
    }

}
