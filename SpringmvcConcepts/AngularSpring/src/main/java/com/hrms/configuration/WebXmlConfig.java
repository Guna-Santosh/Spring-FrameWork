package com.hrms.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebXmlConfig implements WebApplicationInitializer {
	private String TMP_FOLDER = "/tmp";
	private int MAX_UPLOAD_SIZE = 5 * 1024 * 1024;
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(ProjectConfigCls.class);
		DispatcherServlet ds = new DispatcherServlet(webContext);
		
		ServletRegistration.Dynamic webcontainer = servletContext.addServlet("project", ds);
		webcontainer.addMapping("/");
		
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(TMP_FOLDER, MAX_UPLOAD_SIZE,
				MAX_UPLOAD_SIZE * 2, MAX_UPLOAD_SIZE / 2);
		webcontainer.setMultipartConfig(multipartConfigElement);
		
	}

	

//	@Override
//	public void onStartup(ServletContext sc) throws ServletException {
//		ServletRegistration.Dynamic appServlet = sc.addServlet("AngularSpring",
//				new DispatcherServlet(new AnnotationConfigWebApplicationContext()));
//
//		appServlet.setLoadOnStartup(1);
//		appServlet.addMapping("/");
//
//		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(TMP_FOLDER, MAX_UPLOAD_SIZE,
//				MAX_UPLOAD_SIZE * 2, MAX_UPLOAD_SIZE / 2);
//
//		appServlet.setMultipartConfig(multipartConfigElement);
//	}
}