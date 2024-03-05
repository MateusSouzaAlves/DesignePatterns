package middlewares;

public class CheckPermissionMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if (email.equals("master@hotmail.com")) {
            System.out.println("Bem vindo administrador! ");
            return true;
        }else {
            System.out.println("Bem vindo! ");
            return checkNext(email, password);
        }
    }
}
