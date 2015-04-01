package com.yonyou.up.util;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Set;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;
//HttpClient工具类
public class HttpClientUtil {
	private static Integer socketTimeout = 50;
	private static Integer connectTimeout = 6000;
	private static Integer connectionRequestTimeout = 50;
	private static Charset encode = Consts.UTF_8;
	public static final String CONTENT_TYPE = "application/json";
	
	private static CloseableHttpClient client;
	private static PoolingHttpClientConnectionManager connManager = null;
	private static RequestConfig requestConfig;

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
			
			client = HttpClients.custom().setConnectionManager(connManager).build();
			requestConfig = RequestConfig.custom()
					.setConnectionRequestTimeout(connectionRequestTimeout)
					.setConnectTimeout(connectTimeout)
					.setSocketTimeout(socketTimeout).build();
			
		} catch (KeyManagementException e) {

		} catch (NoSuchAlgorithmException e) {

		}
	}

	public HttpClientUtil() {
		super();
		
	}
	// 处理get请求
	public static String get(String url) throws HttpException, IOException
	{
		return get(url,CONTENT_TYPE,encode.toString());
	}
	// 处理get请求
	public static String get(String url, String contentType) throws HttpException, IOException
	{
		return get(url,contentType,encode.toString());
	}
	
	// post
    public static String postUrl(String url,String body) throws HttpException, IOException {
        return post(url,body,CONTENT_TYPE,encode.toString());
    }
	
	// post
    public static String post(String url,String body) throws HttpException, IOException {
        return post(url,body,CONTENT_TYPE,encode.toString());
    }
	
	// post
    public static String post(String url,String body,String contentType) throws HttpException, IOException {
        return post(url,body,contentType,encode.toString());
    }
	
    // 使用post方式，发布对象转成的xml给Rest服务
    public static String postXml(String url, String xmlBody) throws HttpException, IOException {
        return post(url, xmlBody, "application/xml");
    }
    
    // 使用post方式，发布对象转成的Json给Rest服务
    public static String postJson(String url, String jsonBody) throws HttpException, IOException {
        return post(url, jsonBody, "application/json");
    }
    
 // 处理get请求
 	public static String get(String url, String contentType,final String encoding)
 			throws HttpException, IOException {
 		if (url == null)
 			return null;
 		HttpRequestBase request  = null;
 		String responseBody;
 		
 		if (url == null)
 			return null;
 		url = encodeURL(url.trim(), encoding);

 		try {

 			request = new HttpGet(url);
 			if (contentType != null) {
 				request.addHeader(HttpHeaders.CONTENT_TYPE, contentType);
 			}

 			request.setConfig(requestConfig);

 			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

 				public String handleResponse(final HttpResponse response)
 						throws ClientProtocolException, IOException {
 					int status = response.getStatusLine().getStatusCode();
 					if (status >= 200 && status < 300) {
 						HttpEntity entity = response.getEntity();
 						return entity != null ? EntityUtils.toString(entity,encoding)
 								: null;
 					} else {
 						throw new ClientProtocolException(
 								"Unexpected response status: " + status);
 					}
 				}

 			};

 			responseBody = client.execute(request, responseHandler);

 		} finally {
 			if (request != null)
 				request.releaseConnection();
 		}
 		return responseBody;
 	}
    
	// 处理post请求
	public static String post(String url, String body,
			String contentType,final String encoding) throws HttpException, IOException {

		if (url == null)
			return null;
		url = encodeURL(url.trim(), encoding);
		
		String responseBody = null;
		CloseableHttpResponse response = null;
		HttpPost httpPost =null;
		try {

		     httpPost = new HttpPost(url);
			//httpPost.setEntity(new UrlEncodedFormEntity(body, encode));
			httpPost.setEntity(new  StringEntity(body, encode));
			
			if (contentType != null) {
				httpPost.addHeader(HttpHeaders.CONTENT_TYPE, contentType);
			}

			httpPost.setConfig(requestConfig);

		    response = client.execute(httpPost);
          
			HttpEntity entity = response.getEntity();
			responseBody= entity != null ? EntityUtils.toString(entity,encoding)
					: null;

		} finally {
			response.close();
			if (httpPost != null)
				httpPost.releaseConnection();
		}
		return responseBody;
	}

	public static String encodeURL(String url, String encoding) {
		Set<Character> escaped = new HashSet<Character>();

		char[] signArray = { ' ', '\\', '‘', ']', '!', '^', '#', '`', '$', '{',
				'%', '|', '}', '(', '+', ')', '<', '>', ';', '[' };
		for (int i = 0; i < signArray.length; i++) {
			escaped.add(new Character(signArray[i]));
		}

		if (url == null)
			return null;
		if (encoding == null)
			return url;

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < url.length(); i++) {
			char c = url.charAt(i);
			if (c == 10) {
				continue;
			} else if (escaped.contains(new Character(c)) || c == 13 || c > 126) {
				try {
					sb.append(URLEncoder.encode(String.valueOf(c), encoding));
				} catch (Exception e) {
					sb.append(c);
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString().replaceAll("\\+", "%20");
	}

}
