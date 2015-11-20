package com.mykhaylenko.dessign.filter.criteria.impl;

import com.mykhaylenko.dessign.filter.criteria.Criteria;
import com.mykhaylenko.dessign.filter.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femaleList = new ArrayList<>();

        for (Person person : persons) {
            if ("female".equalsIgnoreCase(person.getGender())) {
                femaleList.add(person);
            }
        }

        return femaleList;
    }
}
