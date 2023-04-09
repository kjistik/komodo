package kjistik.komodoback.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "products")
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    Long id_product;

    @Column(name = "active")
    boolean active;

    @Column(name = "product_name")
    String product_name;

    @Column(name = "product_quantity")
    Integer product_quantity;

    @Column(name = "product_ppu")
    float product_ppu;

    @ManyToOne
    @JoinColumn(name = "product_unit")
    Units product_unit;

    @JsonBackReference(value = "movement_product")
    @OneToMany(fetch=FetchType.EAGER,mappedBy = "movement_product")
    List<Movement> movement_product;
}