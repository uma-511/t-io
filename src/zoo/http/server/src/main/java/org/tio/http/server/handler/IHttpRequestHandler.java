package org.tio.http.server.handler;

import org.tio.core.ChannelContext;
import org.tio.http.common.HttpPacket;
import org.tio.http.common.HttpSessionContext;
import org.tio.http.common.http.HttpRequestPacket;
import org.tio.http.common.http.HttpResponsePacket;
import org.tio.http.common.http.RequestLine;

/**
 * 
 * @author tanyaowu 
 *
 */
public interface IHttpRequestHandler
{
	/**
	 * 
	 * @param packet
	 * @param requestLine
	 * @param channelContext
	 * @return
	 * @throws Exception
	 * @author: tanyaowu
	 */
	public HttpResponsePacket handler(HttpRequestPacket packet, RequestLine requestLine, ChannelContext<HttpSessionContext, HttpPacket, Object> channelContext)  throws Exception;
}
