package com.api.ems.controller;


import com.api.ems.repository.TarifRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class TarifController {

@Autowired
    private TarifRepository tarifRepository;
}
