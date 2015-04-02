package com.yonyou.up.util;

import java.nio.charset.CodingErrorAction;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.Consts;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.yonyou.up.domain.Equipment;

public class HttpClientPool4RestTemplate {
	private static Integer socketTimeout = 50;
	private static Integer connectTimeout = 6000;
	private static Integer connectionRequestTimeout = 50;
	
	private static CloseableHttpClient httpClient;
	private static PoolingHttpClientConnectionManager connManager = null;
	private static RequestConfig requestConfig;

	private static RestTemplate template;
	static {
		try {
			SSLContext sslContext = SSLContexts.custom().useTLS().build();
			sslContext.init(null, new TrustManager[] { new X509TrustManager() {

				public void checkClientTrusted(
						java.security.cert.X509Certificate[] arg0, String arg1)
						throws CertificateException {
				}

				public void checkServerTrusted(
						java.security.cert.X509Certificate[] arg0, String arg1)
						throws CertificateException {
				}

				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
			} }, null);
			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder
					.<ConnectionSocketFactory> create()
					.register("http", PlainConnectionSocketFactory.INSTANCE)
					.register("https",
							new SSLConnectionSocketFactory(sslContext)).build();
			connManager = new PoolingHttpClientConnectionManager(
					socketFactoryRegistry);
			SocketConfig socketConfig = SocketConfig.custom()
					.setTcpNoDelay(true).build();
			connManager.setDefaultSocketConfig(socketConfig);
			MessageConstraints messageConstraints = MessageConstraints.custom()
					.setMaxHeaderCount(200).setMaxLineLength(2000).build();
			ConnectionConfig connectionConfig = ConnectionConfig.custom()
					.setMalformedInputAction(CodingErrorAction.IGNORE)
					.setUnmappableInputAction(CodingErrorAction.IGNORE)
					.setCharset(Consts.UTF_8)
					.setMessageConstraints(messageConstraints).build();
			connManager.setDefaultConnectionConfig(connectionConfig);
			connManager.setMaxTotal(200);
			connManager.setDefaultMaxPerRoute(20);
			
	
			requestConfig = RequestConfig.custom()
					.setConnectionRequestTimeout(connectionRequestTimeout)
					.setConnectTimeout(connectTimeout)
					.setSocketTimeout(socketTimeout).build();
			
			httpClient = HttpClients.custom().setConnectionManager(connManager).setDefaultRequestConfig(requestConfig).build();
			
			
		} catch (KeyManagementException e) {

		} catch (NoSuchAlgorithmException e) {

		}
	}
	public HttpClientPool4RestTemplate()
	{
	
	}
	
	public static  RestTemplate  getRestTemplate()
	{
		  if (template==null)
		  {
		       HttpComponentsClientHttpRequestFactory httpFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
		       //创建resttemplate
		       template = new RestTemplate(httpFactory);
		       //设置message的处理种类
//		       List  messageConverters = new ArrayList();        
//		       messageConverters.add(new StringHttpMessageConverter());
//		       messageConverters.add(new ByteArrayHttpMessageConverter());
//		       messageConverters.add(new FormHttpMessageConverter());
//		       template.setMessageConverters(messageConverters);
		  }
	      return template;
	}
	public static void main(String[] args) 
	{
//		String ret=getRestTemplate().getForObject("http://172.20.8.155:8090/wechat/equipment/all.json", String.class);
//		System.out.print(ret);
	
		
		 HttpHeaders headers =new HttpHeaders();
	     headers.setContentType(MediaType.APPLICATION_JSON);
	     
	     Equipment equipment=new Equipment();
	     equipment.setName("li");
	     equipment.setType("牛仔");
	     HttpEntity request=new HttpEntity(equipment, headers);
	     Equipment re = getRestTemplate().postForObject("http://172.20.8.155:8090/wechat/equipment/save", request, Equipment.class);
	     System.out.print(re.getModifiedDate());
	}
}
