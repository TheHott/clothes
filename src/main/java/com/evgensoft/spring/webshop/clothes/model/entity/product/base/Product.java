package com.evgensoft.spring.webshop.clothes.model.entity.product.base;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;
import com.evgensoft.spring.webshop.clothes.model.entity.user.Company;
import com.evgensoft.spring.webshop.clothes.model.enums.ProductStatus;
import com.evgensoft.spring.webshop.clothes.model.enums.Sex;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class Product extends BaseEntity {
    private Double cost;
    private Long amountInStock;
    private Long amountReservedTotal;
    private Long amountReservedPerPerson = 5L;
    private float russianSize;
    
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    @Enumerated(EnumType.STRING)
    private Sex sex;
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_company_id", referencedColumnName = "id")
    private Company sellerCompany;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_of_origin_id", referencedColumnName = "id")
    private Country countryOfOrigin;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id", referencedColumnName = "id")
    private Material material;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "color_id", referencedColumnName = "id")
    private Color color;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_id", referencedColumnName = "id")
    private ProductCollection collection;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "target_audience_id", referencedColumnName = "id")
    private TargetAudience targetAudience;
}
