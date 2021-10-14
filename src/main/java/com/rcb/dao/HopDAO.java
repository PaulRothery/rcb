package com.rcb.dao;

import com.rcb.model.Hop;
import com.rcb.repository.HopRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
@Slf4j
public class HopDAO {

    private final HopRepository hopRepository;

    public HopDAO(HopRepository hopRepository) {
        this.hopRepository = hopRepository;
    }

    public Hop findById(long id) {


        String errMsg;

        Optional<Hop> hop = hopRepository.findById(id);

        if (hop.isPresent()) {
            return hop. get();
        } else {
            errMsg = String.format("Hop not found :%s", id);
            log.error(errMsg);

        }
        return null;
    }


}
