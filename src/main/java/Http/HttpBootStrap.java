package Http;

/**
 * author : zhouzijing
 * Date: 2019/11/1 11:06
 */
public class HttpBootStrap {


    public static void main(String[] args) throws Exception {
        HttpServer httpServer = new HttpServer(9999);
        httpServer.start();

    }


}
