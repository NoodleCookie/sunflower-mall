package sunflower.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserContext {
    private static final ThreadLocal<String> user = new ThreadLocal<>();

    public static void setUser(String username) {
        user.set(username);
    }

    public static String getUser() {
        return user.get();
    }
}
