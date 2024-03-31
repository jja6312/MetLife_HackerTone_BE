package jpa.core.specialContact.repository;

import java.util.List;
import jpa.core.specialContact.domain.SpecialContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialContactRepository extends JpaRepository<SpecialContact, Long> {
    List<SpecialContact> findAll();
}
