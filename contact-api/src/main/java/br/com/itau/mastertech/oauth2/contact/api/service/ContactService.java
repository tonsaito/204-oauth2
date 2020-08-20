package br.com.itau.mastertech.oauth2.contact.api.service;

import br.com.itau.mastertech.oauth2.contact.api.entity.ContactEntity;

import java.util.List;

public interface ContactService {

    ContactEntity save(ContactEntity contactEntity);
    List<ContactEntity> findAllByUserId(Integer id);
}
