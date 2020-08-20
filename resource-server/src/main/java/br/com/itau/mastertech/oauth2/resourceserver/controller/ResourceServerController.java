package br.com.itau.mastertech.oauth2.resourceserver.controller;

import br.com.itau.mastertech.oauth2.resourceserver.model.UserModel;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceServerController {

    @GetMapping(path = "/v1/resources", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserModel getResourcesV1(@AuthenticationPrincipal UserModel userModel){
        return userModel;
    }

}
