package kjistik.komodoback.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

@Entity(name = "units")
@Table(name = "units")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Units {
    @Id
    @Column(name = "id_units")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_units;

    @Column(name = "unitsName")
    String unitsName;

    @JsonBackReference(value = "product_unit")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product_unit")
    List<Products> product_unit;
}