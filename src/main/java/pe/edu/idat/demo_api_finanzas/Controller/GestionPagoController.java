package pe.edu.idat.demo_api_finanzas.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.demo_api_finanzas.Service.ServiceDocenteCliente;

@RestController
public class GestionPagoController {

    private final ServiceDocenteCliente serviceDocenteCliente;

    public GestionPagoController(ServiceDocenteCliente serviceDocenteCliente) {
        this.serviceDocenteCliente = serviceDocenteCliente;
    }

    @GetMapping("/pago")
    public String obtenerPagos(){
        return "Respuesta del servicio de Finanzas-Pago";
    }

    @GetMapping("pago-docente")
    public String obtenerPagoDelDocente(){
        return serviceDocenteCliente.obtenerDocentes();
    }
}
