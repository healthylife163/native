package org.smart4j.service;

import org.smart4j.model.Customer;

import java.util.Map;

/**
 * Created by Administrator on 2016/5/17.
 */
public class CustomerService {
    /**
     * 获取客户数据服务
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword){
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        return false;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(String id){
        return new Customer();
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return false;
    }
}
