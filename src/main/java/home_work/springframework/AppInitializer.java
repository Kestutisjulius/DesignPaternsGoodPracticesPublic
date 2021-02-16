package home_work.springframework;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.scan("com.baeldung");
        container.addListener(new ContextLoaderListener(context));

        ServletRegistration.Dynamic dispacher = container.addServlet("mvc", new DispatcherServlet(context));
        dispacher.setLoadOnStartup(1);
        dispacher.addMapping("/");

    }
}
