package com.teachmeskills.lesson8.task2;

import com.teachmeskills.lesson8.task2.model.accountant;
import com.teachmeskills.lesson8.task2.model.director;
import com.teachmeskills.lesson8.task2.model.worker;
import com.teachmeskills.lesson8.task2.model.roleProvider;

public class Runner {
    public static void main(String[] args) {
        roleProvider human1 = new director();
        roleProvider human2 = new accountant();
        roleProvider human3 = new worker();

        human1.getProfession();
        human2.getProfession();
        human3.getProfession();
    }
}
