package com.lk;

import java.io.Serializable;

import lombok.Data;

// 客户端发送给服务端的消息
@Data
public class InvokeMessage implements Serializable {
    /**
     * 接口名称，即服务名称
     */
    private String className;
    /**
     * 要远程调用的方法名
     */
    private String methodName;
    /**
     * 方法参数类型列表
     */
    private Class<?>[] paramTypes;
    /**
     * 方法参数值列表
     */
    private Object[] paramValues;
	public void setClassName(String name) {
		// TODO Auto-generated method stub
		
	}
	public void setMethodName(String name) {
		// TODO Auto-generated method stub
		
	}
	public void setParamTypes(Object[] args) {
		// TODO Auto-generated method stub
		
	}
}
