package com.lucena.user.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity //Aponta que essa é uma tabela do BD
@Table(name = "endereco") //Define o nome da tabela

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private Long numero;
    @Column(name = "complemento", length = 50)
    private String complemento;
    @Column(name = "cidade", length = 100)
    private String cidade;
    @Column(name = "estado", length = 2)
    private String estado;
    @Column(name = "cep", length = 9)
    private String cep;

    @Column(name = "usuario_id")
    private Long usuario_id;

}
