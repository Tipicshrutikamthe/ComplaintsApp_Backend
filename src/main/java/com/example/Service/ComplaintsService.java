package com.example.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.model.Complaints;

public interface ComplaintsService {
    Complaints registerComplaint(Complaints complaint);
    
	List<Complaints> getAllComplaints();

	Complaints getComplaintsById(Long id);

	void deleteComplaint(Long id);

//    void submitForm(String name, String contact, String complaint, String description, MultipartFile image);


}

