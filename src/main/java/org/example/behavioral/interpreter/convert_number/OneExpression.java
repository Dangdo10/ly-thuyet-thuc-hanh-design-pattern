package org.example.behavioral.interpreter.convert_number;

public class OneExpression extends Expression {

    @Override
    public String one() {
        return "I";
    }

    @Override
    public String four() {
        return "IV";
    }

    @Override
    public String five() {
        return "V";
    }

    @Override
    public String nine() {
        return "IX";
    }

    @Override
    public int multiplier() {
        return 1;
    }
}
