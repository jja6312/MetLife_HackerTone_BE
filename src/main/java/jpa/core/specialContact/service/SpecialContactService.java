package jpa.core.specialContact.service;

import java.util.List;
import jpa.core.specialContact.domain.SpecialContact;
import jpa.core.specialContact.repository.SpecialContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SpecialContactService {

    private final SpecialContactRepository specialContactRepository;

    public List<SpecialContact> findAll() {
        return specialContactRepository.findAll();
    }
}
