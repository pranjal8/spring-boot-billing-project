package com.billing.dao;

import org.springframework.data.repository.CrudRepository;

import com.billing.model.Accountant;

public interface AccountantRepository extends CrudRepository<Accountant, Integer>
{
	Accountant findByBranch(String branch);
}
