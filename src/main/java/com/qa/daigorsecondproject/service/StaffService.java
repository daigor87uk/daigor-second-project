package com.qa.daigorsecondproject.service;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.qa.daigorsecondproject.data.entity.Staff;
import com.qa.daigorsecondproject.data.repository.StaffRepository;

@Service
public class StaffService {

	private StaffRepository staffRepository;
	
	@Autowired
	public StaffService(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}
	
	public List<Staff> readAll() {
		return staffRepository.findAll();
	}
	
	public Staff readById(int id) {
		Optional<Staff> staff = staffRepository.findById(id);
		
		if (staff.isPresent()) {
			return staff.get();
		}
		throw new EntityNotFoundException("Staff with id " + id + " was not found");
	}
	
	public List<Post> readPostsByStaffId(int id) {
		Staff staff = this.readById(id);
		return staff.getPosts();
	}
	
	public Staff create(Staff staff) {
		return staffRepository.save(staff);
	}
	
}
