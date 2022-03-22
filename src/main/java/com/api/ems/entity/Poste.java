package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract  class Poste {
    private  long idPost;
    private  int numero;
    private  Destination designation;
    private  long idAgence;

}
