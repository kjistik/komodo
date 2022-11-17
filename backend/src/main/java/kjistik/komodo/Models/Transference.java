package kjistik.komodo.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "transference")
@Table(name = "transference")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTransference")
    Long idTransference;

    @Column(name = "amountTransference")
    float amountTransference;

    @Column(name = "dateTransference")
    Date dateTransference;

    @ManyToOne
    @JoinColumn(name = "transferedProduct")
    Product transferedProduct;

    @ManyToOne
    @JoinColumn(name = "transference_movement")
    Movement transference_movement;

    void setCurrentTime() {
        dateTransference = new Date(System.currentTimeMillis());
    }
}