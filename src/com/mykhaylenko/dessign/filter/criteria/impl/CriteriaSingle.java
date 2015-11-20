package com.mykhaylenko.dessign.filter.criteria.impl;

import com.mykhaylenko.dessign.filter.criteria.Criteria;
import com.mykhaylenko.dessign.filter.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singleList = new ArrayList<>();

        for (Person person : persons) {
            if (!person.isMarried()) {
                singleList.add(person);
            }
        }

        return singleList;
    }
}
