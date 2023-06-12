package com.evgensoft.spring.webshop.clothes.model.entity.product;

import com.evgensoft.spring.webshop.clothes.model.entity.product.base.Heel;
import com.evgensoft.spring.webshop.clothes.model.entity.product.base.Material;
import com.evgensoft.spring.webshop.clothes.model.entity.product.base.Product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "shoes")
public class Shoe extends Product {
    private float euSize;
    private float usSize;
    private float centimetersSize;
    private float insoleLength;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "insole_material_id", referencedColumnName = "id")
    private Material insoleMaterial; // стелька

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "sole_material_id", referencedColumnName = "id")
    private Material soleMaterial; // подошва

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "heel_id", referencedColumnName = "id")
    private Heel heel;
}
