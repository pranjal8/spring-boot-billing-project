package com.virtusa.billing.dao;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.billing.model.Accountant;

public interface AccountantRepository extends CrudRepository<Accountant, Integer>
{
	Accountant findByBranch(String branch);
}
