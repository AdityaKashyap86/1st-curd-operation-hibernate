package com.sunglowsys.service;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import com.sunglowsys.repository.AddressRepositoryImpl;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    AddressRepository addressRepository = new AddressRepositoryImpl ();

    @Override
    public Address save(Address address) {
        addressRepository.save (address);
        return null;
    }

    @Override
    public Address update(Address address, Long id) {
        return null;
    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
