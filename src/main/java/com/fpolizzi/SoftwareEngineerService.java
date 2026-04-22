package com.fpolizzi;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fpolizzi on 22.04.26
 */
@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(
            SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {

        return softwareEngineerRepository.findAll();
    }
}
