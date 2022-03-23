package com.api.ems.service;

import com.api.ems.entity.Tarif;
import com.api.ems.exception.TarifNotFounfException;
import com.api.ems.repository.TarifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarifImp   {
    private  TarifRepository tarifRepository;
    @Autowired
    public TarifImp(TarifRepository tarifRepository) {
        this.tarifRepository=tarifRepository;
    }
                                         //use this method to add a tariff
    public  Tarif saveTarif(Tarif tarif){
        return this.tarifRepository.save(tarif);
    }
                                         //use this methode to display a  tariff list
    public List<Tarif> tarifList(Tarif tarif){
        return this.tarifRepository.findAll();
    }
                                           //this method allows you to search for a rate
public Optional<Tarif> getOneTarif(long id_tarif){
        Optional<Tarif> tarifPresent = this.tarifRepository.findById(id_tarif);

                                  //here we check if the tariff search exists, then we modify
        if (!tarifPresent.isPresent()){
            throw new TarifNotFounfException(String.format("nous navont pas trouver ce tarif"));
        }
        return  this.tarifRepository.findById(id_tarif);
}
                                            //this method allows you to modify a tariff
    public  Tarif updateTarif(Tarif tarif,Long idTarif){
        Optional<Tarif> tarifExist=this.tarifRepository.findById(idTarif);
        if (!tarifExist.isPresent()){
            throw new TarifNotFounfException(String.format("ce tarif n'existe pas" +idTarif));
        }else
        return this.tarifRepository.save(tarif);
    }
    //this method makes it possible to verifyto delete a tariff
public void deleteTarif(long id_tarif){
        Optional<Tarif> tarifdele=this.tarifRepository.findById(id_tarif);
        if ( !tarifdele.isPresent()){
            throw new TarifNotFounfException(String.format("le tarif a suppreimer n'existe pas"));
        }
        this.tarifRepository.delete(tarifdele.get());
}
}
