package com.example.directory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.directory.ServiceImpl.AddressServiceImpl;
import com.example.directory.entity.Address;

@RestController
@RequestMapping("/add")
public class AddressController {

    private AddressServiceImpl addressServiceImpl;
    
    
    public AddressController() {
	}

    @Autowired
    public AddressController(AddressServiceImpl addressServiceImpl){
        this.addressServiceImpl=addressServiceImpl;
    }

    @GetMapping("/address")
    public List<Address> getAddresses(){
        return addressServiceImpl.getAddresses();
    }

    @GetMapping("/addresses/{addressId}")
    public Address findById(@PathVariable int addressId){
        return addressServiceImpl.findById(addressId);
    }

//    @DeleteMapping("/addresses/{addressId}")
//    public void deleteById(@PathVariable int addressId){
//        addressServiceImpl.deleteById(addressId);
//    }
//    @PostMapping("/addresses")
//    public void saveAddress(@RequestBody Address tempAddress){
//         addressServiceImpl.saveAddress(tempAddress);
//    }
}
