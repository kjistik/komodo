package kjistik.komodo.Models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "movement")
@Table(name = "movement")
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMovement")
    Long idMovement;

    @Column(name = "dateMovement")
    Date dateMovement;

    @ManyToOne
    @JoinColumn(name = "client_movement")
    Client client_movement;

    @JsonBackReference
    @OneToMany(mappedBy = "transference_movement")
    List<Transference> movement_transferences;

    void setCurrentTime() {
        dateMovement = new Date(System.currentTimeMillis());
    }
}