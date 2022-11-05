package com.sergeev.mvc.calculator.logic;

import com.sergeev.mvc.calculator.constant.Action;

import static com.sergeev.mvc.calculator.constant.Action.MULTIPLICATION;

public class Calculate {

    public Double calculateHTML(Double numOne, Double numTwo, Action action) {
        Double result = null;
        switch (action) {
            case MULTIPLICATION:
                result = numOne * numTwo;
                break;
            case ADDITION:
                result = numOne + numTwo;
                break;
            case DIVISION:
                result = numOne / numTwo;
                break;
            case SUBTRACTION:
                result = numOne - numTwo;
                break;
        }
        return result;
    }

    public Double returnDoubleNum(String num) {
        return Double.valueOf(num);
    }
}
