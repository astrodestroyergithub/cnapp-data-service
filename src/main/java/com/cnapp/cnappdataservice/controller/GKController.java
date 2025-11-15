package com.cnapp.cnappdataservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import com.cnapp.cnappdataservice.service.GKService;
import com.cnapp.cnappdataservice.entity.GK;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/data")
@RequiredArgsConstructor
public class GKController {

    private final GKService gkService;

    @GetMapping("/gks")
    public List<GK> getAllGKs() {
        return gkService.getAllGKs();
    }

    @PostMapping("add-gk")
    public GK postGK(@RequestBody GK gk) {
        return gkService.postGK(gk);
    }
    
}
