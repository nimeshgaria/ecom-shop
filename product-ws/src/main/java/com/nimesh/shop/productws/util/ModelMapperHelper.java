package com.nimesh.shop.productws.util;

import org.modelmapper.ModelMapper;

public class ModelMapperHelper  {

    private static ModelMapper modelMapper = new ModelMapper();
    public static <T>T mapToObject(Object source, Class<T> destinationType ){
        return modelMapper.map(source,destinationType);
    }


}
class T <T> {
T obj ;
public T(T obj){
    this.obj = obj;
}

    public T getObj() {
        return obj;
    }
}
