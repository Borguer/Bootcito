
package org.daniel.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionBasica {
    @Bean
    LeerArchivo servicioLeer(){
        LeerArchivo leer=new LeerArchivo();
        return leer;
    }
}
