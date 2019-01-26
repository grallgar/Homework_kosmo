package ru.astraperaspera.kc.ls3;

import java.math.BigDecimal;

public class task1 {

    private void toUSD(int rub, double course) { // Принимаем сумму в рублях и значение курса
        BigDecimal bdCourse = new BigDecimal(course);
        BigDecimal bdRub = new BigDecimal(rub);

        BigDecimal bdUsd = bdCourse.multiply(bdRub); // Перемжножаем
        BigDecimal roundBdUsd = bdUsd.setScale(2, BigDecimal.ROUND_HALF_UP); //округляем до двух значащих разрядов
        System.out.println(roundBdUsd);
    }

    public static void main(String[] args) {
    task1 newUsd = new task1();
    newUsd.toUSD(12, 1.6469);
    }
}
