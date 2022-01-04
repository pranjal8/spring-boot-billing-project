package com.billing.dao;

import org.springframework.data.repository.CrudRepository;

import com.billing.model.Students;

public interface StudentsRepository extends CrudRepository<Students, Integer>
{

}
