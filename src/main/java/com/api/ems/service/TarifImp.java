package com.api.ems.service;

import com.api.ems.Igestion;
import com.api.ems.entity.Tarif;
import com.api.ems.repository.TarifRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TarifImp  implements Igestion {
    private TarifRepository tarifRepository;
    @Override
    public Tarif ajouter(Object objet) {
        return null;
    }

    @Override
    public Object modifier(Object objet) {
        return null;
    }

    @Override
    public void suprimer() {

    }

    @Override
    public Object rechercher() {
        return null;
    }

    @Override
    public List lister() {
        return null;
    }

    @Override
    public Object imprimer() {
        return null;
    }
}
