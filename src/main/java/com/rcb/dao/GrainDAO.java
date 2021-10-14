package com.rcb.dao;

import com.rcb.model.Grain;
import com.rcb.repository.GrainRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
@Slf4j
public class GrainDAO {

    private final GrainRepository grainRepository;

    public GrainDAO(GrainRepository grainRepository) {
        this.grainRepository = grainRepository;
    }

    public Grain findById(long id) {


        String errMsg;

        Optional<Grain> grain = grainRepository.findById(id);

        if (grain.isPresent()) {
            return grain.get();
        } else {
            errMsg = String.format("Grain not found :%s", id);
            log.error(errMsg);

        }
        return null;
    }


}
