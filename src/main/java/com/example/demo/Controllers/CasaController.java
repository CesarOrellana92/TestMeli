package com.example.demo.Controllers;

import com.example.demo.Models.CasaDTO;
import com.example.demo.Models.HabitacionDTO;
import com.example.demo.Models.HabitacionesM2ListaDTO;
import com.example.demo.Services.CasaService;
import com.example.demo.Services.HabitacionService;
import com.example.demo.Services.HabitaciosM2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

public class CasaController {



    @PostMapping(value="/metrosCuadrados")
    public Integer calculoMetrosCuadrados(@RequestBody CasaDTO casa)  {

        return CasaService.superficieCasa(casa);

    }

    @PostMapping(value="/valorCasa")
    public String calculoValorCasa(@RequestBody CasaDTO casa)  {

        Integer sup = CasaService.superficieCasa(casa);
        return "USD " + (sup * 800);

    }

    @PostMapping(value="/habitacionMasGrande")
    public HabitacionDTO habitacionMasGrande(@RequestBody CasaDTO casa)  {

        return CasaService.getHabitacionMasGrande(casa);

    }

    @PostMapping(value="/metrosCuadradosXHabitacion")
    public HabitacionesM2ListaDTO hmetrosCuadradosXHabitacion(@RequestBody CasaDTO casa)  {

        return HabitaciosM2Service.getHabitaciones(casa);

    }




    
}
