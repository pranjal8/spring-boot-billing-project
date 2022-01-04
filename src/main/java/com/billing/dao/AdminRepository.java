package com.billing.dao;

import org.springframework.data.repository.CrudRepository;

import com.billing.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, String>
{

}
