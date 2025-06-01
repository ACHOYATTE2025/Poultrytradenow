package com.Business.Poultrytradenow.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {
  @Id@GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String name;


  @OneToMany(mappedBy = "category")
  private List<Product> products;

  //arguments constructor
  
    
}