package com.cnapp.cnappdataservice.service;

import org.springframework.stereotype.Service;
import com.cnapp.cnappdataservice.entity.GK;
import com.cnapp.cnappdataservice.repository.GKRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GKService {

    private final GKRepository gkRepository;

    public List<GK> getAllGKs() {
        return gkRepository.findAll();
    }

    public GK postGK(GK gk) {
        return gkRepository.save(gk);
    }
}
