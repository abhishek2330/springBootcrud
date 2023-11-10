package com.xadmin.springBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.springBootCrud.bean.Subject;
import com.xadmin.springBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subjectRepo;

	public List<Subject> getAllSubjects(){
		
		
		
		List<Subject> subjects = new ArrayList<>();
		
		//return subjectRepo.findAll();
		//List<Subject> subjects = null;
		//subjects = (List<Subject>) subjectRepo.findAll();
		
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
		
	}

	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
		
	}

	public void updateSubject(String id, Subject subject) {
		
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String id) {
		
		subjectRepo.deleteById(id);
		
	}
}
