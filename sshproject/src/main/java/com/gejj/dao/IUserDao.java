package com.gejj.dao;

import com.gejj.dao.common.IOperations;
import com.gejj.model.User;

public interface IUserDao extends IOperations<User> {
    //�����е�DAO��ʵ�ֻ����Ĳ����ӿ�IOperations
    //����ʵ��IOperations�еĻ�������֮�⣬�ض���DAOҪʵ���������������ڶ�Ӧ�Ľӿ�DAO�ж��巽����
    //�˴�UserDao�Ľӿ�IUserDao����Ҫʵ����������
}
