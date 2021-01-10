package com.extreme.com.prueba.domain;

import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Data
@Table(name="pqrs")
public class Pqr implements Serializable {

private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idPqr;

@NotEmpty
private String tipo;

@NotEmpty
private String asunto;

@NotEmpty
private Long idUsuario;

@NotEmpty
private String estado;

@NotEmpty
@Temporal(TemporalType.TIMESTAMP)
private Calendar fechacreacion;

@NotEmpty
@Temporal(TemporalType.TIMESTAMP)
private Calendar fechalimite;

}
