package com.example.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Repository.ComplaintsRepository;
import com.example.model.Complaints;

@Service
public class ComplaintsServiceImpl implements ComplaintsService {

    @Autowired
    private ComplaintsRepository complaintsRepository;

    @Override
    public Complaints registerComplaint(Complaints complaint) {
       return complaintsRepository.save(complaint);
    }
  
	@Override
	public List<Complaints> getAllComplaints() {
		// TODO Auto-generated method stub
		 return complaintsRepository.findAll();
	}

	@Override
	public Complaints getComplaintsById(Long id) {
		
        return complaintsRepository.findById(id).orElse(null);

	}

	@Override
	public void deleteComplaint(Long id) {
		complaintsRepository.deleteById(id);

	}

}
