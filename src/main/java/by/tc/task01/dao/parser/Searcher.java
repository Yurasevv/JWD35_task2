package by.tc.task01.dao.parser;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Searcher {
	
	private ApplianceRepository repository;
	private List<String> searchData;
	
	public Searcher() {
		this.repository = ApplianceRepository.getInstance() ;
		searchData = initSearchData();
	}
	

	public List<Appliance> find(Criteria criteria){

		List<Appliance> results = ApplianceRepository.getInstance().getData().stream()
				.filter(a -> criteria.getGroupSearchName().toLowerCase(Locale.ROOT).equals(a.getClass().getSimpleName().toLowerCase(Locale.ROOT)))
				//TODO add filter for other criteria
				.collect(Collectors.toList());
		return results;
	}
	
	private List<String> initSearchData() {
		List<Appliance> appliances = repository.getInstance().getData();
		return null;
	}

}



