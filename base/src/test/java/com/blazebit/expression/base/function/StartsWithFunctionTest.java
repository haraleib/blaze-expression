package com.blazebit.expression.base.function;

import com.blazebit.domain.Domain;
import com.blazebit.domain.runtime.model.DomainModel;
import com.blazebit.expression.ExpressionCompiler;
import com.blazebit.expression.ExpressionInterpreter;
import com.blazebit.expression.ExpressionService;
import com.blazebit.expression.Expressions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StartsWithFunctionTest {

    private DomainModel domainModel;
    private ExpressionInterpreter interpreter;
    private ExpressionCompiler compiler;

    @Before
    public void before() {
        if (domainModel == null) {
            domainModel = Domain.getDefaultProvider().createDefaultBuilder().build();
            ExpressionService service = Expressions.forModel(domainModel);
            compiler = service.createCompiler();
            interpreter = service.createInterpreter();
        }
    }

    @Test
    public void should_start_with_substring() {
        Assert.assertTrue(evaluatePredicate("STARTS_WITH('Lorem ipsum dolor', 'Lorem ipsum')"));
    }

    @Test
    public void should_not_start_with_substring() {
        Assert.assertFalse(evaluatePredicate("STARTS_WITH('Lorem ipsum', 'Lorem ipsum dolor')"));
    }

    @Test
    public void should_start_with_substring_using_offset_1() {
        Assert.assertTrue(evaluatePredicate("STARTS_WITH('Lorem ipsum dolor', 'Lorem ipsum', 1)"));
    }

    @Test
    public void should_not_start_with_substring_using_offset_1() {
        Assert.assertFalse(evaluatePredicate("STARTS_WITH('Lorem ipsum dolor', 'orem ipsum', 1)"));
    }

    @Test
    public void should_start_with_substring_using_offset_2() {
        Assert.assertTrue(evaluatePredicate("STARTS_WITH('Lorem ipsum dolor', 'orem ipsum', 2)"));
    }

    private Boolean evaluatePredicate(String expressionString) {
        return interpreter.evaluate(
                compiler.createPredicate(expressionString));
    }
}
