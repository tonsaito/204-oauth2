package br.com.itau.mastertech.oauth2.contact.api.service.impl;

import br.com.itau.mastertech.oauth2.contact.api.entity.ContactEntity;
import br.com.itau.mastertech.oauth2.contact.api.repository.ContactRepository;
import br.com.itau.mastertech.oauth2.contact.api.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public ContactEntity save(ContactEntity contactEntity) {
        return contactRepository.save(contactEntity);
    }

    @Override
    public List<ContactEntity> findAllByUserId(Integer id) {
        return contactRepository.findAllByUserId(id);
    }
}
