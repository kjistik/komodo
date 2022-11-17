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

@Entity(name="unit")
@Table(name = "unit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUnidad")
    Long idUnidad;

    @Column(name = "nombre_unidad")
    String nombre_unidad;

    @Column(name = "active")
    boolean active;

    @JsonBackReference(value = "producto_unidad")
    @OneToMany(mappedBy = "producto_unidad")
    List<Product> producto_unidad;
}