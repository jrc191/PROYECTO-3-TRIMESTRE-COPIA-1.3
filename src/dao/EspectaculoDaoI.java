package dao;

import models.Espectaculo;
import java.time.LocalDate;
import java.util.List;

public interface EspectaculoDaoI {
    List<Espectaculo> obtenerTodos();
    List<Espectaculo> obtenerPorNombre(String nombre);
    List<Espectaculo> obtenerPorFecha(LocalDate fecha);
}
