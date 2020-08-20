package br.com.itau.mastertech.oauth2.contact.api.controller;

import br.com.itau.mastertech.oauth2.contact.api.entity.ContactEntity;
import br.com.itau.mastertech.oauth2.contact.api.model.ContactModel;
import br.com.itau.mastertech.oauth2.contact.api.model.UserModel;
import br.com.itau.mastertech.oauth2.contact.api.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/v1/contacts")
    public ResponseEntity<ContactEntity> saveContactV1(@RequestBody ContactModel contactModel, @AuthenticationPrincipal UserModel userModel){
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setName(contactModel.getName());
        contactEntity.setPhone(contactModel.getPhone());
        contactEntity.setUserId(userModel.getId());
        contactEntity.setUsername(userModel.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(contactService.save(contactEntity));
    }

    @GetMapping(path = "/v1/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContactEntity> getContactsV1(@AuthenticationPrincipal UserModel userModel){
        return contactService.findAllByUserId(userModel.getId());
    }

}
