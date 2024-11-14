package poo.filtrar.parte2.filtros;

import poo.filtrar.parte2.modelo.Archivo;

public interface Filtro {
  boolean cumple(Archivo arch);
}
