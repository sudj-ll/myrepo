package com.hongyousoft.bigdata.dao;

import org.pentaho.di.trans.step.StepMeta;

public interface AddConstantsDao {

    // 增加常量
    StepMeta addConstants(String stepName, String[] fieldsName, String[] fieldsType, String[]
            fieldsValue);
}
