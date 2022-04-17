package by.goncharov.compile.statements;

import by.goncharov.compile.base.Base;
import by.goncharov.compile.expressions.Condition;
import by.goncharov.compile.statements.Statement;

import java.util.List;

public class While extends Statement {
    private final Condition condition;
    private final List<Base> statements;

    public While(Condition condition, List<Base> statements) {
        this.condition = condition;
        this.statements = statements;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat : statements) {
            builder.append(stat.toString());
            if (!stat.toString().endsWith("}"))
                builder.append(";");

        }

        return "while(" +
                condition.toString() + ")"
                + "{" +
                builder +
                '}';
    }
}
