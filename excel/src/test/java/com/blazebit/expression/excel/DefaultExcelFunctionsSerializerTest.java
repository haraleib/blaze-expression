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

package com.blazebit.expression.excel;

import com.blazebit.domain.Domain;
import com.blazebit.domain.boot.model.DomainBuilder;
import com.blazebit.domain.runtime.model.DomainModel;
import com.blazebit.expression.Expression;
import com.blazebit.expression.ExpressionCompiler;
import com.blazebit.expression.ExpressionSerializer;
import com.blazebit.expression.ExpressionService;
import com.blazebit.expression.Expressions;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Harald Eibensteiner
 * @since 1.0.0
 */
public class DefaultExcelFunctionsSerializerTest {

    private final DomainModel domainModel;
    private final ExpressionService expressionService;

    public DefaultExcelFunctionsSerializerTest() {
        DomainBuilder domainBuilder = Domain.getDefaultProvider().createDefaultBuilder();
        domainModel = domainBuilder.build();
        expressionService = Expressions.forModel(domainModel);
    }

    @Test
    public void STARTS_WITH_should_render_to_excel_function() {
        Assert.assertEquals("LEFT(\"Lorem Ipsum\"; LEN(\"Lorem\")) = \"Lorem\"", serialize("STARTS_WITH('Lorem Ipsum', 'Lorem')"));
    }

    @Test
    public void STARTS_WITH_using_offset_should_render_to_excel_function() {
        Assert.assertEquals("MID(\"Lorem Ipsum\"; 1; LEN(\"Lorem\")) = \"Lorem\"", serialize("STARTS_WITH('Lorem Ipsum', 'Lorem', 1)"));
    }

    private String serialize(String expressionString) {
        ExpressionCompiler compiler = expressionService.createCompiler();

        Expression expression = compiler.createExpressionOrPredicate(expressionString);
        ExpressionSerializer<StringBuilder> excelSerializer = expressionService.createSerializer(StringBuilder.class, "excel");
        ExcelExpressionSerializerContext serializerContext = new ExcelExpressionSerializerContext(expressionService, 1);

        StringBuilder sb = new StringBuilder();
        excelSerializer.serializeTo(serializerContext, expression, sb);
        return sb.toString();
    }
}
