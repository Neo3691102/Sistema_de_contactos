package NestorCastaneda.Contactos.servicio;

import NestorCastaneda.Contactos.modelo.EntidadContacto;

import java.util.List;

public interface IContactoServicio {
    public List<EntidadContacto> listarContactos();

    public EntidadContacto buscarContactoPorId(Integer idContacto);

    public void guardarContacto(EntidadContacto contacto);

    public void eliminarContacto(EntidadContacto contacto);
}
