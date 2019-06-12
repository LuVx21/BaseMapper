package org.luvx.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.luvx.entity.User;

/**
 * @ClassName: org.luvx.common.utils
 * @Description:
 * @Author: Ren, Xie
 * @Date: 2019/6/6 16:40
 */
// @RunWith(SpringRunner.class)
// @SpringBootTest
public class ProviderUtilsTest {

    @Test
    public void parseObjectTest() {
        User user = User.builder().userId(10010L).userName("a").password("b").age(10).build();
        JSONObject obj = ProviderUtils.parseObject(user);
        System.out.println(obj);
    }

    @Test
    public void getPrimaryKeyTest() {
        String pkField = ProviderUtils.getPrimaryKeyField(User.class);
        System.out.println(pkField);
        String pk = ProviderUtils.getPrimaryKey(User.class);
        System.out.println(pk);
    }

    @Test
    public void getReadVariablesTest() {
        ProviderUtils.getReadFields(User.class);
        ProviderUtils.getWriteFields(User.class);
    }

    @Test
    public void getAllFieldsTest() {
        // ProviderUtils.getAllFields(User.class);
        // ProviderUtils.nameMap(User.class);
    }
}