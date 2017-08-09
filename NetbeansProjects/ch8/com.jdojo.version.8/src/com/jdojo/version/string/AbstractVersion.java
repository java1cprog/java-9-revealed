package com.jdojo.version.string;

public class AbstractVersion implements VersionInfo{

    private final String fullVersion;
    private final String productVersion;
    private final String updateVersion;
    public AbstractVersion(String fullVersion,String productVersion,String updateVersion) {
        this.fullVersion = fullVersion;
        this.productVersion = productVersion;
        this.updateVersion = updateVersion;
    }
@Override
    public String getFullVersion() {
        return fullVersion;
    }
@Override
    public String getProductVersion() {
        return productVersion;
    }
@Override
    public String getUpdateVersion() {
        return updateVersion;
    }
    
}
