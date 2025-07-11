package com.Business.Poultrytradenow.models;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String name;
  private String brand;
  private BigDecimal price;
  private Integer inventory;
  private String description;


  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "category_id")
  private Category category;


  @OneToMany(mappedBy = "product",cascade =  CascadeType.ALL,orphanRemoval = true)
  private List<Image> images;
  
  //arguments constructor
  public Product(String name,String brand,BigDecimal price,Integer inventory,String description,Category category){
    this.name=name;
    this.brand=brand;
    this.price=price;
    this.inventory=inventory;
    this.description=description;
    this.category=category;
  }

    
}