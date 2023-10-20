package backend.brasil.desafios.securepassword.service;

import backend.brasil.desafios.securepassword.model.RequestSecure;

public class SecureService {

    public static boolean validSecurePassword(RequestSecure data) {
        /*
        Verificar se a senha possui pelo menos 08 caracteres.
        Verificar se a senha contém pelo menos uma letra maiúscula.
        Verificar se a senha contém pelo menos uma letra minúscula.
        Verificar se a senha contém pelo menos um dígito numérico.
        Verificar se a senha contém pelo menos um caractere especial (e.g, !@#$%).
         */

        String password = data.password();
        String specialChars = "!@#$%.";

        if(!(specialChars.chars().anyMatch(c -> password.indexOf(c) != -1))){
            return false;
        }
        if(password.length() < 8){
            return false;
        }
        if(!password.matches(".*[a-z].*")){
            return false;
        }
        if(!password.matches(".*[A-Z].*")) {
            return false;
        }
        if(!password.matches(".*[0-9].*")){
            return false;
        }
        return true;
    }
}
