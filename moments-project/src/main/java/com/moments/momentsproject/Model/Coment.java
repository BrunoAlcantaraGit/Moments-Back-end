package com.moments.momentsproject.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Coment {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String text;
private String userName;
@ManyToOne
private Moment moment;
}
