package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destination {
    private long idDes;
    private int codeDes;
    private String nomDes;
    private String zoneDes;
    private List<Agence> emsCollection;
    }
