package com.mykhaylenko.dessign.filter.criteria.impl;

import com.mykhaylenko.dessign.filter.criteria.Criteria;
import com.mykhaylenko.dessign.filter.person.Person;

import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class AndCriteria implements Criteria {

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria seqondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = seqondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personsForFirstCriteria = firstCriteria.meetCriteria(persons);

        return secondCriteria.meetCriteria(personsForFirstCriteria);
    }
}
