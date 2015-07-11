
package org.daniel.maven;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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
        
        LeerArchivo objeto=new LeerArchivo();
        System.out.println(objeto.leer());
    }
}
    
