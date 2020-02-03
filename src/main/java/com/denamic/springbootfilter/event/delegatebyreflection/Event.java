package com.denamic.springbootfilter.event.delegatebyreflection;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName Event
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/12 15:39
 * @Version 1.0
 **/
public class Event {
    // 要执行方法的对象
    private Object object;
    // 要执行方法的名称
    private String methodName;
    // 要执行方法的参数
    private Object[] params;
    // 要执行方法的参数类型
    private Class[] paramTypes;

    public Event(Object object, String methodName, Object[] args) {
        this.object=object;
        this.methodName=methodName;
        this.params=args;
        contractParamTypes(this.params);
    }


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }
// Event 有参构造方法
  /*  public Event(Object object, String methodName, Object[] params, Class[] paramTypes) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        this.paramTypes = paramTypes;
    }*/
 // Event 无参构造方法
    public Event() {
    }

    // 根据参数数组生成参数类型数组
    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i <params.length ; i++) {
            this.paramTypes[i] = params[i].getClass();

        }
    }
    /**
     * 根据该对象的方法，方法参数，利用反射机制，执行该方法
     * @throws Exception
     */
    public void invoke() throws Exception {
        Method method=object.getClass().getMethod(this.getMethodName(),
                this.getParamTypes());
        if (method == null) {
            return;
        }
        method.invoke(this.getObject(), this.getParams());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("event.delegatebyreflection.Event{");
        sb.append("object=").append(object);
        sb.append("，methodName=").append(methodName).append('\'');
        sb.append(",params=").append(Arrays.toString(params));
        sb.append(",paramTypes=").append(Arrays.toString(paramTypes));
        sb.append('}');
     /*   return "Event{" +
                "object=" + object +
                ", methodName='" + methodName + '\'' +
                ", params=" + Arrays.toString(params) +
                ", paramTypes=" + Arrays.toString(paramTypes) +
                '}';*/
        return sb.toString();
    }
}
