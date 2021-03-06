package com.lsfly.bas.model.system;

import java.io.Serializable;
import java.util.Date;

public class GenTable implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.pk_name
     *
     * @mbg.generated
     */
    private String pkName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.alias_name
     *
     * @mbg.generated
     */
    private String aliasName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.module
     *
     * @mbg.generated
     */
    private String module;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.comments
     *
     * @mbg.generated
     */
    private String comments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.class_name
     *
     * @mbg.generated
     */
    private String className;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.pk_json
     *
     * @mbg.generated
     */
    private String pkJson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.parent_table
     *
     * @mbg.generated
     */
    private String parentTable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.parent_table_fk
     *
     * @mbg.generated
     */
    private String parentTableFk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.is_left_ztree
     *
     * @mbg.generated
     */
    private String isLeftZtree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.left_ztree_id
     *
     * @mbg.generated
     */
    private String leftZtreeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.left_ztree_name
     *
     * @mbg.generated
     */
    private String leftZtreeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.is_delete_
     *
     * @mbg.generated
     */
    private String isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.version_
     *
     * @mbg.generated
     */
    private Long version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.create_by_
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.create_time_
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.update_by_
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.update_time_
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.field1
     *
     * @mbg.generated
     */
    private String field1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.field2
     *
     * @mbg.generated
     */
    private String field2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.field3
     *
     * @mbg.generated
     */
    private String field3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.field4
     *
     * @mbg.generated
     */
    private String field4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table.field5
     *
     * @mbg.generated
     */
    private String field5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gen_table
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.id
     *
     * @return the value of gen_table.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.id
     *
     * @param id the value for gen_table.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.name
     *
     * @return the value of gen_table.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.name
     *
     * @param name the value for gen_table.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.pk_name
     *
     * @return the value of gen_table.pk_name
     *
     * @mbg.generated
     */
    public String getPkName() {
        return pkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.pk_name
     *
     * @param pkName the value for gen_table.pk_name
     *
     * @mbg.generated
     */
    public void setPkName(String pkName) {
        this.pkName = pkName == null ? null : pkName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.alias_name
     *
     * @return the value of gen_table.alias_name
     *
     * @mbg.generated
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.alias_name
     *
     * @param aliasName the value for gen_table.alias_name
     *
     * @mbg.generated
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.module
     *
     * @return the value of gen_table.module
     *
     * @mbg.generated
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.module
     *
     * @param module the value for gen_table.module
     *
     * @mbg.generated
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.comments
     *
     * @return the value of gen_table.comments
     *
     * @mbg.generated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.comments
     *
     * @param comments the value for gen_table.comments
     *
     * @mbg.generated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.class_name
     *
     * @return the value of gen_table.class_name
     *
     * @mbg.generated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.class_name
     *
     * @param className the value for gen_table.class_name
     *
     * @mbg.generated
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.pk_json
     *
     * @return the value of gen_table.pk_json
     *
     * @mbg.generated
     */
    public String getPkJson() {
        return pkJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.pk_json
     *
     * @param pkJson the value for gen_table.pk_json
     *
     * @mbg.generated
     */
    public void setPkJson(String pkJson) {
        this.pkJson = pkJson == null ? null : pkJson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.parent_table
     *
     * @return the value of gen_table.parent_table
     *
     * @mbg.generated
     */
    public String getParentTable() {
        return parentTable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.parent_table
     *
     * @param parentTable the value for gen_table.parent_table
     *
     * @mbg.generated
     */
    public void setParentTable(String parentTable) {
        this.parentTable = parentTable == null ? null : parentTable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.parent_table_fk
     *
     * @return the value of gen_table.parent_table_fk
     *
     * @mbg.generated
     */
    public String getParentTableFk() {
        return parentTableFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.parent_table_fk
     *
     * @param parentTableFk the value for gen_table.parent_table_fk
     *
     * @mbg.generated
     */
    public void setParentTableFk(String parentTableFk) {
        this.parentTableFk = parentTableFk == null ? null : parentTableFk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.is_left_ztree
     *
     * @return the value of gen_table.is_left_ztree
     *
     * @mbg.generated
     */
    public String getIsLeftZtree() {
        return isLeftZtree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.is_left_ztree
     *
     * @param isLeftZtree the value for gen_table.is_left_ztree
     *
     * @mbg.generated
     */
    public void setIsLeftZtree(String isLeftZtree) {
        this.isLeftZtree = isLeftZtree == null ? null : isLeftZtree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.left_ztree_id
     *
     * @return the value of gen_table.left_ztree_id
     *
     * @mbg.generated
     */
    public String getLeftZtreeId() {
        return leftZtreeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.left_ztree_id
     *
     * @param leftZtreeId the value for gen_table.left_ztree_id
     *
     * @mbg.generated
     */
    public void setLeftZtreeId(String leftZtreeId) {
        this.leftZtreeId = leftZtreeId == null ? null : leftZtreeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.left_ztree_name
     *
     * @return the value of gen_table.left_ztree_name
     *
     * @mbg.generated
     */
    public String getLeftZtreeName() {
        return leftZtreeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.left_ztree_name
     *
     * @param leftZtreeName the value for gen_table.left_ztree_name
     *
     * @mbg.generated
     */
    public void setLeftZtreeName(String leftZtreeName) {
        this.leftZtreeName = leftZtreeName == null ? null : leftZtreeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.is_delete_
     *
     * @return the value of gen_table.is_delete_
     *
     * @mbg.generated
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.is_delete_
     *
     * @param isDelete the value for gen_table.is_delete_
     *
     * @mbg.generated
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.version_
     *
     * @return the value of gen_table.version_
     *
     * @mbg.generated
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.version_
     *
     * @param version the value for gen_table.version_
     *
     * @mbg.generated
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.create_by_
     *
     * @return the value of gen_table.create_by_
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.create_by_
     *
     * @param createBy the value for gen_table.create_by_
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.create_time_
     *
     * @return the value of gen_table.create_time_
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.create_time_
     *
     * @param createTime the value for gen_table.create_time_
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.update_by_
     *
     * @return the value of gen_table.update_by_
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.update_by_
     *
     * @param updateBy the value for gen_table.update_by_
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.update_time_
     *
     * @return the value of gen_table.update_time_
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.update_time_
     *
     * @param updateTime the value for gen_table.update_time_
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.field1
     *
     * @return the value of gen_table.field1
     *
     * @mbg.generated
     */
    public String getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.field1
     *
     * @param field1 the value for gen_table.field1
     *
     * @mbg.generated
     */
    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.field2
     *
     * @return the value of gen_table.field2
     *
     * @mbg.generated
     */
    public String getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.field2
     *
     * @param field2 the value for gen_table.field2
     *
     * @mbg.generated
     */
    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.field3
     *
     * @return the value of gen_table.field3
     *
     * @mbg.generated
     */
    public String getField3() {
        return field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.field3
     *
     * @param field3 the value for gen_table.field3
     *
     * @mbg.generated
     */
    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.field4
     *
     * @return the value of gen_table.field4
     *
     * @mbg.generated
     */
    public String getField4() {
        return field4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.field4
     *
     * @param field4 the value for gen_table.field4
     *
     * @mbg.generated
     */
    public void setField4(String field4) {
        this.field4 = field4 == null ? null : field4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table.field5
     *
     * @return the value of gen_table.field5
     *
     * @mbg.generated
     */
    public String getField5() {
        return field5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table.field5
     *
     * @param field5 the value for gen_table.field5
     *
     * @mbg.generated
     */
    public void setField5(String field5) {
        this.field5 = field5 == null ? null : field5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_table
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", pkName=").append(pkName);
        sb.append(", aliasName=").append(aliasName);
        sb.append(", module=").append(module);
        sb.append(", comments=").append(comments);
        sb.append(", className=").append(className);
        sb.append(", pkJson=").append(pkJson);
        sb.append(", parentTable=").append(parentTable);
        sb.append(", parentTableFk=").append(parentTableFk);
        sb.append(", isLeftZtree=").append(isLeftZtree);
        sb.append(", leftZtreeId=").append(leftZtreeId);
        sb.append(", leftZtreeName=").append(leftZtreeName);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", version=").append(version);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", field4=").append(field4);
        sb.append(", field5=").append(field5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_table
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GenTable other = (GenTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPkName() == null ? other.getPkName() == null : this.getPkName().equals(other.getPkName()))
            && (this.getAliasName() == null ? other.getAliasName() == null : this.getAliasName().equals(other.getAliasName()))
            && (this.getModule() == null ? other.getModule() == null : this.getModule().equals(other.getModule()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getPkJson() == null ? other.getPkJson() == null : this.getPkJson().equals(other.getPkJson()))
            && (this.getParentTable() == null ? other.getParentTable() == null : this.getParentTable().equals(other.getParentTable()))
            && (this.getParentTableFk() == null ? other.getParentTableFk() == null : this.getParentTableFk().equals(other.getParentTableFk()))
            && (this.getIsLeftZtree() == null ? other.getIsLeftZtree() == null : this.getIsLeftZtree().equals(other.getIsLeftZtree()))
            && (this.getLeftZtreeId() == null ? other.getLeftZtreeId() == null : this.getLeftZtreeId().equals(other.getLeftZtreeId()))
            && (this.getLeftZtreeName() == null ? other.getLeftZtreeName() == null : this.getLeftZtreeName().equals(other.getLeftZtreeName()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()))
            && (this.getField4() == null ? other.getField4() == null : this.getField4().equals(other.getField4()))
            && (this.getField5() == null ? other.getField5() == null : this.getField5().equals(other.getField5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_table
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPkName() == null) ? 0 : getPkName().hashCode());
        result = prime * result + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        result = prime * result + ((getModule() == null) ? 0 : getModule().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getPkJson() == null) ? 0 : getPkJson().hashCode());
        result = prime * result + ((getParentTable() == null) ? 0 : getParentTable().hashCode());
        result = prime * result + ((getParentTableFk() == null) ? 0 : getParentTableFk().hashCode());
        result = prime * result + ((getIsLeftZtree() == null) ? 0 : getIsLeftZtree().hashCode());
        result = prime * result + ((getLeftZtreeId() == null) ? 0 : getLeftZtreeId().hashCode());
        result = prime * result + ((getLeftZtreeName() == null) ? 0 : getLeftZtreeName().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        result = prime * result + ((getField4() == null) ? 0 : getField4().hashCode());
        result = prime * result + ((getField5() == null) ? 0 : getField5().hashCode());
        return result;
    }
}