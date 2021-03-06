package org.tio.http.server.demo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.http.server.demo1.annotation.RequestPath;
import org.tio.websocket.common.WsPacket;
import org.tio.websocket.common.WsRequestPacket;
import org.tio.websocket.common.WsResponsePacket;
import org.tio.websocket.common.WsSessionContext;
import org.tio.websocket.server.WsServerConfig;

/**
 * @author tanyaowu 
 * 2017年6月29日 下午7:53:59
 */
@RequestPath(value = "/test")
public class TestController {
	private static Logger log = LoggerFactory.getLogger(TestController.class);

	/**
	 * 
	 * @author: tanyaowu
	 */
	public TestController() {
	}

	@RequestPath(value = "/json")
	public WsResponsePacket json(WsRequestPacket wsRequestPacket, WsServerConfig httpServerConfig, ChannelContext<WsSessionContext, WsPacket, Object> channelContext)
			throws Exception {
		
		return null;
	}


	/**
	 * @param args
	 * @author: tanyaowu
	 */
	public static void main(String[] args) {

	}
}
