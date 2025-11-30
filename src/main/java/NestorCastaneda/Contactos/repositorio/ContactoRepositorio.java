package NestorCastaneda.Contactos.repositorio;

import NestorCastaneda.Contactos.modelo.EntidadContacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<EntidadContacto, Integer>{

}
