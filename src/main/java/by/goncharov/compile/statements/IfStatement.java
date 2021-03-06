package by.goncharov.compile.statements;

import by.goncharov.compile.base.Base;
import by.goncharov.compile.expressions.Condition;

import java.util.List;

public class IfStatement extends Statement {
    private Condition condition;
    private List<Base> statements;
    private ElseStatement elseStatement;

    public IfStatement(Condition condition, List<Base> statements) {
        this.condition = condition;
        this.statements = statements;
    }

    public IfStatement(Condition condition, List<Base> statements, ElseStatement elseStatements) {
        this.condition = condition;
        this.statements = statements;
        this.elseStatement = elseStatements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat : statements) {

            builder.append(stat.toString());
            if (!stat.toString().endsWith("}"))
                builder.append(";");

        }
        if (elseStatement != null) {
            return "if(" + condition.toString() + ")\n{" + builder + "}" + elseStatement.toString() + " ";
        }
        return "if(" + condition.toString() + ")\n{" + builder + "}";
    }
}
