public class Configuration {

    private String sendEmailToService = "A service";

    private static Configuration instance;

    private Configuration() {

    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getSendEmailToService() {
        return sendEmailToService;
    }
}
