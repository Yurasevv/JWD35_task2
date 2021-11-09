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

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {

			filteredAppliances = appliances.stream()
					.filter(a -> criteria.getGroupSearchName().toLowerCase(Locale.ROOT).equals(a.getClass().getSimpleName().toLowerCase(Locale.ROOT))
					&& a.toString().replace("\'", "").toLowerCase(Locale.ROOT).contains(entry.getKey().toLowerCase(Locale.ROOT) + "=" + entry.getValue().toString().toLowerCase(Locale.ROOT)))
					//(entry.getKey().toLowerCase(Locale.ROOT) + "='" + entry.getValue().toString().toLowerCase(Locale.ROOT) + "'"))
					//.distinct()
					.collect(Collectors.toList());
		}
		return filteredAppliances;
	}
	
	private List<String> initSearchData() {
		List<Appliance> appliances = repository.getInstance().getData();
		return null;
	}

}



