package com.rcb.service.enums;

import com.rcb.validvalues.RecipeStatus;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Data
@Slf4j
public class RecipeStatusService {


    public List<RecipeStatus> findAll() {

        RecipeStatus[] recipeStatuses = RecipeStatus.values();
        return Arrays.asList(recipeStatuses);

    }



}
