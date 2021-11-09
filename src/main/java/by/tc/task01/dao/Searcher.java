package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Searcher {
	
	private ApplianceRepository repository;
	private List<String> searchData;

	
	public Searcher() {
		this.repository = ApplianceRepository.getInstance() ;
		searchData = initSearchData();
	}
	

	public List<Appliance> find(Criteria criteria){

		List<Appliance> appliances = ApplianceRepository.getInstance().getData();
		List<Appliance> filteredAppliances = new ArrayList<>();

		for (Map.Entry<String, Object> entry : criteria.getCriteriaMap().entrySet()) {

			filteredAppliances = appliances.stream()
					.filter(a -> (a.getClass().getSimpleName().toLowerCase(Locale.ROOT).equals(criteria.getGroupSearchName().toLowerCase(Locale.ROOT))))
					.filter(b -> b.toString().toLowerCase(Locale.ROOT).contains(entry.getKey().replace("_", "").toLowerCase(Locale.ROOT) +
							"=" + entry.getValue().toString().toLowerCase(Locale.ROOT)))
					.collect(Collectors.toList());
		}
		return filteredAppliances;
	}
	
	private List<String> initSearchData() {
		List<Appliance> appliances = repository.getInstance().getData();
		return null;
	}

}



