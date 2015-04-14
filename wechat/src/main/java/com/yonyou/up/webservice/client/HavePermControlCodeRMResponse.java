
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
 *         &lt;element name="HavePermControlCodeRMResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "havePermControlCodeRMResult"
})
@XmlRootElement(name = "HavePermControlCodeRMResponse")
public class HavePermControlCodeRMResponse {

    @XmlElement(name = "HavePermControlCodeRMResult")
    protected boolean havePermControlCodeRMResult;

    /**
     * ��ȡhavePermControlCodeRMResult���Ե�ֵ��
     * 
     */
    public boolean isHavePermControlCodeRMResult() {
        return havePermControlCodeRMResult;
    }

    /**
     * ����havePermControlCodeRMResult���Ե�ֵ��
     * 
     */
    public void setHavePermControlCodeRMResult(boolean value) {
        this.havePermControlCodeRMResult = value;
    }

}
