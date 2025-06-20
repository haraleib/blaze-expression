/*
 * Copyright 2019 - 2025 Blazebit.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.blazebit.expression.declarative.persistence;

import com.blazebit.domain.declarative.DeclarativeDomain;
import com.blazebit.domain.runtime.model.DomainModel;
import com.blazebit.expression.Expression;
import com.blazebit.expression.ExpressionCompiler;
import com.blazebit.expression.ExpressionSerializer;
import com.blazebit.expression.ExpressionService;
import com.blazebit.expression.Expressions;
import com.blazebit.expression.declarative.persistence.mock.WhereBuilderMock;
import com.blazebit.expression.persistence.PersistenceExpressionSerializerContext;
import com.blazebit.persistence.WhereBuilder;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Harald Eibensteiner
 * @since 1.0.0
 */
public class DefaultPersistenceFunctionsSerializerTest {

    private final ExpressionService expressionService;
    private final ExpressionSerializer<WhereBuilder> serializer;
    private final ExpressionSerializer.Context serializerContext;

    public DefaultPersistenceFunctionsSerializerTest() {
        DomainModel domainModel = DeclarativeDomain.getDefaultProvider()
                .createDefaultConfiguration()
                .createDomainModel();
        this.expressionService = Expressions.forModel(domainModel);
        this.serializer = expressionService.createSerializer(WhereBuilder.class);
        this.serializerContext = new PersistenceExpressionSerializerContext<>(expressionService, null);
    }

    @Test
    public void STARTS_WITH_should_render_to_persistence_function() {
        Expression expression = createPredicateExpression("STARTS_WITH('Lorem ipsum dolor', 'Lorem ipsum')");
        WhereBuilderMock whereBuilderMock = new WhereBuilderMock();

        serializer.serializeTo(serializerContext, expression, whereBuilderMock);
        Assert.assertEquals("LOCATE('Lorem ipsum', 'Lorem ipsum dolor') = 1", whereBuilderMock.predicate);
    }

    @Test
    public void STARTS_WITH_using_offset_should_render_to_persistence_function() {
        Expression expression = createPredicateExpression("STARTS_WITH('Lorem ipsum dolor', 'Lorem ipsum', 1)");
        WhereBuilderMock whereBuilderMock = new WhereBuilderMock();

        serializer.serializeTo(serializerContext, expression, whereBuilderMock);
        Assert.assertEquals("LOCATE('Lorem ipsum', 'Lorem ipsum dolor') = 1", whereBuilderMock.predicate);
    }

    private Expression createPredicateExpression(String expressionString) {
        ExpressionCompiler compiler = expressionService.createCompiler();
        return compiler.createPredicate(expressionString);
    }
}
