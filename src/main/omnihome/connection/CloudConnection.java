package main.omnihome.connection;

public class CloudConnection {
   private String apiKey, serverUrl;

   CloudConnection(String apiKey, String serverUrl) {
      this.apiKey = apiKey;
      this.serverUrl = serverUrl;
      System.out.println("CloudConnection initialized.");
   }


   private static class ConnectionHelper {
      private static CloudConnection INSTANCE = new CloudConnection(
              "SUPERSUPERSECRETKEY",
              "https://omnihome.codeany.org"
      );

   }

   public static CloudConnection getInstance() {
     return ConnectionHelper.INSTANCE;
   }

   public String getApiKey() {
      return apiKey;
   }

   public String getServerUrl() {
      return serverUrl;
   }

   public void setApiKey(String apiKey) {
      this.apiKey = apiKey;
   }

   public void setServerUrl(String serverUrl) {
      this.serverUrl = serverUrl;
   }

   public void connect() {
      System.out.println("CloudConnection connected.");
      System.out.println("Connected to " + serverUrl + "by using key: " + apiKey);
   }






}
