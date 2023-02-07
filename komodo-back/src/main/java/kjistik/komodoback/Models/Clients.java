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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clients")
@Entity(name = "clients")
@Getter
@Setter
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clients")
    Long id_clients;

    @Column(name = "client_name")
    String client_name;

    @Column(name = "client_lastName")
    String client_lastName;

    @Column(name = "active")
    boolean active;

    @Column(name = "client_mail")
    String client_mail;

    @Column(name = "client_phone")
    Long client_phone;

    @Column(name = "client_city")
    String client_city;

    @Column(name = "client_adress")
    String client_adress;

    @JsonBackReference(value = "order_clients")
    @OneToMany(mappedBy = "order_clients")
    List<OrderBacklog> order_client;
}