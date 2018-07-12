package com.pandano1;

import com.pandano1.ws.PageApi;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServer {
    public static void main(String[] args) throws Exception {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
//        context.addFilter(AuthenticationFilter.class, "/*", EnumSet.of(DispatcherType.INCLUDE,DispatcherType.REQUEST));


        Server jettyServer = new Server(4080);



        jettyServer.setHandler(context);
        ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);



        String providerClasses = PageApi.class.getCanonicalName();
        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames", providerClasses);

        jettyServer.start();
//        jettyServer.dumpStdErr();
        jettyServer.join();
        jettyServer.stop();
    }
}
