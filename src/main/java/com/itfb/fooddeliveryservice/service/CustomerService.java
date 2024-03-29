package com.itfb.fooddeliveryservice.service;

import com.itfb.fooddeliveryservice.exception.EntityNotFoundException;
import com.itfb.fooddeliveryservice.model.Message;
import com.itfb.fooddeliveryservice.model.domain.Customer;
import com.itfb.fooddeliveryservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final CustomerRepository customerRepository;

    @Transactional
    public Customer saveCustomer(Customer customer) {
        Customer newCustomer = customer;
        newCustomer.setEnabled(true);
        newCustomer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
        return customerRepository.save(newCustomer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Transactional
    public Customer getCustomerByLogin(String login) {
        return customerRepository.findCustomerByLogin(login).orElseThrow(
                () -> new EntityNotFoundException(Message.USER_NOT_FOUND, login));
    }

    @Transactional
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(Message.USER_NOT_FOUND, id));
    }
}
