package com.example.persistence.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


  // LA ANOTACION DATA GENERA CONFLICTOS CON JPA CUANDO USAMOS LAZY YA QUE DATA GENERA LOS METODOS TOSTRING Y HASHCODE INCLUYENDO
//EL ATRIBUTO SKILLS QUE ES UNA LISTA , PERO CUANDO DEFINIMOS EL FETCH DE TIPO LAZY , JPA NO VA A INCLUIR ESA LISTA , POR LO TANTO
// SE GENERARA UN ERROR.
//@Data

//POR LO TANTO LO RECOMENDABLE CUANDO TRABAJAMOS CON ENTIDADES O TABLAS ES PONER CADA UNA DE LAS ANOTACIONES NECESARIAS
@Getter
@Setter
@EqualsAndHashCode(exclude = {"skills"}) //PARA ESTOS METODOS EXCLUIMOS EL ATRIBUTO SKILLS PARA NO GENERAR PROBLEMAS CON JPA
@ToString(exclude = {"skills"})


@Entity
public class Player {

    @Id
    private Long id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id")
    private List<Skill> skills;



}
