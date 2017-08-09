package com.jdojo.version.string.v8;

import com.jdojo.version.string.VersionInfo;
import com.jdojo.version.string.AbstractVersion;
public class Versions {

    private Versions() {
    }
    
    public VersionInfo[] getArray(){
        return new VersionInfo[]{new AbstractVersion("1.8.0_144-b01","8.0.1440.1","8u144"),
        new AbstractVersion("1.8.0_121-b13","8.0.1210.13","8u121"),
        new AbstractVersion("1.8.0_111-b14","8.0.1110.14","8u111"),
        new AbstractVersion("1.8.0_111-b14","8.0.1110.14","8u111"),
        new AbstractVersion("1.8.0_102-b14","8.0.102.14","8u102"),
        
        };
    }
}
