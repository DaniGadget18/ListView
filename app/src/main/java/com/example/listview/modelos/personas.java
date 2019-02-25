package com.example.listview.modelos;

public class personas {
private String Nombre;
private String Sexo;
private Integer Edad;
private Integer id;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public Integer getEdad() {
        return Edad;
          }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
