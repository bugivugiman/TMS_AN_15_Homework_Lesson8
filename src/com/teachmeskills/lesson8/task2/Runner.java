package com.teachmeskills.lesson8.task2;

import com.teachmeskills.lesson8.task2.model.accountant;
import com.teachmeskills.lesson8.task2.model.director;
import com.teachmeskills.lesson8.task2.model.worker;
import com.teachmeskills.lesson8.task2.model.roleProvider;

public class Runner {
    public static void main(String[] args) {
        roleProvider human1 = new Director();
        roleProvider human2 = new Accountant();
        roleProvider human3 = new Worker();

        human1.getProfession();
        human2.getProfession();
        human3.getProfession();
    }
}
