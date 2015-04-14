
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
 *         &lt;element name="buildTreeSubNodesWithChildResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "buildTreeSubNodesWithChildResult"
})
@XmlRootElement(name = "buildTreeSubNodesWithChildResponse")
public class BuildTreeSubNodesWithChildResponse {

    protected String buildTreeSubNodesWithChildResult;

    /**
     * ��ȡbuildTreeSubNodesWithChildResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildTreeSubNodesWithChildResult() {
        return buildTreeSubNodesWithChildResult;
    }

    /**
     * ����buildTreeSubNodesWithChildResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildTreeSubNodesWithChildResult(String value) {
        this.buildTreeSubNodesWithChildResult = value;
    }

}
