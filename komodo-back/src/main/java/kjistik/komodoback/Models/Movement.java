package kjistik.komodoback.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movement")
@Entity(name = "movement")
@Getter
@Setter
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movement")
    Long id_movement;

    @ManyToOne
    @JoinColumn(name = "movement_product")
    Products movement_product;

    @Column(name = "confirmed")
    boolean confirmed;

    @Column(name = "current_ppu")
    Float current_ppu;

    @Column(name = "movement_value")
    Float movement_value;

    @Column(name = "movement_date")
    Date movement_date;

    @ManyToOne
    @JoinColumn(name = "order_backlog")
    OrderBacklog order_backlog;
}