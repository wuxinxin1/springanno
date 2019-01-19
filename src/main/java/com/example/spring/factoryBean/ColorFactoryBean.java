package com.example.spring.factoryBean;

import com.example.spring.model.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2019/1/13/013.
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        return new Color("aa");
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
