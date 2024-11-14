package poo.filtrar.parte1.filtros;

import poo.filtrar.parte1.modelo.Archivo;

public interface Filtro {
  boolean cumple(Archivo arch);
}
