
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
 *         &lt;element name="GetSequenceNoResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "getSequenceNoResult"
})
@XmlRootElement(name = "GetSequenceNoResponse")
public class GetSequenceNoResponse {

    @XmlElement(name = "GetSequenceNoResult")
    protected long getSequenceNoResult;

    /**
     * ��ȡgetSequenceNoResult���Ե�ֵ��
     * 
     */
    public long getGetSequenceNoResult() {
        return getSequenceNoResult;
    }

    /**
     * ����getSequenceNoResult���Ե�ֵ��
     * 
     */
    public void setGetSequenceNoResult(long value) {
        this.getSequenceNoResult = value;
    }

}
