package middlewares;

import server.Server;

public class CheckUserMiddleware extends Middleware{

    private Server server;

    public CheckUserMiddleware(Server server){
        this.server=server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)){
            System.out.println("E-mail inválido. ");
            return false;
        } if (!server.isValidPassword(email,password)){
            System.out.println("Email ou Senha inválidos. ");
            return false;
        }else {
            return checkNext(email, password);
        }
    }
}
