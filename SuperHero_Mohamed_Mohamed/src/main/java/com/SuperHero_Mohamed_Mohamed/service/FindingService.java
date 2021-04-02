package com.SuperHero_Mohamed_Mohamed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperHero_Mohamed_Mohamed.entity.Finding;
import com.SuperHero_Mohamed_Mohamed.repo.FindingRepository;

@Service
public class FindingService {

	@Autowired
	FindingRepository repository;

	public boolean addFinding(Finding finding) {
		repository.save(finding);
		return true;
	}

	public Finding getFindingByID(int findingID) {
		return repository.getByFindingID(findingID);
	}

	public List<Finding> getAllFinding() {
		return repository.findAll();
	}

	public boolean updateFinding(int findingID, Finding finding) {
		Finding getFinding = repository.getByFindingID(findingID);

		if (getFinding != null) {

			getFinding.setFindingDate(getFinding.getFindingDate());
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
