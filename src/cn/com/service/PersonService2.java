package cn.com.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public interface PersonService2 {

	void save();

	Set<String> getSets();

	List<String> getMobiles();

	Properties getP();

	Map<String, String> getMaps();
}