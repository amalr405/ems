package com.ust.ems.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.ems.entity.ContactInfo;
import com.ust.ems.service.ContactInfoService;

@RestController
@RequestMapping("/contacts")
public class ContactInfoController {
	@Autowired
	ContactInfoService service;
	
	@GetMapping("/ContactInfo")
	public ResponseEntity<List<ContactInfo>> getAllcontacts() {
		try {
			List<ContactInfo> contactList = service.getAllContacts();
			if (contactList.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(contactList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/ContactInfo/{contact_id}")
	public ResponseEntity<ContactInfo> getEmployeeById(@PathVariable("emp_id") int id) {
		try {
			Optional<ContactInfo> contact = service.getcontactById(id);
			if (contact.isPresent()) {
				return new ResponseEntity<>(contact.get(), HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/ContactInfo")
	public ResponseEntity<ContactInfo> createContact(@RequestBody ContactInfo contact) {
		try {
			return new ResponseEntity<>(service.createContact(contact), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/ContactInfo")
public ResponseEntity<ContactInfo> updateContact(@RequestBody ContactInfo contact) {
try {
ContactInfo entity = service.updateContact(contact);
if (entity != null) {
return new ResponseEntity<>(entity, HttpStatus.OK);
}
return new ResponseEntity<>(HttpStatus.NOT_FOUND);
} catch (Exception e) {
return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
}
}
	
	@DeleteMapping("/ContactInfo/{emp_id}")
	public ResponseEntity<HttpStatus> deleteEmployeeContactInfoById(@PathVariable("emp_id") int id) {
		try {
			service.deleteContactById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}