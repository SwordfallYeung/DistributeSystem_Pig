import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.web.context.ContextLoaderListener;


public class T {

    public static void main(String[] args) {
        ContextLoaderListener r = null;

        String passwd = new SimpleHash("SHA-1", "admin", "123456").toString();
        System.out.println(passwd);
    }
}
