package com.extreme.com.prueba.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name="usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @NotEmpty
    private String username;


    private Long cedula;

    @NotEmpty
    private String nombres;

    @NotEmpty
    private String apellidos;

    @NotEmpty
    private String password;

    @OneToMany
    @JoinColumn(name="id_usuario")
    private List<Rol> roles;
}
