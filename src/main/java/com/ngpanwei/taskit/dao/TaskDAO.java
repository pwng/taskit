package com.ngpanwei.taskit.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ngpanwei.taskit.model.Task;

public interface TaskDAO extends PagingAndSortingRepository<Task, Long> {
	List<Task> findByName(String name);
}