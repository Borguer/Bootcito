
package org.daniel.maven;


public class LeerMySQL implements Leer {
    @Override
    public String leer() throws Exception{
        String mensajito="Conectado a mysql";
        return mensajito;
    }
}
