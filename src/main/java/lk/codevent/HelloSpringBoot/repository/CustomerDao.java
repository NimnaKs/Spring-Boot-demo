package lk.codevent.HelloSpringBoot.repository;

import lk.codevent.HelloSpringBoot.dto.CustomerDTO;
import lk.codevent.HelloSpringBoot.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<CustomerEntity,String> {

}
