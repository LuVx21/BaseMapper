package org.luvx.common.base;

import lombok.Data;
import org.luvx.common.annotations.Ignore;

/**
 * 基础查询实体
 */
@Data
public class BaseQueryEntity {
    /**
     * 去重复
     */
    @Ignore
    protected Boolean distinctCon;

    /**
     * 要查询的列
     */
    @Ignore
    protected String selectColumns;

    /**
     * 查询条件
     */
    @Ignore
    protected String whereCon;

    /**
     * 排序
     */
    @Ignore
    protected String orderCon;

    /**
     * 分组
     */
    @Ignore
    protected String groupCon;

    /**
     * having
     */
    @Ignore
    protected String havingCon;

    /**
     * limit
     */
    @Ignore
    protected String limitCon;
}