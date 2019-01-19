package com.example.spring.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * Created by Administrator on 2019/1/13/013.
 */
public class MyImportSelector implements ImportSelector {
    /**
     *
     * @param importingClassMetadata  标注了注解的当前类的所有注解信息
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        return new String[]{"com.example.spring.model.Blue","com.example.spring.model.Yellow"};
    }
}
