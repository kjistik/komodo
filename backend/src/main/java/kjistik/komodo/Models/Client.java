package kjistik.komodo.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "client")
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    Long idClient;

    @Column(name = "client_name")
    String client_name;

    @Column(name = "client_lastName")
    String client_lastName;

    @Column(name = "client_email")
    String client_email;

    @Column(name = "client_phone")
    int client_phone;

    @Column(name = "client_phone_ch")
    int client_phone_ch;

    @Column(name = "client_stret")
    String client_street;

    @Column(name = "localidad")
    String localidad;

    @Column(name = "active")
    boolean active;

    @JsonBackReference(value = "movement_client")
    @OneToMany(mappedBy = "client_movement")
    List<Movement> movement_client;
}