package com.roger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roger.beans.ServicioRemoto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        ServicioRemoto sr = (ServicioRemoto)appContext.getBean("servicioRemoto");
        Object o = sr.datos();
        System.out.print(o.getClass());
        System.out.println("\t" + o);
    }
}
