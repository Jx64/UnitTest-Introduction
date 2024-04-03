package com.ejercicio.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "shipping_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ShippingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String address;

    @Column(name = "shipping_company", nullable = false)
    private String shippingCompany;

    @Column(name = "number_reference", nullable = false)
    private Integer numberReference;

    @OneToOne @JoinColumn(name = "fkOrder")
    private Order fkOrder;
}
