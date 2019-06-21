package org.luvx.entity;

import lombok.*;
import org.luvx.common.annotations.Table;
import org.luvx.common.annotations.TableId;
import org.luvx.common.base.BaseQueryEntity;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table("user")
public class User extends BaseQueryEntity
        implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("user_id")
    private Long    userId;
    private String  userName;
    private String  password;
    private Integer age;
}