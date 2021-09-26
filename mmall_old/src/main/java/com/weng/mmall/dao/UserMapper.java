package com.weng.mmall.dao;

import com.weng.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author weng xiaozhi
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 检查username是否已被使用
     * @param username
     * @return
     */
    int checkUsername(String username);

    /**
     * 检查email是否已被使用
     * @param email
     * @return
     */
    int checkEmail(String email);

    /**
     * 查询username和password都相等的用户是否存在，如若存在，就返回User对象
     * @param username
     * @param password
     * @return
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    /**
     * query question by username
     * @param username username
     * @return question(string)
     */
    String selectQuestionByUsername(String username);

    //为什么有的地方有用@Param，有的地方没有？
    // anwser:如果只有一个形参，可以不用@Param，如果有复数的形参时，就要使用@Param，在xml中，type用map
    /**
     * check answer
     * @param username
     * @param question
     * @param answer
     * @return
     */
    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    /**
     * update password of username
     * @param username
     * @param passwordNew
     * @return
     */
    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    /**
     * check password of user
     * @param password
     * @param userId
     * @return
     */
    int checkPassword(@Param("password")String password, @Param("userId")Integer userId);



}