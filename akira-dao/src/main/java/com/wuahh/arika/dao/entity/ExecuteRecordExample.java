package com.wuahh.arika.dao.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExecuteRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExecuteRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdIsNull() {
            addCriterion("repo_conf_id is null");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdIsNotNull() {
            addCriterion("repo_conf_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdEqualTo(Integer value) {
            addCriterion("repo_conf_id =", value, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdNotEqualTo(Integer value) {
            addCriterion("repo_conf_id <>", value, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdGreaterThan(Integer value) {
            addCriterion("repo_conf_id >", value, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repo_conf_id >=", value, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdLessThan(Integer value) {
            addCriterion("repo_conf_id <", value, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdLessThanOrEqualTo(Integer value) {
            addCriterion("repo_conf_id <=", value, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdIn(List<Integer> values) {
            addCriterion("repo_conf_id in", values, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdNotIn(List<Integer> values) {
            addCriterion("repo_conf_id not in", values, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdBetween(Integer value1, Integer value2) {
            addCriterion("repo_conf_id between", value1, value2, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoConfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repo_conf_id not between", value1, value2, "repoConfId");
            return (Criteria) this;
        }

        public Criteria andRepoIdIsNull() {
            addCriterion("repo_id is null");
            return (Criteria) this;
        }

        public Criteria andRepoIdIsNotNull() {
            addCriterion("repo_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepoIdEqualTo(Integer value) {
            addCriterion("repo_id =", value, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdNotEqualTo(Integer value) {
            addCriterion("repo_id <>", value, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdGreaterThan(Integer value) {
            addCriterion("repo_id >", value, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repo_id >=", value, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdLessThan(Integer value) {
            addCriterion("repo_id <", value, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdLessThanOrEqualTo(Integer value) {
            addCriterion("repo_id <=", value, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdIn(List<Integer> values) {
            addCriterion("repo_id in", values, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdNotIn(List<Integer> values) {
            addCriterion("repo_id not in", values, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdBetween(Integer value1, Integer value2) {
            addCriterion("repo_id between", value1, value2, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repo_id not between", value1, value2, "repoId");
            return (Criteria) this;
        }

        public Criteria andRepoNameIsNull() {
            addCriterion("repo_name is null");
            return (Criteria) this;
        }

        public Criteria andRepoNameIsNotNull() {
            addCriterion("repo_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepoNameEqualTo(String value) {
            addCriterion("repo_name =", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameNotEqualTo(String value) {
            addCriterion("repo_name <>", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameGreaterThan(String value) {
            addCriterion("repo_name >", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameGreaterThanOrEqualTo(String value) {
            addCriterion("repo_name >=", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameLessThan(String value) {
            addCriterion("repo_name <", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameLessThanOrEqualTo(String value) {
            addCriterion("repo_name <=", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameLike(String value) {
            addCriterion("repo_name like", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameNotLike(String value) {
            addCriterion("repo_name not like", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameIn(List<String> values) {
            addCriterion("repo_name in", values, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameNotIn(List<String> values) {
            addCriterion("repo_name not in", values, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameBetween(String value1, String value2) {
            addCriterion("repo_name between", value1, value2, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameNotBetween(String value1, String value2) {
            addCriterion("repo_name not between", value1, value2, "repoName");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdIsNull() {
            addCriterion("execute_group_id is null");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdIsNotNull() {
            addCriterion("execute_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdEqualTo(Integer value) {
            addCriterion("execute_group_id =", value, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdNotEqualTo(Integer value) {
            addCriterion("execute_group_id <>", value, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdGreaterThan(Integer value) {
            addCriterion("execute_group_id >", value, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("execute_group_id >=", value, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdLessThan(Integer value) {
            addCriterion("execute_group_id <", value, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("execute_group_id <=", value, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdIn(List<Integer> values) {
            addCriterion("execute_group_id in", values, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdNotIn(List<Integer> values) {
            addCriterion("execute_group_id not in", values, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("execute_group_id between", value1, value2, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andExecuteGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("execute_group_id not between", value1, value2, "executeGroupId");
            return (Criteria) this;
        }

        public Criteria andDockerfileIsNull() {
            addCriterion("dockerfile is null");
            return (Criteria) this;
        }

        public Criteria andDockerfileIsNotNull() {
            addCriterion("dockerfile is not null");
            return (Criteria) this;
        }

        public Criteria andDockerfileEqualTo(String value) {
            addCriterion("dockerfile =", value, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileNotEqualTo(String value) {
            addCriterion("dockerfile <>", value, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileGreaterThan(String value) {
            addCriterion("dockerfile >", value, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileGreaterThanOrEqualTo(String value) {
            addCriterion("dockerfile >=", value, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileLessThan(String value) {
            addCriterion("dockerfile <", value, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileLessThanOrEqualTo(String value) {
            addCriterion("dockerfile <=", value, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileLike(String value) {
            addCriterion("dockerfile like", value, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileNotLike(String value) {
            addCriterion("dockerfile not like", value, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileIn(List<String> values) {
            addCriterion("dockerfile in", values, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileNotIn(List<String> values) {
            addCriterion("dockerfile not in", values, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileBetween(String value1, String value2) {
            addCriterion("dockerfile between", value1, value2, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andDockerfileNotBetween(String value1, String value2) {
            addCriterion("dockerfile not between", value1, value2, "dockerfile");
            return (Criteria) this;
        }

        public Criteria andEnvIsNull() {
            addCriterion("env is null");
            return (Criteria) this;
        }

        public Criteria andEnvIsNotNull() {
            addCriterion("env is not null");
            return (Criteria) this;
        }

        public Criteria andEnvEqualTo(String value) {
            addCriterion("env =", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotEqualTo(String value) {
            addCriterion("env <>", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThan(String value) {
            addCriterion("env >", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThanOrEqualTo(String value) {
            addCriterion("env >=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThan(String value) {
            addCriterion("env <", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThanOrEqualTo(String value) {
            addCriterion("env <=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLike(String value) {
            addCriterion("env like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotLike(String value) {
            addCriterion("env not like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvIn(List<String> values) {
            addCriterion("env in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotIn(List<String> values) {
            addCriterion("env not in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvBetween(String value1, String value2) {
            addCriterion("env between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotBetween(String value1, String value2) {
            addCriterion("env not between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andCompileParamIsNull() {
            addCriterion("compile_param is null");
            return (Criteria) this;
        }

        public Criteria andCompileParamIsNotNull() {
            addCriterion("compile_param is not null");
            return (Criteria) this;
        }

        public Criteria andCompileParamEqualTo(String value) {
            addCriterion("compile_param =", value, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamNotEqualTo(String value) {
            addCriterion("compile_param <>", value, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamGreaterThan(String value) {
            addCriterion("compile_param >", value, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamGreaterThanOrEqualTo(String value) {
            addCriterion("compile_param >=", value, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamLessThan(String value) {
            addCriterion("compile_param <", value, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamLessThanOrEqualTo(String value) {
            addCriterion("compile_param <=", value, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamLike(String value) {
            addCriterion("compile_param like", value, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamNotLike(String value) {
            addCriterion("compile_param not like", value, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamIn(List<String> values) {
            addCriterion("compile_param in", values, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamNotIn(List<String> values) {
            addCriterion("compile_param not in", values, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamBetween(String value1, String value2) {
            addCriterion("compile_param between", value1, value2, "compileParam");
            return (Criteria) this;
        }

        public Criteria andCompileParamNotBetween(String value1, String value2) {
            addCriterion("compile_param not between", value1, value2, "compileParam");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("image_name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("image_name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("image_name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("image_name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("image_name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("image_name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("image_name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("image_name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("image_name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("image_name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("image_name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("image_name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("image_name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("image_name not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCommitIdIsNull() {
            addCriterion("commit_id is null");
            return (Criteria) this;
        }

        public Criteria andCommitIdIsNotNull() {
            addCriterion("commit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommitIdEqualTo(String value) {
            addCriterion("commit_id =", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotEqualTo(String value) {
            addCriterion("commit_id <>", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdGreaterThan(String value) {
            addCriterion("commit_id >", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdGreaterThanOrEqualTo(String value) {
            addCriterion("commit_id >=", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLessThan(String value) {
            addCriterion("commit_id <", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLessThanOrEqualTo(String value) {
            addCriterion("commit_id <=", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLike(String value) {
            addCriterion("commit_id like", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotLike(String value) {
            addCriterion("commit_id not like", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdIn(List<String> values) {
            addCriterion("commit_id in", values, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotIn(List<String> values) {
            addCriterion("commit_id not in", values, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdBetween(String value1, String value2) {
            addCriterion("commit_id between", value1, value2, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotBetween(String value1, String value2) {
            addCriterion("commit_id not between", value1, value2, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitMessageIsNull() {
            addCriterion("commit_message is null");
            return (Criteria) this;
        }

        public Criteria andCommitMessageIsNotNull() {
            addCriterion("commit_message is not null");
            return (Criteria) this;
        }

        public Criteria andCommitMessageEqualTo(String value) {
            addCriterion("commit_message =", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageNotEqualTo(String value) {
            addCriterion("commit_message <>", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageGreaterThan(String value) {
            addCriterion("commit_message >", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageGreaterThanOrEqualTo(String value) {
            addCriterion("commit_message >=", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageLessThan(String value) {
            addCriterion("commit_message <", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageLessThanOrEqualTo(String value) {
            addCriterion("commit_message <=", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageLike(String value) {
            addCriterion("commit_message like", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageNotLike(String value) {
            addCriterion("commit_message not like", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageIn(List<String> values) {
            addCriterion("commit_message in", values, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageNotIn(List<String> values) {
            addCriterion("commit_message not in", values, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageBetween(String value1, String value2) {
            addCriterion("commit_message between", value1, value2, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageNotBetween(String value1, String value2) {
            addCriterion("commit_message not between", value1, value2, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table execute_record
     *
     * @mbg.generated do_not_delete_during_merge Sun Jul 04 15:44:26 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}