package com.example.demo.Services;

import com.example.demo.Models.HabitacionDTO;

public class HabitacionService {

    public static Integer superficieHabitacion(HabitacionDTO habitacion){
        return habitacion.getAlto() * habitacion.getAncho();
    }
}
