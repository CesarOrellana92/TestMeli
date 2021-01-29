package com.example.demo.Models;

import java.util.ArrayList;

public class CasaDTO {

    private String nombre;
    private String direccion;
    ArrayList <HabitacionDTO> habitaciones ;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<HabitacionDTO> getHabitaciones() {
        return this.habitaciones;
    }

    public void setHabitaciones(ArrayList<HabitacionDTO> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
