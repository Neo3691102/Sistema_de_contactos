package NestorCastaneda.Contactos.servicio;

import NestorCastaneda.Contactos.modelo.EntidadContacto;
import NestorCastaneda.Contactos.repositorio.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ContactoServicio implements IContactoServicio{

    @Autowired
    private ContactoRepositorio contactoRepositorio; //repositorio para conectarse con la BD

    @Override
    public List<EntidadContacto> listarContactos() {
        return contactoRepositorio.findAll();
    }

    @Override
    public EntidadContacto buscarContactoPorId(Integer idContacto) {
        EntidadContacto contacto = contactoRepositorio.findById(idContacto).orElse(null);
        return contacto;
    }

    @Override
    public void guardarContacto(EntidadContacto contacto) {
        contactoRepositorio.save(contacto);
    }

    @Override
    public void eliminarContacto(EntidadContacto contacto) {
        contactoRepositorio.delete(contacto);
    }
}
