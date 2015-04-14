
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
 *         &lt;element name="ReportID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nStartPos" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nRecords" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ReportParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "reportID",
    "nStartPos",
    "nRecords",
    "reportParam"
})
@XmlRootElement(name = "GetSrvReportResult")
public class GetSrvReportResult {

    @XmlElement(name = "ReportID")
    protected String reportID;
    protected long nStartPos;
    protected long nRecords;
    @XmlElement(name = "ReportParam")
    protected String reportParam;

    /**
     * ��ȡreportID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportID() {
        return reportID;
    }

    /**
     * ����reportID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportID(String value) {
        this.reportID = value;
    }

    /**
     * ��ȡnStartPos���Ե�ֵ��
     * 
     */
    public long getNStartPos() {
        return nStartPos;
    }

    /**
     * ����nStartPos���Ե�ֵ��
     * 
     */
    public void setNStartPos(long value) {
        this.nStartPos = value;
    }

    /**
     * ��ȡnRecords���Ե�ֵ��
     * 
     */
    public long getNRecords() {
        return nRecords;
    }

    /**
     * ����nRecords���Ե�ֵ��
     * 
     */
    public void setNRecords(long value) {
        this.nRecords = value;
    }

    /**
     * ��ȡreportParam���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportParam() {
        return reportParam;
    }

    /**
     * ����reportParam���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportParam(String value) {
        this.reportParam = value;
    }

}
