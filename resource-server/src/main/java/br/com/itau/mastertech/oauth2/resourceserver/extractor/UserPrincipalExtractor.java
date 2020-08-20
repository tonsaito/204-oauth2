package br.com.itau.mastertech.oauth2.resourceserver.extractor;

import br.com.itau.mastertech.oauth2.resourceserver.model.UserModel;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserPrincipalExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        UserModel userModel = new UserModel();
        userModel.setId((Integer) map.get("id"));
        userModel.setName((String) map.get("name"));

        return userModel;
    }
}
