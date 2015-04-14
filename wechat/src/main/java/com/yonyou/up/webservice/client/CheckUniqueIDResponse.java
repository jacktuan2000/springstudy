
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
 *         &lt;element name="CheckUniqueIDResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "checkUniqueIDResult"
})
@XmlRootElement(name = "CheckUniqueIDResponse")
public class CheckUniqueIDResponse {

    @XmlElement(name = "CheckUniqueIDResult")
    protected long checkUniqueIDResult;

    /**
     * ��ȡcheckUniqueIDResult���Ե�ֵ��
     * 
     */
    public long getCheckUniqueIDResult() {
        return checkUniqueIDResult;
    }

    /**
     * ����checkUniqueIDResult���Ե�ֵ��
     * 
     */
    public void setCheckUniqueIDResult(long value) {
        this.checkUniqueIDResult = value;
    }

}
