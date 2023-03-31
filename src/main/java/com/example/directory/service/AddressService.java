package com.example.directory.service;

import java.util.List;

import com.example.directory.entity.Address;

public interface AddressService {
    public List<Address> getAddresses();
    public Address findById(int addressId);
//    public void deleteById(int addressId);
//    public void saveAddress(Address addressList);
    //public boolean update(Address tempAddress);

    //custom
    //public List<Address> findByUser(int directoryId);
}
