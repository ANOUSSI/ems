package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public  abstract class Envoi {
    private   String numEnvoi;
    private  long codeAgClient;
    private long CodeAgCollecte;



    }

