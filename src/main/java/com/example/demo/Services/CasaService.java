package com.example.demo.Services;

import com.example.demo.Models.CasaDTO;
import com.example.demo.Models.HabitacionDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class CasaService {




    public  static Integer superficieCasa(CasaDTO casa){

        Integer superficieCasa = 0;

        for (HabitacionDTO h: casa.getHabitaciones()) {
            superficieCasa = superficieCasa + HabitacionService.superficieHabitacion(h);
        }
        return superficieCasa;
    }

    public static HabitacionDTO getHabitacionMasGrande(CasaDTO casa){

        Integer superficieMayor = 0;
        HabitacionDTO habitacionMasGrande = null;
        for (HabitacionDTO h: casa.getHabitaciones()) {
            if (HabitacionService.superficieHabitacion(h) > superficieMayor){
                superficieMayor = HabitacionService.superficieHabitacion(h);
                habitacionMasGrande = h;
            }
        }

        return habitacionMasGrande;
    }
}
