/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.core.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 增、删、改数据集
 *
 * @param <T>  DTO数据传输对象
 * @param <ID> 主键类型
 */
public class DataSet<T extends Serializable, ID extends Serializable> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 新增的列表数据
     */
    private List<T> insertedList;
    /**
     * 删除的主键列表
     */
    private List<ID> deletedIds;
    /**
     * 修改的列表数据
     */
    private List<T> updatedList;

    /**
     * 构造函数
     */
    public DataSet() {
    }

    /**
     * 构造函数
     *
     * @param insertedList 新增的列表数据
     * @param deletedIds   删除的主键列表
     * @param updatedList  修改的列表数据
     */
    public DataSet(List<T> insertedList, List<ID> deletedIds, List<T> updatedList) {
        this.insertedList = insertedList;
        this.deletedIds = deletedIds;
        this.updatedList = updatedList;
    }

    public List<T> getInsertedList() {
        return insertedList;
    }

    public void setInsertedList(List<T> insertedList) {
        this.insertedList = insertedList;
    }

    public List<ID> getDeletedIds() {
        return deletedIds;
    }

    public void setDeletedIds(List<ID> deletedIds) {
        this.deletedIds = deletedIds;
    }

    public List<T> getUpdatedList() {
        return updatedList;
    }

    public void setUpdatedList(List<T> updatedList) {
        this.updatedList = updatedList;
    }
}
