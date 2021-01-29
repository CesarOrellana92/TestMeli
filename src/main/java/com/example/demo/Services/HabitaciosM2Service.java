package com.example.demo.Services;

import com.example.demo.Models.CasaDTO;
import com.example.demo.Models.HabitacionDTO;
import com.example.demo.Models.HabitacionM2DTO;
import com.example.demo.Models.HabitacionesM2ListaDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class HabitaciosM2Service {


    public static HabitacionesM2ListaDTO getHabitaciones(CasaDTO casa){
        HabitacionM2DTO hM2 = new HabitacionM2DTO();
        HabitacionesM2ListaDTO hListas = new HabitacionesM2ListaDTO();
        for ( HabitacionDTO h : casa.getHabitaciones()) {
            hM2.setNombre(h.getNombre());
            hM2.setSuperficie(HabitacionService.superficieHabitacion(h));
            hListas.setHabitaciones(null);
            hListas.getHabitaciones().add(hM2);
        }
        return hListas;
    }
}
