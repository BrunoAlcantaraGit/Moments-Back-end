package com.moments.momentsproject.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Moment {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String title;
private String description;
private String image;

@ManyToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
private List<Coment> coment;

}
