package com.mykhaylenko.dessign.filter.criteria;

import com.mykhaylenko.dessign.filter.person.Person;

import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
