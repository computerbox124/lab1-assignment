package main.omnihome.config;

public class Configuration implements Cloneable {
    private String ipAddress;
    private int port;
    private String firmwareVersion;

    public Configuration(String ipAddress, int port, String firmwareVersion) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.firmwareVersion = firmwareVersion;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed", e);
        }
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                '}';
    }
}
