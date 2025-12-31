package com.lucena.user.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //Aponta que essa é uma tabela do BD
@Table(name = "telefone") //Define o nome da tabela
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ddd", length = 3)
    private String ddd;
    @Column(name = "numero", length = 10)
    private String numero;
}
