package by.goncharov.compile.statements;

import by.goncharov.compile.base.Base;

public abstract class Statement extends Base {
    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }
}
