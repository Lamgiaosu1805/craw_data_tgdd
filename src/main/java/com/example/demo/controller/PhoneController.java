package com.example.demo.controller;


import com.example.demo.model.Phone;
import com.example.demo.model.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/phone")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping
    public List<Phone> getListPhone() {
        List<Phone> phones = phoneService.getListPhone();
        return phones;
    }
    @GetMapping("/{id}")
    public Optional<Phone> getPhoneInfo(@PathVariable int id) {
        return phoneService.getPhoneInfo(id);
    }
}
