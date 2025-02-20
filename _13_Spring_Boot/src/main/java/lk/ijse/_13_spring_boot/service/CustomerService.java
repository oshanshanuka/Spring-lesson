package lk.ijse._13_spring_boot.service;

import lk.ijse._13_spring_boot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    void updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(int id);
}