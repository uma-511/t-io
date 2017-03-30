package org.tio.examples.helloworld.server;

import java.io.IOException;

import org.tio.examples.helloworld.common.HelloPacket;
import org.tio.server.AioServer;
import org.tio.server.ServerGroupContext;
import org.tio.server.intf.ServerAioHandler;
import org.tio.server.intf.ServerAioListener;

/**
 * 
 * @author tanyaowu 
 * @创建时间 2016年11月17日 下午5:59:24
 *
 * @操作列表
 *  编号	| 操作时间	| 操作人员	 | 操作说明
 *  (1) | 2016年11月17日 | tanyaowu | 新建类
 *
 */
public class HelloServerStarter
{
	static ServerGroupContext<Object, HelloPacket, Object> serverGroupContext = null;
	static AioServer<Object, HelloPacket, Object> aioServer = null; //可以为空
	static ServerAioHandler<Object, HelloPacket, Object> aioHandler = null;
	static ServerAioListener<Object, HelloPacket, Object> aioListener = null;
	static String serverIp = null;
	static int serverPort = org.tio.examples.helloworld.common.Const.PORT;

	public static void main(String[] args) throws IOException
	{
		aioHandler = new HelloServerAioHandler();
		aioListener = null; //可以为空
		serverGroupContext = new ServerGroupContext<>(aioHandler, aioListener);
		aioServer = new AioServer<>(serverGroupContext);
		aioServer.start(serverIp, serverPort);
	}
}