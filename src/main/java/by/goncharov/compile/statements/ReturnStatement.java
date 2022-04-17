package by.goncharov.compile.statements;

import by.goncharov.compile.base.Base;

public class ReturnStatement extends Statement {
    private Base statement;

    public ReturnStatement(Base statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "return " + this.statement.toString() ;
    }
}
