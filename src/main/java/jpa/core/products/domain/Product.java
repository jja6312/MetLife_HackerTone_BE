package jpa.core.products.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import jpa.core.specialContact.domain.SpecialContact;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "products")
@Getter
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    private String productFeature;

    @OneToMany(mappedBy = "products")
    private List<SpecialContact> specialContacts= new ArrayList<>();

    @Builder
    public Product(String name, List<SpecialContact> specialContacts) {
        this.name = name;
        this.specialContacts = specialContacts;
    }
}
