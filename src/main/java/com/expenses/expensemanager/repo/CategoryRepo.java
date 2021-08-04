package com.expenses.expensemanager.repo;

import com.expenses.expensemanager.document.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends ReactiveMongoRepository<Category, String> {
}
