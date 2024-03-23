package lk.codevent.HelloSpringBoot.service;

import jakarta.transaction.Transactional;
import lk.codevent.HelloSpringBoot.conversion.ConversionData;
import lk.codevent.HelloSpringBoot.dto.CustomerDTO;
import lk.codevent.HelloSpringBoot.entity.CustomerEntity;
import lk.codevent.HelloSpringBoot.repository.CustomerDao;
import lk.codevent.HelloSpringBoot.util.UtilMatters;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceIMPL implements CustomerService{
    private final CustomerDao customerDao;

    private final ConversionData convert;
    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        customerDTO.setCustomerId(UtilMatters.generateId());
        customerDao.save(convert.convertToCustomerEntity(customerDTO));
    }

    @Override
    public CustomerDTO getCustomer(String id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(CustomerDTO customerDTO) {

    }
}
