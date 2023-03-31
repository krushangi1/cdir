package com.example.directory.ServiceImpl;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.directory.dao.AddressRepository;
import com.example.directory.entity.Address;
import com.example.directory.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
	private AddressRepository addressRepository;
	
	public AddressServiceImpl() {
		super();
	}
	
	
	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository=addressRepository;
	}

	
	
	public List<Address> getAddresses(){
		return addressRepository.findAll();
	}
	 public Address findById(int addressId) {
		 java.util.Optional<Address> tempAddress=addressRepository.findById(addressId);
		 Address theAddress=null;
		 
		 if(tempAddress.isPresent()) {
			 theAddress=tempAddress.get();
		 }
		 
		 return theAddress;
	 }

	

}
