package backend.brasil.desafios.securepassword.controller;

import backend.brasil.desafios.securepassword.model.RequestSecure;
import backend.brasil.desafios.securepassword.service.SecureService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate-password")
public class SecureControler {

    @PostMapping
    public ResponseEntity validatePassword(@Validated @RequestBody RequestSecure data){
        if(SecureService.validSecurePassword(data)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
