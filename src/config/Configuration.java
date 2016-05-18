package config;

import java.util.regex.Pattern;

/**
 * Created by Vigo on 16/5/10.
 */
public class Configuration {

    public  static final String IP = "127.0.0.1";

    public static final int PORT = 1234;

    public static final Pattern INSECURE_URI = Pattern.compile(".*[<>&\"].*");

    public static final Pattern ALLOWED_FILE_NAME = Pattern.compile("[A-Za-z0-9][-_A-Za-z0-9\\.]*");
}
