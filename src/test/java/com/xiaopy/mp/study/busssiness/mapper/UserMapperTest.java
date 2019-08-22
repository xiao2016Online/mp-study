package com.xiaopy.mp.study.busssiness.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaopy.mp.study.busssiness.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaopeiyu
 * @since 2019/8/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testadd() {
        User user=new User();
        user.setName("xiaopeiyu");
        user.setAge(123);
        user.setEmail("990402387@qq.com");
        int i = userMapper.insert(user);
        Assert.assertTrue(i>0);
    }

    @Test
    public void testUpdate() {
        User user = userMapper.selectById(6);
        user.setAge(12);
        int i = userMapper.updateById(user);
        Assert.assertTrue(i>0);
    }

    @Test
    public void testSelectByMap() {
        Map<String,Object> map=new HashMap<>();
        map.put("name", "xiaopeiyu");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectByWrapper() {
        QueryWrapper<User> ew = new QueryWrapper <User>();
        List<User> userList = userMapper.selectList(ew.eq("age", 12));
        userList.forEach(System.out::println);
    }


}