package kjistik.komodoback.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "provider")
@Entity(name = "provider")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provider")
    Long id_provider;

    @Column(name = "provider_name")
    String provider_name;

    @Column(name = "active")
    boolean active;

    @Column(name = "provider_mail")
    String provider_mail;

    @Column(name = "provider_city")
    String provider_city;

    @Column(name = "provider_phone")
    Long provider_phone;

    @Column(name = "provider_address")
    String provider_address;

    @JsonBackReference(value = "order_provider")
    @OneToMany(mappedBy = "order_provider")
    List<OrderBacklog> order_provider;
}