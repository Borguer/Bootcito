
package org.daniel.maven;

import java.io.*;
public class LeerArchivo {
    public String leer()throws Exception{
        File file=new File("C:\\Users\\T101\\Downloads\\archivaldo.txt");
        FileInputStream fis=new FileInputStream(file);
        StringBuilder sb=new StringBuilder();
        int ch=0;
        while((ch=fis.read())!=-1){
            sb.append((char)ch);
        }
        return sb.toString();
    }
        
    
}
