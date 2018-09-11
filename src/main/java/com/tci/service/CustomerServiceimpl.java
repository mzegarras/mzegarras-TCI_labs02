package com.tci.service;


import com.tci.dto.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceimpl implements CustomerService {

    @Override
    public List<Customer> listAll() {
        System.out.println("Begin");
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();

        List<Customer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println("End");

        return list;
    }
}
