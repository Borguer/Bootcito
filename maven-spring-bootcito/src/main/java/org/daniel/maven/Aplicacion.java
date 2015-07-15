
package org.daniel.maven;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
@EnableAutoConfiguration
public class Aplicacion {

    public static void main(String[] args)throws Exception {
        SpringApplication.run(Aplicacion.class, args);
        
        System.out.println("Un mensaje desde spring boot");
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfiguracionBasica.class);
        
        Leer servicioLeer=ctx.getBean(Leer.class);
        System.out.println(servicioLeer.leer());
    }
}
    
