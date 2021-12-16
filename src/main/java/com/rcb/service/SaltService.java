package com.rcb.service;

import com.rcb.validvalues.Salt;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Data
@Slf4j
public class SaltService {


    public List<Salt> findAll() {

        Salt[] salts = Salt.values();
        return Arrays.asList(salts);

    }



}
