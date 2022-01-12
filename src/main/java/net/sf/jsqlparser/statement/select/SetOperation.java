/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.statement.select;

import net.sf.jsqlparser.parser.ASTNodeAccessImpl;
import net.sf.jsqlparser.statement.select.SetOperationList.SetOperationType;

public abstract class SetOperation extends ASTNodeAccessImpl {

    private SetOperationType type;
    private boolean all;

    public SetOperation(SetOperationType type) {
        this.type = type;
    }


    public boolean isAll() {
        return all;
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    protected String modifierToString() {
        if (isAll()) {
            return " ALL";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return type.name() + modifierToString();
    }
}
