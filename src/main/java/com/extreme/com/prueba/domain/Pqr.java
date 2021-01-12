package com.extreme.com.prueba.domain;

import lombok.Data;



import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;

import java.util.Calendar;
import java.util.Date;

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


private Long idUsuario;

@NotEmpty
private String estado;


@Temporal(TemporalType.TIMESTAMP)
private Date fechacreacion;


@Temporal(TemporalType.TIMESTAMP)
private Date fechalimite;


}
