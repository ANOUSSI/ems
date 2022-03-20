package com.api.ems;

import java.util.List;

public interface Igestion<T> {
  public   T ajouter(T objet);
  public   T modifier(T objet);
  public    void  suprimer();
  public    T rechercher();
  public      List<T> lister();
  public T imprimer();




}
