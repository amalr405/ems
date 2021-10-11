/*package com.ust.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ems.model.ContactInfo;
import com.ust.ems.repository.ContactInfoRepository;


 //perform service tasks.

@Service
@Transactional
public class  ContactInfoService {
	
	@Autowired
	private ContactInfoRepository repository;
	
	
	
	 
	
	public List<ContactInfo> getAllContacts() {
		List<ContactInfo> contactList = repository.findAll();
		if(contactList.size() > 0) {
			return contactList;
		} else {
			return new ArrayList<ContactInfo>();
		}
	}
	
	
	 
	
	public Optional<ContactInfo> getcontactById(int id) {
		Optional<ContactInfo> contact = repository.findByEmployeeIdNumber(id);
		return contact;
	}
	
	
	
	public ContactInfo createContact(ContactInfo entity) {
		Optional<ContactInfo> contact = repository.findByEmployeeIdNumber(entity.getEmployee_ID_Number());

		if(contact.isPresent()) {
			return this.updateContact( entity);
		} else {
			entity = repository.save(entity);
			return entity;
		}
	}
	
	
	
	 
	public ContactInfo updateContact(ContactInfo entity) {
		Optional<ContactInfo> contact= repository.findByEmployeeIdNumber(entity.getEmployee_ID_Number());

		if(contact.isPresent()) {
			ContactInfo contactEntity = contact.get();
			contactEntity.setEmployee_ID_Number(entity.getEmployee_ID_Number());
			contactEntity.setc_First_Name(entity.getc_First_Name());
			contactEntity.setc_Middle_Name(entity.getc_Middle_Name());
			contactEntity.setc_Last_Name(entity.getc_Last_Name());
			contactEntity.setc_Cellular_Phone(entity.getc_Cellular_Phone());
			contactEntity.setc_Home_Phone(entity.getc_Home_Phone());
			contactEntity.setc_City(entity.getc_City());
			contactEntity.setc_Address(entity.getc_Address());
			contactEntity=repository.save(contactEntity);
			
			
			return contactEntity;
		}
		else {
			entity = null;
			return entity;  
		}
	} 
	
	
	
	public void deleteContactById(int id) {
		Optional<ContactInfo> contact= repository.findByEmployeeIdNumber(id);    
		if(contact.isPresent()) {
			repository.deleteByEmployeeIdNumber(id);
		}
		else {
			return;
		}
		
	}

}*/

