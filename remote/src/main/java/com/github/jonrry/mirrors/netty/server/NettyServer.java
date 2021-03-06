package com.github.jonrry.mirrors.netty.server;


import com.github.jonrry.mirrors.netty.NettyThreadFactory;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * Netty Server
 */
public class NettyServer {
//    private static final Logger LOGGER = LoggerInit.LOGGER_REMOTING;
//

    private final EventLoopGroup eventLoopGroup = new NioEventLoopGroup(0,new NettyThreadFactory());



    //TODO 需要考虑nettyServer是否会被多次初始化
    public void statrtNettyServer(int listenPort){

        ServerBootstrap serverBootstrap = new ServerBootstrap();

        serverBootstrap.group(eventLoopGroup);
//                        .childOption();

    }


//    private final EventLoopGroup bossGroup = new NioEventLoopGroup(0, new NamedThreadFactory(
//            HSFThreadNameSpace.HSF_NETTY_BOSS));
//    private final EventLoopGroup workerGroup = NettySharedHolder.workerGroup;
//
//    private final NettyServerHandler serverHandler = new NettyServerHandler();
//    private final RpcRequestProcessor rpcProcessor;
//
//    private final AtomicBoolean startFlag = new AtomicBoolean(false);
//    private final AtomicBoolean startHttpFlag = new AtomicBoolean(false);
//    private final String bindHost;
//
//    public NettyServer(final RpcRequestProcessor rpcProcessor, final String bindHost) {
//        this.rpcProcessor = rpcProcessor;
//        ProtocolFactory.instance.initServerSide(rpcProcessor);
//        this.bindHost = bindHost;
//
//        NettySharedHolder.timer.newTimeout(new ScanAllClientRunnerServerSide(serverHandler), 59, TimeUnit.SECONDS);
//    }
//
//    public void start(int listenPort) throws Exception {
//        if (!startFlag.compareAndSet(false, true)) {
//            return;
//        }
//        ServerBootstrap bootstrap = new ServerBootstrap();
//        // 可配置的几个
//        bootstrap.group(bossGroup, workerGroup)//
//                .channel(NioServerSocketChannel.class)//
//                // .option(ChannelOption.SO_BACKLOG,
//                // SystemPropertyUtil.getInt("hsf.backlog", 100000))//
//                .option(ChannelOption.ALLOCATOR, NettySharedHolder.byteBufAllocator)//
//                .childOption(ChannelOption.ALLOCATOR, NettySharedHolder.byteBufAllocator)//
//                .childOption(ChannelOption.TCP_NODELAY, true)//
//                .childOption(ChannelOption.SO_REUSEADDR, true)
//                // .childOption(ChannelOption.SO_KEEPALIVE, true)//
//                .childHandler(new ChannelInitializer<SocketChannel>() {
//                    @Override
//                    public void initChannel(SocketChannel ch) throws Exception {
//                        ch.pipeline().addLast("decoder", new NettyProtocolDecoder())//
//                                .addLast("encoder", new NettyProtocolEncoder())//
//                                .addLast("handler", serverHandler);
//                    }
//                });
//
//        long tryBind = 3;
//        while (tryBind > 0) {
//            ChannelFuture cf = bootstrap.bind(new InetSocketAddress(bindHost, listenPort));
//            cf.await();
//            if (cf.isSuccess()) {
//                LOGGER.warn("Server started,listen at: " + listenPort);
//                return;
//            } else {
//                tryBind--;
//                if (tryBind <= 0) {
//                    LOGGER.warn("After 3 failed attempts to start server at port : " + listenPort
//                            + ", we are shutting down the vm");
//                    System.exit(1);
//                } else {
//                    LOGGER.warn("Failed to start server at port : " + listenPort + ", Sleep 3s and try again",
//                            cf.cause());
//                    Thread.sleep(3000);
//                }
//            }
//        }
//    }
//
//    public List<Channel> listChannels() {
//        return serverHandler.getChannels();
//    }
//
//    public void stop() throws Exception {
//        LOGGER.warn("Server stop!");
//        this.startFlag.set(false);
//        this.bossGroup.shutdownGracefully();
//        this.workerGroup.shutdownGracefully();
//    }
//
//    @Override
//    public void signalClosingServer() {
//        RpcResponse msg = new RpcResponse(-1, Codecs.HESSIAN2_CODEC, new byte[1]);
//        msg.setStatus(ResponseStatus.SERVER_CLOSING);
//        for (Channel channel : serverHandler.getChannels()) {
//            channel.writeAndFlush(msg);
//        }
//    }
//
//    @Override
//    public void startHttp(int listenPort) throws Exception {
//        if (!startHttpFlag.compareAndSet(false, true)) {
//            return;
//        }
//
//        ServerBootstrap bootstrap = new ServerBootstrap();
//        bootstrap.group(bossGroup, workerGroup)//
//                .channel(NioServerSocketChannel.class)//
//                .option(ChannelOption.SO_BACKLOG, SystemPropertyUtil.getInt("hsf.backlog.http", 100000))//
//                .option(ChannelOption.ALLOCATOR, NettySharedHolder.byteBufAllocator)//
//                .childOption(ChannelOption.ALLOCATOR, NettySharedHolder.byteBufAllocator)//
//                .childHandler(new ChannelInitializer<SocketChannel>() {
//                    @Override
//                    protected void initChannel(SocketChannel channel) throws Exception {
//                        ChannelPipeline pipeline = channel.pipeline();
//                        // Uncomment the following line if you want HTTPS
//                        // SSLEngine engine =
//                        // SecureChatSslContextFactory.getServerContext().createSSLEngine();
//                        // engine.setUseClientMode(false);
//                        // p.addLast("ssl", new SslHandler(engine));
//
//                        pipeline.addLast("decoder", new HttpRequestDecoder());
//                        // comment the following line if you don't want to
//                        // handle HttpChunks.
//                        pipeline.addLast("aggregator", new HttpObjectAggregator(1048576));
//                        pipeline.addLast("encoder", new HttpResponseEncoder());
//                        // Remove the following line if you don't want automatic
//                        // content compression.
//                        // pipeline.addLast("deflater", new
//                        // HttpContentCompressor());
//                        pipeline.addLast("handler", new NettyServerHttpHandler(rpcProcessor));
//                    }
//
//                });
//
//        long tryBind = 3;
//        while (tryBind > 0) {
//            ChannelFuture cf = bootstrap.bind(new InetSocketAddress(bindHost, listenPort));
//            cf.await();
//            if (cf.isSuccess()) {
//                LOGGER.warn("Server started http transport, while listen at: " + listenPort);
//                return;
//            } else {
//                tryBind--;
//                if (tryBind <= 0) {
//                    LOGGER.warn("After 3 failed attempts to start http transport at port : " + listenPort
//                            + ", we are shutting down the vm");
//                    System.exit(1);
//                } else {
//                    LOGGER.warn("Failed to start http transport at port : " + listenPort, cf.cause());
//                    Thread.sleep(3000);
//                }
//            }
//        }
//    }
//
//    @Override
//    public void closeConnections() {
//        for (Connection connection : serverHandler.getConnections()) {
//            try {
//                connection.close();
//            } catch (Exception e) {
//                LOGGER.error("[Connection Close]", e.getMessage());
//            }
//        }
//
//    }


    public static String fuzzySearchFilter(String param){

        String resultParam = param.trim();

        if(resultParam.contains("!")||resultParam.contains("#") ||resultParam.contains("¥") ||
                resultParam.contains("%") || resultParam.contains("$")){
            resultParam = resultParam.replace("!","");
            resultParam = resultParam.replace("#","");
            resultParam = resultParam.replace("¥","");
            resultParam = resultParam.replace("%","");
            resultParam = resultParam.replace("$","");
        }
        return resultParam;
    }


    public static void main(String[] args){
        String s = "   234$534$#%";
        s = fuzzySearchFilter(s);
        System.out.println(s);

    }
}

