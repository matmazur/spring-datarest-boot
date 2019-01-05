package com.matmazur.springdatarestboot.model.wrappers;

import com.matmazur.springdatarestboot.model.City;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class CityWrapper {

    private List<City> cities = new ArrayList<>();

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
