package lk.codevent.HelloSpringBoot.service;

import lk.codevent.HelloSpringBoot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    CustomerDTO getCustomer(String id);
    List<CustomerDTO> getAllCustomers();
    void updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(CustomerDTO customerDTO);

}
