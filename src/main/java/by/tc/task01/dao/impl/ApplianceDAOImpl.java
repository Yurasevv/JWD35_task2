package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.parser.Searcher;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO{

	private Searcher searcher;

	{
		searcher = new Searcher();
	}

	public List<Appliance> find(Criteria criteria) {

		return searcher.find(criteria);
	}
}
