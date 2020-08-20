package br.com.itau.mastertech.oauth2.contact.api.repository;

import br.com.itau.mastertech.oauth2.contact.api.entity.ContactEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {

    @Query("SELECT c FROM ContactEntity c WHERE c.userId = ?1")
    List<ContactEntity> findAllByUserId(Integer id);
}
