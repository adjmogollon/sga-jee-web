package com.adjmogollon.sga.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.adjmogollon.sga.domain.Persona;

@WebService
public interface PersonaServiceWs {
    
    @WebMethod
    public List<Persona> listarPersonas();
}
