package com.xadmin.springBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.springBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {

}
