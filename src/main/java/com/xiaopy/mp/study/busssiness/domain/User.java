package com.xiaopy.mp.study.busssiness.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xiaopeiyu
 * @since 2019/8/21
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}