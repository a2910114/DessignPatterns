package com.mykhaylenko.dessign.filter;

import com.mykhaylenko.dessign.filter.criteria.Criteria;
import com.mykhaylenko.dessign.filter.criteria.impl.CriteriaFemale;
import com.mykhaylenko.dessign.filter.criteria.impl.CriteriaMale;
import com.mykhaylenko.dessign.filter.criteria.impl.CriteriaSingle;
import com.mykhaylenko.dessign.filter.criteria.impl.OrCriteria;
import com.mykhaylenko.dessign.filter.person.Person;
import com.mykhaylenko.dessign.simple.*;
import com.mykhaylenko.dessign.simple.Number;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("first", "male", true));
        persons.add(new Person("second", "female", false));
        persons.add(new Person("third", "male", true));
        persons.add(new Person("forth", "female", true));

        Criteria male = new OrCriteria(new CriteriaMale(), new CriteriaSingle());
        List<Person> males = male.meetCriteria(persons);

        List<Person> persons1 = new ArrayList<>();
        List<Person> persons2 = new ArrayList<>();
        List<Person> persons3 = new ArrayList<>();

        boolean b = !(persons1.isEmpty() && persons2.isEmpty() && persons3.isEmpty());
        System.out.println(b);
    }
}


