package cn.com.jdbc.spring.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jdbc.spring.dao.UserDao;
import cn.com.jdbc.spring.modle.User;
@Transactional
public class UserServiceBean implements UserDao {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /**
     * Description
     * 
     * @param u
     * @see cn.com.jdbc.spring.dao.UserDao#save(cn.com.jdbc.spring.modle.User)
     */

    @Override
    public void save(User u) {
        jdbcTemplate.update("insert into user(id,name,password) values(?,?,?)",
                new Object[] { u.getId(), u.getName(), u.getPassword() },
                new int[] { java.sql.Types.INTEGER, java.sql.Types.VARCHAR, java.sql.Types.VARCHAR });
    }

    /**
     * Description
     * 
     * @param u
     * @see cn.com.jdbc.spring.dao.UserDao#update(cn.com.jdbc.spring.modle.User)
     */

    @Override
    public void update(User u) {
        jdbcTemplate.update("update user set name=?,password=? where id=?",
                new Object[] { u.getName(), u.getPassword(), u.getId() },
                new int[] { java.sql.Types.VARCHAR, java.sql.Types.VARCHAR, java.sql.Types.INTEGER });
    }

    /**
     * Description
     * 
     * @param id
     * @return
     * @see cn.com.jdbc.spring.dao.UserDao#getUser(int)
     */

    @Override
    public User getUser(int id) {
        return (User) jdbcTemplate.queryForObject("select * from user where id=?", new Object[] { id },
                new int[] { java.sql.Types.INTEGER }, new UserRowMapper());
    }

    /**
     * Description
     * 
     * @return
     * @see cn.com.jdbc.spring.dao.UserDao#getAllUser()
     */

    @Override
    public List<User> getAllUser() {
        return (List<User>) jdbcTemplate.query("select * from user", new UserRowMapper());
    }

    /**
     * Description
     * 
     * @param id
     * @see cn.com.jdbc.spring.dao.UserDao#deleteUserById(int)
     */

    @Override
    public void deleteUserById(int id) {
        jdbcTemplate.update("delete from user where id=?", new Object[] { id }, new int[] { java.sql.Types.INTEGER });
    }

}
