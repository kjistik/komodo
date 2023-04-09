package kjistik.komodoback.Models;

import java.sql.Date;
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

@Table(name = "order_backlog")
@Entity(name = "order_backlog")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderBacklog {

    @Id
    @Column(name = "id_order")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_order;

    @Column(name = "order_total_value")
    Float order_total_value;

    @ManyToOne
    @JoinColumn(name = "order_clients")
    Clients order_clients;

    @ManyToOne
    @JoinColumn(name = "order_provider")
    Provider order_provider;

    @Column(name = "order_date")
    Date order_date;

    @JsonBackReference(value = "order_backlog")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "order_backlog")
    List<Movement> order_backlog;
}