package com.example.demo.model.service;

import com.example.demo.model.Phone;
import com.example.demo.model.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PhoneServiceImlp implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public List<Phone> getListPhone() {
        return phoneRepository.findAll();
    }

    public Optional<Phone> getPhoneInfo(int id) {
        return phoneRepository.findById(id);
    }

}
