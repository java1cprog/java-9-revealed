package com.jdojo.version.string;

import java.util.List;

public final class VersionInfo {

    private final int major;
    private final int minor;
    private final int security;
    private final String vnumAdditionalInfo;
    private final String pre;
    private final String build;
    private final String optional;

    private VersionInfo(int major, int minor, int security, String vnumAdditionalInfo, String pre, String build, String optional) {
        this.major = major;
        this.minor = minor;
        this.security = security;
        this.vnumAdditionalInfo = vnumAdditionalInfo;
        this.pre = pre;
        this.build = build;
        this.optional = optional;
    }

    public VersionInfo(Runtime.Version version) {
        this(version.major(),
                version.minor(),
                version.security(),
                getAdditionalVersionInfo(version),
                version.pre().orElse(""),
                version.build().isPresent() ? version.build().get().toString() : "",
                version.optional().orElse(""));
    }

    public VersionInfo(String versonString) {
        this(Runtime.Version.parse(versonString));
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public int getSecurity() {
        return security;
    }

    public String getVnumAdditionalInfo() {
        return vnumAdditionalInfo;
    }

    public String getPre() {
        return pre;
    }

    public String getBuild() {
        return build;
    }

    public String getOptional() {
        return optional;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof VersionInfo) {
            VersionInfo aVersionInfo = (VersionInfo) anObject;
            if (major == aVersionInfo.major && minor == aVersionInfo.minor && security == aVersionInfo.security && vnumAdditionalInfo.equals(aVersionInfo.vnumAdditionalInfo) && pre.equals(aVersionInfo.pre) && build.equals(aVersionInfo.pre) && optional.equals(aVersionInfo.optional)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int hashCode() {

        return major + minor + security + vnumAdditionalInfo.hashCode() + pre.hashCode() + build.hashCode() + optional.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Major=%d, Minor=%d, Security=%d, Additional Version=%s,"
                + " Pre=%s, Build=%s, Optional=%s", major, minor, security, vnumAdditionalInfo, pre, build, optional);

    }

    // Returns the version number elements from the 4th elements to the end      
    public static String getAdditionalVersionInfo(Runtime.Version v) {
        String str = "";

        final List<Integer> vnum = v.version();
        int size = vnum.size();
        if (size >= 4) {
            str = str + String.valueOf(vnum.get(3));
        }

        for (int i = 4; i < size; i++) {
            str = str + "." + String.valueOf(vnum.get(i));
        }

        return str;
    }

}
