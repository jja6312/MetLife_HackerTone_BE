package jpa.core.specialContact.controller;

import java.util.List;
import jpa.core.specialContact.dto.RequestInsuracneCreate;
import jpa.core.specialContact.dto.SpecialContactResponse;
import jpa.core.specialContact.service.SpecialContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class SpecialContactController {

    private final SpecialContactService specialContactService;

    @GetMapping("/insurance")
    @ResponseStatus(HttpStatus.OK)
    public List<SpecialContactResponse> findAllSpecialContact() {
        List<SpecialContactResponse> specialContacts = specialContactService.findAll()
            .stream()
            .map(SpecialContactResponse::new)
            .toList();

        return specialContacts;
    }

    @PostMapping("/insurance")
    @ResponseStatus(HttpStatus.CREATED)
    public List<SpecialContactResponse> createSpecialContact(@RequestBody RequestInsuracneCreate requestInsuracneCreate ) {
        List<SpecialContactResponse> specialContacts = specialContactService.findAll()
            .stream()
            .map(SpecialContactResponse::new)
            .toList();

        return specialContacts;
    }
}
