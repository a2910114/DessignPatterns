package com.mykhaylenko.dessign.filter.criteria.impl;

import com.mykhaylenko.dessign.filter.criteria.Criteria;
import com.mykhaylenko.dessign.filter.person.Person;

import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class OrCriteria implements Criteria{

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personsForFirstCriteria = firstCriteria.meetCriteria(persons);
        List<Person> personsForSecondCriteria = secondCriteria.meetCriteria(persons);

        for (Person person : personsForSecondCriteria) {
            if (!personsForFirstCriteria.contains(person)) {
                personsForFirstCriteria.add(person);
            }
        }

        return personsForFirstCriteria;
    }
}
