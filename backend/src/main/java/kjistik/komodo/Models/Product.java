package kjistik.komodo.Models;

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

@Entity(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    Long idProducto;

    @Column(name = "nombre_producto")
    String nombre_producto;

    @Column(name = "cantidad_producto")
    Float cantidad_producto;

    @Column(name = "active")
    boolean active;

    @Column(name = "precio_producto")
    Float precio_producto;

    @ManyToOne
    @JoinColumn(name = "producto_unidad")
    Unit producto_unidad;

    @JsonBackReference
    @OneToMany(mappedBy = "transferedProduct")
    List<Transference> producto_transferencias;

}
