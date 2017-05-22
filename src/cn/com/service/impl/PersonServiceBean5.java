package cn.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.com.dao.PersonDao;
import cn.com.service.PersonService5;

/**
 * @author HuWeiLiang
 * @Desc 1.手动注入：通过注解注入@Resource:按名称装配 ，@AutoWrite：按类型装配 @Qualifier按名称注入
 *       required=false不提示 2.自动注入(不推荐)
 * @date 2017年5月22日
 * @time 上午11:36:46
 * @email:huweiliang@tydic.com
 */
public class PersonServiceBean5 implements PersonService5 {

    // @Resource(name = "pdb")
    @Autowired(required = false)
    @Qualifier("pdb")
    private PersonDao personDao;

    @Override
    public void save() {
        personDao.add();
    }

}
