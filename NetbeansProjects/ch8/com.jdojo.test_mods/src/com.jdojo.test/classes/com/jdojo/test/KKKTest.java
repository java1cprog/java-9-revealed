// KKKTest.java
package com.jdojo.test;



public class KKKTest {
    public static void main(String[] args)  {       
       final ModuleLayer layer = ModuleLayer.boot();
       layer.modules().forEach((m) -> {
           final ClassLoader cl = m.getClassLoader();
           String loader = "Bootstrap";
           if (cl != null) {
               loader = cl.getName();               
           }
           
           System.out.println(loader + "\t" + m.getName());
        });
    }
}
