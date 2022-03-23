package com.api.ems.service;

import java.util.List;

    public interface Igestion<T> {
        public   T add(T objet);
        public   T update(T objet);
        public    void  delete();
        public    T rechercher();
        public List<T> lister();
        public T imprimer();

    }
