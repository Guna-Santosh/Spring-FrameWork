package com.hrms.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class WebXmlConfig implements WebApplicationInitializer 
{
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(ProjectConfigCls.class);
		DispatcherServlet ds = new DispatcherServlet(webContext);
		ServletRegistration.Dynamic webcontainer = servletContext.addServlet("project", ds);
		webcontainer.addMapping("/");
	}
}