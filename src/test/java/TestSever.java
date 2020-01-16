import com.octopus.server.Server;

/**
 * @FileName: TestSever
 * @Author: yeyang
 * @Date: 2020/1/16 15:32
 */
public class TestSever {
    public static void main(String[] args) {
        Thread thread = new Thread(new Server());
        thread.start();
    }
}
