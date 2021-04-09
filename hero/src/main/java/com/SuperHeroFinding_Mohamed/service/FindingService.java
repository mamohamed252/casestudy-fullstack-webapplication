package com.SuperHeroFinding_Mohamed.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperHeroFinding_Mohamed.entity.Finding;
import com.SuperHeroFinding_Mohamed.repo.FindingRepository;

@Service
public class FindingService {

	@Autowired
	FindingRepository repository;

	public Finding addFinding(Finding finding) {
		return repository.save(finding);
	}

	public Finding getFindingByID(int findingID) {
		return repository.getByFindingID(findingID);
	}

	public List<Finding> findAllByFindingDate(Date findingDate) {
		
		
		return repository.findAllByFindingDate(findingDate);
		
	}

	public List<Finding> getAllFinding() {
		return repository.findAll();
	}

	public boolean updateFinding(int findingID, Finding finding) {
		Finding getFinding = repository.getByFindingID(findingID);

		if (getFinding != null) {

			getFinding.setFindingDate(finding.getFindingDate());
			getFinding.setHeroName(finding.getHeroName());
			getFinding.setLocationName(finding.getLocationName());
			getFinding.setOrgName(finding.getOrgName());
			repository.save(getFinding);
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteFindingByID(int findingID) {
		Finding deleteSearch = repository.getByFindingID(findingID);

		if (deleteSearch != null) {
			repository.delete(deleteSearch);
			return true;
		} else {
			return false;
		}
	}

}
