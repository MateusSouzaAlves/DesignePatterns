import middlewares.CheckPermissionMiddleware;
import middlewares.CheckUserMiddleware;
import middlewares.Middleware;
import server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        private static Server server;

        public static void init(){
            server = new Server();
            server.registerUser("master@hotmail.com", "111321");
            server.registerUser("mateus@hotmail.com","111321");

            Middleware middleware = new CheckUserMiddleware(server);
            middleware.linkWith(new CheckPermissionMiddleware());

            server.setMiddleware(middleware);
        }

    public static void main(String[] args) throws IOException {
            init();

            boolean done;

            do {
                System.out.println("Digite o email: ");
                String email = reader.readLine();
                System.out.println("Digite a senha: ");
                String password = reader.readLine();
                done = server.login(email,password);
            }while (!done);
    }


}