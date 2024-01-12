package com.example.demo.model.service;

import com.example.demo.model.Phone;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PhoneService {
    public List<Phone> getListPhone();
    public Optional<Phone> getPhoneInfo(int id);
}
