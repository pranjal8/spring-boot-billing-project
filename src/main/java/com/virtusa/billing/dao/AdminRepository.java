package com.virtusa.billing.dao;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.billing.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, String>
{

}
