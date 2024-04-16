package com.example.Controller;

import java.io.IOException;
import java.util.List;
import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.Service.ComplaintsService;
import com.example.model.Complaints;
@CrossOrigin
@RestController
@RequestMapping("/api/complaints")
public class ComplaintsController {

    @Autowired
    private ComplaintsService complaintsService;
    

    public ComplaintsController(ComplaintsService complaintsService) {
		super();
		this.complaintsService = complaintsService;
	}

	@PostMapping
    public Complaints registerComplaint(@RequestBody Complaints complaint) {
      return complaintsService.registerComplaint(complaint);
   }
   
   
    @GetMapping
    public List<Complaints> getComplaints() {
       return complaintsService.getAllComplaints();
   }
	
	 @GetMapping("/{id}")
	    public ResponseEntity<Complaints> getComplaintById(@PathVariable("id")Long id) {
	        Complaints complaint = complaintsService.getComplaintsById(id);
	        if (complaint == null) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(complaint);
	    }
	 
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Complaints> deleteComplaint(@PathVariable Long id) {
		 complaintsService.deleteComplaint(id);
	        return ResponseEntity.noContent().build();
	    }
}

