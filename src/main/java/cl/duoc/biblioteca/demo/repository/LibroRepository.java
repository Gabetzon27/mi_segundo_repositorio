package cl.duoc.biblioteca.demo.repository;

import org.springframework.stereotype.Repository;
import cl.duoc.biblioteca.demo.model.Libro;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro buscarporID(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarLibro(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public Libro guardar(Libro lib) {
        listaLibros.add(lib);
        return lib;
    }

public Libro actualizar(libro lib) {
    int id = 0;
    int idPosicion = 0;
    
    for (int i = 0; i < listaLibros.size(); i++) {
        if (listaLibros.get(i).getId() == lib.getId()) {
            id = lib.getId();
            idPosicion = 1;
        }
    }


Libro libro1 = new Libro();
libro1.SetId(id);
libro1.SetTitulo(lib.getTitulo());
libro1.SetAutor(lib.getAutor());
libro1.SetFechaPublicacion(lib.getFechaPublicacion());
libro1.SetEditorial(lib.getEditorial());
libro1.SetIsbn(lib.getIsbn());

listaLibros.set(idPosicion, libro1);
return libro1;



