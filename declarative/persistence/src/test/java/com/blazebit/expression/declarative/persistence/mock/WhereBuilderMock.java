package com.blazebit.expression.declarative.persistence.mock;

import com.blazebit.persistence.BaseWhereBuilder;
import com.blazebit.persistence.BetweenBuilder;
import com.blazebit.persistence.CaseWhenStarterBuilder;
import com.blazebit.persistence.CommonQueryBuilder;
import com.blazebit.persistence.FullQueryBuilder;
import com.blazebit.persistence.LikeBuilder;
import com.blazebit.persistence.MultipleSubqueryInitiator;
import com.blazebit.persistence.PredicateBuilder;
import com.blazebit.persistence.QuantifiableBinaryPredicateBuilder;
import com.blazebit.persistence.RestrictionBuilder;
import com.blazebit.persistence.SimpleCaseWhenStarterBuilder;
import com.blazebit.persistence.SubqueryBuilder;
import com.blazebit.persistence.SubqueryInitiator;
import com.blazebit.persistence.WhereBuilder;
import com.blazebit.persistence.WhereOrBuilder;
import com.blazebit.persistence.internal.RestrictionBuilderExperimental;

import java.util.Collection;

public class WhereBuilderMock implements WhereBuilder, MultipleSubqueryInitiator<RestrictionBuilder>, RestrictionBuilder {

    public String predicate;

    @Override
    public WhereOrBuilder whereOr() {
        return null;
    }

    @Override
    public WhereBuilder setWhereExpression(String expression) {
        return null;
    }

    @Override
    public BaseWhereBuilder whereExpression(String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator whereExpressionSubqueries(String expression) {
        predicate = expression;
        return this;
    }

    @Override
    public MultipleSubqueryInitiator setWhereExpressionSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryInitiator<RestrictionBuilder> whereSubquery() {
        return null;
    }

    @Override
    public SubqueryInitiator<RestrictionBuilder> whereSubquery(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator<RestrictionBuilder> whereSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder<RestrictionBuilder> whereSubquery(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder<RestrictionBuilder> whereSubquery(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public RestrictionBuilder where(String expression) {
        return null;
    }

    @Override
    public CaseWhenStarterBuilder<RestrictionBuilder> whereCase() {
        return null;
    }

    @Override
    public SimpleCaseWhenStarterBuilder<RestrictionBuilder> whereSimpleCase(String expression) {
        return null;
    }

    @Override
    public SubqueryInitiator whereExists() {
        return null;
    }

    @Override
    public SubqueryInitiator whereNotExists() {
        return null;
    }

    @Override
    public SubqueryBuilder whereExists(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder whereNotExists(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public CommonQueryBuilder<?> getParentQueryBuilder() {
        return null;
    }

    @Override
    public SubqueryInitiator<MultipleSubqueryInitiator<RestrictionBuilder>> with(String subqueryAlias) {
        return null;
    }

    @Override
    public SubqueryBuilder<MultipleSubqueryInitiator> with(String subqueryAlias, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public RestrictionBuilder end() {
        return this;
    }

    @Override
    public BetweenBuilder betweenExpression(String start) {
        return null;
    }

    @Override
    public BetweenBuilder between(Object start) {
        return null;
    }

    @Override
    public SubqueryInitiator<BetweenBuilder> betweenSubquery() {
        return null;
    }

    @Override
    public SubqueryInitiator<BetweenBuilder> betweenSubquery(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator<BetweenBuilder> betweenSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder<BetweenBuilder> betweenSubquery(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder<BetweenBuilder> betweenSubquery(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public BetweenBuilder notBetweenExpression(String start) {
        return null;
    }

    @Override
    public BetweenBuilder notBetween(Object start) {
        return null;
    }

    @Override
    public SubqueryInitiator<BetweenBuilder> notBetweenSubquery() {
        return null;
    }

    @Override
    public SubqueryInitiator<BetweenBuilder> notBetweenSubquery(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator<BetweenBuilder> notBetweenSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder<BetweenBuilder> notBetweenSubquery(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder<BetweenBuilder> notBetweenSubquery(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public QuantifiableBinaryPredicateBuilder eq() {
        return null;
    }

    @Override
    public SubqueryInitiator eq(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator eqSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder eq(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder eq(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Object eq(Object value) {
        return null;
    }

    @Override
    public Object eqExpression(String expression) {
        return null;
    }

    @Override
    public QuantifiableBinaryPredicateBuilder notEq() {
        return null;
    }

    @Override
    public SubqueryInitiator notEq(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator notEqSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder notEq(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder notEq(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Object notEq(Object value) {
        return null;
    }

    @Override
    public Object notEqExpression(String expression) {
        return null;
    }

    @Override
    public QuantifiableBinaryPredicateBuilder gt() {
        return null;
    }

    @Override
    public SubqueryInitiator gt(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator gtSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder gt(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder gt(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Object gt(Object value) {
        return null;
    }

    @Override
    public Object gtExpression(String expression) {
        return null;
    }

    @Override
    public QuantifiableBinaryPredicateBuilder ge() {
        return null;
    }

    @Override
    public SubqueryInitiator ge(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator geSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder ge(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder ge(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Object ge(Object value) {
        return null;
    }

    @Override
    public Object geExpression(String expression) {
        return null;
    }

    @Override
    public QuantifiableBinaryPredicateBuilder lt() {
        return null;
    }

    @Override
    public SubqueryInitiator lt(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator ltSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder lt(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder lt(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Object lt(Object value) {
        return null;
    }

    @Override
    public Object ltExpression(String expression) {
        return null;
    }

    @Override
    public QuantifiableBinaryPredicateBuilder le() {
        return null;
    }

    @Override
    public SubqueryInitiator le(String subqueryAlias, String expression) {
        return null;
    }

    @Override
    public MultipleSubqueryInitiator leSubqueries(String expression) {
        return null;
    }

    @Override
    public SubqueryBuilder le(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder le(String subqueryAlias, String expression, FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Object le(Object value) {
        return null;
    }

    @Override
    public Object leExpression(String expression) {
        return null;
    }

    @Override
    public SubqueryInitiator in() {
        return null;
    }

    @Override
    public SubqueryInitiator notIn() {
        return null;
    }

    @Override
    public SubqueryBuilder in(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public SubqueryBuilder notIn(FullQueryBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Object inExpressions(String... parameterOrLiteralExpressions) {
        return null;
    }

    @Override
    public Object inCollectionExpression(String collectionParameterExpression) {
        return null;
    }

    @Override
    public Object in(Collection values) {
        return null;
    }

    @Override
    public Object in(Object... values) {
        return null;
    }

    @Override
    public Object notInExpressions(String... parameterOrLiteralExpressions) {
        return null;
    }

    @Override
    public Object notInCollectionExpression(String collectionParameterExpression) {
        return null;
    }

    @Override
    public Object notIn(Collection values) {
        return null;
    }

    @Override
    public Object notIn(Object... values) {
        return null;
    }

    @Override
    public BetweenBuilder betweenLiteral(Object start) {
        return null;
    }

    @Override
    public BetweenBuilder notBetweenLiteral(Object start) {
        return null;
    }

    @Override
    public Object eqLiteral(Object value) {
        return null;
    }

    @Override
    public Object notEqLiteral(Object value) {
        return null;
    }

    @Override
    public Object gtLiteral(Object value) {
        return null;
    }

    @Override
    public Object geLiteral(Object value) {
        return null;
    }

    @Override
    public Object ltLiteral(Object value) {
        return null;
    }

    @Override
    public Object leLiteral(Object value) {
        return null;
    }

    @Override
    public Object inLiterals(Collection values) {
        return null;
    }

    @Override
    public Object inLiterals(Object... values) {
        return null;
    }

    @Override
    public Object notInLiterals(Collection values) {
        return null;
    }

    @Override
    public Object notInLiterals(Object... values) {
        return null;
    }

    @Override
    public Object isNull() {
        return null;
    }

    @Override
    public Object isNotNull() {
        return null;
    }

    @Override
    public Object isEmpty() {
        return null;
    }

    @Override
    public Object isNotEmpty() {
        return null;
    }

    @Override
    public Object isMemberOf(String expression) {
        return null;
    }

    @Override
    public Object isNotMemberOf(String expression) {
        return null;
    }

    @Override
    public LikeBuilder like(boolean caseSensitive) {
        return null;
    }

    @Override
    public LikeBuilder like() {
        return null;
    }

    @Override
    public LikeBuilder notLike(boolean caseSensitive) {
        return null;
    }

    @Override
    public LikeBuilder notLike() {
        return null;
    }

    @Override
    public RestrictionBuilderExperimental nonPortable() {
        return null;
    }

    @Override
    public PredicateBuilder where() {
        return null;
    }
}
