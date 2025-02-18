package pe.edu.idat.demo_api_finanzas.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionPagoController {

    @GetMapping("/pago")
    public String obtenerPagos(){
        return "Respuesta del servicio de Finanzas-Pago";
    }
}
